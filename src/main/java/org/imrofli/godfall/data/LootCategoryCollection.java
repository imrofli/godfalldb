package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class LootCategoryCollection {
    private String name;
    private String groupName;
    private PurpleType type;
    private String rarityIndex;
    private long tierOffset;
    private long tierOffsetChance;
    private long maxTier;
    private long weight;
    private List<String> overrideDropTags;
    private Long tierOverride;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("groupName")
    public String getGroupName() { return groupName; }
    @JsonProperty("groupName")
    public void setGroupName(String value) { this.groupName = value; }

    @JsonProperty("type")
    public PurpleType getType() { return type; }
    @JsonProperty("type")
    public void setType(PurpleType value) { this.type = value; }

    @JsonProperty("rarityIndex")
    public String getRarityIndex() { return rarityIndex; }
    @JsonProperty("rarityIndex")
    public void setRarityIndex(String value) { this.rarityIndex = value; }

    @JsonProperty("tierOffset")
    public long getTierOffset() { return tierOffset; }
    @JsonProperty("tierOffset")
    public void setTierOffset(long value) { this.tierOffset = value; }

    @JsonProperty("tierOffsetChance")
    public long getTierOffsetChance() { return tierOffsetChance; }
    @JsonProperty("tierOffsetChance")
    public void setTierOffsetChance(long value) { this.tierOffsetChance = value; }

    @JsonProperty("maxTier")
    public long getMaxTier() { return maxTier; }
    @JsonProperty("maxTier")
    public void setMaxTier(long value) { this.maxTier = value; }

    @JsonProperty("weight")
    public long getWeight() { return weight; }
    @JsonProperty("weight")
    public void setWeight(long value) { this.weight = value; }

    @JsonProperty("overrideDropTags")
    public List<String> getOverrideDropTags() { return overrideDropTags; }
    @JsonProperty("overrideDropTags")
    public void setOverrideDropTags(List<String> value) { this.overrideDropTags = value; }

    @JsonProperty("tierOverride")
    public Long getTierOverride() { return tierOverride; }
    @JsonProperty("tierOverride")
    public void setTierOverride(Long value) { this.tierOverride = value; }
}
