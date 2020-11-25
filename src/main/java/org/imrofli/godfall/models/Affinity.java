package org.imrofli.godfall.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.imrofli.godfall.data.Index;

import java.io.IOException;

public enum Affinity {
    NONE,MIGHT,SPIRIT,VITALITY;

    public String toValue() {
        switch (this) {
            case NONE: return "None";
            case MIGHT: return "Might (Red)";
            case SPIRIT: return "Spirit (Blue)";
            case VITALITY: return "Vitality (Green)";
        }
        return null;
    }

    public static Affinity forValue(Long value){
        if (value==1) return MIGHT;
        if (value==2) return VITALITY;
        if (value==3) return SPIRIT;
        return NONE;
    }

    public static Affinity forValue(String value){
        if (value.equals("Might (Red)")) return MIGHT;
        if (value.equals("Vitality (Green)")) return VITALITY;
        if (value.equals("Spirit (Blue)")) return SPIRIT;
        return NONE;
    }
}
