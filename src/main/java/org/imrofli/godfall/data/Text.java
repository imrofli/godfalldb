package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Text {
    TALK_TO_THE_QUEST_GIVER;

    @JsonValue
    public String toValue() {
        switch (this) {
            case TALK_TO_THE_QUEST_GIVER: return "\"Talk to the Quest Giver\"";
        }
        return null;
    }

    @JsonCreator
    public static Text forValue(String value) throws IOException {
        if (value.equals("\"Talk to the Quest Giver\"")) return TALK_TO_THE_QUEST_GIVER;
        throw new IOException("Cannot deserialize Text");
    }
}
