package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum PurpleTraitSlotGroups {
    AUGMENT_TRAIT_SLOTS, AUGMENT_TRAIT_SLOTS_NO_PRIMARY_TRAIT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AUGMENT_TRAIT_SLOTS: return "Augment Trait Slots";
            case AUGMENT_TRAIT_SLOTS_NO_PRIMARY_TRAIT: return "Augment Trait Slots - No Primary Trait";
        }
        return null;
    }

    @JsonCreator
    public static PurpleTraitSlotGroups forValue(String value) throws IOException {
        if (value.equals("Augment Trait Slots")) return AUGMENT_TRAIT_SLOTS;
        if (value.equals("Augment Trait Slots - No Primary Trait")) return AUGMENT_TRAIT_SLOTS_NO_PRIMARY_TRAIT;
        throw new IOException("Cannot deserialize PurpleTraitSlotGroups");
    }
}
