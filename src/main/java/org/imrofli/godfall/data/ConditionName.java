package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ConditionName {
    CONNECTED, CONNECTED_AFFINITY, CONNECTED_STAT_TOTAL_MAGNITUDE, FOR_EACH_CONNECTED_STAT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CONNECTED: return "Connected";
            case CONNECTED_AFFINITY: return "ConnectedAffinity";
            case CONNECTED_STAT_TOTAL_MAGNITUDE: return "ConnectedStatTotalMagnitude";
            case FOR_EACH_CONNECTED_STAT: return "ForEachConnectedStat";
        }
        return null;
    }

    @JsonCreator
    public static ConditionName forValue(String value) throws IOException {
        if (value.equals("Connected")) return CONNECTED;
        if (value.equals("ConnectedAffinity")) return CONNECTED_AFFINITY;
        if (value.equals("ConnectedStatTotalMagnitude")) return CONNECTED_STAT_TOTAL_MAGNITUDE;
        if (value.equals("ForEachConnectedStat")) return FOR_EACH_CONNECTED_STAT;
        throw new IOException("Cannot deserialize ConditionName");
    }
}
