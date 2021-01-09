package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum SuccessText {
    CRAFT_YOUR_FIRST_VALORPLATE, DREAMSTONE_COMPLETE, TALK_TO_SEVENTH_SANCTUM, TALK_TO_ZENUN_EARTHMINDER, VISIT_THE_FORGE, VISIT_THE_TRAINING_ROOM;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CRAFT_YOUR_FIRST_VALORPLATE: return "Craft your first Valorplate";
            case DREAMSTONE_COMPLETE: return "Dreamstone Complete";
            case TALK_TO_SEVENTH_SANCTUM: return "Talk to Seventh Sanctum";
            case TALK_TO_ZENUN_EARTHMINDER: return "Talk to Zenun Earthminder";
            case VISIT_THE_FORGE: return "Visit the Forge";
            case VISIT_THE_TRAINING_ROOM: return "Visit the Training Room";
        }
        return null;
    }

    @JsonCreator
    public static SuccessText forValue(String value) throws IOException {
        if (value.equals("Craft your first Valorplate")) return CRAFT_YOUR_FIRST_VALORPLATE;
        if (value.equals("Dreamstone Complete")) return DREAMSTONE_COMPLETE;
        if (value.equals("Talk to Seventh Sanctum")) return TALK_TO_SEVENTH_SANCTUM;
        if (value.equals("Talk to Zenun Earthminder")) return TALK_TO_ZENUN_EARTHMINDER;
        if (value.equals("Visit the Forge")) return VISIT_THE_FORGE;
        if (value.equals("Visit the Training Room")) return VISIT_THE_TRAINING_ROOM;
        throw new IOException("Cannot deserialize SuccessText");
    }
}
