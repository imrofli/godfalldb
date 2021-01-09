package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum PurpleType {
    CURRENCY, GEAR, POWERUP;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CURRENCY: return "Currency";
            case GEAR: return "Gear";
            case POWERUP: return "Powerup";
        }
        return null;
    }

    @JsonCreator
    public static PurpleType forValue(String value) throws IOException {
        if (value.equals("Currency")) return CURRENCY;
        if (value.equals("Gear")) return GEAR;
        if (value.equals("Powerup")) return POWERUP;
        throw new IOException("Cannot deserialize PurpleType");
    }
}
