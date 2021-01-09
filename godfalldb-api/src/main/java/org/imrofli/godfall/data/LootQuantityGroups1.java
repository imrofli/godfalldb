package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum LootQuantityGroups1 {
    LOOT_QUANTITY_CURRENCY_ELECTRUM_10;

    @JsonValue
    public String toValue() {
        switch (this) {
            case LOOT_QUANTITY_CURRENCY_ELECTRUM_10: return "Loot.Quantity.Currency.Electrum.10";
        }
        return null;
    }

    @JsonCreator
    public static LootQuantityGroups1 forValue(String value) throws IOException {
        if (value.equals("Loot.Quantity.Currency.Electrum.10")) return LOOT_QUANTITY_CURRENCY_ELECTRUM_10;
        throw new IOException("Cannot deserialize LootQuantityGroups1");
    }
}
