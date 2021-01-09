package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum AllowedTags {
    DREAMSTONE_EFFECT_BOSS_ACTIVITY_INTEL_MODIFY, DREAMSTONE_EFFECT_BOSS_ACTIVITY_INTEL_REVEAL, DREAMSTONE_EFFECT_BOSS_ACTIVITY_REWARD_ADD, DREAMSTONE_EFFECT_BOSS_ACTIVITY_REWARD_ADD_1, DREAMSTONE_EFFECT_BOSS_ACTIVITY_REWARD_ADD_2, DREAMSTONE_EFFECT_BOSS_ACTIVITY_REWARD_ADD_3, DREAMSTONE_EFFECT_PLAYER_BOON_APPLY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DREAMSTONE_EFFECT_BOSS_ACTIVITY_INTEL_MODIFY: return "Dreamstone.Effect.BossActivity.Intel.Modify";
            case DREAMSTONE_EFFECT_BOSS_ACTIVITY_INTEL_REVEAL: return "Dreamstone.Effect.BossActivity.Intel.Reveal";
            case DREAMSTONE_EFFECT_BOSS_ACTIVITY_REWARD_ADD: return "Dreamstone.Effect.BossActivity.Reward.Add";
            case DREAMSTONE_EFFECT_BOSS_ACTIVITY_REWARD_ADD_1: return "Dreamstone.Effect.BossActivity.Reward.Add.1";
            case DREAMSTONE_EFFECT_BOSS_ACTIVITY_REWARD_ADD_2: return "Dreamstone.Effect.BossActivity.Reward.Add.2";
            case DREAMSTONE_EFFECT_BOSS_ACTIVITY_REWARD_ADD_3: return "Dreamstone.Effect.BossActivity.Reward.Add.3";
            case DREAMSTONE_EFFECT_PLAYER_BOON_APPLY: return "Dreamstone.Effect.Player.Boon.Apply";
        }
        return null;
    }

    @JsonCreator
    public static AllowedTags forValue(String value) throws IOException {
        if (value.equals("Dreamstone.Effect.BossActivity.Intel.Modify")) return DREAMSTONE_EFFECT_BOSS_ACTIVITY_INTEL_MODIFY;
        if (value.equals("Dreamstone.Effect.BossActivity.Intel.Reveal")) return DREAMSTONE_EFFECT_BOSS_ACTIVITY_INTEL_REVEAL;
        if (value.equals("Dreamstone.Effect.BossActivity.Reward.Add")) return DREAMSTONE_EFFECT_BOSS_ACTIVITY_REWARD_ADD;
        if (value.equals("Dreamstone.Effect.BossActivity.Reward.Add.1")) return DREAMSTONE_EFFECT_BOSS_ACTIVITY_REWARD_ADD_1;
        if (value.equals("Dreamstone.Effect.BossActivity.Reward.Add.2")) return DREAMSTONE_EFFECT_BOSS_ACTIVITY_REWARD_ADD_2;
        if (value.equals("Dreamstone.Effect.BossActivity.Reward.Add.3")) return DREAMSTONE_EFFECT_BOSS_ACTIVITY_REWARD_ADD_3;
        if (value.equals("Dreamstone.Effect.Player.Boon.Apply")) return DREAMSTONE_EFFECT_PLAYER_BOON_APPLY;
        throw new IOException("Cannot deserialize AllowedTags");
    }
}
