package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum BoonWhitelistTag {
    BANE, BANE_INTENSIFIED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BANE: return "Bane";
            case BANE_INTENSIFIED: return "Bane.Intensified";
        }
        return null;
    }

    @JsonCreator
    public static BoonWhitelistTag forValue(String value) throws IOException {
        if (value.equals("Bane")) return BANE;
        if (value.equals("Bane.Intensified")) return BANE_INTENSIFIED;
        throw new IOException("Cannot deserialize BoonWhitelistTag");
    }
}
