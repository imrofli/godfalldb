package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum SampleFromTable {
    NONE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case NONE: return "None";
        }
        return null;
    }

    @JsonCreator
    public static SampleFromTable forValue(String value) throws IOException {
        if (value.equals("None")) return NONE;
        throw new IOException("Cannot deserialize SampleFromTable");
    }
}
