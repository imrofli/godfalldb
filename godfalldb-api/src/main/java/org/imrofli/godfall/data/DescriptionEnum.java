package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum DescriptionEnum {
    AIR_BIOME_CURRENCY, EARTH_BIOME_CURRENCY, WATER_BIOME_CURRENCY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AIR_BIOME_CURRENCY: return "Air Biome Currency";
            case EARTH_BIOME_CURRENCY: return "Earth Biome Currency";
            case WATER_BIOME_CURRENCY: return "Water Biome Currency";
        }
        return null;
    }

    @JsonCreator
    public static DescriptionEnum forValue(String value) throws IOException {
        if (value.equals("Air Biome Currency")) return AIR_BIOME_CURRENCY;
        if (value.equals("Earth Biome Currency")) return EARTH_BIOME_CURRENCY;
        if (value.equals("Water Biome Currency")) return WATER_BIOME_CURRENCY;
        throw new IOException("Cannot deserialize DescriptionEnum");
    }
}
