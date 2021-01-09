package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum FluffyTraitSlotGroups {
    POTION_TRAIT_SLOTS, POTION_TRAIT_SLOTS_NO_PRIMARY_TRAIT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case POTION_TRAIT_SLOTS: return "Potion Trait Slots";
            case POTION_TRAIT_SLOTS_NO_PRIMARY_TRAIT: return "Potion Trait Slots - No Primary Trait";
        }
        return null;
    }

    @JsonCreator
    public static FluffyTraitSlotGroups forValue(String value) throws IOException {
        if (value.equals("Potion Trait Slots")) return POTION_TRAIT_SLOTS;
        if (value.equals("Potion Trait Slots - No Primary Trait")) return POTION_TRAIT_SLOTS_NO_PRIMARY_TRAIT;
        throw new IOException("Cannot deserialize FluffyTraitSlotGroups");
    }
}
