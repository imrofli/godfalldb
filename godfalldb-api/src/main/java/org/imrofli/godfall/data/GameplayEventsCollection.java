package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class GameplayEventsCollection {
    private String name;
    private List<String> lootQuantityGroups;
    private String gameplayTag;
    private Long itemTierIndexBonus;
    private LootEventRulesType lootEventRulesType;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("lootQuantityGroups")
    public List<String> getLootQuantityGroups() { return lootQuantityGroups; }
    @JsonProperty("lootQuantityGroups")
    public void setLootQuantityGroups(List<String> value) { this.lootQuantityGroups = value; }

    @JsonProperty("gameplayTag")
    public String getGameplayTag() { return gameplayTag; }
    @JsonProperty("gameplayTag")
    public void setGameplayTag(String value) { this.gameplayTag = value; }

    @JsonProperty("itemTierIndexBonus")
    public Long getItemTierIndexBonus() { return itemTierIndexBonus; }
    @JsonProperty("itemTierIndexBonus")
    public void setItemTierIndexBonus(Long value) { this.itemTierIndexBonus = value; }

    @JsonProperty("lootEventRulesType")
    public LootEventRulesType getLootEventRulesType() { return lootEventRulesType; }
    @JsonProperty("lootEventRulesType")
    public void setLootEventRulesType(LootEventRulesType value) { this.lootEventRulesType = value; }
}
