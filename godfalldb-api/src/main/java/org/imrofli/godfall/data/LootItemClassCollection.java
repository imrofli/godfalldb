package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class LootItemClassCollection {
    private String name;
    private long minTier;
    private long maxTier;
    private long minThreat;
    private long maxThreat;
    private long weight;
    private List<String> addedDropTags;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("minTier")
    public long getMinTier() { return minTier; }
    @JsonProperty("minTier")
    public void setMinTier(long value) { this.minTier = value; }

    @JsonProperty("maxTier")
    public long getMaxTier() { return maxTier; }
    @JsonProperty("maxTier")
    public void setMaxTier(long value) { this.maxTier = value; }

    @JsonProperty("minThreat")
    public long getMinThreat() { return minThreat; }
    @JsonProperty("minThreat")
    public void setMinThreat(long value) { this.minThreat = value; }

    @JsonProperty("maxThreat")
    public long getMaxThreat() { return maxThreat; }
    @JsonProperty("maxThreat")
    public void setMaxThreat(long value) { this.maxThreat = value; }

    @JsonProperty("weight")
    public long getWeight() { return weight; }
    @JsonProperty("weight")
    public void setWeight(long value) { this.weight = value; }

    @JsonProperty("addedDropTags")
    public List<String> getAddedDropTags() { return addedDropTags; }
    @JsonProperty("addedDropTags")
    public void setAddedDropTags(List<String> value) { this.addedDropTags = value; }
}
