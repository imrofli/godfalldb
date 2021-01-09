package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum TentacledTraitSlotGroups {
    TRINKET_TRAIT_SLOTS, TRINKET_TRAIT_SLOTS_NO_PRIMARY_TRAIT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case TRINKET_TRAIT_SLOTS: return "Trinket Trait Slots";
            case TRINKET_TRAIT_SLOTS_NO_PRIMARY_TRAIT: return "Trinket Trait Slots - No Primary Trait";
        }
        return null;
    }

    @JsonCreator
    public static TentacledTraitSlotGroups forValue(String value) throws IOException {
        if (value.equals("Trinket Trait Slots")) return TRINKET_TRAIT_SLOTS;
        if (value.equals("Trinket Trait Slots - No Primary Trait")) return TRINKET_TRAIT_SLOTS_NO_PRIMARY_TRAIT;
        throw new IOException("Cannot deserialize TentacledTraitSlotGroups");
    }
}
