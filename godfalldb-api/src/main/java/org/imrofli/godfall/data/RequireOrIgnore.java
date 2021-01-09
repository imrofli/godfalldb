package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum RequireOrIgnore {
    REQUIRED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case REQUIRED: return "Required";
        }
        return null;
    }

    @JsonCreator
    public static RequireOrIgnore forValue(String value) throws IOException {
        if (value.equals("Required")) return REQUIRED;
        throw new IOException("Cannot deserialize RequireOrIgnore");
    }
}
