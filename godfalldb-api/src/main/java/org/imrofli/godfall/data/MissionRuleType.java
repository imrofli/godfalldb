package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum MissionRuleType {
    ACTIVITY, DREAMSTONE, FORCED_ACTIVITY, STORY_ACTIVITY, WSS_ACTIVITY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ACTIVITY: return "activity";
            case DREAMSTONE: return "dreamstone";
            case FORCED_ACTIVITY: return "forcedActivity";
            case STORY_ACTIVITY: return "storyActivity";
            case WSS_ACTIVITY: return "wssActivity";
        }
        return null;
    }

    @JsonCreator
    public static MissionRuleType forValue(String value) throws IOException {
        if (value.equals("activity")) return ACTIVITY;
        if (value.equals("dreamstone")) return DREAMSTONE;
        if (value.equals("forcedActivity")) return FORCED_ACTIVITY;
        if (value.equals("storyActivity")) return STORY_ACTIVITY;
        if (value.equals("wssActivity")) return WSS_ACTIVITY;
        throw new IOException("Cannot deserialize MissionRuleType");
    }
}
