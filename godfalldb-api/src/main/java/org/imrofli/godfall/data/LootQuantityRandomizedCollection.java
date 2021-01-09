package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class LootQuantityRandomizedCollection {
    private String id;
    private List<String> metaTags;
    private String lootQuantityGroup;
    private long minTier;
    private long maxTier;
    private long minThreat;
    private long maxThreat;
    private long weight;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("metaTags")
    public List<String> getMetaTags() { return metaTags; }
    @JsonProperty("metaTags")
    public void setMetaTags(List<String> value) { this.metaTags = value; }

    @JsonProperty("lootQuantityGroup")
    public String getLootQuantityGroup() { return lootQuantityGroup; }
    @JsonProperty("lootQuantityGroup")
    public void setLootQuantityGroup(String value) { this.lootQuantityGroup = value; }

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
}
