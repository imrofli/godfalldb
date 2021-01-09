package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum GameplayTag {
    INTERACTIBLE_NAVIGATE_UI_ARCHIVIST, INTERACTIBLE_NAVIGATE_UI_FORGE, INTERACTIBLE_NAVIGATE_UI_LOADOUT_PHOENIX, INTERACTIBLE_NAVIGATE_UI_QUESTS, INTERACTIBLE_NAVIGATE_UI_TRAINING_ROOM;

    @JsonValue
    public String toValue() {
        switch (this) {
            case INTERACTIBLE_NAVIGATE_UI_ARCHIVIST: return "Interactible.NavigateUI.Archivist";
            case INTERACTIBLE_NAVIGATE_UI_FORGE: return "Interactible.NavigateUI.Forge";
            case INTERACTIBLE_NAVIGATE_UI_LOADOUT_PHOENIX: return "Interactible.NavigateUI.Loadout.Phoenix";
            case INTERACTIBLE_NAVIGATE_UI_QUESTS: return "Interactible.NavigateUI.Quests";
            case INTERACTIBLE_NAVIGATE_UI_TRAINING_ROOM: return "Interactible.NavigateUI.TrainingRoom";
        }
        return null;
    }

    @JsonCreator
    public static GameplayTag forValue(String value) throws IOException {
        if (value.equals("Interactible.NavigateUI.Archivist")) return INTERACTIBLE_NAVIGATE_UI_ARCHIVIST;
        if (value.equals("Interactible.NavigateUI.Forge")) return INTERACTIBLE_NAVIGATE_UI_FORGE;
        if (value.equals("Interactible.NavigateUI.Loadout.Phoenix")) return INTERACTIBLE_NAVIGATE_UI_LOADOUT_PHOENIX;
        if (value.equals("Interactible.NavigateUI.Quests")) return INTERACTIBLE_NAVIGATE_UI_QUESTS;
        if (value.equals("Interactible.NavigateUI.TrainingRoom")) return INTERACTIBLE_NAVIGATE_UI_TRAINING_ROOM;
        throw new IOException("Cannot deserialize GameplayTag");
    }
}
