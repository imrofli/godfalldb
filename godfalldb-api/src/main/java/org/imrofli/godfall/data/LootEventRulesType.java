package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum LootEventRulesType {
    CHEST, DEFAULT, DESTRUCTIBLE, GATHER, KNIGHT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CHEST: return "Chest";
            case DEFAULT: return "Default";
            case DESTRUCTIBLE: return "Destructible";
            case GATHER: return "Gather";
            case KNIGHT: return "Knight";
        }
        return null;
    }

    @JsonCreator
    public static LootEventRulesType forValue(String value) throws IOException {
        if (value.equals("Chest")) return CHEST;
        if (value.equals("Default")) return DEFAULT;
        if (value.equals("Destructible")) return DESTRUCTIBLE;
        if (value.equals("Gather")) return GATHER;
        if (value.equals("Knight")) return KNIGHT;
        throw new IOException("Cannot deserialize LootEventRulesType");
    }
}
