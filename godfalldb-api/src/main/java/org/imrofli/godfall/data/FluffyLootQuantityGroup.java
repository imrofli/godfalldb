package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum FluffyLootQuantityGroup {
    AETHERIUM_GUARANTEED, AETHERIUM_KNIGHT, AETHERIUM_MOOK, AETHERIUM_SQUIRE, HEALTH_GLOBULE_GUARANTEED, HEALTH_GLOBULE_KNIGHT, HEALTH_GLOBULE_MOOK, HEALTH_GLOBULE_SQUIRE, HEALTH_GLOBULE_X2_GUARANTEED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AETHERIUM_GUARANTEED: return "Aetherium - Guaranteed";
            case AETHERIUM_KNIGHT: return "Aetherium - Knight";
            case AETHERIUM_MOOK: return "Aetherium - Mook";
            case AETHERIUM_SQUIRE: return "Aetherium - Squire";
            case HEALTH_GLOBULE_GUARANTEED: return "Health Globule - Guaranteed";
            case HEALTH_GLOBULE_KNIGHT: return "Health Globule - Knight";
            case HEALTH_GLOBULE_MOOK: return "Health Globule - Mook";
            case HEALTH_GLOBULE_SQUIRE: return "Health Globule - Squire";
            case HEALTH_GLOBULE_X2_GUARANTEED: return "Health Globule x2 - Guaranteed";
        }
        return null;
    }

    @JsonCreator
    public static FluffyLootQuantityGroup forValue(String value) throws IOException {
        if (value.equals("Aetherium - Guaranteed")) return AETHERIUM_GUARANTEED;
        if (value.equals("Aetherium - Knight")) return AETHERIUM_KNIGHT;
        if (value.equals("Aetherium - Mook")) return AETHERIUM_MOOK;
        if (value.equals("Aetherium - Squire")) return AETHERIUM_SQUIRE;
        if (value.equals("Health Globule - Guaranteed")) return HEALTH_GLOBULE_GUARANTEED;
        if (value.equals("Health Globule - Knight")) return HEALTH_GLOBULE_KNIGHT;
        if (value.equals("Health Globule - Mook")) return HEALTH_GLOBULE_MOOK;
        if (value.equals("Health Globule - Squire")) return HEALTH_GLOBULE_SQUIRE;
        if (value.equals("Health Globule x2 - Guaranteed")) return HEALTH_GLOBULE_X2_GUARANTEED;
        throw new IOException("Cannot deserialize FluffyLootQuantityGroup");
    }
}
