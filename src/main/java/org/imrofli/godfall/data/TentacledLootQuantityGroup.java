package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum TentacledLootQuantityGroup {
    LOOT_QUANTITY_OBJECTIVE_OPTIONAL_FLEX;

    @JsonValue
    public String toValue() {
        switch (this) {
            case LOOT_QUANTITY_OBJECTIVE_OPTIONAL_FLEX: return "Loot.Quantity.Objective.Optional.Flex";
        }
        return null;
    }

    @JsonCreator
    public static TentacledLootQuantityGroup forValue(String value) throws IOException {
        if (value.equals("Loot.Quantity.Objective.Optional.Flex")) return LOOT_QUANTITY_OBJECTIVE_OPTIONAL_FLEX;
        throw new IOException("Cannot deserialize TentacledLootQuantityGroup");
    }
}
