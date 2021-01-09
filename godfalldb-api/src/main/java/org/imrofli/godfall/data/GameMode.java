package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum GameMode {
    BOSS, FLEXIBLE_MISSION, FTUE, FTUE_BOSS, PLAY, SANCTUM, STORY, TOWER_OF_TRIALS, TOWER_OF_TRIALS_END_GAME;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BOSS: return "Boss";
            case FLEXIBLE_MISSION: return "FlexibleMission";
            case FTUE: return "FTUE";
            case FTUE_BOSS: return "FTUEBoss";
            case PLAY: return "Play";
            case SANCTUM: return "Sanctum";
            case STORY: return "Story";
            case TOWER_OF_TRIALS: return "TowerOfTrials";
            case TOWER_OF_TRIALS_END_GAME: return "TowerOfTrialsEndGame";
        }
        return null;
    }

    @JsonCreator
    public static GameMode forValue(String value) throws IOException {
        if (value.equals("Boss")) return BOSS;
        if (value.equals("FlexibleMission")) return FLEXIBLE_MISSION;
        if (value.equals("FTUE")) return FTUE;
        if (value.equals("FTUEBoss")) return FTUE_BOSS;
        if (value.equals("Play")) return PLAY;
        if (value.equals("Sanctum")) return SANCTUM;
        if (value.equals("Story")) return STORY;
        if (value.equals("TowerOfTrials")) return TOWER_OF_TRIALS;
        if (value.equals("TowerOfTrialsEndGame")) return TOWER_OF_TRIALS_END_GAME;
        throw new IOException("Cannot deserialize GameMode");
    }
}
