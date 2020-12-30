package org.imrofli.godfall.helpers;

import org.apache.commons.collections4.list.SetUniqueList;
import org.imrofli.godfall.api.model.*;
import org.imrofli.godfall.dao.model.*;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class DaoToViewInterpreter {

    public static List<Weapon> convertWeaponDaoList(Set<WeaponModel> weaponSet) {
        List<Weapon> out = new ArrayList<>();
        for (WeaponModel weapon : weaponSet) {
            out.add(convertWeaponDao(weapon));
        }
        return out;
    }

    public static Weapon convertWeaponDao(WeaponModel weapon) {
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
        out.setVersion(convertVersionModelDao(weapon.getVersion()));

        return out;
    }

    public static List<Augment> convertAugmentDaoList(Set<AugmentModel> augmentSet) {
        List<Augment> out = new ArrayList<>();
        for (AugmentModel augment : augmentSet) {
            out.add(convertAugmentDao(augment));
        }
        return out;
    }

    public static Augment convertAugmentDao(AugmentModel augment) {
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
        out.setVersion(convertVersionModelDao(augment.getVersion()));
        return out;
    }

    public static List<Banner> convertBannerDaoList(Set<BannerModel> bannerSet) {
        List<Banner> out = new ArrayList<>();
        for (BannerModel banner : bannerSet) {
            out.add(convertBannerDao(banner));
        }
        return out;
    }

    public static Banner convertBannerDao(BannerModel banner) {
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
        out.setVersion(convertVersionModelDao(banner.getVersion()));
        return out;
    }

    public static List<LifeStone> convertLifeStoneDaoList(Set<LifeStoneModel> lifeStoneSet) {
        List<LifeStone> out = new ArrayList<>();
        for (LifeStoneModel lifeStone : lifeStoneSet) {
            out.add(convertLifeStoneDao(lifeStone));
        }
        return out;
    }

    public static LifeStone convertLifeStoneDao(LifeStoneModel lifeStone) {
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
        out.setVersion(convertVersionModelDao(lifeStone.getVersion()));
        return out;
    }

    public static List<Ring> convertRingDaoList(Set<TrinketModel> trinketSet) {
        List<Ring> out = new ArrayList<>();
        for (TrinketModel trinket : trinketSet) {
            out.add(convertRingDao(trinket));
        }
        return out;
    }

    public static Ring convertRingDao(TrinketModel trinket) {
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
        out.setVersion(convertVersionModelDao(trinket.getVersion()));
        return out;
    }

    public static List<Amulet> convertAmuletDaoList(Set<TrinketModel> trinketSet) {
        List<Amulet> out = new ArrayList<>();
        for (TrinketModel trinket : trinketSet) {
            out.add(convertAmuletDao(trinket));
        }
        return out;
    }

    public static Amulet convertAmuletDao(TrinketModel trinket) {
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
        out.setVersion(convertVersionModelDao(trinket.getVersion()));
        return out;
    }

    public static List<TraitSlot> convertTraitSlots(Set<TraitSlotModel> traitSlots) {
        List<TraitSlot> out = new ArrayList<>();
        if (traitSlots != null) {
            for (TraitSlotModel entry : traitSlots) {
                out.add(convertTraitSlot(entry));
            }
        }
        return out;
    }

    public static List<Scaling> convertScalingsDao(Set<ScalingModel> scalings) {
        List<Scaling> out = new ArrayList<>();
        if (scalings != null) {
            for (ScalingModel entry : scalings) {
                out.add(convertScaling(entry));
            }
        }
        return out;
    }

    public static Scaling convertScaling(ScalingModel entry) {
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
            out.setVersion(convertVersionModelDao(entry.getVersion()));
        }
        return out;
    }

    private static TraitSlot convertTraitSlot(TraitSlotModel entry) {
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

    private static SlotType convertSlotType(SlotTypeModel slotType) {
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

    public static List<Charm> convertCharmDaoList(Set<TrinketModel> trinketSet) {
        List<Charm> out = new ArrayList<>();
        for (TrinketModel trinket : trinketSet) {
            out.add(convertCharmDao(trinket));
        }
        return out;
    }

    public static Charm convertCharmDao(TrinketModel trinket) {
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
        out.setVersion(convertVersionModelDao(trinket.getVersion()));
        return out;
    }

    public static List<LootInfo> convertLootInfoDaoList(Set<LootInfoModel> lootInfoSet) {
        List<LootInfo> out = new ArrayList<>();
        for (LootInfoModel lootInfo : lootInfoSet) {
            out.add(convertLootInfoDao(lootInfo));
        }
        return out;
    }

    public static LootInfo convertLootInfoDao(LootInfoModel lootInfo) {
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
        out.setVersion(convertVersionModelDao(lootInfo.getVersion()));
        return out;
    }

    public static List<Version> convertVersionModelDaoSet(Set<VersionModel> versionModelSet) {
        List<Version> out = new ArrayList<>();
        for (VersionModel versionModel : versionModelSet) {
            out.add(convertVersionModelDao(versionModel));
        }
        return out;
    }

    public static Version convertVersionModelDao(VersionModel versionModel) {
        Version out = new Version();
        out.setId(versionModel.getId());
        out.setVersion(versionModel.getVersion());
        OffsetDateTime offset = OffsetDateTime.ofInstant(versionModel.getLoadTime().toInstant(), ZoneId.systemDefault());
        out.setLoadtime(offset);

        return out;
    }

    public static List<Trait> convertTraitSetDao(Set<TraitModel> traitSet) {
        List<Trait> out = new ArrayList<>();
        for (TraitModel entry : traitSet) {
            out.add(convertTraitDao(entry));
        }
        return out;
    }

    public static Trait convertTraitDao(TraitModel trait) {
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
        out.setVersion(convertVersionModelDao(trait.getVersion()));
        return out;
    }

    public static List<TraitRequirement> convertTagRequirementSet(Set<TagRequirementModel> requirements) {
        List<TraitRequirement> out = new ArrayList<>();
        if (requirements != null) {
            for (TagRequirementModel entry : requirements) {
                out.add(convertTagRequirement(entry));
            }
        }
        return out;
    }

    public static TraitRequirement convertTagRequirement(TagRequirementModel requirement) {
        TraitRequirement out = new TraitRequirement();
        out.setGameplayTag(requirement.getName());
        out.setActorType(requirement.getActorType());
        if ("Required".equalsIgnoreCase(requirement.getRequireOrIgnore())) {
            out.setRequired(true);
        } else {
            out.setRequired(false);
        }
        return out;
    }

    public static TraitCategory convertTraitCategory(TraitCategoryModel traitCategory) {
        TraitCategory out = new TraitCategory();
        if (traitCategory != null) {
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

    public static List<LootEffect> convertLootEffectList(Set<LootEffectModel> lootEffects) {
        List<LootEffect> out = new ArrayList<>();
        if (lootEffects != null) {
            for (LootEffectModel entry : lootEffects) {
                out.add(convertLootEffect(entry));
            }
        }
        return out;
    }

    public static Valorplate convertValorplate(ValorplateModel valorplate) {
        Valorplate out = new Valorplate();
        out.setName(valorplate.getName());
        out.setGameplaytag(valorplate.getGameplayTag());
        out.setArchonChargeGainMultiplier(valorplate.getArchonChargeGainMultiplier());
        out.setDisplayname(valorplate.getDisplayname());
        out.setId(valorplate.getId());
        out.setAetheriumArchonChargeRate(valorplate.getAetheriumArchonChargeRate());
        out.setArchonDamageScalar(valorplate.getArchonDamageScalar());
        out.setArchonModeDamageReduction(valorplate.getArchonModeDamageReduction());
        out.setEnabled(valorplate.getEnabled());
        out.setStartinglevel(valorplate.getStartinglevel());
        out.setArchonChargeGainMultiplier(valorplate.getArchonChargeGainMultiplier());
        out.setArchonModeDrainRate(valorplate.getArchonModeDrainRate());
        out.setArchonmode(convertArchonMode(valorplate.getArchonmode()));
        out.setAugmentGraphs(convertAugmentGraphsSet(valorplate.getAugmentGraphs()));
        out.setVersion(convertVersionModelDao(valorplate.getVersion()));
        return out;
    }

    private static List<AugmentGraph> convertAugmentGraphsSet(Set<AugmentGraphModel> augmentGraphs) {
        List<AugmentGraph> out = new ArrayList<>();
        if (augmentGraphs != null) {
            for (AugmentGraphModel entry : augmentGraphs) {
                out.add(convertAugmentGraph(entry));
            }
        }
        return out;
    }

    public static Skill convertSkillDao(SkillModel entry) {
        Skill out = new Skill();
        if (entry != null) {
            out.setId(entry.getId());
            out.setDisplaydescription(entry.getDisplaydescription());
            out.setDisplayname(entry.getDisplayname());
            out.setName(entry.getName());
            out.setSkillgroup(entry.getSkillgroup());
            out.setMinPoints(entry.getMinPoints());
            out.setTraitname(entry.getTraitname());
            out.setVersion(convertVersionModelDao(entry.getVersion()));
        }
        return out;
    }

    public static List<Skill> convertSkillDaoSet(Set<SkillModel> skillSet) {
        List<Skill> out = new ArrayList<>();
        if (skillSet != null) {
            for (SkillModel entry : skillSet) {
                out.add(convertSkillDao(entry));
            }
        }
        return out;
    }

    private static AugmentGraph convertAugmentGraph(AugmentGraphModel entry) {
        AugmentGraph out = new AugmentGraph();
        if (entry != null) {
            out.setGraphName(entry.getGraphName());
            out.setGameplayTag(entry.getGameplayTag());
            out.setNodeid(entry.getNodeid());
            out.setLevelAvailable(entry.getLevelAvailable());
            out.setAffinityRequirement(convertAffinity(entry.getAffinityRequirement()));
        }
        return out;
    }

    private static ArchonMode convertArchonMode(ArchonModeModel archonmode) {
        ArchonMode out = new ArchonMode();
        if (archonmode != null) {
            out.setGameplayTag(archonmode.getGameplayTag());
            out.setAlwaysOn(convertStringSet(archonmode.getAlwaysOn()));
            out.setOnActivation(convertStringSet(archonmode.getOnActivation()));
            out.setWhileActive(convertStringSet(archonmode.getWhileActive()));
        }
        return out;
    }

    public static List<Valorplate> convertValorplateList(Set<ValorplateModel> valorplates) {
        List<Valorplate> out = new ArrayList<>();
        if (valorplates != null) {
            for (ValorplateModel entry : valorplates) {
                out.add(convertValorplate(entry));
            }
        }
        return out;
    }

    public static LootEffect convertLootEffect(LootEffectModel lootEffect) {
        LootEffect out = new LootEffect();
        out.setName(lootEffect.getName());
        out.setMagnitudes(convertMagnitudeList(lootEffect.getMagnitudes()));
        return out;
    }

    public static List<ConditionalLootEffect> convertConditionalLootEffectList(Set<ConditionalLootEffectModel> lootEffects) {
        List<ConditionalLootEffect> out = new ArrayList<>();
        if (lootEffects != null) {
            for (ConditionalLootEffectModel entry : lootEffects) {
                out.add(convertConditionalLootEffect(entry));
            }
        }
        return out;
    }

    public static ConditionalLootEffect convertConditionalLootEffect(ConditionalLootEffectModel lootEffect) {
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

    public static List<GlobalParameters> convertGlobalParameterSetDao(Set<GlobalParametersModel> entrySet) {
        List<GlobalParameters> out = new ArrayList<>();
        if (entrySet != null) {
            for (GlobalParametersModel entry : entrySet) {
                out.add(convertGlobalParameterDao(entry));
            }
        }
        return out;

    }

    public static GlobalParameters convertGlobalParameterDao(GlobalParametersModel entry) {
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
        globalParameters.setVersion(convertVersionModelDao(entry.getVersion()));
        return globalParameters;
    }

    public static List<PlayerStrengthIndex> convertPlayerStrengthIndexSetDao(Set<PlayerStrengthIndexModel> entrySet) {
        List<PlayerStrengthIndex> out = new ArrayList<>();
        if (entrySet != null) {
            for (PlayerStrengthIndexModel entry : entrySet) {
                out.add(convertPlayerStrengthIndexDao(entry));
            }
        }
        return out;

    }


    public static PlayerStrengthIndex convertPlayerStrengthIndexDao(PlayerStrengthIndexModel entry) {
        PlayerStrengthIndex out = new PlayerStrengthIndex();
        if (entry != null) {
            out.setId(entry.getId());
            out.setPlayerStrengthIndex(entry.getPlayerStrengthIndex());
            out.setPowerMultiplierArchonMode(entry.getPowerMultiplierArchonMode());
            out.setPowerMultiplierWeaponSpectral(entry.getPowerMultiplierWeaponSpectral());
            out.setPowerMultiplierPolarityShockwave(entry.getPowerMultiplierPolarityShockwave());
            out.setTakedownMultiplier(entry.getTakedownMultiplier());
            out.setPowerMultiplierDrain(entry.getPowerMultiplierDrain());
            out.setVersion(convertVersionModelDao(entry.getVersion()));
        }
        return out;
    }

    public static List<PlayerTier> convertPlayerTierSetDao(Set<PlayerTierModel> entrySet) {
        List<PlayerTier> out = new ArrayList<>();
        if (entrySet != null) {
            for (PlayerTierModel entry : entrySet) {
                out.add(convertPlayerTierDao(entry));
            }
        }
        return out;

    }


    public static PlayerTier convertPlayerTierDao(PlayerTierModel entry) {
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
            out.setVersion(convertVersionModelDao(entry.getVersion()));
        }
        return out;
    }

    public static List<EnemyTier> convertEnemyTierSetDao(Set<EnemyTierModel> entrySet) {
        List<EnemyTier> out = new ArrayList<>();
        if (entrySet != null) {
            for (EnemyTierModel entry : entrySet) {
                out.add(convertEnemyTierDao(entry));
            }
        }
        return out;

    }


    public static EnemyTier convertEnemyTierDao(EnemyTierModel entry) {
        EnemyTier out = new EnemyTier();
        if (entry != null) {
            out.setId(entry.getId());
            out.setTier(entry.getTier());
            out.setDamageScalar(entry.getDamageScalar());
            out.setBreachHealthScalar(entry.getBreachHealthScalar());
            out.setExperienceScalar(entry.getExperienceScalar());
            out.setHealthScalar(entry.getHealthScalar());
            out.setVersion(convertVersionModelDao(entry.getVersion()));
        }
        return out;
    }

    public static List<EnemyClass> convertEnemyClassSetDao(Set<EnemyClassModel> entrySet) {
        List<EnemyClass> out = new ArrayList<>();
        if (entrySet != null) {
            for (EnemyClassModel entry : entrySet) {
                out.add(convertEnemyClassDao(entry));
            }
        }
        return out;

    }


    public static EnemyClass convertEnemyClassDao(EnemyClassModel entry) {
        EnemyClass out = new EnemyClass();
        if (entry != null) {
            out.setId(entry.getId());
            out.setName(entry.getName());
            out.setArchonChargeGainMultiplier(entry.getArchonChargeGainMultiplier());
            out.setEnemyclasslevels(convertEnemyClassLvlSetDao(entry.getEnemyclasslevels()));
            out.setVersion(convertVersionModelDao(entry.getVersion()));
        }
        return out;
    }

    public static List<EnemyClassLvl> convertEnemyClassLvlSetDao(Set<EnemyClassLvlModel> entrySet) {
        List<EnemyClassLvl> out = new ArrayList<>();
        if (entrySet != null) {
            for (EnemyClassLvlModel entry : entrySet) {
                out.add(convertEnemyClassLvlDao(entry));
            }
        }
        return out;

    }


    public static EnemyClassLvl convertEnemyClassLvlDao(EnemyClassLvlModel entry) {
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

    public static List<Enemy> convertEnemySetDao(Set<EnemyModel> entrySet) {
        List<Enemy> out = new ArrayList<>();
        if (entrySet != null) {
            for (EnemyModel entry : entrySet) {
                out.add(convertEnemyDao(entry));
            }
        }
        return out;

    }


    public static Enemy convertEnemyDao(EnemyModel entry) {
        Enemy out = new Enemy();
        if (entry != null) {
            out.setId(entry.getId());
            out.setName(entry.getName());
            out.setEnemyType(entry.getEnemyType());
            out.setGameplayTag(entry.getGameplayTag());
            out.setExperienceGranted(entry.getExperienceGranted());
            out.setLootEventRulesType(entry.getLootEventRulesType());
            out.setVersion(convertVersionModelDao(entry.getVersion()));
        }
        return out;
    }

    public static List<EffectMagnitude> convertMagnitudeList(Set<EffectMagnitudeModel> magnitudes) {
        List<EffectMagnitude> out = new ArrayList<>();
        if (magnitudes != null) {
            for (EffectMagnitudeModel entry : magnitudes) {
                out.add(convertMagnitude(entry));
            }
        }
        return out;
    }

    public static EffectMagnitude convertMagnitude(EffectMagnitudeModel magnitude) {
        EffectMagnitude out = new EffectMagnitude();
        out.setName(magnitude.getName());
        out.setScalar(magnitude.getScalar());
        out.setConditionparamtype(convertParameterType(magnitude.getParameterType()));
        out.setCalculatedvalues(convertCalculatedValuesDaoSet(magnitude.getCalculatedMagnitudes()));
        return out;
    }

    private static List<CalculatedMagnitude> convertCalculatedValuesDaoSet(Set<CalculatedMagnitudeModel> calculatedMagnitudes) {
        List<CalculatedMagnitude> out = new ArrayList<>();
        if (calculatedMagnitudes != null) {
            for (CalculatedMagnitudeModel entry : calculatedMagnitudes) {
                out.add(convertCalculatedValuesDao(entry));
            }
        }
        return out;
    }

    private static CalculatedMagnitude convertCalculatedValuesDao(CalculatedMagnitudeModel calculatedMagnitude) {
        CalculatedMagnitude out = new CalculatedMagnitude();
        if (calculatedMagnitude != null) {
            out.setLevel(calculatedMagnitude.getLevel());
            out.setRarity(convertRarity(calculatedMagnitude.getRarity()));
            out.setCalculatedmin(calculatedMagnitude.getMinimum());
            out.setCalculatedmax(calculatedMagnitude.getMaximum());
        }
        return out;
    }

    public static ConditionParamCategory convertParamCategory(ConditionParamCategoryModel paramCategory) {
        ConditionParamCategory out = new ConditionParamCategory();
        if (paramCategory.getAffinity() != null) {
            out.setAffinity(convertAffinity(paramCategory.getAffinity()));
        }
        if (paramCategory.getColor() != null) {
            out.setColor(convertColor(paramCategory.getColor()));
        }
        return out;
    }

    public static Affinity convertAffinity(AffinityModel affinity) {
        if (affinity != null) {
            switch (affinity) {
                case VITALITY:
                    return Affinity.VITALITY;
                case MIGHT:
                    return Affinity.MIGHT;
                default:
                    return Affinity.SPIRIT;
            }
        }
        return null;
    }

    public static List<Affinity> convertAffinitySet(Set<AffinityModel> affinitySet) {
        List<Affinity> out = new ArrayList<>();
        if (affinitySet != null) {
            for (AffinityModel entry : affinitySet) {
                out.add(convertAffinity(entry));
            }
        }
        return out;
    }

    public static TraitType convertTraitType(TraitTypeModel traitType) {
        switch (traitType) {
            case MASTERWORK:
                return TraitType.MASTERWORK;
            case PRIMARY:
                return TraitType.PRIMARY;
            default:
                return TraitType.SECONDARY;
        }
    }

    public static Color convertColor(ColorModel color) {
        switch (color) {
            case BLUE:
                return Color.BLUE;
            case RED:
                return Color.RED;
            default:
                return Color.GREEN;
        }
    }

    public static ParamType convertParameterType(ParameterTypeModel parameterType) {
        switch (parameterType) {
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


    public static Weapon.WeaponclassEnum convertWeaponType(WeaponTypeModel weaponType) {
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

    public static List<ItemElement> convertElementsToList(Set<ElementModel> elements) {
        //in case for duplicates
        List<ItemElement> itemElements = SetUniqueList.setUniqueList(new ArrayList<>());
        if (elements != null) {
            for (ElementModel ele : elements) {
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

    public static Rarity convertRarity(RarityModel rarity) {
        switch (rarity) {
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

    public static RarityModel convertRarityBack(Rarity rarity) {
        switch (rarity) {
            case LEGENDARY:
                return RarityModel.LEGENDARY;
            case EXOTIC:
                return RarityModel.EXOTIC;
            case EPIC:
                return RarityModel.EPIC;
            case RARE:
                return RarityModel.RARE;
            case UNCOMMON:
                return RarityModel.UNCOMMON;
            default:
                return RarityModel.COMMON;
        }
    }
}
