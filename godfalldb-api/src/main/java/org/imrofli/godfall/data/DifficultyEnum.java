package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum DifficultyEnum {
    TIER_1_THREAT_1;

    @JsonValue
    public String toValue() {
        switch (this) {
            case TIER_1_THREAT_1: return "(Tier=1,Threat=1)";
        }
        return null;
    }

    @JsonCreator
    public static DifficultyEnum forValue(String value) throws IOException {
        if (value.equals("(Tier=1,Threat=1)")) return TIER_1_THREAT_1;
        throw new IOException("Cannot deserialize DifficultyEnum");
    }
}
