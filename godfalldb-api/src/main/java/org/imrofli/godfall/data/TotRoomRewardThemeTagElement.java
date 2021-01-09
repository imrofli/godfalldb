package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum TotRoomRewardThemeTagElement {
    BOON, KEY, LOCKED_CHEST, LOCKED_CHEST_10, LOCKED_CHEST_15, LOCKED_CHEST_20, LOCKED_CHEST_5, SHOP;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BOON: return "boon";
            case KEY: return "key";
            case LOCKED_CHEST: return "lockedChest";
            case LOCKED_CHEST_10: return "lockedChest.10";
            case LOCKED_CHEST_15: return "lockedChest.15";
            case LOCKED_CHEST_20: return "lockedChest.20";
            case LOCKED_CHEST_5: return "lockedChest.5";
            case SHOP: return "shop";
        }
        return null;
    }

    @JsonCreator
    public static TotRoomRewardThemeTagElement forValue(String value) throws IOException {
        if (value.equals("boon")) return BOON;
        if (value.equals("key")) return KEY;
        if (value.equals("lockedChest")) return LOCKED_CHEST;
        if (value.equals("lockedChest.10")) return LOCKED_CHEST_10;
        if (value.equals("lockedChest.15")) return LOCKED_CHEST_15;
        if (value.equals("lockedChest.20")) return LOCKED_CHEST_20;
        if (value.equals("lockedChest.5")) return LOCKED_CHEST_5;
        if (value.equals("shop")) return SHOP;
        throw new IOException("Cannot deserialize TotRoomRewardThemeTagElement");
    }
}
