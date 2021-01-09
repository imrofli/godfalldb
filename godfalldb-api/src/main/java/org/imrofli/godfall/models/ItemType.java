package org.imrofli.godfall.models;

public enum ItemType {
    RING,
    AMULET,
    CHARM;


    public String toValue() {
        switch (this) {
            case RING: return "Ring";
            case AMULET: return "Amulet";
            case CHARM: return "Charm";

        }
        return null;
    }

    public static ItemType forValue(String value){
        if (value.equalsIgnoreCase("Ring")) return RING;
        if (value.equalsIgnoreCase("Amulet")) return AMULET;
        if (value.equalsIgnoreCase("Charm")) return CHARM;
        else return CHARM;
    }


}
