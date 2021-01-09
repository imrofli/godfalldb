package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum BoonWhitelistTagElement {
    AILMENT, AIR, CRIT, DEFENSIVE, EARTH, FIRE, GENERIC, MIGHT, OFFENSIVE, PHYSICAL, RECOVERY, SOULSHATTER, SPIRIT, UPGRADE, VITALITY, VOID, WATER, WEAKPOINT, WEAPON;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AILMENT: return "Ailment";
            case AIR: return "Air";
            case CRIT: return "Crit";
            case DEFENSIVE: return "Defensive";
            case EARTH: return "Earth";
            case FIRE: return "Fire";
            case GENERIC: return "Generic";
            case MIGHT: return "Might";
            case OFFENSIVE: return "Offensive";
            case PHYSICAL: return "Physical";
            case RECOVERY: return "Recovery";
            case SOULSHATTER: return "Soulshatter";
            case SPIRIT: return "Spirit";
            case UPGRADE: return "Upgrade";
            case VITALITY: return "Vitality";
            case VOID: return "Void";
            case WATER: return "Water";
            case WEAKPOINT: return "Weakpoint";
            case WEAPON: return "Weapon";
        }
        return null;
    }

    @JsonCreator
    public static BoonWhitelistTagElement forValue(String value) throws IOException {
        if (value.equals("Ailment")) return AILMENT;
        if (value.equals("Air")) return AIR;
        if (value.equals("Crit")) return CRIT;
        if (value.equals("Defensive")) return DEFENSIVE;
        if (value.equals("Earth")) return EARTH;
        if (value.equals("Fire")) return FIRE;
        if (value.equals("Generic")) return GENERIC;
        if (value.equals("Might")) return MIGHT;
        if (value.equals("Offensive")) return OFFENSIVE;
        if (value.equals("Physical")) return PHYSICAL;
        if (value.equals("Recovery")) return RECOVERY;
        if (value.equals("Soulshatter")) return SOULSHATTER;
        if (value.equals("Spirit")) return SPIRIT;
        if (value.equals("Upgrade")) return UPGRADE;
        if (value.equals("Vitality")) return VITALITY;
        if (value.equals("Void")) return VOID;
        if (value.equals("Water")) return WATER;
        if (value.equals("Weakpoint")) return WEAKPOINT;
        if (value.equals("Weapon")) return WEAPON;
        throw new IOException("Cannot deserialize BoonWhitelistTagElement");
    }
}
