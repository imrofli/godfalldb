package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Region {
    AIR, DEV1, EARTH, WATER;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AIR: return "air";
            case DEV1: return "dev1";
            case EARTH: return "earth";
            case WATER: return "water";
        }
        return null;
    }

    @JsonCreator
    public static Region forValue(String value) throws IOException {
        if (value.equals("air")) return AIR;
        if (value.equals("dev1")) return DEV1;
        if (value.equals("earth")) return EARTH;
        if (value.equals("water")) return WATER;
        throw new IOException("Cannot deserialize Region");
    }
}
