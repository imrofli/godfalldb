package org.imrofli.godfall.helpers;

import org.imrofli.godfall.dao.model.*;
import org.imrofli.godfall.dao.model.ItemType;
import org.imrofli.godfall.dao.model.Magnitude;
import org.imrofli.godfall.data.*;
import org.imrofli.godfall.services.ItemScalingServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class ItemHelper {
    private static final Logger LOGGER = LoggerFactory.getLogger(ItemHelper.class);

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
            } else if (traitGroup.contains("boon") || traitGroup.contains("Boon")) {
                return TraitType.BOON;
            } else if (traitGroup.contains("masterwork") || traitGroup.contains("Masterwork")) {
                return TraitType.MASTERWORK;
            } else if (traitGroup.contains("SkillGrid") || traitGroup.contains("Skillgrid")) {
                return TraitType.SKILLGRID;
            } else {
                return TraitType.PRIMARY;
            }
        } else {
            return TraitType.NA;
        }
    }

    public static Set<LootEffect> getLootEffects(List<FluffyNamedLootEffect> namedLootEffects, List<String> conditionalLootEffects) {
        Set<LootEffect> lootEffectSet = new HashSet<>();
        if (conditionalLootEffects != null) {
            for (String cond : conditionalLootEffects) {
                LootEffect lootEffect = new LootEffect();
                lootEffect.setName(cond);
                lootEffect.setMagnitudes(null);
                lootEffect.setLootEffectType(LootEffectType.CONDITIONAL);
                lootEffectSet.add(lootEffect);
            }
        }
        if (namedLootEffects != null) {
            for (FluffyNamedLootEffect named : namedLootEffects) {
                LootEffect lootEffect = new LootEffect();
                lootEffect.setName(named.getName());
                if("ConnectedMightCritOvershield".equals(named.getName())){
                    LOGGER.info("Magnitude {}", named.getMagnitudes());
                }
                Set<org.imrofli.godfall.dao.model.Magnitude> magnitudeSet = new HashSet<>();
                if (named.getMagnitudes() != null) {
                    for (org.imrofli.godfall.data.Magnitude magn : named.getMagnitudes()) {
                        org.imrofli.godfall.dao.model.Magnitude entry = new org.imrofli.godfall.dao.model.Magnitude();
                        entry.setName(magn.getMagnitudeName().toValue());
                        entry.setParameterType(getParamType(magn.getParamType()));
                        entry.setScalar(magn.getScalar());
                        magnitudeSet.add(entry);
                    }
                }
                lootEffect.setMagnitudes(magnitudeSet);
                lootEffect.setLootEffectType(LootEffectType.NAMED);
                lootEffectSet.add(lootEffect);
            }
        }

        return lootEffectSet;
    }

    public static void updateConditionalEffects(Set<LootEffect> lootEffects, ConditionalLootEffects conditionalLootEffects){
        for(LootEffect effect : lootEffects){
            if(effect.getMagnitudes()==null){
                effect.setMagnitudes(new HashSet<>());
            }
            if(effect.getLootEffectType() == LootEffectType.CONDITIONAL){
                for(ConditionalLootEffectsCollection effectsCollection : conditionalLootEffects.getCollection()){
                    if(effectsCollection.getName().equals(effect.getName())) {
                        if (effectsCollection.getNamedLootEffects() != null) {
                            for (PurpleNamedLootEffect purpleNamedLootEffect : effectsCollection.getNamedLootEffects()) {
                                if (purpleNamedLootEffect.getMagnitudes() != null) {
                                    for (org.imrofli.godfall.data.Magnitude magn : purpleNamedLootEffect.getMagnitudes()) {
                                        boolean wasAlreadyIn = false;
                                        for (Magnitude lootMagnitude : effect.getMagnitudes()) {
                                            if (lootMagnitude.getName().equals(magn.getMagnitudeName().toValue())) {
                                                lootMagnitude.setScalar(magn.getScalar());
                                                wasAlreadyIn = true;
                                            }
                                        }
                                        if (!wasAlreadyIn) {
                                            org.imrofli.godfall.dao.model.Magnitude entry = new org.imrofli.godfall.dao.model.Magnitude();
                                            entry.setName(magn.getMagnitudeName().toValue());
                                            entry.setParameterType(getParamType(magn.getParamType()));
                                            entry.setScalar(magn.getScalar());

                                            effect.getMagnitudes().add(entry);
                                        }
                                    }
                                }
                            }
                        }
                        else if(effectsCollection.getTraitModifiers()!=null){
                                if (effectsCollection.getTraitModifiers() != null) {
                                        boolean wasAlreadyIn = false;
                                        for (Magnitude lootMagnitude : effect.getMagnitudes()) {
                                            for(String s : effectsCollection.getTraitModifiers().getModifierNames()){
                                                if (lootMagnitude.getName().equals("s")) {
                                                    lootMagnitude.setScalar((double) effectsCollection.getTraitModifiers().getScalar());
                                                    wasAlreadyIn = true;
                                                }
                                            }

                                        }
                                        if (!wasAlreadyIn) {
                                            org.imrofli.godfall.dao.model.Magnitude entry = new org.imrofli.godfall.dao.model.Magnitude();
                                            for(String s : effectsCollection.getTraitModifiers().getModifierNames()){
                                                entry.setName(s);
                                                entry.setParameterType(getParamType(effectsCollection.getConditionParamType()));
                                                entry.setScalar((double) effectsCollection.getTraitModifiers().getScalar());

                                                effect.getMagnitudes().add(entry);
                                            }

                                        }

                                }

                        }
                    }

                }
            }
        }
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


    public static String formatWeaponName(String name, List<String> nameList) {
        StringBuilder sb = new StringBuilder();
        if (nameList != null && !nameList.isEmpty()) {
            for (String entry : nameList) {
                sb.append(entry);
                sb.append(" ");
            }
        } else if (name != null && !name.isEmpty()) {
            sb.append(name);
        }
        return sb.toString().trim();
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
        return Affinity.NA;
    }
}
