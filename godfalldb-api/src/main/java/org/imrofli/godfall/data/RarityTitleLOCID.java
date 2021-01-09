package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum RarityTitleLOCID {
    RARITY_EPIC, RARITY_LEGENDARY, RARITY_RARE, RARITY_UNCOMMON;

    @JsonValue
    public String toValue() {
        switch (this) {
            case RARITY_EPIC: return "Rarity.Epic";
            case RARITY_LEGENDARY: return "Rarity.Legendary";
            case RARITY_RARE: return "Rarity.Rare";
            case RARITY_UNCOMMON: return "Rarity.Uncommon";
        }
        return null;
    }

    @JsonCreator
    public static RarityTitleLOCID forValue(String value) throws IOException {
        if (value.equals("Rarity.Epic")) return RARITY_EPIC;
        if (value.equals("Rarity.Legendary")) return RARITY_LEGENDARY;
        if (value.equals("Rarity.Rare")) return RARITY_RARE;
        if (value.equals("Rarity.Uncommon")) return RARITY_UNCOMMON;
        throw new IOException("Cannot deserialize RarityTitleLOCID");
    }
}
