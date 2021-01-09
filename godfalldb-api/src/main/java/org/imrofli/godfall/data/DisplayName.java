package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum DisplayName {
    MASTERWORK, PRIMARY, SECONDARY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case MASTERWORK: return "Masterwork";
            case PRIMARY: return "Primary";
            case SECONDARY: return "Secondary";
        }
        return null;
    }

    @JsonCreator
    public static DisplayName forValue(String value) throws IOException {
        if (value.equals("Masterwork")) return MASTERWORK;
        if (value.equals("Primary")) return PRIMARY;
        if (value.equals("Secondary")) return SECONDARY;
        throw new IOException("Cannot deserialize DisplayName");
    }
}
