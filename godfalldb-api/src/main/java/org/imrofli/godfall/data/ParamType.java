package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ParamType {
    ATTRIBUTE_NO_VARIANCE, CORE_ATTRIBUTE, CORE_ATTRIBUTE_PERCENT, DEFENSE_PERCENT, NON_SCALING, NO_VARIANCE_CORE_ATTRIBUTE_PERCENT, NO_VARIANCE_DEFENSE_PERCENT, NO_VARIANCE_PLAYER_POWER, PLAYER_POWER;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ATTRIBUTE_NO_VARIANCE: return "attributeNoVariance";
            case CORE_ATTRIBUTE: return "coreAttribute";
            case CORE_ATTRIBUTE_PERCENT: return "coreAttributePercent";
            case DEFENSE_PERCENT: return "defensePercent";
            case NON_SCALING: return "nonScaling";
            case NO_VARIANCE_CORE_ATTRIBUTE_PERCENT: return "noVarianceCoreAttributePercent";
            case NO_VARIANCE_DEFENSE_PERCENT: return "noVarianceDefensePercent";
            case NO_VARIANCE_PLAYER_POWER: return "noVariancePlayerPower";
            case PLAYER_POWER: return "playerPower";
        }
        return null;
    }

    @JsonCreator
    public static ParamType forValue(String value) throws IOException {
        if (value.equals("attributeNoVariance")) return ATTRIBUTE_NO_VARIANCE;
        if (value.equals("coreAttribute")) return CORE_ATTRIBUTE;
        if (value.equals("coreAttributePercent")) return CORE_ATTRIBUTE_PERCENT;
        if (value.equals("defensePercent")) return DEFENSE_PERCENT;
        if (value.equals("nonScaling")) return NON_SCALING;
        if (value.equals("noVarianceCoreAttributePercent")) return NO_VARIANCE_CORE_ATTRIBUTE_PERCENT;
        if (value.equals("noVarianceDefensePercent")) return NO_VARIANCE_DEFENSE_PERCENT;
        if (value.equals("noVariancePlayerPower")) return NO_VARIANCE_PLAYER_POWER;
        if (value.equals("playerPower")) return PLAYER_POWER;
        throw new IOException("Cannot deserialize ParamType");
    }
}
