package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum NameElement {
    COMMON, EPIC, LEGENDARY, RARE, UNCOMMON;

    @JsonValue
    public String toValue() {
        switch (this) {
            case COMMON: return "common";
            case EPIC: return "epic";
            case LEGENDARY: return "legendary";
            case RARE: return "rare";
            case UNCOMMON: return "uncommon";
        }
        return null;
    }

    @JsonCreator
    public static NameElement forValue(String value) throws IOException {
        if (value.equals("common")) return COMMON;
        if (value.equals("epic")) return EPIC;
        if (value.equals("legendary")) return LEGENDARY;
        if (value.equals("rare")) return RARE;
        if (value.equals("uncommon")) return UNCOMMON;
        throw new IOException("Cannot deserialize NameElement");
    }
}
