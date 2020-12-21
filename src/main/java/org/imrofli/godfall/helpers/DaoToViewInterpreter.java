package org.imrofli.godfall.helpers;

import org.apache.commons.collections4.list.SetUniqueList;
import org.imrofli.godfall.api.model.*;
import org.imrofli.godfall.dao.model.Element;
import org.imrofli.godfall.dao.model.ParameterType;
import org.imrofli.godfall.dao.model.TagRequirement;
import org.imrofli.godfall.dao.model.WeaponType;
import org.imrofli.godfall.data.Magnitude;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class DaoToViewInterpreter {

    public static List<Weapon> convertWeaponDaoList(Set<org.imrofli.godfall.dao.model.Weapon> weaponSet){
        List<Weapon> out = new ArrayList<>();
        for(org.imrofli.godfall.dao.model.Weapon weapon : weaponSet){
            out.add(convertWeaponDao(weapon));
        }
        return out;
    }

    public static Weapon convertWeaponDao(org.imrofli.godfall.dao.model.Weapon weapon) {
        Weapon out = new Weapon();
        out.setId(weapon.getId());
        out.setName(weapon.getName());
        out.setGameplayTag(weapon.getGameplayTag());
        out.setMinimumrarity(convertRarity(weapon.getMinimumRarity()));
        out.setWeaponclass(convertWeaponType(weapon.getWeaponType()));
        out.setElements(convertElementsToList(weapon.getElements()));

        return out;
    }

    public static List<Augment> convertAugmentDaoList(Set<org.imrofli.godfall.dao.model.Augment> augmentSet){
        List<Augment> out = new ArrayList<>();
        for(org.imrofli.godfall.dao.model.Augment augment : augmentSet){
            out.add(convertAugmentDao(augment));
        }
        return out;
    }

    public static Augment convertAugmentDao(org.imrofli.godfall.dao.model.Augment augment) {
        Augment out = new Augment();
        out.setId(augment.getId());
        out.setName(augment.getName());
        out.setGameplayTag(augment.getGameplayTag());
        out.setMinimumrarity(convertRarity(augment.getMinimumRarity()));
        out.elements(convertElementsToList(augment.getElements()));

        return out;
    }
    public static List<Banner> convertBannerDaoList(Set<org.imrofli.godfall.dao.model.Banner> bannerSet){
        List<Banner> out = new ArrayList<>();
        for(org.imrofli.godfall.dao.model.Banner banner : bannerSet){
            out.add(convertBannerDao(banner));
        }
        return out;
    }

    public static Banner convertBannerDao(org.imrofli.godfall.dao.model.Banner banner) {
        Banner out = new Banner();
        out.setId(banner.getId());
        out.setName(banner.getName());
        out.setGameplayTag(banner.getGameplayTag());
        out.elements(convertElementsToList(banner.getElements()));
        out.setCooldownScalar(banner.getCooldownScalar());
        out.setOvershieldScalar(banner.getOvershieldScalar());
        out.setRadiusScalar(banner.getRadiusScalar());

        return out;
    }

    public static List<LifeStone> convertLifeStoneDaoList(Set<org.imrofli.godfall.dao.model.LifeStone> lifeStoneSet){
        List<LifeStone> out = new ArrayList<>();
        for(org.imrofli.godfall.dao.model.LifeStone lifeStone : lifeStoneSet){
            out.add(convertLifeStoneDao(lifeStone));
        }
        return out;
    }

    public static LifeStone convertLifeStoneDao(org.imrofli.godfall.dao.model.LifeStone lifeStone) {
        LifeStone out = new LifeStone();
        out.setId(lifeStone.getId());
        out.setName(lifeStone.getName());
        out.setGameplayTag(lifeStone.getGameplayTag());
        out.setMinimumrarity(convertRarity(lifeStone.getMinimumRarity()));
        out.elements(convertElementsToList(lifeStone.getElements()));
        out.secondaryTraitDuration(lifeStone.getSecondaryTraitDurationScalar());
        out.setCharges(lifeStone.getChargesScalar());
        out.setHealamount(lifeStone.getHealScalar());
        out.setHealDuration(lifeStone.getHealDurationScalar());

        return out;
    }

    public static List<Ring> convertRingDaoList(Set<org.imrofli.godfall.dao.model.Trinket> trinketSet){
        List<Ring> out = new ArrayList<>();
        for(org.imrofli.godfall.dao.model.Trinket trinket : trinketSet){
            out.add(convertRingDao(trinket));
        }
        return out;
    }

    public static Ring convertRingDao(org.imrofli.godfall.dao.model.Trinket trinket) {
        Ring out = new Ring();
        out.setId(trinket.getId());
        out.setName(trinket.getName());
        out.setGameplayTag(trinket.getGameplayTag());
        out.setMinimumrarity(convertRarity(trinket.getMinimumRarity()));
        out.elements(convertElementsToList(trinket.getElements()));

        return out;
    }

    public static List<Amulet> convertAmuletDaoList(Set<org.imrofli.godfall.dao.model.Trinket> trinketSet){
        List<Amulet> out = new ArrayList<>();
        for(org.imrofli.godfall.dao.model.Trinket trinket : trinketSet){
            out.add(convertAmuletDao(trinket));
        }
        return out;
    }

    public static Amulet convertAmuletDao(org.imrofli.godfall.dao.model.Trinket trinket) {
        Amulet out = new Amulet();
        out.setId(trinket.getId());
        out.setName(trinket.getName());
        out.setGameplayTag(trinket.getGameplayTag());
        out.setMinimumrarity(convertRarity(trinket.getMinimumRarity()));
        out.elements(convertElementsToList(trinket.getElements()));

        return out;
    }

    public static List<Charm> convertCharmDaoList(Set<org.imrofli.godfall.dao.model.Trinket> trinketSet){
        List<Charm> out = new ArrayList<>();
        for(org.imrofli.godfall.dao.model.Trinket trinket : trinketSet){
            out.add(convertCharmDao(trinket));
        }
        return out;
    }

    public static Charm convertCharmDao(org.imrofli.godfall.dao.model.Trinket trinket) {
        Charm out = new Charm();
        out.setId(trinket.getId());
        out.setName(trinket.getName());
        out.setGameplayTag(trinket.getGameplayTag());
        out.setMinimumrarity(convertRarity(trinket.getMinimumRarity()));
        out.elements(convertElementsToList(trinket.getElements()));

        return out;
    }
    public static List<LootInfo> convertLootInfoDaoList(Set<org.imrofli.godfall.dao.model.LootInfo> lootInfoSet){
        List<LootInfo> out = new ArrayList<>();
        for(org.imrofli.godfall.dao.model.LootInfo lootInfo : lootInfoSet){
            out.add(convertLootInfoDao(lootInfo));
        }
        return out;
    }

    public static LootInfo convertLootInfoDao(org.imrofli.godfall.dao.model.LootInfo lootInfo) {
        LootInfo out = new LootInfo();
        out.setId(lootInfo.getId());
        out.setName(lootInfo.getName());
        out.setGameplayTag(lootInfo.getGameplayTag());
        out.setMinimumrarity(convertRarity(lootInfo.getMinimumRarity()));
        out.setMinimumTier(lootInfo.getMinimumTier());
        out.setMaximumTier(lootInfo.getMaximumTier());
        out.setMaximumrarity(convertRarity(lootInfo.getMinimumRarity()));
        out.setPreorderDrop(lootInfo.getPreorderDrop());
        out.setTowerDrop(lootInfo.getTowerDrop());
        List<String> stringList = new ArrayList<>();
        stringList.addAll(lootInfo.getDropTags());
        out.setDropTags(stringList);

        return out;
    }

    public static List<Trait> convertTraitSetDao(Set<org.imrofli.godfall.dao.model.Trait> traitSet){
        List<Trait> out = new ArrayList<>();
        for(org.imrofli.godfall.dao.model.Trait entry : traitSet){
            out.add(convertTraitDao(entry));
        }
        return out;
    }

    public static Trait convertTraitDao(org.imrofli.godfall.dao.model.Trait trait){
        Trait out = new Trait();
        out.setId(trait.getId());
        out.setName(trait.getName());
        out.setGroup(trait.getTraitGroup());
        out.setDescription(trait.getDescription());
        out.setTraitrequirement(convertTagRequirementSet(trait.getTagRequirements()));
        out.setLooteffects(convertLootEffectList(trait.getLootEffects()));
        out.setConditionallooteffects(convertConditionalLootEffectList(trait.getConditionalLootEffects()));
        out.setMinimumrarity(convertRarity(trait.getMinimumRarity()));
        out.setMaximumrarity(convertRarity(trait.getMaximumRarity()));
        out.setMaximumTier(trait.getMaximumTier());
        out.setMinimumTier(trait.getMinimumTier());
        out.setMatchModifierMagnitudes(trait.getMatchModifierMagnitudes());
        out.setWeight(trait.getWeight());
        out.setTraitcategory(convertTraitCategory(trait.getTraitCategory()));
        if(trait.getKeywords() != null){
            List<String> keywords = new ArrayList<>();
            keywords.addAll(trait.getKeywords());
            out.setKeywords(keywords);
        }

        return out;
    }

    public static List<TraitRequirement> convertTagRequirementSet(Set<TagRequirement> requirements){
        List<TraitRequirement> out = new ArrayList<>();
        if(requirements!=null){
            for(TagRequirement entry : requirements){
                out.add(convertTagRequirement(entry));
            }
        }
        return out;
    }

    public static TraitRequirement convertTagRequirement(TagRequirement requirement){
        TraitRequirement out = new TraitRequirement();
        out.setGameplayTag(requirement.getName());
        out.setActorType(requirement.getActorType());
        if("Required".equalsIgnoreCase(requirement.getRequireOrIgnore())){
            out.setRequired(true);
        }
        else{
            out.setRequired(false);
        }
        return out;
    }

    public static TraitCategory convertTraitCategory(org.imrofli.godfall.dao.model.TraitCategory traitCategory){
        TraitCategory out = new TraitCategory();
        if(traitCategory!=null) {
            out.setName(traitCategory.getName());
            out.setGroupname(traitCategory.getGroupname());
            out.setTraittype(convertTraitType(traitCategory.getTraitType()));
            List<String> allowedtraittags = new ArrayList<>();
            if (traitCategory.getAllowedTraitTags() != null) {
                allowedtraittags.addAll(traitCategory.getAllowedTraitTags());
            }
            out.setAllowedtraittags(allowedtraittags);
            out.setTraitgroup(traitCategory.getTraitGroup());
            List<String> exclusiongroups = new ArrayList<>();
            if (traitCategory.getExclusionGroups() != null) {
                exclusiongroups.addAll(traitCategory.getExclusionGroups());
            }
            out.setExclusiongroups(exclusiongroups);
            out.setMinimumtier(traitCategory.getMinimumTier());
            out.setMaximumtier(traitCategory.getMaximumTier());
            out.setWeight(traitCategory.getWeight());
            out.setMinimumrarity(convertRarity(traitCategory.getMinimumRarity()));
            out.setMaximumrarity(convertRarity(traitCategory.getMaximumRarity()));
        }
        else{
            return null;
        }
        return out;
    }

    public static List<LootEffect> convertLootEffectList(Set<org.imrofli.godfall.dao.model.LootEffect> lootEffects){
        List<LootEffect> out = new ArrayList<>();
        if(lootEffects != null){
            for(org.imrofli.godfall.dao.model.LootEffect entry : lootEffects){
                out.add(convertLootEffect(entry));
            }
        }
        return out;
    }

    public static LootEffect convertLootEffect(org.imrofli.godfall.dao.model.LootEffect lootEffect){
        LootEffect out = new LootEffect();
        out.setName(lootEffect.getName());
        out.setMagnitudes(convertMagnitudeList(lootEffect.getMagnitudes()));
        return out;
    }

    public static List<ConditionalLootEffect> convertConditionalLootEffectList(Set<org.imrofli.godfall.dao.model.ConditionalLootEffect> lootEffects){
        List<ConditionalLootEffect> out = new ArrayList<>();
        if(lootEffects != null){
            for(org.imrofli.godfall.dao.model.ConditionalLootEffect entry : lootEffects){
                out.add(convertConditionalLootEffect(entry));
            }
        }
        return out;
    }

    public static ConditionalLootEffect convertConditionalLootEffect(org.imrofli.godfall.dao.model.ConditionalLootEffect lootEffect){
        ConditionalLootEffect out = new ConditionalLootEffect();
        out.setName(lootEffect.getName());
        out.setDescription(lootEffect.getDescription());
        out.setApplytoself(lootEffect.getApplyToSelf());
        out.setApplytoconnected(lootEffect.getApplyToConnected());
        out.setApplyforeach(lootEffect.getApplyForEach());
        out.setLooteffects(convertLootEffectList(lootEffect.getLootEffects()));
        out.setConditionname(lootEffect.getConditionName());
        out.setConditionparamcategory(convertParamCategory(lootEffect.getConditionParamCategory()));
        out.setConditionparamtype(convertParameterType(lootEffect.getConditionParameterType()));
        out.setConditionparamscalar(lootEffect.getConditionParamScalar());
        return out;
    }

    public static List<EffectMagnitude> convertMagnitudeList(Set<org.imrofli.godfall.dao.model.EffectMagnitude> magnitudes){
        List<EffectMagnitude> out = new ArrayList<>();
        if(magnitudes!=null){
            for(org.imrofli.godfall.dao.model.EffectMagnitude entry : magnitudes){
                out.add(convertMagnitude(entry));
            }
        }
        return out;
    }

    public static EffectMagnitude convertMagnitude(org.imrofli.godfall.dao.model.EffectMagnitude magnitude){
        EffectMagnitude out = new EffectMagnitude();
        out.setName(magnitude.getName());
        out.setScalar(magnitude.getScalar());
        out.setConditionparamtype(convertParameterType(magnitude.getParameterType()));
        return out;
    }

    public static ConditionParamCategory convertParamCategory(org.imrofli.godfall.dao.model.ConditionParamCategory paramCategory){
        ConditionParamCategory out = new ConditionParamCategory();
        if(paramCategory.getAffinity() != null){
            out.setAffinity(convertAffinity(paramCategory.getAffinity()));
        }
        if(paramCategory.getColor() != null){
            out.setColor(convertColor(paramCategory.getColor()));
        }
        return out;
    }

    public static Affinity convertAffinity(org.imrofli.godfall.dao.model.Affinity affinity){
        switch(affinity){
            case VITALITY:
                return Affinity.VITALITY;
            case MIGHT:
                return Affinity.MIGHT;
            default:
                return Affinity.SPIRIT;
        }
    }

    public static TraitType convertTraitType(org.imrofli.godfall.dao.model.TraitType traitType){
        switch(traitType){
            case MASTERWORK:
                return TraitType.MASTERWORK;
            case PRIMARY:
                return TraitType.PRIMARY;
            default:
                return TraitType.SECONDARY;
        }
    }

    public static Color convertColor(org.imrofli.godfall.dao.model.Color color){
        switch(color){
            case BLUE:
                return Color.BLUE;
            case RED:
                return Color.RED;
            default:
                return Color.GREEN;
        }
    }

    public static ParamType convertParameterType(ParameterType parameterType){
        switch (parameterType){
            case PLAYER_POWER:
                return ParamType.PLAYER_POWER;
            case CORE_ATTRIBUTE:
                return ParamType.CORE_ATTRIBUTE;
            case DEFENSE_PERCENT:
                return ParamType.DEFENSE_PERCENT;
            case ATTRIBUTE_NO_VARIANCE:
                return ParamType.ATTRIBUTE_NO_VARIANCE;
            case CORE_ATTRIBUTE_PERCENT:
                return ParamType.CORE_ATTRIBUTE_PERCENT;
            case NO_VARIANCE_PLAYER_POWER:
                return ParamType.NO_VARIANCE_PLAYER_POWER;
            case NO_VARIANCE_DEFENSE_PERCENT:
                return ParamType.NO_VARIANCE_DEFENSE_PERCENT;
            case NO_VARIANCE_CORE_ATTRIBUTE_PERCENT:
                return ParamType.NO_VARIANCE_CORE_ATTRIBUTE_PERCENT;
            default:
                return ParamType.NON_SCALING;
        }
    }


    public static Weapon.WeaponclassEnum convertWeaponType(WeaponType weaponType){
        switch (weaponType) {
            case POLEARM:
                return Weapon.WeaponclassEnum.POLEARM;
            case DUALBLADES:
                return Weapon.WeaponclassEnum.DUALBLADES;
            case GREATSWORD:
                return Weapon.WeaponclassEnum.GREATSWORD;
            case LONGSWORD:
                return Weapon.WeaponclassEnum.LONGSWORD;
            case WARHAMMER:
                return Weapon.WeaponclassEnum.WARHAMMER;
            default:
                return Weapon.WeaponclassEnum.LONGSWORD;
        }
    }

    public static List<ItemElement> convertElementsToList(Set<Element> elements) {
        //in case for duplicates
        List<ItemElement> itemElements = SetUniqueList.setUniqueList(new ArrayList<>());
        for (Element ele : elements) {
            switch (ele) {
                case PHYSICAL:
                    itemElements.add(ItemElement.PHYSICAL);
                    break;
                case AIR:
                    itemElements.add(ItemElement.AIR);
                    break;
                case EARTH:
                    itemElements.add(ItemElement.EARTH);
                    break;
                case VOID:
                    itemElements.add(ItemElement.VOID);
                    break;
                case WATER:
                    itemElements.add(ItemElement.WATER);
                    break;
                case FIRE:
                    itemElements.add(ItemElement.FIRE);
                    break;
            }
        }
        if(itemElements.isEmpty()){
            itemElements.add(ItemElement.NONE);
        }
        return itemElements;
    }

    public static Rarity convertRarity(org.imrofli.godfall.dao.model.Rarity rarity){
        switch (rarity){
            case LEGENDARY:
                return Rarity.LEGENDARY;
            case EXOTIC:
                return Rarity.EXOTIC;
            case EPIC:
                return Rarity.EPIC;
            case RARE:
                return Rarity.RARE;
            case UNCOMMON:
                return Rarity.UNCOMMON;
            default:
                return Rarity.COMMON;
        }
    }
}
