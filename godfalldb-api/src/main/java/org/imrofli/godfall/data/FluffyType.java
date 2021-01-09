package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum FluffyType {
    BOSS_FLOOR, ROOM_FLOOR;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BOSS_FLOOR: return "bossFloor";
            case ROOM_FLOOR: return "roomFloor";
        }
        return null;
    }

    @JsonCreator
    public static FluffyType forValue(String value) throws IOException {
        if (value.equals("bossFloor")) return BOSS_FLOOR;
        if (value.equals("roomFloor")) return ROOM_FLOOR;
        throw new IOException("Cannot deserialize FluffyType");
    }
}
