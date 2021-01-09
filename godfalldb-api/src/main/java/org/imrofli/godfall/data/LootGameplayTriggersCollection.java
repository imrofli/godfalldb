package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class LootGameplayTriggersCollection {
    private PurpleGameplayTag gameplayTag;
    private boolean triggerWhenTarget;
    private boolean triggerWhenInstigator;
    private long triggerCount;
    private EnemyType triggerForEnemyType;
    private List<FluffyLootQuantityGroup> lootQuantityGroups;
    private LootEventRulesType lootEventRulesType;
    private String triggerForGameplayTag;

    @JsonProperty("gameplayTag")
    public PurpleGameplayTag getGameplayTag() { return gameplayTag; }
    @JsonProperty("gameplayTag")
    public void setGameplayTag(PurpleGameplayTag value) { this.gameplayTag = value; }

    @JsonProperty("triggerWhenTarget")
    public boolean getTriggerWhenTarget() { return triggerWhenTarget; }
    @JsonProperty("triggerWhenTarget")
    public void setTriggerWhenTarget(boolean value) { this.triggerWhenTarget = value; }

    @JsonProperty("triggerWhenInstigator")
    public boolean getTriggerWhenInstigator() { return triggerWhenInstigator; }
    @JsonProperty("triggerWhenInstigator")
    public void setTriggerWhenInstigator(boolean value) { this.triggerWhenInstigator = value; }

    @JsonProperty("triggerCount")
    public long getTriggerCount() { return triggerCount; }
    @JsonProperty("triggerCount")
    public void setTriggerCount(long value) { this.triggerCount = value; }

    @JsonProperty("triggerForEnemyType")
    public EnemyType getTriggerForEnemyType() { return triggerForEnemyType; }
    @JsonProperty("triggerForEnemyType")
    public void setTriggerForEnemyType(EnemyType value) { this.triggerForEnemyType = value; }

    @JsonProperty("lootQuantityGroups")
    public List<FluffyLootQuantityGroup> getLootQuantityGroups() { return lootQuantityGroups; }
    @JsonProperty("lootQuantityGroups")
    public void setLootQuantityGroups(List<FluffyLootQuantityGroup> value) { this.lootQuantityGroups = value; }

    @JsonProperty("lootEventRulesType")
    public LootEventRulesType getLootEventRulesType() { return lootEventRulesType; }
    @JsonProperty("lootEventRulesType")
    public void setLootEventRulesType(LootEventRulesType value) { this.lootEventRulesType = value; }

    @JsonProperty("triggerForGameplayTag")
    public String getTriggerForGameplayTag() { return triggerForGameplayTag; }
    @JsonProperty("triggerForGameplayTag")
    public void setTriggerForGameplayTag(String value) { this.triggerForGameplayTag = value; }
}
