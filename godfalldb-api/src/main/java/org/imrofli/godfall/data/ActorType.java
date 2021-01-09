package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ActorType {
    INSTIGATOR, TARGET;

    @JsonValue
    public String toValue() {
        switch (this) {
            case INSTIGATOR: return "Instigator";
            case TARGET: return "Target";
        }
        return null;
    }

    @JsonCreator
    public static ActorType forValue(String value) throws IOException {
        if (value.equals("Instigator")) return INSTIGATOR;
        if (value.equals("Target")) return TARGET;
        throw new IOException("Cannot deserialize ActorType");
    }
}
