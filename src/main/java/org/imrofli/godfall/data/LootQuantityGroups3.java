package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum LootQuantityGroups3 {
    LOOT_QUANTITY_CURRENCY_DRAGONSTEEL_10, LOOT_QUANTITY_CURRENCY_ELECTRUM_21;

    @JsonValue
    public String toValue() {
        switch (this) {
            case LOOT_QUANTITY_CURRENCY_DRAGONSTEEL_10: return "Loot.Quantity.Currency.Dragonsteel.10";
            case LOOT_QUANTITY_CURRENCY_ELECTRUM_21: return "Loot.Quantity.Currency.Electrum.21";
        }
        return null;
    }

    @JsonCreator
    public static LootQuantityGroups3 forValue(String value) throws IOException {
        if (value.equals("Loot.Quantity.Currency.Dragonsteel.10")) return LOOT_QUANTITY_CURRENCY_DRAGONSTEEL_10;
        if (value.equals("Loot.Quantity.Currency.Electrum.21")) return LOOT_QUANTITY_CURRENCY_ELECTRUM_21;
        throw new IOException("Cannot deserialize LootQuantityGroups3");
    }
}
