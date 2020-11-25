package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum MeritAbyssianSlayerCategory {
    COMBAT, EXPLORATION, KILL;

    @JsonValue
    public String toValue() {
        switch (this) {
            case COMBAT: return "Combat";
            case EXPLORATION: return "Exploration";
            case KILL: return "Kill";
        }
        return null;
    }

    @JsonCreator
    public static MeritAbyssianSlayerCategory forValue(String value) throws IOException {
        if (value.equals("Combat")) return COMBAT;
        if (value.equals("Exploration")) return EXPLORATION;
        if (value.equals("Kill")) return KILL;
        throw new IOException("Cannot deserialize MeritAbyssianSlayerCategory");
    }
}
