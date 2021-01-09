package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum PurpleGameplayTag {
    TRIGGER_CHARACTER_DEFEAT_VALID, TRIGGER_CHARACTER_HEALTH_AT_OR_BELOW_10, TRIGGER_CHARACTER_HEALTH_AT_OR_BELOW_20, TRIGGER_CHARACTER_HEALTH_AT_OR_BELOW_30, TRIGGER_CHARACTER_HEALTH_AT_OR_BELOW_40, TRIGGER_CHARACTER_HEALTH_AT_OR_BELOW_50, TRIGGER_CHARACTER_HEALTH_AT_OR_BELOW_60, TRIGGER_CHARACTER_HEALTH_AT_OR_BELOW_70, TRIGGER_CHARACTER_HEALTH_AT_OR_BELOW_80;

    @JsonValue
    public String toValue() {
        switch (this) {
            case TRIGGER_CHARACTER_DEFEAT_VALID: return "Trigger.Character.Defeat.Valid";
            case TRIGGER_CHARACTER_HEALTH_AT_OR_BELOW_10: return "Trigger.Character.HealthAtOrBelow.10";
            case TRIGGER_CHARACTER_HEALTH_AT_OR_BELOW_20: return "Trigger.Character.HealthAtOrBelow.20";
            case TRIGGER_CHARACTER_HEALTH_AT_OR_BELOW_30: return "Trigger.Character.HealthAtOrBelow.30";
            case TRIGGER_CHARACTER_HEALTH_AT_OR_BELOW_40: return "Trigger.Character.HealthAtOrBelow.40";
            case TRIGGER_CHARACTER_HEALTH_AT_OR_BELOW_50: return "Trigger.Character.HealthAtOrBelow.50";
            case TRIGGER_CHARACTER_HEALTH_AT_OR_BELOW_60: return "Trigger.Character.HealthAtOrBelow.60";
            case TRIGGER_CHARACTER_HEALTH_AT_OR_BELOW_70: return "Trigger.Character.HealthAtOrBelow.70";
            case TRIGGER_CHARACTER_HEALTH_AT_OR_BELOW_80: return "Trigger.Character.HealthAtOrBelow.80";
        }
        return null;
    }

    @JsonCreator
    public static PurpleGameplayTag forValue(String value) throws IOException {
        if (value.equals("Trigger.Character.Defeat.Valid")) return TRIGGER_CHARACTER_DEFEAT_VALID;
        if (value.equals("Trigger.Character.HealthAtOrBelow.10")) return TRIGGER_CHARACTER_HEALTH_AT_OR_BELOW_10;
        if (value.equals("Trigger.Character.HealthAtOrBelow.20")) return TRIGGER_CHARACTER_HEALTH_AT_OR_BELOW_20;
        if (value.equals("Trigger.Character.HealthAtOrBelow.30")) return TRIGGER_CHARACTER_HEALTH_AT_OR_BELOW_30;
        if (value.equals("Trigger.Character.HealthAtOrBelow.40")) return TRIGGER_CHARACTER_HEALTH_AT_OR_BELOW_40;
        if (value.equals("Trigger.Character.HealthAtOrBelow.50")) return TRIGGER_CHARACTER_HEALTH_AT_OR_BELOW_50;
        if (value.equals("Trigger.Character.HealthAtOrBelow.60")) return TRIGGER_CHARACTER_HEALTH_AT_OR_BELOW_60;
        if (value.equals("Trigger.Character.HealthAtOrBelow.70")) return TRIGGER_CHARACTER_HEALTH_AT_OR_BELOW_70;
        if (value.equals("Trigger.Character.HealthAtOrBelow.80")) return TRIGGER_CHARACTER_HEALTH_AT_OR_BELOW_80;
        throw new IOException("Cannot deserialize PurpleGameplayTag");
    }
}
