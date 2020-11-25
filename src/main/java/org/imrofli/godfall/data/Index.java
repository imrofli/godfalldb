package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Index {
    COMMON, EPIC, EXOTIC, LEGENDARY, RARE, UNCOMMON;

    @JsonValue
    public String toValue() {
        switch (this) {
            case COMMON: return "Common";
            case EPIC: return "Epic";
            case EXOTIC: return "Exotic";
            case LEGENDARY: return "Legendary";
            case RARE: return "Rare";
            case UNCOMMON: return "Uncommon";
        }
        return null;
    }

    @JsonCreator
    public static Index forValue(String value) throws IOException {
        if (value.equals("Common")) return COMMON;
        if (value.equals("Epic")) return EPIC;
        if (value.equals("Exotic")) return EXOTIC;
        if (value.equals("Legendary")) return LEGENDARY;
        if (value.equals("Rare")) return RARE;
        if (value.equals("Uncommon")) return UNCOMMON;
        throw new IOException("Cannot deserialize Index");
    }
}
