package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Activity {
    END_BOSS_ARCH_TEMPERED, END_BOSS_TEMPERED, FLEX_ARCH_TEMPERED, FLEX_NORMAL, FLEX_TEMPERED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case END_BOSS_ARCH_TEMPERED: return "EndBoss.ArchTempered";
            case END_BOSS_TEMPERED: return "EndBoss.Tempered";
            case FLEX_ARCH_TEMPERED: return "Flex.ArchTempered";
            case FLEX_NORMAL: return "Flex.Normal";
            case FLEX_TEMPERED: return "Flex.Tempered";
        }
        return null;
    }

    @JsonCreator
    public static Activity forValue(String value) throws IOException {
        if (value.equals("EndBoss.ArchTempered")) return END_BOSS_ARCH_TEMPERED;
        if (value.equals("EndBoss.Tempered")) return END_BOSS_TEMPERED;
        if (value.equals("Flex.ArchTempered")) return FLEX_ARCH_TEMPERED;
        if (value.equals("Flex.Normal")) return FLEX_NORMAL;
        if (value.equals("Flex.Tempered")) return FLEX_TEMPERED;
        throw new IOException("Cannot deserialize Activity");
    }
}
