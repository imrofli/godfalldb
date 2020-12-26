package org.imrofli.godfall.helpers;

import org.apache.commons.collections4.list.SetUniqueList;
import org.imrofli.godfall.api.model.*;
import org.imrofli.godfall.dao.model.Element;
import org.imrofli.godfall.dao.model.ParameterType;
import org.imrofli.godfall.dao.model.TagRequirement;
import org.imrofli.godfall.dao.model.WeaponType;

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
        out.setAffinities(convertAffinitySet(weapon.getAffinities()));
        out.setDisplayname(weapon.getDisplayName());
        out.setDisplaydescription(weapon.getDisplayDescription());
        out.setTags(convertStringSet(weapon.getTags()));
        out.setBlacklisttags(convertStringSet(weapon.getBlacklistTags()));
        out.setTraitslots(convertTraitSlots(weapon.getTraitSlots()));

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
        out.setElements(convertElementsToList(augment.getElements()));
        out.setAffinities(convertAffinitySet(augment.getAffinities()));
        out.setDisplayname(augment.getDisplayName());
        out.setDisplaydescription(augment.getDisplayDescription());
        out.setTags(convertStringSet(augment.getTags()));
        out.setBlacklisttags(convertStringSet(augment.getBlacklistTags()));
        out.setTraitslots(convertTraitSlots(augment.getTraitSlots()));

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
        out.setElements(convertElementsToList(banner.getElements()));
        out.setCooldownScalar(banner.getCooldownScalar());
        out.setOvershieldScalar(banner.getOvershieldScalar());
        out.setRadiusScalar(banner.getRadiusScalar());
        out.setAffinities(convertAffinitySet(banner.getAffinities()));
        out.setDisplayname(banner.getDisplayName());
        out.setDisplaydescription(banner.getDisplayDescription());
        out.setTags(convertStringSet(banner.getTags()));
        out.setBlacklisttags(convertStringSet(banner.getBlacklistTags()));
        out.setTraitslots(convertTraitSlots(banner.getTraitSlots()));
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
        out.setElements(convertElementsToList(lifeStone.getElements()));
        out.setSecondaryTraitDuration(lifeStone.getSecondaryTraitDurationScalar());
        out.setCharges(lifeStone.getChargesScalar());
        out.setHealamount(lifeStone.getHealScalar());
        out.setHealDuration(lifeStone.getHealDurationScalar());
        out.setAffinities(convertAffinitySet(lifeStone.getAffinities()));
        out.setDisplayname(lifeStone.getDisplayName());
        out.setDisplaydescription(lifeStone.getDisplayDescription());
        out.setTags(convertStringSet(lifeStone.getTags()));
        out.setBlacklisttags(convertStringSet(lifeStone.getBlacklistTags()));
        out.setTraitslots(convertTraitSlots(lifeStone.getTraitSlots()));
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
        out.setElements(convertElementsToList(trinket.getElements()));
        out.setAffinities(convertAffinitySet(trinket.getAffinities()));
        out.setDisplayname(trinket.getDisplayName());
        out.setDisplaydescription(trinket.getDisplayDescription());
        out.setTags(convertStringSet(trinket.getTags()));
        out.setBlacklisttags(convertStringSet(trinket.getBlacklistTags()));
        out.setTraitslots(convertTraitSlots(trinket.getTraitSlots()));
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
        out.setElements(convertElementsToList(trinket.getElements()));
        out.setAffinities(convertAffinitySet(trinket.getAffinities()));
        out.setDisplayname(trinket.getDisplayName());
        out.setDisplaydescription(trinket.getDisplayDescription());
        out.setTags(convertStringSet(trinket.getTags()));
        out.setBlacklisttags(convertStringSet(trinket.getBlacklistTags()));
        out.setTraitslots(convertTraitSlots(trinket.getTraitSlots()));

        return out;
    }

    public static List<TraitSlot> convertTraitSlots(Set<org.imrofli.godfall.dao.model.TraitSlot> traitSlots) {
        List<TraitSlot> out = new ArrayList<>();
        if (traitSlots != null) {
            for (org.imrofli.godfall.dao.model.TraitSlot entry : traitSlots) {
                out.add(convertTraitSlot(entry));
            }
        }
        return out;
    }

    public static List<Scaling> convertScalingsDao(Set<org.imrofli.godfall.dao.model.Scaling> scalings) {
        List<Scaling> out = new ArrayList<>();
        if (scalings != null) {
            for (org.imrofli.godfall.dao.model.Scaling entry : scalings) {
                out.add(convertScaling(entry));
            }
        }
        return out;
    }

    public static Scaling convertScaling(org.imrofli.godfall.dao.model.Scaling entry) {
        Scaling out = new Scaling();
        if (entry != null) {
            out.setId(entry.getId());
            out.setItemlevel(entry.getTierIdentifier());
            out.setRarity(convertRarity(entry.getRarity()));
            out.setPlayerLevelRequirement(entry.getPlayerTierRequirement());
            out.setMinWeaponDamage(entry.getMinWeaponDamage());
            out.setMaxWeaponDamage(entry.getMaxWeaponDamage());
            out.setMinPotionHeal(entry.getMinPotionHeal());
            out.setMaxPotionHeal(entry.getMaxPotionHeal());
            out.setMinBannerOvershield(entry.getMinBannerOvershield());
            out.setMaxBannerOvershield(entry.getMaxBannerOvershield());
            out.setPowerDrain(entry.getPowerDrain());
            out.setItemStrengthIndex(entry.getItemStrengthIndex());
            out.setCoreAttributeMin(entry.getCoreAttributeMin());
            out.setCoreAttributeMax(entry.getCoreAttributeMax());
            out.setCoreAttributePercentMin(entry.getCoreAttributePercentMin());
            out.setCoreAttributePercentMax(entry.getCoreAttributePercentMax());
            out.setDefensePercentMin(entry.getDefensePercentMin());
            out.setDefensePercentMax(entry.getDefensePercentMax());
            out.setReverseScalingMin(entry.getReverseScalingMin());
            out.setReverseScalingMax(entry.getReverseScalingMax());
            out.setNonScalingMin(entry.getNonScalingMin());
            out.setNonScalingMax(entry.getNonScalingMax());
            out.setPlayerPowerMin(entry.getPlayerPowerMin());
            out.setPlayerPowerMax(entry.getPlayerPowerMax());
            out.setPlayerHealthMin(entry.getPlayerHealthMin());
            out.setPlayerHealthMax(entry.getPlayerHealthMax());
            out.setAttributeNoVarianceMin(entry.getAttributeNoVarianceMin());
            out.setAttributeNoVarianceMax(entry.getAttributeNoVarianceMax());
            out.setHealthToDamageMin(entry.getHealthToDamageMin());
            out.setHealthToDamageMax(entry.getHealthToDamageMax());
            out.setNonScalingVarianceMin(entry.getNonScalingVarianceMin());
            out.setNonScalingVarianceMax(entry.getNonScalingVarianceMax());
            out.setNoVarianceCoreAttributePercentMin(entry.getNoVarianceCoreAttributePercentMin());
            out.setNoVarianceCoreAttributePercentMax(entry.getNoVarianceCoreAttributePercentMax());
            out.setNoVarianceDefensePercentMin(entry.getNoVarianceDefensePercentMin());
            out.setNoVarianceDefensePercentMax(entry.getNoVarianceDefensePercentMax());
            out.setNoVariancePlayerPowerMin(entry.getNoVariancePlayerPowerMin());
            out.setNoVariancePlayerPowerMax(entry.getNoVariancePlayerPowerMax());
            out.setNoVarianceHealthToDamageMin(entry.getNoVarianceHealthToDamageMin());
            out.setNoVarianceHealthToDamageMax(entry.getNoVarianceHealthToDamageMax());
            out.setNoVariancePlayerHealthMax(entry.getNoVariancePlayerHealthMax());
            out.setNoVariancePlayerHealthMin(entry.getNoVariancePlayerHealthMin());

        }
        return out;
    }

    private static TraitSlot convertTraitSlot(org.imrofli.godfall.dao.model.TraitSlot entry) {
        TraitSlot out = new TraitSlot();
        if (entry != null) {
            out.setName(entry.getName());
            out.setSlotIndex(entry.getSlotIndex());
            out.setGroupName(entry.getGroupName());
            out.setSlottype(convertSlotType(entry.getSlotType()));
            out.setTraitCategoryGroup(convertSlotType(entry.getTraitCategoryGroup()));
            out.setMinimumrarity(convertRarity(entry.getMinimumRarity()));
            out.setMaximumrarity(convertRarity(entry.getMaximumRarity()));
            out.setSlotchance(entry.getSlotChance());
            out.setTraitchance(entry.getTraitChance());
            out.setDisplayname(entry.getDisplayName());
        }
        return out;
    }

    private static SlotType convertSlotType(org.imrofli.godfall.dao.model.SlotType slotType) {
        switch (slotType) {
            case PRIMARY_TRAIT:
                return SlotType.PRIMARY_TRAIT;
            case PRIMARY_ATTRIBUTE:
                return SlotType.PRIMARY_ATTRIBUTE;
            case MASTERWORK_TRAIT:
                return SlotType.MASTERWORK_TRAIT;
            default:
                return SlotType.SECONDARY_TRAIT;
        }
    }

    private static List<String> convertStringSet(Set<String> tags) {
        List<String> out = new ArrayList<>();
        if (tags != null) {
            out.addAll(tags);
        }
        return out;
    }

    public static List<Charm> convertCharmDaoList(Set<org.imrofli.godfall.dao.model.Trinket> trinketSet) {
        List<Charm> out = new ArrayList<>();
        for (org.imrofli.godfall.dao.model.Trinket trinket : trinketSet) {
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
        out.setElements(convertElementsToList(trinket.getElements()));
        out.setAffinities(convertAffinitySet(trinket.getAffinities()));
        out.setDisplayname(trinket.getDisplayName());
        out.setDisplaydescription(trinket.getDisplayDescription());
        out.setTags(convertStringSet(trinket.getTags()));
        out.setBlacklisttags(convertStringSet(trinket.getBlacklistTags()));
        out.setTraitslots(convertTraitSlots(trinket.getTraitSlots()));

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

    public static List<GlobalParameters> convertGlobalParameterSetDao(Set<org.imrofli.godfall.dao.model.GlobalParameters> entrySet) {
        List<GlobalParameters> out = new ArrayList<>();
        if (entrySet != null) {
            for (org.imrofli.godfall.dao.model.GlobalParameters entry : entrySet) {
                out.add(convertGlobalParameterDao(entry));
            }
        }
        return out;

    }

    public static GlobalParameters convertGlobalParameterDao(org.imrofli.godfall.dao.model.GlobalParameters entry) {
        GlobalParameters globalParameters = new GlobalParameters();
        globalParameters.setId(entry.getId());
        globalParameters.setLootTierBonusScalar(entry.getLootTierBonusScalar());
        globalParameters.setShieldBaseDamage(entry.getShieldBaseDamage());
        globalParameters.setShieldBaseCooldown(entry.getShieldBaseCooldown());
        globalParameters.setArchonModeBaseDamage(entry.getArchonModeBaseDamage());
        globalParameters.setBaseValorplateHealth(entry.getBaseValorplateHealth());
        globalParameters.setActivityMaxNumDeaths(entry.getActivityMaxNumDeaths());
        globalParameters.setSpiritArchonDamageMultiplier(entry.getSpiritArchonDamageMultiplier());
        globalParameters.setSpiritBombDamageMultiplier(entry.getSpiritBombDamageMultiplier());
        globalParameters.setLowTierMissionXpPenalty(entry.getLowTierMissionXpPenalty());
        globalParameters.setLootComboChargePerAetherium(entry.getLootComboChargePerAetherium());
        globalParameters.setStarterWeaponMain(entry.getStarterWeaponMain());
        globalParameters.setStarterWeaponOffhand(entry.getStarterWeaponOffhand());
        globalParameters.setWeaponMasteryXpBaseAmount(entry.getWeaponMasteryXpBaseAmount());
        globalParameters.setRandomNumberExponent(entry.getRandomNumberExponent());
        globalParameters.setAilmentHealthRegenDelay(entry.getAilmentHealthRegenDelay());
        globalParameters.setAilmentHealthRegenRate(entry.getAilmentHealthRegenRate());
        globalParameters.setBaseTakedownHeal(entry.getBaseTakedownHeal());
        globalParameters.setSpiritTakedownHealMultiplier(entry.getSpiritTakedownHealMultiplier());
        globalParameters.setBaseTakedownArchonCharge(entry.getBaseTakedownArchonCharge());
        globalParameters.setExperienceInclusionRadius(entry.getExperienceInclusionRadius());
        globalParameters.setArchonExplosionDamage(entry.getArchonExplosionDamage());
        globalParameters.setArchonExplosionBreachPower(entry.getArchonExplosionBreachPower());
        globalParameters.setArchonExplosionImpactDisplacement(entry.getArchonExplosionImpactDisplacement());
        globalParameters.setPhysicalResistanceMax(entry.getPhysicalResistanceMax());
        globalParameters.setFireResistanceMax(entry.getFireResistanceMax());
        globalParameters.setWaterResistanceMax(entry.getWaterResistanceMax());
        globalParameters.setAirResistanceMax(entry.getAirResistanceMax());
        globalParameters.setEarthResistanceMax(entry.getEarthResistanceMax());
        globalParameters.setVoidResistanceMax(entry.getVoidResistanceMax());
        globalParameters.setPhysicalResistancePostModifierMax(entry.getPhysicalResistancePostModifierMax());
        globalParameters.setFireResistancePostModifierMax(entry.getFireResistancePostModifierMax());
        globalParameters.setWaterResistancePostModifierMax(entry.getWaterResistancePostModifierMax());
        globalParameters.setAirResistancePostModifierMax(entry.getAirResistancePostModifierMax());
        globalParameters.setEarthResistancePostModifierMax(entry.getEarthResistancePostModifierMax());
        globalParameters.setVoidResistancePostModifierMax(entry.getVoidResistancePostModifierMax());
        globalParameters.setMainQuestType(entry.getMainQuestType());
        globalParameters.setPlayerBaseMapIdentifier(entry.getPlayerBaseMapIdentifier());
        globalParameters.setFtueProgressionFlagId(entry.getFtueProgressionFlagId());
        globalParameters.setProgressionFlagRequiredForAchievements(entry.getProgressionFlagRequiredForAchievements());
        globalParameters.setProgressionFlagRequiredForPersonalMenu(entry.getProgressionFlagRequiredForPersonalMenu());
        globalParameters.setProgressionFlagRequiredForCodexEntries(entry.getProgressionFlagRequiredForCodexEntries());
        globalParameters.setProgressionFlagRequiredForDreamstoneMode(entry.getProgressionFlagRequiredForDreamstoneMode());
        globalParameters.setTowerOfTrialsEndgameStartingFloor(entry.getTowerOfTrialsEndgameStartingFloor());
        globalParameters.setDefaultDifficultyIdentifier(entry.getDefaultDifficultyIdentifier());
        globalParameters.setMaxExpPenaltyScalar(entry.getMaxExpPenaltyScalar());
        globalParameters.setBaseWeaponDamage(entry.getBaseWeaponDamage());
        globalParameters.setMightWeaponDamageMultiplier(entry.getMightWeaponDamageMultiplier());
        globalParameters.setSpiritWeaponDamageMultiplier(entry.getSpiritWeaponDamageMultiplier());
        globalParameters.setVitalityHealthMultiplier(entry.getVitalityHealthMultiplier());
        globalParameters.setSpiritSpectralDamageMultiplier(entry.getSpiritSpectralDamageMultiplier());
        globalParameters.setPotionBaseHealAmount(entry.getPotionBaseHealAmount());
        globalParameters.setSpiritPotionHealScalar(entry.getSpiritPotionHealScalar());
        globalParameters.setPotionBaseCharges(entry.getPotionBaseCharges());
        globalParameters.setPotionBaseHealDuration(entry.getPotionBaseHealDuration());
        globalParameters.setPotionBaseSecondaryTraitDuration(entry.getPotionBaseSecondaryTraitDuration());
        globalParameters.setMinCriticalHitChance(entry.getMinCriticalHitChance());
        globalParameters.setMaxCriticalHitChance(entry.getMaxCriticalHitChance());
        globalParameters.setDefaultCriticalHitChance(entry.getDefaultCriticalHitChance());
        globalParameters.setMinCriticalHitMultiplier(entry.getMinCriticalHitMultiplier());
        globalParameters.setDefaultCriticalHitMultiplier(entry.getDefaultCriticalHitMultiplier());
        globalParameters.setAetheriumArchonBaseChargeAmount(entry.getAetheriumArchonBaseChargeAmount());
        globalParameters.setAetheriumPotionRefillChargeAmount(entry.getAetheriumPotionRefillChargeAmount());
        globalParameters.setAetheriumPotionChargesGained(entry.getAetheriumPotionChargesGained());
        globalParameters.setAetheriumSpectralCooldownReduction(entry.getAetheriumSpectralCooldownReduction());
        globalParameters.setBannerBaseCooldown(entry.getBannerBaseCooldown());
        globalParameters.setBannerBaseDuration(entry.getBannerBaseDuration());
        globalParameters.setBannerBaseRadius(entry.getBannerBaseRadius());
        globalParameters.setBannerSpiritOvershieldScalar(entry.getBannerSpiritOvershieldScalar());
        globalParameters.setBombBaseDamage(entry.getBombBaseDamage());
        globalParameters.setBombBaseCooldown(entry.getBombBaseCooldown());
        globalParameters.setBombBaseRadius(entry.getBombBaseRadius());
        globalParameters.setBombBaseBreachDamage(entry.getBombBaseBreachDamage());
        globalParameters.setOvershieldDegenDelay(entry.getOvershieldDegenDelay());
        globalParameters.setOvershieldDegenRate(entry.getOvershieldDegenRate());
        globalParameters.setDamageReductionBuffProductMin(entry.getDamageReductionBuffProductMin());
        globalParameters.setDamageDebuffProductMin(entry.getDamageDebuffProductMin());
        globalParameters.setArchonChargeBaseChargePerSecond(entry.getArchonChargeBaseChargePerSecond());
        globalParameters.setArchonDrainPerAttack(entry.getArchonDrainPerAttack());
        globalParameters.setBaseTakedownDamage(entry.getBaseTakedownDamage());
        globalParameters.setSpiritTakedownDamageMultiplier(entry.getSpiritTakedownDamageMultiplier());
        globalParameters.setBaseDrainDamage(entry.getBaseDrainDamage());
        globalParameters.setVitalityDrainDamageMultiplier(entry.getVitalityDrainDamageMultiplier());
        globalParameters.setPolarityShockwaveBaseDamage(entry.getPolarityShockwaveBaseDamage());
        globalParameters.setSpiritPolarityShockwaveDamageMultiplier(entry.getSpiritPolarityShockwaveDamageMultiplier());
        globalParameters.setAscendedItemInitialUpgradeRank(entry.getAscendedItemInitialUpgradeRank());
        globalParameters.setAscendedItemImprovedTraitTierOffset(entry.getAscendedItemImprovedTraitTierOffset());
        globalParameters.setAscendedItemMinRarityIdentifier(convertRarity(entry.getAscendedItemMinRarityIdentifier()));
        globalParameters.setMaxCoopAdjustedLootTier(entry.getMaxCoopAdjustedLootTier());
        return globalParameters;
    }

    public static List<PlayerStrengthIndex> convertPlayerStrengthIndexSetDao(Set<org.imrofli.godfall.dao.model.PlayerStrengthIndex> entrySet) {
        List<PlayerStrengthIndex> out = new ArrayList<>();
        if (entrySet != null) {
            for (org.imrofli.godfall.dao.model.PlayerStrengthIndex entry : entrySet) {
                out.add(convertPlayerStrengthIndexDao(entry));
            }
        }
        return out;

    }


    public static PlayerStrengthIndex convertPlayerStrengthIndexDao(org.imrofli.godfall.dao.model.PlayerStrengthIndex entry) {
        PlayerStrengthIndex out = new PlayerStrengthIndex();
        if (entry != null) {
            out.setId(entry.getId());
            out.setPlayerStrengthIndex(entry.getPlayerStrengthIndex());
            out.setPowerMultiplierArchonMode(entry.getPowerMultiplierArchonMode());
            out.setPowerMultiplierWeaponSpectral(entry.getPowerMultiplierWeaponSpectral());
            out.setPowerMultiplierPolarityShockwave(entry.getPowerMultiplierPolarityShockwave());
            out.setTakedownMultiplier(entry.getTakedownMultiplier());
            out.setPowerMultiplierDrain(entry.getPowerMultiplierDrain());
        }
        return out;
    }

    public static List<PlayerTier> convertPlayerTierSetDao(Set<org.imrofli.godfall.dao.model.PlayerTier> entrySet) {
        List<PlayerTier> out = new ArrayList<>();
        if (entrySet != null) {
            for (org.imrofli.godfall.dao.model.PlayerTier entry : entrySet) {
                out.add(convertPlayerTierDao(entry));
            }
        }
        return out;

    }


    public static PlayerTier convertPlayerTierDao(org.imrofli.godfall.dao.model.PlayerTier entry) {
        PlayerTier out = new PlayerTier();
        if (entry != null) {
            out.setId(entry.getId());
            out.setTier(entry.getTier());
            out.setCoopScalingPlayerMinTier(entry.getCoopScalingPlayerMinTier());
            out.setCoopScalingPlayerMaxTier(entry.getCoopScalingPlayerMaxTier());
            out.setTotalXpRequired(entry.getTotalXpRequired());
            out.setTotalSkillPoints(entry.getTotalSkillPoints());
            out.setMight(entry.getMight());
            out.setVitality(entry.getVitality());
            out.setSpirit(entry.getSpirit());
            out.setBaseHealth(entry.getBaseHealth());
            out.setExpPenaltySafeTierDifference(entry.getExpPenaltySafeTierDifference());
            out.setExpPenaltyMaxTierDifference(entry.getExpPenaltyMaxTierDifference());
            out.setPowerCapacity(entry.getPowerCapacity());
        }
        return out;
    }

    public static List<EnemyTier> convertEnemyTierSetDao(Set<org.imrofli.godfall.dao.model.EnemyTier> entrySet) {
        List<EnemyTier> out = new ArrayList<>();
        if (entrySet != null) {
            for (org.imrofli.godfall.dao.model.EnemyTier entry : entrySet) {
                out.add(convertEnemyTierDao(entry));
            }
        }
        return out;

    }


    public static EnemyTier convertEnemyTierDao(org.imrofli.godfall.dao.model.EnemyTier entry) {
        EnemyTier out = new EnemyTier();
        if (entry != null) {
            out.setId(entry.getId());
            out.setTier(entry.getTier());
            out.setDamageScalar(entry.getDamageScalar());
            out.setBreachHealthScalar(entry.getBreachHealthScalar());
            out.setExperienceScalar(entry.getExperienceScalar());
            out.setHealthScalar(entry.getHealthScalar());
        }
        return out;
    }

    public static List<EnemyClass> convertEnemyClassSetDao(Set<org.imrofli.godfall.dao.model.EnemyClass> entrySet) {
        List<EnemyClass> out = new ArrayList<>();
        if (entrySet != null) {
            for (org.imrofli.godfall.dao.model.EnemyClass entry : entrySet) {
                out.add(convertEnemyClassDao(entry));
            }
        }
        return out;

    }


    public static EnemyClass convertEnemyClassDao(org.imrofli.godfall.dao.model.EnemyClass entry) {
        EnemyClass out = new EnemyClass();
        if (entry != null) {
            out.setId(entry.getId());
            out.setName(entry.getName());
            out.setArchonChargeGainMultiplier(entry.getArchonChargeGainMultiplier());
            out.setEnemyclasslevels(convertEnemyClassLvlSetDao(entry.getEnemyclasslevels()));

        }
        return out;
    }

    public static List<EnemyClassLvl> convertEnemyClassLvlSetDao(Set<org.imrofli.godfall.dao.model.EnemyClassLvl> entrySet) {
        List<EnemyClassLvl> out = new ArrayList<>();
        if (entrySet != null) {
            for (org.imrofli.godfall.dao.model.EnemyClassLvl entry : entrySet) {
                out.add(convertEnemyClassLvlDao(entry));
            }
        }
        return out;

    }


    public static EnemyClassLvl convertEnemyClassLvlDao(org.imrofli.godfall.dao.model.EnemyClassLvl entry) {
        EnemyClassLvl out = new EnemyClassLvl();
        if (entry != null) {
            out.setId(entry.getId());
            out.setBreachHealthScalar(entry.getBreachHealthScalar());
            out.setBreachHealthRegenScalar(entry.getBreachHealthRegenScalar());
            out.setExperienceScalar(entry.getExperienceScalar());
            out.setHealthScalar(entry.getHealthScalar());
            out.setBreachRechargeDurationScalar(entry.getBreachRechargeDurationScalar());
            out.setQuantityScalar(entry.getQuantityScalar());
        }
        return out;
    }

    public static List<Enemy> convertEnemySetDao(Set<org.imrofli.godfall.dao.model.Enemy> entrySet) {
        List<Enemy> out = new ArrayList<>();
        if (entrySet != null) {
            for (org.imrofli.godfall.dao.model.Enemy entry : entrySet) {
                out.add(convertEnemyDao(entry));
            }
        }
        return out;

    }


    public static Enemy convertEnemyDao(org.imrofli.godfall.dao.model.Enemy entry) {
        Enemy out = new Enemy();
        if (entry != null) {
            out.setId(entry.getId());
            out.setName(entry.getName());
            out.setEnemyType(entry.getEnemyType());
            out.setGameplayTag(entry.getGameplayTag());
            out.setExperienceGranted(entry.getExperienceGranted());
            out.setLootEventRulesType(entry.getLootEventRulesType());
        }
        return out;
    }

    public static List<EffectMagnitude> convertMagnitudeList(Set<org.imrofli.godfall.dao.model.EffectMagnitude> magnitudes) {
        List<EffectMagnitude> out = new ArrayList<>();
        if (magnitudes != null) {
            for (org.imrofli.godfall.dao.model.EffectMagnitude entry : magnitudes) {
                out.add(convertMagnitude(entry));
            }
        }
        return out;
    }

    public static EffectMagnitude convertMagnitude(org.imrofli.godfall.dao.model.EffectMagnitude magnitude) {
        EffectMagnitude out = new EffectMagnitude();
        out.setName(magnitude.getName());
        out.setScalar(magnitude.getScalar());
        out.setConditionparamtype(convertParameterType(magnitude.getParameterType()));
        out.setCalculatedvalues(convertCalculatedValuesDaoSet(magnitude.getCalculatedMagnitudes()));
        return out;
    }

    private static List<CalculatedMagnitude> convertCalculatedValuesDaoSet(Set<org.imrofli.godfall.dao.model.CalculatedMagnitude> calculatedMagnitudes) {
        List<CalculatedMagnitude> out = new ArrayList<>();
        if (calculatedMagnitudes != null) {
            for (org.imrofli.godfall.dao.model.CalculatedMagnitude entry : calculatedMagnitudes) {
                out.add(convertCalculatedValuesDao(entry));
            }
        }
        return out;
    }

    private static CalculatedMagnitude convertCalculatedValuesDao(org.imrofli.godfall.dao.model.CalculatedMagnitude calculatedMagnitude) {
        CalculatedMagnitude out = new CalculatedMagnitude();
        if (calculatedMagnitude != null) {
            out.setLevel(calculatedMagnitude.getLevel());
            out.setRarity(convertRarity(calculatedMagnitude.getRarity()));
            out.setCalculatedmin(calculatedMagnitude.getMinimum());
            out.setCalculatedmax(calculatedMagnitude.getMaximum());
        }
        return out;
    }

    public static ConditionParamCategory convertParamCategory(org.imrofli.godfall.dao.model.ConditionParamCategory paramCategory) {
        ConditionParamCategory out = new ConditionParamCategory();
        if (paramCategory.getAffinity() != null) {
            out.setAffinity(convertAffinity(paramCategory.getAffinity()));
        }
        if (paramCategory.getColor() != null) {
            out.setColor(convertColor(paramCategory.getColor()));
        }
        return out;
    }

    public static Affinity convertAffinity(org.imrofli.godfall.dao.model.Affinity affinity) {
        switch (affinity) {
            case VITALITY:
                return Affinity.VITALITY;
            case MIGHT:
                return Affinity.MIGHT;
            default:
                return Affinity.SPIRIT;
        }
    }

    public static List<Affinity> convertAffinitySet(Set<org.imrofli.godfall.dao.model.Affinity> affinitySet) {
        List<Affinity> out = new ArrayList<>();
        if (affinitySet != null) {
            for (org.imrofli.godfall.dao.model.Affinity entry : affinitySet) {
                out.add(convertAffinity(entry));
            }
        }
        return out;
    }

    public static TraitType convertTraitType(org.imrofli.godfall.dao.model.TraitType traitType) {
        switch (traitType) {
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
        if (weaponType == null) {
            return null;
        }
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
        if (elements != null) {
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
        }
        if (itemElements.isEmpty()) {
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

    public static org.imrofli.godfall.dao.model.Rarity convertRarityBack(Rarity rarity) {
        switch (rarity) {
            case LEGENDARY:
                return org.imrofli.godfall.dao.model.Rarity.LEGENDARY;
            case EXOTIC:
                return org.imrofli.godfall.dao.model.Rarity.EXOTIC;
            case EPIC:
                return org.imrofli.godfall.dao.model.Rarity.EPIC;
            case RARE:
                return org.imrofli.godfall.dao.model.Rarity.RARE;
            case UNCOMMON:
                return org.imrofli.godfall.dao.model.Rarity.UNCOMMON;
            default:
                return org.imrofli.godfall.dao.model.Rarity.COMMON;
        }
    }
}
