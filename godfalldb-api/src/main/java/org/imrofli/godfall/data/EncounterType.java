package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum EncounterType {
    ENCOUNTER_CONFLICT, ENCOUNTER_FLEX_SOBEKU, ENCOUNTER_GATHER, ENCOUNTER_GATHER_ELEMENTAL, ENCOUNTER_GATHER_SOLDIER, ENCOUNTER_GATHER_URN, ENCOUNTER_MICRO_EVENT, ENCOUNTER_MIDBOSS, ENCOUNTER_REWARD;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ENCOUNTER_CONFLICT: return "Encounter.Conflict";
            case ENCOUNTER_FLEX_SOBEKU: return "Encounter.FlexSobeku";
            case ENCOUNTER_GATHER: return "Encounter.Gather";
            case ENCOUNTER_GATHER_ELEMENTAL: return "Encounter.Gather.Elemental";
            case ENCOUNTER_GATHER_SOLDIER: return "Encounter.Gather.Soldier";
            case ENCOUNTER_GATHER_URN: return "Encounter.Gather.Urn";
            case ENCOUNTER_MICRO_EVENT: return "Encounter.MicroEvent";
            case ENCOUNTER_MIDBOSS: return "Encounter.Midboss";
            case ENCOUNTER_REWARD: return "Encounter.Reward";
        }
        return null;
    }

    @JsonCreator
    public static EncounterType forValue(String value) throws IOException {
        if (value.equals("Encounter.Conflict")) return ENCOUNTER_CONFLICT;
        if (value.equals("Encounter.FlexSobeku")) return ENCOUNTER_FLEX_SOBEKU;
        if (value.equals("Encounter.Gather")) return ENCOUNTER_GATHER;
        if (value.equals("Encounter.Gather.Elemental")) return ENCOUNTER_GATHER_ELEMENTAL;
        if (value.equals("Encounter.Gather.Soldier")) return ENCOUNTER_GATHER_SOLDIER;
        if (value.equals("Encounter.Gather.Urn")) return ENCOUNTER_GATHER_URN;
        if (value.equals("Encounter.MicroEvent")) return ENCOUNTER_MICRO_EVENT;
        if (value.equals("Encounter.Midboss")) return ENCOUNTER_MIDBOSS;
        if (value.equals("Encounter.Reward")) return ENCOUNTER_REWARD;
        throw new IOException("Cannot deserialize EncounterType");
    }
}
