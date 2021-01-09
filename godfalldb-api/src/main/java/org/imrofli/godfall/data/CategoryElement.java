package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum CategoryElement {
    AIR, EARTH, FIRE, FLEX, MICRO_EVENT, QA, REWARD, TOWER_OF_TRIALS, WATER;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AIR: return "Air";
            case EARTH: return "Earth";
            case FIRE: return "Fire";
            case FLEX: return "Flex";
            case MICRO_EVENT: return "Micro Event";
            case QA: return "QA";
            case REWARD: return "Reward";
            case TOWER_OF_TRIALS: return "TowerOfTrials";
            case WATER: return "Water";
        }
        return null;
    }

    @JsonCreator
    public static CategoryElement forValue(String value) throws IOException {
        if (value.equals("Air")) return AIR;
        if (value.equals("Earth")) return EARTH;
        if (value.equals("Fire")) return FIRE;
        if (value.equals("Flex")) return FLEX;
        if (value.equals("Micro Event")) return MICRO_EVENT;
        if (value.equals("QA")) return QA;
        if (value.equals("Reward")) return REWARD;
        if (value.equals("TowerOfTrials")) return TOWER_OF_TRIALS;
        if (value.equals("Water")) return WATER;
        throw new IOException("Cannot deserialize CategoryElement");
    }
}
