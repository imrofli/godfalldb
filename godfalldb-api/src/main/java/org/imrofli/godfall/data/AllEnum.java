package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum AllEnum {
    REQUIRED_PORTION, STEP1;

    @JsonValue
    public String toValue() {
        switch (this) {
            case REQUIRED_PORTION: return "RequiredPortion";
            case STEP1: return "Step1";
        }
        return null;
    }

    @JsonCreator
    public static AllEnum forValue(String value) throws IOException {
        if (value.equals("RequiredPortion")) return REQUIRED_PORTION;
        if (value.equals("Step1")) return STEP1;
        throw new IOException("Cannot deserialize AllEnum");
    }
}
