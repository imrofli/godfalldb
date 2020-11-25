package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum StickyTraitSlotGroups {
    WEAPON_TRAIT_SLOTS, WEAPON_TRAIT_SLOTS_NO_PRIMARY_TRAIT, WEAPON_TRAIT_SLOTS_TO_T_WEAPON;

    @JsonValue
    public String toValue() {
        switch (this) {
            case WEAPON_TRAIT_SLOTS: return "Weapon Trait Slots";
            case WEAPON_TRAIT_SLOTS_NO_PRIMARY_TRAIT: return "Weapon Trait Slots - No Primary Trait";
            case WEAPON_TRAIT_SLOTS_TO_T_WEAPON: return "Weapon Trait Slots - ToT Weapon";
        }
        return null;
    }

    @JsonCreator
    public static StickyTraitSlotGroups forValue(String value) throws IOException {
        if (value.equals("Weapon Trait Slots")) return WEAPON_TRAIT_SLOTS;
        if (value.equals("Weapon Trait Slots - No Primary Trait")) return WEAPON_TRAIT_SLOTS_NO_PRIMARY_TRAIT;
        if (value.equals("Weapon Trait Slots - ToT Weapon")) return WEAPON_TRAIT_SLOTS_TO_T_WEAPON;
        throw new IOException("Cannot deserialize StickyTraitSlotGroups");
    }
}
