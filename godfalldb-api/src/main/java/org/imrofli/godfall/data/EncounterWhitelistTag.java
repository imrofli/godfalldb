package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum EncounterWhitelistTag {
    ENCOUNTER_ABYSSIAN, ENCOUNTER_BLACKTIDE, ENCOUNTER_CRIMSON_WIND, ENCOUNTER_NYAK, ENCOUNTER_TOWER_OF_TRIALS_ELEVATOR, ENCOUNTER_TOWER_OF_TRIALS_ROOM, ENCOUNTER_VARGUL;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ENCOUNTER_ABYSSIAN: return "Encounter.Abyssian";
            case ENCOUNTER_BLACKTIDE: return "Encounter.Blacktide";
            case ENCOUNTER_CRIMSON_WIND: return "Encounter.CrimsonWind";
            case ENCOUNTER_NYAK: return "Encounter.Nyak";
            case ENCOUNTER_TOWER_OF_TRIALS_ELEVATOR: return "Encounter.TowerOfTrials.Elevator";
            case ENCOUNTER_TOWER_OF_TRIALS_ROOM: return "Encounter.TowerOfTrials.Room";
            case ENCOUNTER_VARGUL: return "Encounter.Vargul";
        }
        return null;
    }

    @JsonCreator
    public static EncounterWhitelistTag forValue(String value) throws IOException {
        if (value.equals("Encounter.Abyssian")) return ENCOUNTER_ABYSSIAN;
        if (value.equals("Encounter.Blacktide")) return ENCOUNTER_BLACKTIDE;
        if (value.equals("Encounter.CrimsonWind")) return ENCOUNTER_CRIMSON_WIND;
        if (value.equals("Encounter.Nyak")) return ENCOUNTER_NYAK;
        if (value.equals("Encounter.TowerOfTrials.Elevator")) return ENCOUNTER_TOWER_OF_TRIALS_ELEVATOR;
        if (value.equals("Encounter.TowerOfTrials.Room")) return ENCOUNTER_TOWER_OF_TRIALS_ROOM;
        if (value.equals("Encounter.Vargul")) return ENCOUNTER_VARGUL;
        throw new IOException("Cannot deserialize EncounterWhitelistTag");
    }
}
