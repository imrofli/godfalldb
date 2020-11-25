package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum CodexTab {
    BESTIARY, COMBAT, LORE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BESTIARY: return "Bestiary";
            case COMBAT: return "Combat";
            case LORE: return "Lore";
        }
        return null;
    }

    @JsonCreator
    public static CodexTab forValue(String value) throws IOException {
        if (value.equals("Bestiary")) return BESTIARY;
        if (value.equals("Combat")) return COMBAT;
        if (value.equals("Lore")) return LORE;
        throw new IOException("Cannot deserialize CodexTab");
    }
}
