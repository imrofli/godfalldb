package org.imrofli.godfall.services;

import org.apache.commons.math3.util.Precision;
import org.imrofli.godfall.api.model.GlobalParameters;
import org.imrofli.godfall.api.model.Scaling;
import org.imrofli.godfall.dao.model.*;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.helpers.DaoToViewInterpreter;
import org.imrofli.godfall.services.intf.CalculationService;
import org.imrofli.godfall.services.intf.GlobalParameterService;
import org.imrofli.godfall.services.intf.ScalingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class CalculationServiceImpl implements CalculationService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CalculationServiceImpl.class);
    @Autowired
    ScalingService scalingService;
    @Autowired
    GlobalParameterService globalParameterService;


    @Override
    public void calculateTraitPerLevelAndRarity(String version, TraitModel trait, Long level, RarityModel rarity, String descriptionParamType, List<GlobalParameters> globalParametersList) throws ServiceCallException {
        if (trait == null || level == null || rarity == null || version == null) {
            throw new ServiceCallException("VersionModel, Trait, level or rarity were NULL");
        }
        List<Scaling> scalingList = scalingService.getScalingByRarityAndLevel(DaoToViewInterpreter.convertRarity(rarity), level, version);
        if (scalingList == null || scalingList.isEmpty()) {
            throw new ServiceCallException("scalingService.getScalingByRarityAndLevel returned NULL or Empty");
        }
        Scaling scaling = scalingList.get(0);
        if (globalParametersList == null || globalParametersList.isEmpty()) {
            throw new ServiceCallException("globalParameterService.getAllGlobalParameters returned NULL or Empty");
        }
        GlobalParameters globalParameters = globalParametersList.get(0);
        if (trait.getConditionalLootEffects() != null && !trait.getConditionalLootEffects().isEmpty()) {
            for (ConditionalLootEffectModel cond : trait.getConditionalLootEffects()) {
                String conditionalDescription = cond.getDescription();
                String conditionalDescriptionParamType = getDescriptionParamType(conditionalDescription);
                calculateLootEffects(cond.getLootEffects(), level, rarity, descriptionParamType, scaling, globalParameters, trait.getMatchModifierMagnitudes());
            }

        }
        if (trait.getLootEffects() != null && !trait.getLootEffects().isEmpty()) {
            calculateLootEffects(trait.getLootEffects(), level, rarity, descriptionParamType, scaling, globalParameters, trait.getMatchModifierMagnitudes());
        }
    }

    private void calculateLootEffects(Set<LootEffectModel> lootEffects, Long level, RarityModel rarity, String descriptionParamType, Scaling scaling, GlobalParameters globalParameters, Boolean matchModifierMagnitudes) {
        for (LootEffectModel lootEffect : lootEffects) {
            for (EffectMagnitudeModel effectMagnitude : lootEffect.getMagnitudes()) {
                CalculatedMagnitudeModel calculatedMagnitude = calculateValue(globalParameters, scaling, descriptionParamType, effectMagnitude, matchModifierMagnitudes);
                calculatedMagnitude.setRarity(rarity);
                calculatedMagnitude.setLevel(level);
                if (effectMagnitude.getCalculatedMagnitudes() == null) {
                    effectMagnitude.setCalculatedMagnitudes(new HashSet<>());
                }
                effectMagnitude.getCalculatedMagnitudes().add(calculatedMagnitude);
            }
        }
    }

    @Override
    public void calculateTrait(String version, TraitModel trait) throws ServiceCallException {
        String description = trait.getDescription();
        String descriptionParamType = getDescriptionParamType(description);
        Long minTier = 1L;
        if (trait.getMinimumTier() != null) {
            minTier = trait.getMinimumTier();
        }
        Long maxTier = 50L;
        if (trait.getMaximumTier() != null && trait.getMaximumTier() < maxTier) {
            maxTier = trait.getMaximumTier();
        }
        for (Long i = minTier; i <= maxTier; i++) {
            //this is done in this way so all rarities from the minimum up are calculated
            switch (trait.getMinimumRarity()) {
                case COMMON:
                    calculateTraitPerLevelAndRarity(version, trait, i, RarityModel.COMMON, descriptionParamType, globalParameterService.getAllGlobalParameters(version));
                case UNCOMMON:
                    calculateTraitPerLevelAndRarity(version, trait, i, RarityModel.UNCOMMON, descriptionParamType, globalParameterService.getAllGlobalParameters(version));
                case RARE:
                    calculateTraitPerLevelAndRarity(version, trait, i, RarityModel.RARE, descriptionParamType, globalParameterService.getAllGlobalParameters(version));
                case EPIC:
                    calculateTraitPerLevelAndRarity(version, trait, i, RarityModel.EPIC, descriptionParamType, globalParameterService.getAllGlobalParameters(version));
                case LEGENDARY:
                    calculateTraitPerLevelAndRarity(version, trait, i, RarityModel.LEGENDARY, descriptionParamType, globalParameterService.getAllGlobalParameters(version));
            }
        }

    }

    private List<String> getDescriptionParams(String description) {
        String patternToMatch = "(\\%\\([\\w\\.]+\\.?\\w*\\)[df]\\%*)";
        Pattern pattern = Pattern.compile(patternToMatch);
        Matcher matcher = pattern.matcher(description);
        List<String> output = new ArrayList<>();
        while (matcher.find()) {
            output.add(matcher.group(1));
        }
        return output;
    }

    private String getDescriptionReplaceString(String descriptionParams) {
        String output = new String();
        String patternToMatch = "(\\%\\([\\w\\.]+\\.?\\w*\\)[df])\\%*";
        Pattern pattern = Pattern.compile(patternToMatch);
        Matcher matcher = pattern.matcher(descriptionParams);
        while (matcher.find()) {
            String result = matcher.group(1);
            if (descriptionParams.contains("%%")) {
                result += "%";
            }
            output = result;
        }
        return output;
    }

    private String getDescriptionParamType(String descriptionParam) {
        String patternToMatch = "\\%\\([\\w\\.]+\\.?\\w*\\)([df])\\%*";
        Pattern pattern = Pattern.compile(patternToMatch);
        Matcher matcher = pattern.matcher(descriptionParam);
        String output = new String();
        while (matcher.find()) {
            output = matcher.group(1);
        }
        return output;
    }

    private String getDescriptionParamName(String descriptionParam) {
        String patternToMatch = "\\%\\(([\\w\\.]+)\\.?\\w*\\)[df]\\%*";
        Pattern pattern = Pattern.compile(patternToMatch);
        Matcher matcher = pattern.matcher(descriptionParam);
        String output = new String();
        while (matcher.find()) {
            output = matcher.group(1);
        }
        return output;
    }

    private String getDescriptionParamValueName(String descriptionParam) {
        String patternToMatch = "\\w+\\.+(\\w*)";
        Pattern pattern = Pattern.compile(patternToMatch);
        Matcher matcher = pattern.matcher(descriptionParam);
        String output = new String();
        while (matcher.find()) {
            output = matcher.group(1);
        }
        return output;
    }

    private CalculatedMagnitudeModel calculateValue(GlobalParameters globalParameters, Scaling scaling, String descriptionParamType, EffectMagnitudeModel magnitude, Boolean matchModifierMagnitudes) {
        CalculatedMagnitudeModel calculatedMagnitude = new CalculatedMagnitudeModel();
        Double min = 0d;
        Double max = 0d;
        Double scalar = 1d;
        if (magnitude.getScalar() != null) {
            scalar = magnitude.getScalar();
        }
        switch (magnitude.getParameterType()) {
            case PLAYER_POWER:
                min = scaling.getPlayerPowerMin() * scalar;
                max = scaling.getPlayerPowerMax() * scalar;
                break;
            case CORE_ATTRIBUTE:
                min = scaling.getCoreAttributeMin() * scalar;
                max = scaling.getCoreAttributeMax() * scalar;
                break;
            case NON_SCALING:
                min = scaling.getNonScalingMin() * scalar;
                max = scaling.getNonScalingMax() * scalar;
                break;
            case ATTRIBUTE_NO_VARIANCE:
                min = scaling.getAttributeNoVarianceMin() * scalar;
                max = scaling.getAttributeNoVarianceMax() * scalar;
                break;
            case DEFENSE_PERCENT:
                min = scaling.getDefensePercentMin() * scalar * 100;
                max = scaling.getDefensePercentMax() * scalar * 100;
                break;
            case NO_VARIANCE_CORE_ATTRIBUTE_PERCENT:
                min = scaling.getNoVarianceCoreAttributePercentMin() * scalar * 100;
                max = scaling.getNoVarianceCoreAttributePercentMax() * scalar * 100;
                break;
            case NO_VARIANCE_DEFENSE_PERCENT:
                min = scaling.getNoVarianceDefensePercentMin() * scalar * 100;
                max = scaling.getNoVarianceDefensePercentMax() * scalar * 100;
                break;
            case NO_VARIANCE_PLAYER_POWER:
                min = scaling.getNoVariancePlayerPowerMin() * scalar;
                max = scaling.getNoVariancePlayerPowerMax() * scalar;
                break;
            case CORE_ATTRIBUTE_PERCENT:
                min = scaling.getCoreAttributePercentMin() * scalar * 100;
                max = scaling.getCoreAttributePercentMax() * scalar * 100;
                break;
        }
        if (descriptionParamType.equals("d")) {
            min = Precision.round(min, 2, BigDecimal.ROUND_HALF_UP);
            max = Precision.round(max, 2, BigDecimal.ROUND_HALF_UP);
        }
        calculatedMagnitude.setMinimum(min);
        calculatedMagnitude.setMaximum(max);
        return calculatedMagnitude;
    }
}
