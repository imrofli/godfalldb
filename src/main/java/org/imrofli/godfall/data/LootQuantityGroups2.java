package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum LootQuantityGroups2 {
    LOOT_QUANTITY_CURRENCY_ELECTRUM_15, LOOT_QUANTITY_CURRENCY_SUNSTEEL_6;

    @JsonValue
    public String toValue() {
        switch (this) {
            case LOOT_QUANTITY_CURRENCY_ELECTRUM_15: return "Loot.Quantity.Currency.Electrum.15";
            case LOOT_QUANTITY_CURRENCY_SUNSTEEL_6: return "Loot.Quantity.Currency.Sunsteel.6";
        }
        return null;
    }

    @JsonCreator
    public static LootQuantityGroups2 forValue(String value) throws IOException {
        if (value.equals("Loot.Quantity.Currency.Electrum.15")) return LOOT_QUANTITY_CURRENCY_ELECTRUM_15;
        if (value.equals("Loot.Quantity.Currency.Sunsteel.6")) return LOOT_QUANTITY_CURRENCY_SUNSTEEL_6;
        throw new IOException("Cannot deserialize LootQuantityGroups2");
    }
}
