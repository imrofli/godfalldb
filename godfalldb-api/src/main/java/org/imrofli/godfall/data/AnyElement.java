package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum AnyElement {
    STEP1, STEP2, STEP3;

    @JsonValue
    public String toValue() {
        switch (this) {
            case STEP1: return "Step1";
            case STEP2: return "Step2";
            case STEP3: return "Step3";
        }
        return null;
    }

    @JsonCreator
    public static AnyElement forValue(String value) throws IOException {
        if (value.equals("Step1")) return STEP1;
        if (value.equals("Step2")) return STEP2;
        if (value.equals("Step3")) return STEP3;
        throw new IOException("Cannot deserialize AnyElement");
    }
}
