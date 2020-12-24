package org.imrofli.godfall.helpers;

import org.imrofli.godfall.dao.model.ConditionParamCategory;
import org.imrofli.godfall.dao.model.ItemType;
import org.imrofli.godfall.dao.model.TraitCategory;
import org.imrofli.godfall.dao.model.TraitSlot;
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

    public static Rarity getRarity(Long value) {
        if (value != null) {
            if (value == 1L) return Rarity.COMMON;
            if (value == 4L) return Rarity.EPIC;
            if (value == 6L) return Rarity.EXOTIC;
            if (value == 5L) return Rarity.LEGENDARY;
            if (value == 3L) return Rarity.RARE;
            if (value == 2L) return Rarity.UNCOMMON;
        }
        return Rarity.NA;
    }

    public static Rarity getRarityByIndex(Index value) {
        if (value != null) {
            if (value == Index.COMMON) return Rarity.COMMON;
            if (value == Index.EPIC) return Rarity.EPIC;
            if (value == Index.EXOTIC) return Rarity.EXOTIC;
            if (value == Index.LEGENDARY) return Rarity.LEGENDARY;
            if (value == Index.RARE) return Rarity.RARE;
            if (value == Index.UNCOMMON) return Rarity.UNCOMMON;
        }
        return Rarity.NA;
    }

    public static Set<Element> getElements(String element) {
        Set<Element> elementSet = new HashSet<>();
        if (element.equals("Random Element")) {
            elementSet.add(Element.FIRE);
            elementSet.add(Element.AIR);
            elementSet.add(Element.EARTH);
            elementSet.add(Element.VOID);
            elementSet.add(Element.WATER);
            elementSet.add(Element.PHYSICAL);
        } else if (element.equals("Air")) {
            elementSet.add(Element.AIR);
        } else if (element.equals("Physical")) {
            elementSet.add(Element.PHYSICAL);
        } else if (element.equals("Fire")) {
            elementSet.add(Element.FIRE);
        } else if (element.equals("Water")) {
            elementSet.add(Element.WATER);
        } else if (element.equals("Earth")) {
            elementSet.add(Element.EARTH);
        } else if (element.equals("Void")) {
            elementSet.add(Element.VOID);
        } else {
            elementSet.add(Element.NA);
        }
        return elementSet;
    }

    public static Element getElementsIgnoreRandom(String element) {
        if (element.equals("Air")) {
            return Element.AIR;
        } else if (element.equals("Physical")) {
            return Element.PHYSICAL;
        } else if (element.equals("Fire")) {
            return Element.FIRE;
        } else if (element.equals("Water")) {
            return Element.WATER;
        } else if (element.equals("Earth")) {
            return Element.EARTH;
        } else if (element.equals("Void")) {
            return Element.VOID;
        } else {
            return Element.NA;
        }
    }

    public static Set<Element> getElements(List<String> elements) {
        return getElements(getElement(elements));
    }

    public static TraitType getTraitTypeFromGroup(String traitGroup) {
        if (traitGroup != null) {
            if (traitGroup.contains("secondary") || traitGroup.contains("Secondary")) {
                return TraitType.SECONDARY;
            } else if (traitGroup.contains("masterwork") || traitGroup.contains("Masterwork")) {
                return TraitType.MASTERWORK;
            } else {
                return TraitType.PRIMARY;
            }
        }
        return null;
    }

    public static Set<LootEffect> getLootEffects(List<FluffyNamedLootEffect> namedLootEffects) {
        Set<LootEffect> lootEffectSet = new HashSet<>();
        if (namedLootEffects != null) {
            for (FluffyNamedLootEffect named : namedLootEffects) {
                LootEffect lootEffect = new LootEffect();
                lootEffect.setName(named.getName());
                Set<EffectMagnitude> effectMagnitudeSet = getMagnitudes(named.getMagnitudes());
                lootEffect.setMagnitudes(effectMagnitudeSet);
                lootEffectSet.add(lootEffect);
            }
        }
        return lootEffectSet;
    }

    public static Set<LootEffect> getLootEffectsForConditional(List<PurpleNamedLootEffect> namedLootEffects) {
        Set<LootEffect> lootEffectSet = new HashSet<>();
        if (namedLootEffects != null) {
            for (PurpleNamedLootEffect named : namedLootEffects) {
                LootEffect lootEffect = new LootEffect();
                lootEffect.setName(named.getName());
                Set<EffectMagnitude> effectMagnitudeSet = getMagnitudes(named.getMagnitudes());
                lootEffect.setMagnitudes(effectMagnitudeSet);
                lootEffectSet.add(lootEffect);
            }
        }
        return lootEffectSet;
    }

    public static ConditionParamCategory getConditionParamCategory(org.imrofli.godfall.data.ConditionParamCategory conditionParamCategory) {
        ConditionParamCategory category = new ConditionParamCategory();
        if(conditionParamCategory != null){
            if (BoonWhitelistTagElement.MIGHT.equals(conditionParamCategory.enumValue)) {
                category.setAffinity(Affinity.MIGHT);
                return category;
            } else if (BoonWhitelistTagElement.SPIRIT.equals(conditionParamCategory.enumValue)) {
                category.setAffinity(Affinity.SPIRIT);
                return category;
            } else if (BoonWhitelistTagElement.VITALITY.equals(conditionParamCategory.enumValue)) {
                category.setAffinity(Affinity.VITALITY);
                return category;
            } else if (1L == conditionParamCategory.integerValue) {
                category.setColor(Color.RED);
                return category;
            } else if (2L == conditionParamCategory.integerValue) {
                category.setColor(Color.GREEN);
                return category;
            }
            else if (3L == conditionParamCategory.integerValue) {
                category.setColor(Color.BLUE);
                return category;
            }
        }
        return category;

    }

    public static Set<ConditionalLootEffect> getConditionalLootEffects(List<String> conditionalLootEffects, List<ConditionalLootEffectsCollection> conditionalLootEffectsCollections) {
        Set<ConditionalLootEffect> lootEffectSet = new HashSet<>();
        if (conditionalLootEffects != null && conditionalLootEffectsCollections != null) {
            for (String searchEntry : conditionalLootEffects) {
                for (ConditionalLootEffectsCollection condEffect : conditionalLootEffectsCollections) {
                    if (searchEntry.equals(condEffect.getName())) {
                        ConditionalLootEffect effect = new ConditionalLootEffect();
                        effect.setName(condEffect.getName());
                        effect.setDescription(condEffect.getDescription().replace("\\", "").replace("\"", "").trim());
                        effect.setApplyToSelf(condEffect.getApplyToSelf());
                        effect.setApplyToConnected(condEffect.getApplyToConnected());
                        effect.setApplyForEach(condEffect.getApplyForEach());
                        Set<LootEffect> namedLootEffects = getLootEffectsForConditional(condEffect.getNamedLootEffects());
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

    public static TraitCategory getTraitCategory(String name, List<TraitCategoryCollection> traitCategoryCollections) {
        for (TraitCategoryCollection collection : traitCategoryCollections) {
            if (name.equals(collection.getName())) {
                TraitCategory traitCategory = new TraitCategory();
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

    public static TraitType getTraitType(GroupName groupName) {
        switch (groupName) {
            case PRIMARY_TRAIT:
                return TraitType.PRIMARY;
            case PRIMARY_ATTRIBUTE:
                return TraitType.PRIMARY;
            case MASTERWORK_TRAIT:
                return TraitType.MASTERWORK;
            default:
                return TraitType.SECONDARY;
        }
    }

    public static Set<EffectMagnitude> getMagnitudes(List<Magnitude> magnitudeList) {
        Set<EffectMagnitude> effectMagnitudeSet = new HashSet<>();
        if (magnitudeList != null && !magnitudeList.isEmpty()) {
            for (Magnitude magn : magnitudeList) {
                EffectMagnitude entry = new EffectMagnitude();
                entry.setName(magn.getMagnitudeName().toValue());
                entry.setParameterType(getParamType(magn.getParamType()));
                entry.setScalar(magn.getScalar());
                effectMagnitudeSet.add(entry);
            }
        }
        return effectMagnitudeSet;
    }


    public static ParameterType getParamType(ParamType type) {
        switch (type) {
            case CORE_ATTRIBUTE:
                return ParameterType.CORE_ATTRIBUTE;
            case PLAYER_POWER:
                return ParameterType.PLAYER_POWER;
            case NON_SCALING:
                return ParameterType.NON_SCALING;
            case DEFENSE_PERCENT:
                return ParameterType.DEFENSE_PERCENT;
            case ATTRIBUTE_NO_VARIANCE:
                return ParameterType.ATTRIBUTE_NO_VARIANCE;
            case CORE_ATTRIBUTE_PERCENT:
                return ParameterType.CORE_ATTRIBUTE_PERCENT;
            case NO_VARIANCE_PLAYER_POWER:
                return ParameterType.NO_VARIANCE_PLAYER_POWER;
            case NO_VARIANCE_DEFENSE_PERCENT:
                return ParameterType.NO_VARIANCE_DEFENSE_PERCENT;
            default:
                return ParameterType.NO_VARIANCE_CORE_ATTRIBUTE_PERCENT;
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

    public static WeaponType getWeaponType(Long typeId) {
        if (typeId == 1) return WeaponType.LONGSWORD;
        if (typeId == 2) return WeaponType.POLEARM;
        if (typeId == 3) return WeaponType.GREATSWORD;
        if (typeId == 4) return WeaponType.WARHAMMER;
        if (typeId == 5) return WeaponType.DUALBLADES;
        else return WeaponType.NA;
    }

    public static Set<WeaponType> getWeaponTypeSet(List<String> traitTags) {
        Set<WeaponType> weaponTypeSet = new HashSet<>();
        if (traitTags != null) {
            for (String entry : traitTags) {
                String[] splits = entry.split("-");
                if (splits.length > 1) {
                    if (splits[1].trim().equals("Random Weapon")) {
                        weaponTypeSet.add(WeaponType.DUALBLADES);
                        weaponTypeSet.add(WeaponType.GREATSWORD);
                        weaponTypeSet.add(WeaponType.LONGSWORD);
                        weaponTypeSet.add(WeaponType.POLEARM);
                        weaponTypeSet.add(WeaponType.WARHAMMER);
                    } else if (splits[1].trim().equals("Polearm")) {
                        weaponTypeSet.add(WeaponType.POLEARM);
                    } else if (splits[1].trim().equals("Dual Blades")) {
                        weaponTypeSet.add(WeaponType.DUALBLADES);
                    } else if (splits[1].trim().equals("Greatsword")) {
                        weaponTypeSet.add(WeaponType.GREATSWORD);
                    } else if (splits[1].trim().equals("Longsword")) {
                        weaponTypeSet.add(WeaponType.LONGSWORD);
                    } else if (splits[1].trim().equals("Warhammer")) {
                        weaponTypeSet.add(WeaponType.WARHAMMER);
                    }

                }

            }
        }
        return weaponTypeSet;
    }

    public static WeaponType getWeaponTypeFromString(String tag) {
        if (tag != null) {
            if (tag.equals("Polearm")) {
                return WeaponType.POLEARM;
            } else if (tag.equals("Dual Blades")) {
                return WeaponType.DUALBLADES;
            } else if (tag.equals("Greatsword")) {
                return WeaponType.GREATSWORD;
            } else if (tag.equals("Longsword")) {
                return WeaponType.LONGSWORD;
            } else if (tag.equals("Warhammer")) {
                return WeaponType.WARHAMMER;
            }
        }
        return WeaponType.NA;
    }

    public static ItemType getItemType(String value) {
        if (value != null) {
            if (value.equals("Amulet")) return ItemType.AMULET;
            if (value.equals("Augment")) return ItemType.AUGMENT;
            if (value.equals("Banner")) return ItemType.BANNER;
            if (value.equals("Bomb")) return ItemType.BOMB;
            if (value.equals("Charm")) return ItemType.CHARM;
            if (value.equals("Consumable")) return ItemType.CONSUMABLE;
            if (value.equals("Potion")) return ItemType.LIFESTONE;
            if (value.equals("Ring")) return ItemType.RING;
            if (value.equals("Talisman")) return ItemType.TALISMAN;
            if (value.equals("Trinket")) return ItemType.TRINKET;
            if (value.equals("Weapon")) return ItemType.WEAPON;
        }
        return ItemType.NA;
    }

    public static Set<Affinity> getAffinities(List<String> tagList) {
        Set<Affinity> affinitySet = new HashSet<>();
        if (tagList != null && !tagList.isEmpty()) {
            for (String entry : tagList) {
                if (entry != null && entry.contains("- Might")) {
                    affinitySet.add(Affinity.MIGHT);
                } else if (entry != null && entry.contains("- Spirit")) {
                    affinitySet.add(Affinity.SPIRIT);
                } else if (entry != null && entry.contains("- Vitality")) {
                    affinitySet.add(Affinity.VITALITY);
                }
            }
        }
        return affinitySet;
    }

    public static Affinity getAffinity(String tag) {

        if (tag != null && !tag.isEmpty()) {

            if (tag.contains("Might")) {
                return Affinity.MIGHT;
            } else if (tag.contains("Spirit")) {
                return Affinity.SPIRIT;
            } else if (tag.contains("Vitality")) {
                return Affinity.VITALITY;
            }
        }
        return null;
    }

    public static Set<TagRequirement> getTagRequirements(List<OngoingTagRequirement> ongoingTagRequirements) {
        Set<TagRequirement> out = new HashSet<>();
        if(ongoingTagRequirements!=null){
            for (OngoingTagRequirement tagRequirement : ongoingTagRequirements) {
                TagRequirement entry = new TagRequirement();
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


    public static Set<TraitSlot> getTraitSlotsSet(String traitSlotGroups, List<TraitSlotCollection> collection) {
        Set<TraitSlot> out = new HashSet<>();
        if (traitSlotGroups != null && collection != null) {
            for (TraitSlotCollection entry : collection) {
                if (traitSlotGroups.equals(entry.getGroupName())) {
                    TraitSlot ts = new TraitSlot();
                    ts.setName(entry.getName());
                    ts.setSlotIndex(entry.getSlotIndex().toValue());
                    ts.setGroupName(entry.getGroupName());
                }
            }
        }

        return out;
    }

    public static SlotType getSlotTypeFromIndex(SlotIndex slotType) {
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

    public static Set<EnemyClassLvl> getEnemyClassLevels(The2 the2, The2 the3) {
        Set<EnemyClassLvl> enemyClassLvls = new HashSet<>();
        if (the2 != null) {
            EnemyClassLvl out = new EnemyClassLvl();
            out.setBreachHealthScalar(the2.getBreachHealthScalar());
            out.setExperienceScalar(the2.getExperienceScalar());
            out.setBreachHealthRegenScalar(the2.getBreachHealthRegenScalar());
            out.setHealthScalar(the2.getHealthScalar());
            out.setQuantityScalar(the2.getQuantityScalar());
            out.setBreachRechargeDurationScalar(the2.getBreachRechargeDurationScalar());
            enemyClassLvls.add(out);
        }
        if (the3 != null) {
            EnemyClassLvl out = new EnemyClassLvl();
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
}
