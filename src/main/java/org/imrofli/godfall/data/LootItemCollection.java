package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class LootItemCollection {
    private NameUnion name;
    private ItemType itemType;
    private String gameplayTag;
    private long minRarity;
    private long maxRarity;
    private long minTier;
    private long maxTier;
    private List<String> allowedDropTags;
    private long weight;

    @JsonProperty("name")
    public NameUnion getName() { return name; }
    @JsonProperty("name")
    public void setName(NameUnion value) { this.name = value; }

    @JsonProperty("itemType")
    public ItemType getItemType() { return itemType; }
    @JsonProperty("itemType")
    public void setItemType(ItemType value) { this.itemType = value; }

    @JsonProperty("gameplayTag")
    public String getGameplayTag() { return gameplayTag; }
    @JsonProperty("gameplayTag")
    public void setGameplayTag(String value) { this.gameplayTag = value; }

    @JsonProperty("minRarity")
    public long getMinRarity() { return minRarity; }
    @JsonProperty("minRarity")
    public void setMinRarity(long value) { this.minRarity = value; }

    @JsonProperty("maxRarity")
    public long getMaxRarity() { return maxRarity; }
    @JsonProperty("maxRarity")
    public void setMaxRarity(long value) { this.maxRarity = value; }

    @JsonProperty("minTier")
    public long getMinTier() { return minTier; }
    @JsonProperty("minTier")
    public void setMinTier(long value) { this.minTier = value; }

    @JsonProperty("maxTier")
    public long getMaxTier() { return maxTier; }
    @JsonProperty("maxTier")
    public void setMaxTier(long value) { this.maxTier = value; }

    @JsonProperty("allowedDropTags")
    public List<String> getAllowedDropTags() { return allowedDropTags; }
    @JsonProperty("allowedDropTags")
    public void setAllowedDropTags(List<String> value) { this.allowedDropTags = value; }

    @JsonProperty("weight")
    public long getWeight() { return weight; }
    @JsonProperty("weight")
    public void setWeight(long value) { this.weight = value; }
}
