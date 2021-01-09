package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum AcquireText {
    APPROACH_THE_WORLD_MAP, CONTINUE_COMPLETING_DREAMSTONES, TALK_TO_SEVENTH_SANCTUM;

    @JsonValue
    public String toValue() {
        switch (this) {
            case APPROACH_THE_WORLD_MAP: return "Approach the World Map";
            case CONTINUE_COMPLETING_DREAMSTONES: return "Continue Completing Dreamstones";
            case TALK_TO_SEVENTH_SANCTUM: return "Talk to Seventh Sanctum";
        }
        return null;
    }

    @JsonCreator
    public static AcquireText forValue(String value) throws IOException {
        if (value.equals("Approach the World Map")) return APPROACH_THE_WORLD_MAP;
        if (value.equals("Continue Completing Dreamstones")) return CONTINUE_COMPLETING_DREAMSTONES;
        if (value.equals("Talk to Seventh Sanctum")) return TALK_TO_SEVENTH_SANCTUM;
        throw new IOException("Cannot deserialize AcquireText");
    }
}
