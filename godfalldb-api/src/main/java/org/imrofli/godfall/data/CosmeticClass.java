package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum CosmeticClass {
    BANNERS, SPECTRAL_WEAPONS, VALORPLATES, WEAPONS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BANNERS: return "banners";
            case SPECTRAL_WEAPONS: return "spectralWeapons";
            case VALORPLATES: return "valorplates";
            case WEAPONS: return "weapons";
        }
        return null;
    }

    @JsonCreator
    public static CosmeticClass forValue(String value) throws IOException {
        if (value.equals("banners")) return BANNERS;
        if (value.equals("spectralWeapons")) return SPECTRAL_WEAPONS;
        if (value.equals("valorplates")) return VALORPLATES;
        if (value.equals("weapons")) return WEAPONS;
        throw new IOException("Cannot deserialize CosmeticClass");
    }
}
