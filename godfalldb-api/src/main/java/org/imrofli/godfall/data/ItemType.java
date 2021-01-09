package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ItemType {
    AMULET, AUGMENT, BANNER, BOMB, CHARM, CONSUMABLE, POTION, RING, TALISMAN, TRINKET, WEAPON;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AMULET: return "Amulet";
            case AUGMENT: return "Augment";
            case BANNER: return "Banner";
            case BOMB: return "Bomb";
            case CHARM: return "Charm";
            case CONSUMABLE: return "Consumable";
            case POTION: return "Potion";
            case RING: return "Ring";
            case TALISMAN: return "Talisman";
            case TRINKET: return "Trinket";
            case WEAPON: return "Weapon";
        }
        return null;
    }

    @JsonCreator
    public static ItemType forValue(String value) throws IOException {
        if (value.equals("Amulet")) return AMULET;
        if (value.equals("Augment")) return AUGMENT;
        if (value.equals("Banner")) return BANNER;
        if (value.equals("Bomb")) return BOMB;
        if (value.equals("Charm")) return CHARM;
        if (value.equals("Consumable")) return CONSUMABLE;
        if (value.equals("Potion")) return POTION;
        if (value.equals("Ring")) return RING;
        if (value.equals("Talisman")) return TALISMAN;
        if (value.equals("Trinket")) return TRINKET;
        if (value.equals("Weapon")) return WEAPON;
        throw new IOException("Cannot deserialize ItemType");
    }
}
