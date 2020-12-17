package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum MagnitudeName {
    MAGNITUDE_A, MAGNITUDE_AILMENT_TYPE, MAGNITUDE_B, MAGNITUDE_CHANCE, MAGNITUDE_DAMAGE_TYPE, MAGNITUDE_DURATION, MAGNITUDE_RADIUS, MAGNITUDE_SECONDS_A, MAGNITUDE_SECONDS_B, MAGNITUDE_SUMMON_TAG, MAGNITUDE_X, MAGNITUDE_Y, MAGNITUDE_Z;

    @JsonValue
    public String toValue() {
        switch (this) {
            case MAGNITUDE_A: return "Magnitude.A";
            case MAGNITUDE_AILMENT_TYPE: return "Magnitude.AilmentType";
            case MAGNITUDE_B: return "Magnitude.B";
            case MAGNITUDE_CHANCE: return "Magnitude.Chance";
            case MAGNITUDE_DAMAGE_TYPE: return "Magnitude.DamageType";
            case MAGNITUDE_DURATION: return "Magnitude.Duration";
            case MAGNITUDE_RADIUS: return "Magnitude.Radius";
            case MAGNITUDE_SECONDS_A: return "Magnitude.Seconds.A";
            case MAGNITUDE_SECONDS_B: return "Magnitude.Seconds.B";
            case MAGNITUDE_SUMMON_TAG: return "Magnitude.SummonTag";
            case MAGNITUDE_X: return "Magnitude.X";
            case MAGNITUDE_Y: return "Magnitude.Y";
            case MAGNITUDE_Z: return "Magnitude.Z";
        }
        return null;
    }

    @JsonCreator
    public static MagnitudeName forValue(String value) throws IOException {
        if (value.equals("Magnitude.A")) return MAGNITUDE_A;
        if (value.equals("Magnitude.AilmentType")) return MAGNITUDE_AILMENT_TYPE;
        if (value.equals("Magnitude.B")) return MAGNITUDE_B;
        if (value.equals("Magnitude.Chance")) return MAGNITUDE_CHANCE;
        if (value.equals("Magnitude.DamageType")) return MAGNITUDE_DAMAGE_TYPE;
        if (value.equals("Magnitude.Duration")) return MAGNITUDE_DURATION;
        if (value.equals("Magnitude.Radius")) return MAGNITUDE_RADIUS;
        if (value.equals("Magnitude.Seconds.A")) return MAGNITUDE_SECONDS_A;
        if (value.equals("Magnitude.Seconds.B")) return MAGNITUDE_SECONDS_B;
        if (value.equals("Magnitude.SummonTag")) return MAGNITUDE_SUMMON_TAG;
        if (value.equals("Magnitude.X")) return MAGNITUDE_X;
        if (value.equals("Magnitude.Y")) return MAGNITUDE_Y;
        if (value.equals("Magnitude.Z")) return MAGNITUDE_Z;
        throw new IOException("Cannot deserialize MagnitudeName");
    }
}
