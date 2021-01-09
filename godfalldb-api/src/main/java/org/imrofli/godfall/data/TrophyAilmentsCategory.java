package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum TrophyAilmentsCategory {
    TROPHY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case TROPHY: return "Trophy";
        }
        return null;
    }

    @JsonCreator
    public static TrophyAilmentsCategory forValue(String value) throws IOException {
        if (value.equals("Trophy")) return TROPHY;
        throw new IOException("Cannot deserialize TrophyAilmentsCategory");
    }
}
