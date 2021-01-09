package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ID {
    SUBZONE_AIR_AZURE_ENCLAVE, SUBZONE_AIR_FLOATING_REMNANT, SUBZONE_EARTH_ALLUVIAL_PLAINS, SUBZONE_EARTH_CRIMSON_GLADES, SUBZONE_EARTH_PRISMATIC_FALLS, SUBZONE_GLOBAL_MONOLITH, SUBZONE_WATER_ASHEN_GOD, SUBZONE_WATER_COBALT_CALDERA;

    @JsonValue
    public String toValue() {
        switch (this) {
            case SUBZONE_AIR_AZURE_ENCLAVE: return "Subzone.Air.AzureEnclave";
            case SUBZONE_AIR_FLOATING_REMNANT: return "Subzone.Air.FloatingRemnant";
            case SUBZONE_EARTH_ALLUVIAL_PLAINS: return "Subzone.Earth.AlluvialPlains";
            case SUBZONE_EARTH_CRIMSON_GLADES: return "Subzone.Earth.CrimsonGlades";
            case SUBZONE_EARTH_PRISMATIC_FALLS: return "Subzone.Earth.PrismaticFalls";
            case SUBZONE_GLOBAL_MONOLITH: return "Subzone.Global.Monolith";
            case SUBZONE_WATER_ASHEN_GOD: return "Subzone.Water.AshenGod";
            case SUBZONE_WATER_COBALT_CALDERA: return "Subzone.Water.CobaltCaldera";
        }
        return null;
    }

    @JsonCreator
    public static ID forValue(String value) throws IOException {
        if (value.equals("Subzone.Air.AzureEnclave")) return SUBZONE_AIR_AZURE_ENCLAVE;
        if (value.equals("Subzone.Air.FloatingRemnant")) return SUBZONE_AIR_FLOATING_REMNANT;
        if (value.equals("Subzone.Earth.AlluvialPlains")) return SUBZONE_EARTH_ALLUVIAL_PLAINS;
        if (value.equals("Subzone.Earth.CrimsonGlades")) return SUBZONE_EARTH_CRIMSON_GLADES;
        if (value.equals("Subzone.Earth.PrismaticFalls")) return SUBZONE_EARTH_PRISMATIC_FALLS;
        if (value.equals("Subzone.Global.Monolith")) return SUBZONE_GLOBAL_MONOLITH;
        if (value.equals("Subzone.Water.AshenGod")) return SUBZONE_WATER_ASHEN_GOD;
        if (value.equals("Subzone.Water.CobaltCaldera")) return SUBZONE_WATER_COBALT_CALDERA;
        throw new IOException("Cannot deserialize ID");
    }
}
