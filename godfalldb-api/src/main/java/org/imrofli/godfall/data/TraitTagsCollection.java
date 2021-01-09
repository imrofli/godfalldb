package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class TraitTagsCollection {
    private String name;
    private String groupName;
    private long weight;
    private List<String> addedTraitTags;
    private long minTier;
    private long maxTier;
    private long minRarity;
    private long maxRarity;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("groupName")
    public String getGroupName() { return groupName; }
    @JsonProperty("groupName")
    public void setGroupName(String value) { this.groupName = value; }

    @JsonProperty("weight")
    public long getWeight() { return weight; }
    @JsonProperty("weight")
    public void setWeight(long value) { this.weight = value; }

    @JsonProperty("addedTraitTags")
    public List<String> getAddedTraitTags() { return addedTraitTags; }
    @JsonProperty("addedTraitTags")
    public void setAddedTraitTags(List<String> value) { this.addedTraitTags = value; }

    @JsonProperty("minTier")
    public long getMinTier() { return minTier; }
    @JsonProperty("minTier")
    public void setMinTier(long value) { this.minTier = value; }

    @JsonProperty("maxTier")
    public long getMaxTier() { return maxTier; }
    @JsonProperty("maxTier")
    public void setMaxTier(long value) { this.maxTier = value; }

    @JsonProperty("minRarity")
    public long getMinRarity() { return minRarity; }
    @JsonProperty("minRarity")
    public void setMinRarity(long value) { this.minRarity = value; }

    @JsonProperty("maxRarity")
    public long getMaxRarity() { return maxRarity; }
    @JsonProperty("maxRarity")
    public void setMaxRarity(long value) { this.maxRarity = value; }
}
