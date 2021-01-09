package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum EnemyType {
    END_BOSS, KNIGHT, MID_BOSS, MOOK, POPCORN, SQUIRE, STORY_MACROS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case END_BOSS: return "EndBoss";
            case KNIGHT: return "Knight";
            case MID_BOSS: return "MidBoss";
            case MOOK: return "Mook";
            case POPCORN: return "Popcorn";
            case SQUIRE: return "Squire";
            case STORY_MACROS: return "StoryMacros";
        }
        return null;
    }

    @JsonCreator
    public static EnemyType forValue(String value) throws IOException {
        if (value.equals("EndBoss")) return END_BOSS;
        if (value.equals("Knight")) return KNIGHT;
        if (value.equals("MidBoss")) return MID_BOSS;
        if (value.equals("Mook")) return MOOK;
        if (value.equals("Popcorn")) return POPCORN;
        if (value.equals("Squire")) return SQUIRE;
        if (value.equals("StoryMacros")) return STORY_MACROS;
        throw new IOException("Cannot deserialize EnemyType");
    }
}
