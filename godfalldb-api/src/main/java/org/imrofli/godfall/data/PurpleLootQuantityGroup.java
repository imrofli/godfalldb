package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum PurpleLootQuantityGroup {
    CHEST_RARE, END_BOSS, KNIGHT, MID_BOSS, MOOK, POPCORN, SQUIRE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CHEST_RARE: return "Chest - Rare";
            case END_BOSS: return "End Boss";
            case KNIGHT: return "Knight";
            case MID_BOSS: return "Mid Boss";
            case MOOK: return "Mook";
            case POPCORN: return "Popcorn";
            case SQUIRE: return "Squire";
        }
        return null;
    }

    @JsonCreator
    public static PurpleLootQuantityGroup forValue(String value) throws IOException {
        if (value.equals("Chest - Rare")) return CHEST_RARE;
        if (value.equals("End Boss")) return END_BOSS;
        if (value.equals("Knight")) return KNIGHT;
        if (value.equals("Mid Boss")) return MID_BOSS;
        if (value.equals("Mook")) return MOOK;
        if (value.equals("Popcorn")) return POPCORN;
        if (value.equals("Squire")) return SQUIRE;
        throw new IOException("Cannot deserialize PurpleLootQuantityGroup");
    }
}
