package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Activity1 {
    FLEX_NORMAL, FLEX_TEMPERED, STORY_AIR, STORY_EARTH, STORY_WATER;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FLEX_NORMAL: return "Flex.Normal";
            case FLEX_TEMPERED: return "Flex.Tempered";
            case STORY_AIR: return "Story.Air";
            case STORY_EARTH: return "Story.Earth";
            case STORY_WATER: return "Story.Water";
        }
        return null;
    }

    @JsonCreator
    public static Activity1 forValue(String value) throws IOException {
        if (value.equals("Flex.Normal")) return FLEX_NORMAL;
        if (value.equals("Flex.Tempered")) return FLEX_TEMPERED;
        if (value.equals("Story.Air")) return STORY_AIR;
        if (value.equals("Story.Earth")) return STORY_EARTH;
        if (value.equals("Story.Water")) return STORY_WATER;
        throw new IOException("Cannot deserialize Activity1");
    }
}
