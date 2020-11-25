package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ElementTraitTagGroup {
    AUGMENT_AIR, AUGMENT_EARTH, AUGMENT_PHYSICAL, AUGMENT_RANDOM_ELEMENT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AUGMENT_AIR: return "Augment - Air";
            case AUGMENT_EARTH: return "Augment - Earth";
            case AUGMENT_PHYSICAL: return "Augment - Physical";
            case AUGMENT_RANDOM_ELEMENT: return "Augment - Random Element";
        }
        return null;
    }

    @JsonCreator
    public static ElementTraitTagGroup forValue(String value) throws IOException {
        if (value.equals("Augment - Air")) return AUGMENT_AIR;
        if (value.equals("Augment - Earth")) return AUGMENT_EARTH;
        if (value.equals("Augment - Physical")) return AUGMENT_PHYSICAL;
        if (value.equals("Augment - Random Element")) return AUGMENT_RANDOM_ELEMENT;
        throw new IOException("Cannot deserialize ElementTraitTagGroup");
    }
}
