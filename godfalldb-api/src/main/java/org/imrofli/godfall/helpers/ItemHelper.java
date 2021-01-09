package org.imrofli.godfall.helpers;

import org.imrofli.godfall.dao.model.*;
import org.imrofli.godfall.data.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public final class ItemHelper {
    private static final Logger LOGGER = LoggerFactory.getLogger(ItemHelper.class);

    private static final Map<String, SkillGridHelperModel> skillGridMap = new HashMap<>(24);

    public static final String getLocation(List<String> tags) {
        if (tags != null && !tags.isEmpty()) {
            String[] splits = tags.get(tags.size() - 1).split("-");
            if (splits[0].trim().startsWith("ToT")) {
                return "Tower Drop";
            }
        }
        return "World Drop";
    }

    public static final String getElement(List<String> tags) {
        if (tags != null && !tags.isEmpty()) {
            String[] splits = tags.get(tags.size() - 1).split("-");
            if (splits.length >= 2) {
                return splits[1].trim();
            }
        }
        return "Undefined";
    }

    public static String getStat(List<String> tags) {
        if (tags != null && !tags.isEmpty()) {
            String statsString = "";
            for (String entry : tags) {
                if (entry.contains(" - Might") || entry.contains(" - Spirit") || entry.contains(" - Vitality")) {
                    String[] splits = entry.split("-");
                    if (splits.length >= 2) {
                        statsString += splits[1].trim() + " ";
                    }
                }
            }
            if (!statsString.isEmpty()) {
                return statsString.trim();
            }
        }
        return "N/A";
    }

    public static final String getTraitName(List<String> tags) {
        if (tags != null && !tags.isEmpty()) {
            for (String entry : tags) {
                if (entry.startsWith("Trigger.") || entry.startsWith("Connected") || entry.startsWith("Scale")) {
                    return entry;
                }
            }
        }
        return "Nothing";
    }

    public static Index forIntValue(Integer value) {
        if (value == 1) return Index.COMMON;
        if (value == 4) return Index.EPIC;
        if (value == 6) return Index.EXOTIC;
        if (value == 5) return Index.LEGENDARY;
        if (value == 3) return Index.RARE;
        if (value == 2) return Index.UNCOMMON;
        return Index.COMMON;
    }

    public static RarityModel getRarity(Long value) {
        if (value != null) {
            if (value == 1L) return RarityModel.COMMON;
            if (value == 4L) return RarityModel.EPIC;
            if (value == 6L) return RarityModel.EXOTIC;
            if (value == 5L) return RarityModel.LEGENDARY;
            if (value == 3L) return RarityModel.RARE;
            if (value == 2L) return RarityModel.UNCOMMON;
        }
        return RarityModel.NA;
    }

    public static RarityModel getRarityByIndex(Index value) {
        if (value != null) {
            if (value == Index.COMMON) return RarityModel.COMMON;
            if (value == Index.EPIC) return RarityModel.EPIC;
            if (value == Index.EXOTIC) return RarityModel.EXOTIC;
            if (value == Index.LEGENDARY) return RarityModel.LEGENDARY;
            if (value == Index.RARE) return RarityModel.RARE;
            if (value == Index.UNCOMMON) return RarityModel.UNCOMMON;
        }
        return RarityModel.NA;
    }

    public static Set<ElementModel> getElements(String element) {
        Set<ElementModel> elementSet = new HashSet<>();
        if (element.equals("Random Element")) {
            elementSet.add(ElementModel.FIRE);
            elementSet.add(ElementModel.AIR);
            elementSet.add(ElementModel.EARTH);
            elementSet.add(ElementModel.VOID);
            elementSet.add(ElementModel.WATER);
            elementSet.add(ElementModel.PHYSICAL);
        } else if (element.equals("Air")) {
            elementSet.add(ElementModel.AIR);
        } else if (element.equals("Physical")) {
            elementSet.add(ElementModel.PHYSICAL);
        } else if (element.equals("Fire")) {
            elementSet.add(ElementModel.FIRE);
        } else if (element.equals("Water")) {
            elementSet.add(ElementModel.WATER);
        } else if (element.equals("Earth")) {
            elementSet.add(ElementModel.EARTH);
        } else if (element.equals("Void")) {
            elementSet.add(ElementModel.VOID);
        } else {
            elementSet.add(ElementModel.NA);
        }
        return elementSet;
    }

    public static ElementModel getElementsIgnoreRandom(String element) {
        if (element.equals("Air")) {
            return ElementModel.AIR;
        } else if (element.equals("Physical")) {
            return ElementModel.PHYSICAL;
        } else if (element.equals("Fire")) {
            return ElementModel.FIRE;
        } else if (element.equals("Water")) {
            return ElementModel.WATER;
        } else if (element.equals("Earth")) {
            return ElementModel.EARTH;
        } else if (element.equals("Void")) {
            return ElementModel.VOID;
        } else {
            return ElementModel.NA;
        }
    }

    public static Set<ElementModel> getElements(List<String> elements) {
        return getElements(getElement(elements));
    }

    public static TraitTypeModel getTraitTypeFromGroup(String traitGroup) {
        if (traitGroup != null) {
            if (traitGroup.contains("secondary") || traitGroup.contains("Secondary")) {
                return TraitTypeModel.SECONDARY;
            } else if (traitGroup.contains("masterwork") || traitGroup.contains("Masterwork")) {
                return TraitTypeModel.MASTERWORK;
            } else {
                return TraitTypeModel.PRIMARY;
            }
        }
        return null;
    }

    public static Set<LootEffectModel> getLootEffects(List<FluffyNamedLootEffect> namedLootEffects) {
        Set<LootEffectModel> lootEffectSet = new HashSet<>();
        if (namedLootEffects != null) {
            for (FluffyNamedLootEffect named : namedLootEffects) {
                LootEffectModel lootEffect = new LootEffectModel();
                lootEffect.setName(named.getName());
                Set<EffectMagnitudeModel> effectMagnitudeSet = getMagnitudes(named.getMagnitudes());
                lootEffect.setMagnitudes(effectMagnitudeSet);
                lootEffectSet.add(lootEffect);
            }
        }
        return lootEffectSet;
    }

    public static Set<LootEffectModel> getLootEffectsForConditional(List<PurpleNamedLootEffect> namedLootEffects) {
        Set<LootEffectModel> lootEffectSet = new HashSet<>();
        if (namedLootEffects != null) {
            for (PurpleNamedLootEffect named : namedLootEffects) {
                LootEffectModel lootEffect = new LootEffectModel();
                lootEffect.setName(named.getName());
                Set<EffectMagnitudeModel> effectMagnitudeSet = getMagnitudes(named.getMagnitudes());
                lootEffect.setMagnitudes(effectMagnitudeSet);
                lootEffectSet.add(lootEffect);
            }
        }
        return lootEffectSet;
    }

    public static ConditionParamCategoryModel getConditionParamCategory(org.imrofli.godfall.data.ConditionParamCategory conditionParamCategory) {
        ConditionParamCategoryModel category = new ConditionParamCategoryModel();
        if (conditionParamCategory != null) {
            if (BoonWhitelistTagElement.MIGHT.equals(conditionParamCategory.enumValue)) {
                category.setAffinity(AffinityModel.MIGHT);
                return category;
            } else if (BoonWhitelistTagElement.SPIRIT.equals(conditionParamCategory.enumValue)) {
                category.setAffinity(AffinityModel.SPIRIT);
                return category;
            } else if (BoonWhitelistTagElement.VITALITY.equals(conditionParamCategory.enumValue)) {
                category.setAffinity(AffinityModel.VITALITY);
                return category;
            } else if (1L == conditionParamCategory.integerValue) {
                category.setColor(ColorModel.RED);
                return category;
            } else if (2L == conditionParamCategory.integerValue) {
                category.setColor(ColorModel.GREEN);
                return category;
            } else if (3L == conditionParamCategory.integerValue) {
                category.setColor(ColorModel.BLUE);
                return category;
            }
        }
        return category;

    }

    public static Set<ConditionalLootEffectModel> getConditionalLootEffects(List<String> conditionalLootEffects, List<ConditionalLootEffectsCollection> conditionalLootEffectsCollections) {
        Set<ConditionalLootEffectModel> lootEffectSet = new HashSet<>();
        if (conditionalLootEffects != null && conditionalLootEffectsCollections != null) {
            for (String searchEntry : conditionalLootEffects) {
                for (ConditionalLootEffectsCollection condEffect : conditionalLootEffectsCollections) {
                    if (searchEntry.equals(condEffect.getName())) {
                        ConditionalLootEffectModel effect = new ConditionalLootEffectModel();
                        effect.setName(condEffect.getName());
                        effect.setDescription(condEffect.getDescription().replace("\\", "").replace("\"", "").trim());
                        effect.setApplyToSelf(condEffect.getApplyToSelf());
                        effect.setApplyToConnected(condEffect.getApplyToConnected());
                        effect.setApplyForEach(condEffect.getApplyForEach());
                        Set<LootEffectModel> namedLootEffects = getLootEffectsForConditional(condEffect.getNamedLootEffects());
                        effect.setLootEffects(namedLootEffects);
                        effect.setConditionName(condEffect.getConditionName().toValue());
                        effect.setConditionParamCategory(getConditionParamCategory(condEffect.getConditionParamCategory()));
                        effect.setConditionParameterType(getParamType(condEffect.getConditionParamType()));
                        effect.setConditionParamScalar(condEffect.getConditionParamScalar());
                        lootEffectSet.add(effect);
                    }
                }
            }
        }
        return lootEffectSet;
    }

    public static TraitCategoryModel getTraitCategory(String name, List<TraitCategoryCollection> traitCategoryCollections) {
        for (TraitCategoryCollection collection : traitCategoryCollections) {
            if (name.equals(collection.getName())) {
                TraitCategoryModel traitCategory = new TraitCategoryModel();
                traitCategory.setName(collection.getName());
                traitCategory.setGroupname(collection.getGroupName().toString());
                traitCategory.setTraitType(getTraitType(collection.getGroupName()));
                traitCategory.setTraitGroup(collection.getTraitGroup());
                Set<String> allowedTraitTags = new HashSet<>();
                if (collection.getAllowedTraitTags() != null) {
                    allowedTraitTags.addAll(collection.getAllowedTraitTags());
                }
                traitCategory.setAllowedTraitTags(allowedTraitTags);
                Set<String> exclusionGroups = new HashSet<>();
                if (collection.getExclusionGroups() != null) {
                    exclusionGroups.addAll(collection.getExclusionGroups());
                }
                traitCategory.setExclusionGroups(exclusionGroups);
                traitCategory.setMinimumTier(collection.getMinTier());
                traitCategory.setMaximumTier(collection.getMaxTier());
                traitCategory.setWeight(collection.getWeight());
                traitCategory.setMinimumRarity(getRarity(collection.getMinRarity()));
                traitCategory.setMaximumRarity(getRarity(collection.getMaxRarity()));


                return traitCategory;
            }
        }
        return null;
    }

    public static TraitTypeModel getTraitType(GroupName groupName) {
        switch (groupName) {
            case PRIMARY_TRAIT:
                return TraitTypeModel.PRIMARY;
            case PRIMARY_ATTRIBUTE:
                return TraitTypeModel.PRIMARY;
            case MASTERWORK_TRAIT:
                return TraitTypeModel.MASTERWORK;
            default:
                return TraitTypeModel.SECONDARY;
        }
    }

    public static Set<EffectMagnitudeModel> getMagnitudes(List<Magnitude> magnitudeList) {
        Set<EffectMagnitudeModel> effectMagnitudeSet = new HashSet<>();
        if (magnitudeList != null && !magnitudeList.isEmpty()) {
            for (Magnitude magn : magnitudeList) {
                EffectMagnitudeModel entry = new EffectMagnitudeModel();
                entry.setName(magn.getMagnitudeName().toValue());
                entry.setParameterType(getParamType(magn.getParamType()));
                entry.setScalar(magn.getScalar());
                effectMagnitudeSet.add(entry);
            }
        }
        return effectMagnitudeSet;
    }


    public static ParameterTypeModel getParamType(ParamType type) {
        switch (type) {
            case CORE_ATTRIBUTE:
                return ParameterTypeModel.CORE_ATTRIBUTE;
            case PLAYER_POWER:
                return ParameterTypeModel.PLAYER_POWER;
            case NON_SCALING:
                return ParameterTypeModel.NON_SCALING;
            case DEFENSE_PERCENT:
                return ParameterTypeModel.DEFENSE_PERCENT;
            case ATTRIBUTE_NO_VARIANCE:
                return ParameterTypeModel.ATTRIBUTE_NO_VARIANCE;
            case CORE_ATTRIBUTE_PERCENT:
                return ParameterTypeModel.CORE_ATTRIBUTE_PERCENT;
            case NO_VARIANCE_PLAYER_POWER:
                return ParameterTypeModel.NO_VARIANCE_PLAYER_POWER;
            case NO_VARIANCE_DEFENSE_PERCENT:
                return ParameterTypeModel.NO_VARIANCE_DEFENSE_PERCENT;
            default:
                return ParameterTypeModel.NO_VARIANCE_CORE_ATTRIBUTE_PERCENT;
        }
    }


    public static String formatName(String name, List<String> nameList) {
        StringBuilder sb = new StringBuilder();
        if (nameList != null && !nameList.isEmpty()) {
            for (String entry : nameList) {
                sb.append(entry);
                sb.append(" ");
            }
        } else if (name != null && !name.isEmpty()) {
            sb.append(name);
        }
        return sb.toString().replace("\\", "").replace("\"", "").trim();
    }

    public static WeaponTypeModel getWeaponType(Long typeId) {
        if (typeId == 1) return WeaponTypeModel.LONGSWORD;
        if (typeId == 2) return WeaponTypeModel.POLEARM;
        if (typeId == 3) return WeaponTypeModel.GREATSWORD;
        if (typeId == 4) return WeaponTypeModel.WARHAMMER;
        if (typeId == 5) return WeaponTypeModel.DUALBLADES;
        else return WeaponTypeModel.NA;
    }

    public static Set<WeaponTypeModel> getWeaponTypeSet(List<String> traitTags) {
        Set<WeaponTypeModel> weaponTypeSet = new HashSet<>();
        if (traitTags != null) {
            for (String entry : traitTags) {
                String[] splits = entry.split("-");
                if (splits.length > 1) {
                    if (splits[1].trim().equals("Random Weapon")) {
                        weaponTypeSet.add(WeaponTypeModel.DUALBLADES);
                        weaponTypeSet.add(WeaponTypeModel.GREATSWORD);
                        weaponTypeSet.add(WeaponTypeModel.LONGSWORD);
                        weaponTypeSet.add(WeaponTypeModel.POLEARM);
                        weaponTypeSet.add(WeaponTypeModel.WARHAMMER);
                    } else if (splits[1].trim().equals("Polearm")) {
                        weaponTypeSet.add(WeaponTypeModel.POLEARM);
                    } else if (splits[1].trim().equals("Dual Blades")) {
                        weaponTypeSet.add(WeaponTypeModel.DUALBLADES);
                    } else if (splits[1].trim().equals("Greatsword")) {
                        weaponTypeSet.add(WeaponTypeModel.GREATSWORD);
                    } else if (splits[1].trim().equals("Longsword")) {
                        weaponTypeSet.add(WeaponTypeModel.LONGSWORD);
                    } else if (splits[1].trim().equals("Warhammer")) {
                        weaponTypeSet.add(WeaponTypeModel.WARHAMMER);
                    }

                }

            }
        }
        return weaponTypeSet;
    }

    public static WeaponTypeModel getWeaponTypeFromString(String tag) {
        if (tag != null) {
            if (tag.equals("Polearm")) {
                return WeaponTypeModel.POLEARM;
            } else if (tag.equals("Dual Blades")) {
                return WeaponTypeModel.DUALBLADES;
            } else if (tag.equals("Greatsword")) {
                return WeaponTypeModel.GREATSWORD;
            } else if (tag.equals("Longsword")) {
                return WeaponTypeModel.LONGSWORD;
            } else if (tag.equals("Warhammer")) {
                return WeaponTypeModel.WARHAMMER;
            }
        }
        return WeaponTypeModel.NA;
    }

    public static ItemTypeModel getItemType(String value) {
        if (value != null) {
            if (value.equals("Amulet")) return ItemTypeModel.AMULET;
            if (value.equals("Augment")) return ItemTypeModel.AUGMENT;
            if (value.equals("Banner")) return ItemTypeModel.BANNER;
            if (value.equals("Bomb")) return ItemTypeModel.BOMB;
            if (value.equals("Charm")) return ItemTypeModel.CHARM;
            if (value.equals("Consumable")) return ItemTypeModel.CONSUMABLE;
            if (value.equals("Potion")) return ItemTypeModel.LIFESTONE;
            if (value.equals("Ring")) return ItemTypeModel.RING;
            if (value.equals("Talisman")) return ItemTypeModel.TALISMAN;
            if (value.equals("Trinket")) return ItemTypeModel.TRINKET;
            if (value.equals("Weapon")) return ItemTypeModel.WEAPON;
        }
        return ItemTypeModel.NA;
    }

    public static Set<AffinityModel> getAffinities(List<String> tagList) {
        Set<AffinityModel> affinitySet = new HashSet<>();
        if (tagList != null && !tagList.isEmpty()) {
            for (String entry : tagList) {
                if (entry != null && entry.contains("- Might")) {
                    affinitySet.add(AffinityModel.MIGHT);
                } else if (entry != null && entry.contains("- Spirit")) {
                    affinitySet.add(AffinityModel.SPIRIT);
                } else if (entry != null && entry.contains("- Vitality")) {
                    affinitySet.add(AffinityModel.VITALITY);
                }
            }
        }
        return affinitySet;
    }

    public static AffinityModel getAffinity(String tag) {

        if (tag != null && !tag.isEmpty()) {

            if (tag.contains("Might")) {
                return AffinityModel.MIGHT;
            } else if (tag.contains("Spirit")) {
                return AffinityModel.SPIRIT;
            } else if (tag.contains("Vitality")) {
                return AffinityModel.VITALITY;
            }
        }
        return null;
    }

    public static Set<TagRequirementModel> getTagRequirements(List<OngoingTagRequirement> ongoingTagRequirements) {
        Set<TagRequirementModel> out = new HashSet<>();
        if (ongoingTagRequirements != null) {
            for (OngoingTagRequirement tagRequirement : ongoingTagRequirements) {
                TagRequirementModel entry = new TagRequirementModel();
                entry.setName(tagRequirement.getGameplayTag());
                entry.setActorType(tagRequirement.getActorType().toString());
                entry.setRequireOrIgnore(tagRequirement.getRequireOrIgnore().toString());
                out.add(entry);
            }
        }
        return out;
    }

    public static Set<String> getItemTagsWithItemType(List<TraitTagsCollection> collection, List<org.imrofli.godfall.data.ItemType> tagGroups, List<String> defaultTraitTagGroups, List<String> elementTraitTagGroups) {
        List<String> renamed = new ArrayList<>();
        for (org.imrofli.godfall.data.ItemType entry : tagGroups) {
            switch (entry) {
                case RING:
                    renamed.add("Ring");
                    break;
                case CHARM:
                    renamed.add("Charm");
                    break;
                case AMULET:
                    renamed.add("Amulet");
                    break;
                case BANNER:
                    renamed.add("Banner");
                    break;
                case AUGMENT:
                    renamed.add("Augment");
                    break;
                case WEAPON:
                    renamed.add("Weapon");
                    break;
                case TRINKET:
                    renamed.add("Trinket");
                    break;
                case BOMB:
                    renamed.add("Bomb");
                    break;
                case POTION:
                    renamed.add("Potion");
                    break;
                case TALISMAN:
                    renamed.add("Talisman");
                    break;
                case CONSUMABLE:
                    renamed.add("Consumable");
                    break;
            }
        }
        return getItemTags(collection, renamed, defaultTraitTagGroups, elementTraitTagGroups);
    }

    public static Set<String> getItemTagsElementTraitTag(List<TraitTagsCollection> collection, List<String> traitTagGroups, List<String> defaultTraitTagGroups, List<ElementTraitTagGroup> elementTraitTagGroups) {
        List<String> renamed = new ArrayList<>();
        for (ElementTraitTagGroup entry : elementTraitTagGroups) {
            renamed.add(entry.toValue());
        }
        return getItemTags(collection, traitTagGroups, defaultTraitTagGroups, renamed);
    }

    public static Set<String> getItemTags(List<TraitTagsCollection> collection, List<String> tagGroups, List<String> defaultTraitTagGroups, List<String> elementTraitTagGroups) {
        Set<String> out = new HashSet<>();
        out = processItemTagStringlist(out, elementTraitTagGroups, collection);
        out = processItemTagStringlist(out, defaultTraitTagGroups, collection);
        out = processItemTagStringlist(out, tagGroups, collection);
        for (String traitTag : defaultTraitTagGroups) {
            Boolean found = false;
            for (TraitTagsCollection entry : collection) {
                if (traitTag.equals(entry.getName()) || traitTag.equals(entry.getGroupName())) {
                    found = true;
                    if (entry.getAddedTraitTags() != null) {
                        for (String s : entry.getAddedTraitTags()) {
                            if (!out.contains(s)) {
                                out.add(s);
                            }
                        }
                    }
                }
            }
            if (!found) {
                out.add(traitTag);
            }
        }
        return out;
    }

    public static Set<String> processItemTagStringlist(Set<String> tagSet, List<String> stringList, List<TraitTagsCollection> collection) {
        if (tagSet == null) {
            tagSet = new HashSet<>();
        }
        for (String traitTag : stringList) {
            Boolean found = false;
            for (TraitTagsCollection entry : collection) {
                if (traitTag.equals(entry.getName()) || traitTag.equals(entry.getGroupName())) {
                    found = true;
                    if (entry.getAddedTraitTags() != null) {
                        for (String s : entry.getAddedTraitTags()) {
                            if (!tagSet.contains(s)) {
                                tagSet.add(s);
                            }
                        }
                    }
                }
            }
            if (!found && !tagSet.contains(traitTag)) {
                tagSet.add(traitTag);
            }
        }
        return tagSet;
    }

    public static Set<String> getBlacklistSet(List<String> blacklist) {
        Set<String> out = new HashSet<>();
        if (blacklist != null) {
            for (String entry : blacklist) {
                out.add(entry);
            }
        }
        return out;
    }


    public static Set<TraitSlotModel> getTraitSlotsSet(String traitSlotGroups, List<TraitSlotCollection> collection) {
        Set<TraitSlotModel> out = new HashSet<>();
        if (traitSlotGroups != null && collection != null) {
            for (TraitSlotCollection entry : collection) {
                if (traitSlotGroups.equals(entry.getGroupName())) {
                    TraitSlotModel ts = new TraitSlotModel();
                    ts.setName(entry.getName());
                    ts.setSlotIndex(entry.getSlotIndex().toValue());
                    ts.setGroupName(entry.getGroupName());
                }
            }
        }

        return out;
    }

    public static SlotTypeModel getSlotTypeFromIndex(SlotIndex slotType) {
        switch (slotType) {
            case PRIMARY_TRAIT:
                return SlotTypeModel.PRIMARY_TRAIT;
            case PRIMARY_ATTRIBUTE:
                return SlotTypeModel.PRIMARY_ATTRIBUTE;
            case MASTERWORK_TRAIT:
                return SlotTypeModel.MASTERWORK_TRAIT;
            default:
                return SlotTypeModel.SECONDARY_TRAIT;
        }
    }

    public static Set<EnemyClassLvlModel> getEnemyClassLevels(The2 the2, The2 the3) {
        Set<EnemyClassLvlModel> enemyClassLvls = new HashSet<>();
        if (the2 != null) {
            EnemyClassLvlModel out = new EnemyClassLvlModel();
            out.setBreachHealthScalar(the2.getBreachHealthScalar());
            out.setExperienceScalar(the2.getExperienceScalar());
            out.setBreachHealthRegenScalar(the2.getBreachHealthRegenScalar());
            out.setHealthScalar(the2.getHealthScalar());
            out.setQuantityScalar(the2.getQuantityScalar());
            out.setBreachRechargeDurationScalar(the2.getBreachRechargeDurationScalar());
            enemyClassLvls.add(out);
        }
        if (the3 != null) {
            EnemyClassLvlModel out = new EnemyClassLvlModel();
            out.setBreachHealthScalar(the3.getBreachHealthScalar());
            out.setExperienceScalar(the3.getExperienceScalar());
            out.setBreachHealthRegenScalar(the3.getBreachHealthRegenScalar());
            out.setHealthScalar(the3.getHealthScalar());
            out.setQuantityScalar(the3.getQuantityScalar());
            out.setBreachRechargeDurationScalar(the3.getBreachRechargeDurationScalar());
            enemyClassLvls.add(out);
        }
        return enemyClassLvls;
    }

    public static ArchonModeModel getArchonMode(String archonModeID, ArchonModes archonModes) {
        ArchonModeModel out = new ArchonModeModel();
        org.imrofli.godfall.data.ArchonMode input = null;
        if (archonModeID.equals(archonModes.getArchonModeArmistice().getID())) {
            input = archonModes.getArchonModeArmistice();
        } else if (archonModeID.equals(archonModes.getArchonModeBulwark().getID())) {
            input = archonModes.getArchonModeBulwark();
        } else if (archonModeID.equals(archonModes.getArchonModeMesa().getID())) {
            input = archonModes.getArchonModeMesa();
        } else if (archonModeID.equals(archonModes.getArchonModeGrayehawk().getID())) {
            input = archonModes.getArchonModeGrayehawk();
        } else if (archonModeID.equals(archonModes.getArchonModeHinterclaw().getID())) {
            input = archonModes.getArchonModeHinterclaw();
        } else if (archonModeID.equals(archonModes.getArchonModeIllumina().getID())) {
            input = archonModes.getArchonModeIllumina();
        } else if (archonModeID.equals(archonModes.getArchonModeMoebius().getID())) {
            input = archonModes.getArchonModeMoebius();
        } else if (archonModeID.equals(archonModes.getArchonModePhoenix().getID())) {
            input = archonModes.getArchonModePhoenix();
        } else if (archonModeID.equals(archonModes.getArchonModeSilvermane().getID())) {
            input = archonModes.getArchonModeSilvermane();
        } else if (archonModeID.equals(archonModes.getArchonModeSirius().getID())) {
            input = archonModes.getArchonModeSirius();
        } else if (archonModeID.equals(archonModes.getArchonModeTyphon().getID())) {
            input = archonModes.getArchonModeTyphon();
        } else if (archonModeID.equals(archonModes.getArchonModeVertigo().getID())) {
            input = archonModes.getArchonModeVertigo();
        }
        if (input != null) {
            out.setGameplayTag(input.getID());
            Set<String> alwaysOn = new HashSet<>();
            alwaysOn.add(input.getAlwaysOn());
            out.setAlwaysOn(alwaysOn);
            Set<String> onActivation = new HashSet<>();
            onActivation.add(input.getOnActivation());
            out.setOnActivation(onActivation);
            Set<String> whileActive = new HashSet<>();
            whileActive.addAll(input.getWhileActive());
            out.setWhileActive(whileActive);
        }

        return out;
    }

    public static AffinityModel getAffinityFromInt(Integer affinity) {
        switch (affinity) {
            case 1:
                return AffinityModel.MIGHT;
            case 2:
                return AffinityModel.SPIRIT;
            case 3:
                return AffinityModel.VITALITY;
            default:
                return null;
        }
    }

    public static Set<AugmentGraphModel> getAugmentGraphs(String gameplayTag, List<AugmentGraphsCollection> collection) {
        Set<AugmentGraphModel> out = new HashSet<>();
        for (AugmentGraphsCollection entry : collection) {
            if (gameplayTag.equals(entry.getValorplateGameplayTag())) {
                AugmentGraphModel graph = new AugmentGraphModel();
                graph.setGraphName(entry.getGraphName());
                graph.setGameplayTag(entry.getValorplateGameplayTag());

                graph.setAffinityRequirement(getAffinityFromInt(Math.toIntExact(entry.getAffinityRequirement())));
                graph.setNodeid(Math.toIntExact(entry.getNodeID()));
                graph.setLevelAvailable(Math.toIntExact(entry.getLevelAvailable()));
                out.add(graph);
            }
        }
        return out;
    }
}
