package org.imrofli.godfall.models;


public enum WeaponClass {
    LONGSWORD,
    GREATSWORD,
    POLEARM,
    DUALBLADES,
    WARHAMMER;


    public String toValue() {
        switch (this) {
            case LONGSWORD: return "Longsword";
            case GREATSWORD: return "Greatsword";
            case DUALBLADES: return "DualBlades";
            case WARHAMMER: return "Warhammer";
            case POLEARM: return "Polearm";
        }
        return null;
    }

    public static WeaponClass forValue(Integer value){
        if (value == 1) return LONGSWORD;
        if (value == 2) return POLEARM;
        if (value == 3) return GREATSWORD;
        if (value == 4) return WARHAMMER;
        else return DUALBLADES;
    }
}
