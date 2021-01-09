package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum SlotIndex {
    MASTERWORK_TRAIT, PRIMARY_ATTRIBUTE, PRIMARY_TRAIT, SECONDARY_TRAIT, SECONDARY_TRAIT_PREFIX_1, SECONDARY_TRAIT_PREFIX_2, SECONDARY_TRAIT_SUFFIX_1;

    @JsonValue
    public String toValue() {
        switch (this) {
            case MASTERWORK_TRAIT: return "Masterwork Trait";
            case PRIMARY_ATTRIBUTE: return "Primary Attribute";
            case PRIMARY_TRAIT: return "Primary Trait";
            case SECONDARY_TRAIT: return "Secondary Trait";
            case SECONDARY_TRAIT_PREFIX_1: return "Secondary Trait - Prefix 1";
            case SECONDARY_TRAIT_PREFIX_2: return "Secondary Trait - Prefix 2";
            case SECONDARY_TRAIT_SUFFIX_1: return "Secondary Trait - Suffix 1";
        }
        return null;
    }

    @JsonCreator
    public static SlotIndex forValue(String value) throws IOException {
        if (value.equals("Masterwork Trait")) return MASTERWORK_TRAIT;
        if (value.equals("Primary Attribute")) return PRIMARY_ATTRIBUTE;
        if (value.equals("Primary Trait")) return PRIMARY_TRAIT;
        if (value.equals("Secondary Trait")) return SECONDARY_TRAIT;
        if (value.equals("Secondary Trait - Prefix 1")) return SECONDARY_TRAIT_PREFIX_1;
        if (value.equals("Secondary Trait - Prefix 2")) return SECONDARY_TRAIT_PREFIX_2;
        if (value.equals("Secondary Trait - Suffix 1")) return SECONDARY_TRAIT_SUFFIX_1;
        throw new IOException("Cannot deserialize SlotIndex");
    }
}
