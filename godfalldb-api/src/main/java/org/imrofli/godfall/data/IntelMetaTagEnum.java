package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum IntelMetaTagEnum {
    BASE_STRENGTH, BASE_WEAKNESS, DEALS_AIR_DAMAGE, DEALS_EARTH_DAMAGE, DEALS_FIRE_DAMAGE, DEALS_PHYSICAL_DAMAGE, DEALS_VOID_DAMAGE, DEALS_WATER_DAMAGE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BASE_STRENGTH: return "BaseStrength";
            case BASE_WEAKNESS: return "BaseWeakness";
            case DEALS_AIR_DAMAGE: return "DealsAirDamage";
            case DEALS_EARTH_DAMAGE: return "DealsEarthDamage";
            case DEALS_FIRE_DAMAGE: return "DealsFireDamage";
            case DEALS_PHYSICAL_DAMAGE: return "DealsPhysicalDamage";
            case DEALS_VOID_DAMAGE: return "DealsVoidDamage";
            case DEALS_WATER_DAMAGE: return "DealsWaterDamage";
        }
        return null;
    }

    @JsonCreator
    public static IntelMetaTagEnum forValue(String value) throws IOException {
        if (value.equals("BaseStrength")) return BASE_STRENGTH;
        if (value.equals("BaseWeakness")) return BASE_WEAKNESS;
        if (value.equals("DealsAirDamage")) return DEALS_AIR_DAMAGE;
        if (value.equals("DealsEarthDamage")) return DEALS_EARTH_DAMAGE;
        if (value.equals("DealsFireDamage")) return DEALS_FIRE_DAMAGE;
        if (value.equals("DealsPhysicalDamage")) return DEALS_PHYSICAL_DAMAGE;
        if (value.equals("DealsVoidDamage")) return DEALS_VOID_DAMAGE;
        if (value.equals("DealsWaterDamage")) return DEALS_WATER_DAMAGE;
        throw new IOException("Cannot deserialize IntelMetaTagEnum");
    }
}
