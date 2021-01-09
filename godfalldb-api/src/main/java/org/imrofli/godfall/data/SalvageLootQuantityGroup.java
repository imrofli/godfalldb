package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum SalvageLootQuantityGroup {
    ITEM_SALVAGE_TIER_1, ITEM_SALVAGE_TIER_2, ITEM_SALVAGE_TIER_3, ITEM_SALVAGE_TIER_4, ITEM_SALVAGE_TIER_5;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ITEM_SALVAGE_TIER_1: return "Item Salvage - Tier 1";
            case ITEM_SALVAGE_TIER_2: return "Item Salvage - Tier 2";
            case ITEM_SALVAGE_TIER_3: return "Item Salvage - Tier 3";
            case ITEM_SALVAGE_TIER_4: return "Item Salvage - Tier 4";
            case ITEM_SALVAGE_TIER_5: return "Item Salvage - Tier 5";
        }
        return null;
    }

    @JsonCreator
    public static SalvageLootQuantityGroup forValue(String value) throws IOException {
        if (value.equals("Item Salvage - Tier 1")) return ITEM_SALVAGE_TIER_1;
        if (value.equals("Item Salvage - Tier 2")) return ITEM_SALVAGE_TIER_2;
        if (value.equals("Item Salvage - Tier 3")) return ITEM_SALVAGE_TIER_3;
        if (value.equals("Item Salvage - Tier 4")) return ITEM_SALVAGE_TIER_4;
        if (value.equals("Item Salvage - Tier 5")) return ITEM_SALVAGE_TIER_5;
        throw new IOException("Cannot deserialize SalvageLootQuantityGroup");
    }
}
