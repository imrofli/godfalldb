package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum SpawnPointRedActorTag {
    ALLUVIAL_PLAINS, ASHEN_GOD, AZURE_ENCLAVE, COBALT_CALDERA, CRIMSON_GLADES, FLOATING_REMNANT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ALLUVIAL_PLAINS: return "AlluvialPlains";
            case ASHEN_GOD: return "AshenGod";
            case AZURE_ENCLAVE: return "AzureEnclave";
            case COBALT_CALDERA: return "CobaltCaldera";
            case CRIMSON_GLADES: return "CrimsonGlades";
            case FLOATING_REMNANT: return "FloatingRemnant";
        }
        return null;
    }

    @JsonCreator
    public static SpawnPointRedActorTag forValue(String value) throws IOException {
        if (value.equals("AlluvialPlains")) return ALLUVIAL_PLAINS;
        if (value.equals("AshenGod")) return ASHEN_GOD;
        if (value.equals("AzureEnclave")) return AZURE_ENCLAVE;
        if (value.equals("CobaltCaldera")) return COBALT_CALDERA;
        if (value.equals("CrimsonGlades")) return CRIMSON_GLADES;
        if (value.equals("FloatingRemnant")) return FLOATING_REMNANT;
        throw new IOException("Cannot deserialize SpawnPointRedActorTag");
    }
}
