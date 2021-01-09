package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class TraitCategoryCollection {
    private String name;
    private GroupName groupName;
    private List<String> allowedTraitTags;
    private String traitGroup;
    private List<String> exclusionGroups;
    private long minTier;
    private long maxTier;
    private long minRarity;
    private long maxRarity;
    private long weight;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("groupName")
    public GroupName getGroupName() { return groupName; }
    @JsonProperty("groupName")
    public void setGroupName(GroupName value) { this.groupName = value; }

    @JsonProperty("allowedTraitTags")
    public List<String> getAllowedTraitTags() { return allowedTraitTags; }
    @JsonProperty("allowedTraitTags")
    public void setAllowedTraitTags(List<String> value) { this.allowedTraitTags = value; }

    @JsonProperty("traitGroup")
    public String getTraitGroup() { return traitGroup; }
    @JsonProperty("traitGroup")
    public void setTraitGroup(String value) { this.traitGroup = value; }

    @JsonProperty("exclusionGroups")
    public List<String> getExclusionGroups() { return exclusionGroups; }
    @JsonProperty("exclusionGroups")
    public void setExclusionGroups(List<String> value) { this.exclusionGroups = value; }

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

    @JsonProperty("weight")
    public long getWeight() { return weight; }
    @JsonProperty("weight")
    public void setWeight(long value) { this.weight = value; }
}
