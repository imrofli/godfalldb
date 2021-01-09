package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum GroupName {
    AIR_TOUCHED_SHOCK, EARTH_TOUCHED_POISON, FLAME_TOUCHED_IGNITE, FLAME_TOUCHED_WEAKPOINT, MASTERWORK_TRAIT, PHYSICAL_TOUCHED_BLEED, PRIMARY_ATTRIBUTE, PRIMARY_TRAIT, SECONDARY_TRAIT, VOID_TOUCHED_CURSE, WATER_TOUCHED_CHILL;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AIR_TOUCHED_SHOCK: return "Air Touched Shock";
            case EARTH_TOUCHED_POISON: return "Earth Touched Poison";
            case FLAME_TOUCHED_IGNITE: return "Flame Touched Ignite";
            case FLAME_TOUCHED_WEAKPOINT: return "Flame Touched Weakpoint";
            case MASTERWORK_TRAIT: return "Masterwork Trait";
            case PHYSICAL_TOUCHED_BLEED: return "Physical Touched Bleed";
            case PRIMARY_ATTRIBUTE: return "Primary Attribute";
            case PRIMARY_TRAIT: return "Primary Trait";
            case SECONDARY_TRAIT: return "Secondary Trait";
            case VOID_TOUCHED_CURSE: return "Void Touched Curse";
            case WATER_TOUCHED_CHILL: return "Water Touched Chill";
        }
        return null;
    }

    @JsonCreator
    public static GroupName forValue(String value) throws IOException {
        if (value.equals("Air Touched Shock")) return AIR_TOUCHED_SHOCK;
        if (value.equals("Earth Touched Poison")) return EARTH_TOUCHED_POISON;
        if (value.equals("Flame Touched Ignite")) return FLAME_TOUCHED_IGNITE;
        if (value.equals("Flame Touched Weakpoint")) return FLAME_TOUCHED_WEAKPOINT;
        if (value.equals("Masterwork Trait")) return MASTERWORK_TRAIT;
        if (value.equals("Physical Touched Bleed")) return PHYSICAL_TOUCHED_BLEED;
        if (value.equals("Primary Attribute")) return PRIMARY_ATTRIBUTE;
        if (value.equals("Primary Trait")) return PRIMARY_TRAIT;
        if (value.equals("Secondary Trait")) return SECONDARY_TRAIT;
        if (value.equals("Void Touched Curse")) return VOID_TOUCHED_CURSE;
        if (value.equals("Water Touched Chill")) return WATER_TOUCHED_CHILL;
        throw new IOException("Cannot deserialize GroupName");
    }
}
