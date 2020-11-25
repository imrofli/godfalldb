package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class CollectionDreamstones {
    private List<String> validTags;
    private List<String> exclusionGroups;
    private long weight;
    private List<AllowedTags> effectsTags;

    @JsonProperty("validTags")
    public List<String> getValidTags() { return validTags; }
    @JsonProperty("validTags")
    public void setValidTags(List<String> value) { this.validTags = value; }

    @JsonProperty("exclusionGroups")
    public List<String> getExclusionGroups() { return exclusionGroups; }
    @JsonProperty("exclusionGroups")
    public void setExclusionGroups(List<String> value) { this.exclusionGroups = value; }

    @JsonProperty("weight")
    public long getWeight() { return weight; }
    @JsonProperty("weight")
    public void setWeight(long value) { this.weight = value; }

    @JsonProperty("effectsTags")
    public List<AllowedTags> getEffectsTags() { return effectsTags; }
    @JsonProperty("effectsTags")
    public void setEffectsTags(List<AllowedTags> value) { this.effectsTags = value; }
}
