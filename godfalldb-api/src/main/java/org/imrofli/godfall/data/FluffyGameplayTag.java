package org.imrofli.godfall.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum FluffyGameplayTag {
    OBJECTIVE_BANK_ACCOUNT, OBJECTIVE_GAMEPLAY_TRIGGER, OBJECTIVE_GAMEPLAY_TRIGGER_FAIL_ON_RELATED_TAG_FAIL, OBJECTIVE_GENERIC, OBJECTIVE_KILL_ENEMY_ABILITY, OBJECTIVE_KILL_ENEMY_TAG, OBJECTIVE_KILL_ENEMY_TAG_CHASE_1, OBJECTIVE_LOOT_PICKUP_GEAR, OBJECTIVE_LOOT_PICKUP_LEGENDARY, OBJECTIVE_LOOT_PICKUP_TAG, OBJECTIVE_SHIELD_THROW, OBJECTIVE_TOWER_OF_TRIALS_FLOOR, OBJECTIVE_WEAPON_ART;

    @JsonValue
    public String toValue() {
        switch (this) {
            case OBJECTIVE_BANK_ACCOUNT: return "Objective.BankAccount";
            case OBJECTIVE_GAMEPLAY_TRIGGER: return "Objective.GameplayTrigger";
            case OBJECTIVE_GAMEPLAY_TRIGGER_FAIL_ON_RELATED_TAG_FAIL: return "Objective.GameplayTrigger.FailOnRelatedTagFail";
            case OBJECTIVE_GENERIC: return "Objective.Generic";
            case OBJECTIVE_KILL_ENEMY_ABILITY: return "Objective.KillEnemyAbility";
            case OBJECTIVE_KILL_ENEMY_TAG: return "Objective.KillEnemyTag";
            case OBJECTIVE_KILL_ENEMY_TAG_CHASE_1: return "Objective.KillEnemyTag.Chase.1";
            case OBJECTIVE_LOOT_PICKUP_GEAR: return "Objective.LootPickup.Gear";
            case OBJECTIVE_LOOT_PICKUP_LEGENDARY: return "Objective.LootPickup.Legendary";
            case OBJECTIVE_LOOT_PICKUP_TAG: return "Objective.LootPickup.Tag";
            case OBJECTIVE_SHIELD_THROW: return "Objective.ShieldThrow";
            case OBJECTIVE_TOWER_OF_TRIALS_FLOOR: return "Objective.TowerOfTrialsFloor";
            case OBJECTIVE_WEAPON_ART: return "Objective.WeaponArt";
        }
        return null;
    }

    @JsonCreator
    public static FluffyGameplayTag forValue(String value) throws IOException {
        if (value.equals("Objective.BankAccount")) return OBJECTIVE_BANK_ACCOUNT;
        if (value.equals("Objective.GameplayTrigger")) return OBJECTIVE_GAMEPLAY_TRIGGER;
        if (value.equals("Objective.GameplayTrigger.FailOnRelatedTagFail")) return OBJECTIVE_GAMEPLAY_TRIGGER_FAIL_ON_RELATED_TAG_FAIL;
        if (value.equals("Objective.Generic")) return OBJECTIVE_GENERIC;
        if (value.equals("Objective.KillEnemyAbility")) return OBJECTIVE_KILL_ENEMY_ABILITY;
        if (value.equals("Objective.KillEnemyTag")) return OBJECTIVE_KILL_ENEMY_TAG;
        if (value.equals("Objective.KillEnemyTag.Chase.1")) return OBJECTIVE_KILL_ENEMY_TAG_CHASE_1;
        if (value.equals("Objective.LootPickup.Gear")) return OBJECTIVE_LOOT_PICKUP_GEAR;
        if (value.equals("Objective.LootPickup.Legendary")) return OBJECTIVE_LOOT_PICKUP_LEGENDARY;
        if (value.equals("Objective.LootPickup.Tag")) return OBJECTIVE_LOOT_PICKUP_TAG;
        if (value.equals("Objective.ShieldThrow")) return OBJECTIVE_SHIELD_THROW;
        if (value.equals("Objective.TowerOfTrialsFloor")) return OBJECTIVE_TOWER_OF_TRIALS_FLOOR;
        if (value.equals("Objective.WeaponArt")) return OBJECTIVE_WEAPON_ART;
        throw new IOException("Cannot deserialize FluffyGameplayTag");
    }
}
