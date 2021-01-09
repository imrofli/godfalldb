package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Icon {
    AIR_CRYSTAL, AUGMENT, EARTH_CRYSTAL, WATER_CRYSTAL, WEAPON;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AIR_CRYSTAL: return "AirCrystal";
            case AUGMENT: return "Augment";
            case EARTH_CRYSTAL: return "EarthCrystal";
            case WATER_CRYSTAL: return "WaterCrystal";
            case WEAPON: return "Weapon";
        }
        return null;
    }

    @JsonCreator
    public static Icon forValue(String value) throws IOException {
        if (value.equals("AirCrystal")) return AIR_CRYSTAL;
        if (value.equals("Augment")) return AUGMENT;
        if (value.equals("EarthCrystal")) return EARTH_CRYSTAL;
        if (value.equals("WaterCrystal")) return WATER_CRYSTAL;
        if (value.equals("Weapon")) return WEAPON;
        throw new IOException("Cannot deserialize Icon");
    }
}
