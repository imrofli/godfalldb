package org.imrofli.godfall.services;

import com.helger.commons.math.RoundHelper;
import org.imrofli.godfall.dao.intf.ItemScalingDao;
import org.imrofli.godfall.dao.intf.LootEffectDao;
import org.imrofli.godfall.dao.intf.TraitDao;
import org.imrofli.godfall.dao.model.*;
import org.imrofli.godfall.data.MagnitudeName;
import org.imrofli.godfall.services.intf.ItemScalingService;
import org.imrofli.godfall.view.WeaponView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ItemScalingServiceImpl implements ItemScalingService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ItemScalingServiceImpl.class);

    @Autowired
    ItemScalingDao itemScalingDao;
    @Autowired
    LootEffectDao lootEffectDao;
    @Autowired
    TraitDao traitDao;


    @Override
    public String getScaledDescription(Trait trait, Rarity rarity, Long tier) {
        LOGGER.info("Getting Description trait: {} - Rarity: {} - Tier: {}", trait.getDescription(), rarity, tier);
        if(tier==null){
            tier=1L;
        }
        ItemScaling itemScaling = itemScalingDao.getByTierIdentifierAndRarity(tier, rarity);
        Trait intermediary = traitDao.findByIdAndFetchLootEffects(trait.getId());
        Long effectId=1L;
        for(LootEffect l : intermediary.getLootEffects()){
            effectId=l.getId();
        }
        LootEffect lootEffect = lootEffectDao.findByIdAndFetch(effectId);
        String toCompile = "\\%(\\([\\w\\.]+\\.?\\w*\\)[df])\\%*";
        Pattern pattern = Pattern.compile(toCompile);
        Matcher matcher = pattern.matcher(trait.getDescription());
        String endString = trait.getDescription();
        while (matcher.find()) {
            String matched = matcher.group(1);
            for(Magnitude magnitude : lootEffect.getMagnitudes()){
                Boolean  isFloat = false;
                Boolean isDecimal = false;
                if(matched.endsWith("f%") || matched.endsWith("f")){
                    isFloat=true;
                }
                if(matched.endsWith("d%") || matched.endsWith("d")){
                    isDecimal=true;
                }

                Pattern patternTwo = Pattern.compile("\\(([\\w\\.]+\\.?\\w*)\\)[df]");
                Matcher matcherTwo = patternTwo.matcher(matched);
                while (matcherTwo.find()){
                    String matchedTwo = matcherTwo.group(1);
                    String[] matchSplit = matchedTwo.split("\\.");
                    String[] magnSplit = magnitude.getName().split("\\.");

                    if(magnSplit[magnSplit.length-1].equals(matchSplit[matchSplit.length-1])){
                        String replaceValue = calculateSingleEntry(magnitude, itemScaling, isFloat, isDecimal);
                        endString = endString.replaceAll("\\%\\("+matchedTwo + "\\)[df]\\%?", replaceValue);
                    }
                    else if(matched.startsWith("Increase") && (magnitude.getName().equals("Magnitude.X") || magnitude.getName().startsWith("Increase"))){
                        String replaceValue = calculateSingleEntry(magnitude, itemScaling, isFloat, isDecimal);
                        endString = endString.replaceAll("\\%\\("+matchedTwo + "\\)[df]\\%?", replaceValue);
                    }
                }
            }

        }
        return endString;
    }

    private String calculateSingleEntry(Magnitude magnitude, ItemScaling itemScaling, Boolean isFloat, Boolean isDecimal){
        LOGGER.info("Calculating: Magnitude - {} Scaling", magnitude, itemScaling);
        double min = 0;
        double max = 0;
        boolean takeFaceValue = false;
        switch (magnitude.getParameterType()) {
            case NON_SCALING:
                min = magnitude.getScalar();
                max = magnitude.getScalar();

                if(!magnitude.getName().equals("Magnitude.Duration") && !magnitude.getName().equals("Magnitude.Seconds.A") &&
                        !magnitude.getName().equals("Magnitude.Seconds.B") ) {
                    if (isDecimal) {
                        min *= 100;
                        min = RoundHelper.getRoundedUpFix(min, 0);
                        max *= 100;
                        max = RoundHelper.getRoundedUpFix(max, 0);
                    }
                }

                if(!magnitude.getName().equals("Duration") && !magnitude.getName().equals("Magnitude.Seconds.A") &&
                        !magnitude.getName().equals("Magnitude.Seconds.B") ) {
                    takeFaceValue=true;
                    min = min;
                    max = max;
                }
                break;
            case PLAYER_POWER:
                min = (itemScaling.getPlayerPowerMin() * magnitude.getScalar());
                max = (itemScaling.getPlayerPowerMax()* magnitude.getScalar());
                break;
            case CORE_ATTRIBUTE:
                min = (itemScaling.getCoreAttributeMin() * magnitude.getScalar());
                max = (itemScaling.getCoreAttributeMax()* magnitude.getScalar());
                break;
            case ATTRIBUTE_NO_VARIANCE:
                min = itemScaling.getAttributeNoVarianceMin() *100 * magnitude.getScalar();
                max = itemScaling.getAttributeNoVarianceMax() *100 * magnitude.getScalar();
                break;
            case CORE_ATTRIBUTE_PERCENT:
                min = itemScaling.getCoreAttributePercentMin() *100 * magnitude.getScalar();
                max = itemScaling.getCoreAttributePercentMax() *100 * magnitude.getScalar();
                break;
            case DEFENSE_PERCENT:
                min = itemScaling.getDefensePercentMin() *100 * magnitude.getScalar();
                max = itemScaling.getDefensePercentMax() *100 * magnitude.getScalar();
                break;
            case NO_VARIANCE_CORE_ATTRIBUTE_PERCENT:
                min = itemScaling.getNoVarianceCoreAttributePercentMin() *100 * magnitude.getScalar();
                max = itemScaling.getNoVarianceCoreAttributePercentMax() *100 * magnitude.getScalar();
                break;
            case NO_VARIANCE_DEFENSE_PERCENT:
                min = itemScaling.getNoVarianceDefensePercentMin() *100 * magnitude.getScalar();
                max = itemScaling.getNoVarianceDefensePercentMax() *100 * magnitude.getScalar();
                break;
            case NO_VARIANCE_PLAYER_POWER:
                min = itemScaling.getNoVariancePlayerPowerMin() *100 * magnitude.getScalar();
                max = itemScaling.getNoVariancePlayerPowerMax() *100 * magnitude.getScalar();
                break;
        }
        if (!takeFaceValue) {
            min = Math.round(min  * 100.0) / 100.0;
            max = Math.round(max  * 100.0) / 100.0;
        }
        String replaceValue;
        if (max == min) {
            replaceValue = String.valueOf(max);
        } else {
            replaceValue = min + "-" + max;
        }
        return replaceValue;
    }
}
