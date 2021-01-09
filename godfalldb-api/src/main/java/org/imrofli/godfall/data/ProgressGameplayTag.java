package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ProgressGameplayTag {
    INTERACTIBLE_NAVIGATE_UI_MAP;

    @JsonValue
    public String toValue() {
        switch (this) {
            case INTERACTIBLE_NAVIGATE_UI_MAP: return "Interactible.NavigateUI.Map";
        }
        return null;
    }

    @JsonCreator
    public static ProgressGameplayTag forValue(String value) throws IOException {
        if (value.equals("Interactible.NavigateUI.Map")) return INTERACTIBLE_NAVIGATE_UI_MAP;
        throw new IOException("Cannot deserialize ProgressGameplayTag");
    }
}
