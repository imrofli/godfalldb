package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum SheetName {
    ACTIVITIES, AILMENTS, ARCHON_MODES, AUGMENTS, AUGMENT_AFFINITIES, BANNERS, CODEX_ENTRIES, CONDITIONAL_LOOT_EFFECTS, COSMETICS, CURRENCIES, DAMAGE_TYPES, DREAMSTONES, DREAMSTONE_EFFECTS, ENEMIES, GAMEPLAY_EVENTS, INTEL, KEYWORDS, LOCALIZATION_ORPHANS, LOOT_GAMEPLAY_TRIGGERS, LOOT_QUANTITY, MAP_SUBZONES, MASTERY_ENTITLEMENTS, MERITS, NOEX_GAMEPLAY_TAGS, NOEX_LOCALIZATION_ORPHANS, OBJECTIVE, POTIONS, POWERUPS, QUESTS, RARITIES, TRAIT, TRINKETS, VALORPLATES, WEAPONS, WEAPON_CLASS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ACTIVITIES: return "activities";
            case AILMENTS: return "ailments";
            case ARCHON_MODES: return "archonModes";
            case AUGMENTS: return "augments";
            case AUGMENT_AFFINITIES: return "augmentAffinities";
            case BANNERS: return "banners";
            case CODEX_ENTRIES: return "codexEntries";
            case CONDITIONAL_LOOT_EFFECTS: return "conditionalLootEffects";
            case COSMETICS: return "cosmetics";
            case CURRENCIES: return "currencies";
            case DAMAGE_TYPES: return "damageTypes";
            case DREAMSTONES: return "dreamstones";
            case DREAMSTONE_EFFECTS: return "dreamstoneEffects";
            case ENEMIES: return "enemies";
            case GAMEPLAY_EVENTS: return "gameplayEvents";
            case INTEL: return "intel";
            case KEYWORDS: return "keywords";
            case LOCALIZATION_ORPHANS: return "LocalizationOrphans";
            case LOOT_GAMEPLAY_TRIGGERS: return "lootGameplayTriggers";
            case LOOT_QUANTITY: return "lootQuantity";
            case MAP_SUBZONES: return "mapSubzones";
            case MASTERY_ENTITLEMENTS: return "masteryEntitlements";
            case MERITS: return "merits";
            case NOEX_GAMEPLAY_TAGS: return "NOEX_gameplayTags";
            case NOEX_LOCALIZATION_ORPHANS: return "NOEX_localizationOrphans";
            case OBJECTIVE: return "objective";
            case POTIONS: return "potions";
            case POWERUPS: return "powerups";
            case QUESTS: return "quests";
            case RARITIES: return "rarities";
            case TRAIT: return "trait";
            case TRINKETS: return "trinkets";
            case VALORPLATES: return "valorplates";
            case WEAPONS: return "weapons";
            case WEAPON_CLASS: return "weaponClass";
        }
        return null;
    }

    @JsonCreator
    public static SheetName forValue(String value) throws IOException {
        if (value.equals("activities")) return ACTIVITIES;
        if (value.equals("ailments")) return AILMENTS;
        if (value.equals("archonModes")) return ARCHON_MODES;
        if (value.equals("augments")) return AUGMENTS;
        if (value.equals("augmentAffinities")) return AUGMENT_AFFINITIES;
        if (value.equals("banners")) return BANNERS;
        if (value.equals("codexEntries")) return CODEX_ENTRIES;
        if (value.equals("conditionalLootEffects")) return CONDITIONAL_LOOT_EFFECTS;
        if (value.equals("cosmetics")) return COSMETICS;
        if (value.equals("currencies")) return CURRENCIES;
        if (value.equals("damageTypes")) return DAMAGE_TYPES;
        if (value.equals("dreamstones")) return DREAMSTONES;
        if (value.equals("dreamstoneEffects")) return DREAMSTONE_EFFECTS;
        if (value.equals("enemies")) return ENEMIES;
        if (value.equals("gameplayEvents")) return GAMEPLAY_EVENTS;
        if (value.equals("intel")) return INTEL;
        if (value.equals("keywords")) return KEYWORDS;
        if (value.equals("LocalizationOrphans")) return LOCALIZATION_ORPHANS;
        if (value.equals("lootGameplayTriggers")) return LOOT_GAMEPLAY_TRIGGERS;
        if (value.equals("lootQuantity")) return LOOT_QUANTITY;
        if (value.equals("mapSubzones")) return MAP_SUBZONES;
        if (value.equals("masteryEntitlements")) return MASTERY_ENTITLEMENTS;
        if (value.equals("merits")) return MERITS;
        if (value.equals("NOEX_gameplayTags")) return NOEX_GAMEPLAY_TAGS;
        if (value.equals("NOEX_localizationOrphans")) return NOEX_LOCALIZATION_ORPHANS;
        if (value.equals("objective")) return OBJECTIVE;
        if (value.equals("potions")) return POTIONS;
        if (value.equals("powerups")) return POWERUPS;
        if (value.equals("quests")) return QUESTS;
        if (value.equals("rarities")) return RARITIES;
        if (value.equals("trait")) return TRAIT;
        if (value.equals("trinkets")) return TRINKETS;
        if (value.equals("valorplates")) return VALORPLATES;
        if (value.equals("weapons")) return WEAPONS;
        if (value.equals("weaponClass")) return WEAPON_CLASS;
        throw new IOException("Cannot deserialize SheetName");
    }
}
