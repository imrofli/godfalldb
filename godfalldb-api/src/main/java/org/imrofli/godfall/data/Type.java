package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Type {
    FINAL_QUEST, MAIN_QUEST, MAP_QUEST, SANCTUM_QUEST, SIDE_QUEST;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FINAL_QUEST: return "finalQuest";
            case MAIN_QUEST: return "mainQuest";
            case MAP_QUEST: return "mapQuest";
            case SANCTUM_QUEST: return "sanctumQuest";
            case SIDE_QUEST: return "sideQuest";
        }
        return null;
    }

    @JsonCreator
    public static Type forValue(String value) throws IOException {
        if (value.equals("finalQuest")) return FINAL_QUEST;
        if (value.equals("mainQuest")) return MAIN_QUEST;
        if (value.equals("mapQuest")) return MAP_QUEST;
        if (value.equals("sanctumQuest")) return SANCTUM_QUEST;
        if (value.equals("sideQuest")) return SIDE_QUEST;
        throw new IOException("Cannot deserialize Type");
    }
}
