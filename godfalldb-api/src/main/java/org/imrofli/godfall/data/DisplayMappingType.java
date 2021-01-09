package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum DisplayMappingType {
    PERCENT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case PERCENT: return "percent";
        }
        return null;
    }

    @JsonCreator
    public static DisplayMappingType forValue(String value) throws IOException {
        if (value.equals("percent")) return PERCENT;
        throw new IOException("Cannot deserialize DisplayMappingType");
    }
}
