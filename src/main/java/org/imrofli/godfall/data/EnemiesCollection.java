package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class EnemiesCollection {
    private String name;
    private String gameplayTag;
    private EnemyType enemyType;
    private long experienceGranted;
    private List<PurpleLootQuantityGroup> lootQuantityGroups;
    private EnemyType lootEventRulesType;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("gameplayTag")
    public String getGameplayTag() { return gameplayTag; }
    @JsonProperty("gameplayTag")
    public void setGameplayTag(String value) { this.gameplayTag = value; }

    @JsonProperty("enemyType")
    public EnemyType getEnemyType() { return enemyType; }
    @JsonProperty("enemyType")
    public void setEnemyType(EnemyType value) { this.enemyType = value; }

    @JsonProperty("experienceGranted")
    public long getExperienceGranted() { return experienceGranted; }
    @JsonProperty("experienceGranted")
    public void setExperienceGranted(long value) { this.experienceGranted = value; }

    @JsonProperty("lootQuantityGroups")
    public List<PurpleLootQuantityGroup> getLootQuantityGroups() { return lootQuantityGroups; }
    @JsonProperty("lootQuantityGroups")
    public void setLootQuantityGroups(List<PurpleLootQuantityGroup> value) { this.lootQuantityGroups = value; }

    @JsonProperty("lootEventRulesType")
    public EnemyType getLootEventRulesType() { return lootEventRulesType; }
    @JsonProperty("lootEventRulesType")
    public void setLootEventRulesType(EnemyType value) { this.lootEventRulesType = value; }
}
