package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum CurrencyGameplayTag {
    CURRENCY_ACTIVITY_COMPLETION_1, CURRENCY_ACTIVITY_COMPLETION_2, CURRENCY_ACTIVITY_COMPLETION_3, CURRENCY_ELECTRUM, CURRENCY_ENEMY_1, CURRENCY_ENEMY_2, CURRENCY_SALVAGE_1, CURRENCY_SALVAGE_2;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CURRENCY_ACTIVITY_COMPLETION_1: return "Currency.ActivityCompletion.1";
            case CURRENCY_ACTIVITY_COMPLETION_2: return "Currency.ActivityCompletion.2";
            case CURRENCY_ACTIVITY_COMPLETION_3: return "Currency.ActivityCompletion.3";
            case CURRENCY_ELECTRUM: return "Currency.Electrum";
            case CURRENCY_ENEMY_1: return "Currency.Enemy.1";
            case CURRENCY_ENEMY_2: return "Currency.Enemy.2";
            case CURRENCY_SALVAGE_1: return "Currency.Salvage.1";
            case CURRENCY_SALVAGE_2: return "Currency.Salvage.2";
        }
        return null;
    }

    @JsonCreator
    public static CurrencyGameplayTag forValue(String value) throws IOException {
        if (value.equals("Currency.ActivityCompletion.1")) return CURRENCY_ACTIVITY_COMPLETION_1;
        if (value.equals("Currency.ActivityCompletion.2")) return CURRENCY_ACTIVITY_COMPLETION_2;
        if (value.equals("Currency.ActivityCompletion.3")) return CURRENCY_ACTIVITY_COMPLETION_3;
        if (value.equals("Currency.Electrum")) return CURRENCY_ELECTRUM;
        if (value.equals("Currency.Enemy.1")) return CURRENCY_ENEMY_1;
        if (value.equals("Currency.Enemy.2")) return CURRENCY_ENEMY_2;
        if (value.equals("Currency.Salvage.1")) return CURRENCY_SALVAGE_1;
        if (value.equals("Currency.Salvage.2")) return CURRENCY_SALVAGE_2;
        throw new IOException("Cannot deserialize CurrencyGameplayTag");
    }
}
