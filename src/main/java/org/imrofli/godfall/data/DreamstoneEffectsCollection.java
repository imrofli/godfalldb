package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class DreamstoneEffectsCollection {
    private String id;
    private AllowedTags allowedTags;
    private Long minFutureRounds;
    private Long minLockedRewards;
    private long weight;
    private AllowedTags effectType;
    private EffectParameter effectParameter;
    private Long maxFutureRounds;
    private Long minHiddenIntel;
    private Long maxHiddenIntel;
    private List<BoonWhitelistTagElement> boonWhitelistTags;
    private List<NameElement> boonWhitelistRarities;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("allowedTags")
    public AllowedTags getAllowedTags() { return allowedTags; }
    @JsonProperty("allowedTags")
    public void setAllowedTags(AllowedTags value) { this.allowedTags = value; }

    @JsonProperty("minFutureRounds")
    public Long getMinFutureRounds() { return minFutureRounds; }
    @JsonProperty("minFutureRounds")
    public void setMinFutureRounds(Long value) { this.minFutureRounds = value; }

    @JsonProperty("minLockedRewards")
    public Long getMinLockedRewards() { return minLockedRewards; }
    @JsonProperty("minLockedRewards")
    public void setMinLockedRewards(Long value) { this.minLockedRewards = value; }

    @JsonProperty("weight")
    public long getWeight() { return weight; }
    @JsonProperty("weight")
    public void setWeight(long value) { this.weight = value; }

    @JsonProperty("effectType")
    public AllowedTags getEffectType() { return effectType; }
    @JsonProperty("effectType")
    public void setEffectType(AllowedTags value) { this.effectType = value; }

    @JsonProperty("effectParameter")
    public EffectParameter getEffectParameter() { return effectParameter; }
    @JsonProperty("effectParameter")
    public void setEffectParameter(EffectParameter value) { this.effectParameter = value; }

    @JsonProperty("maxFutureRounds")
    public Long getMaxFutureRounds() { return maxFutureRounds; }
    @JsonProperty("maxFutureRounds")
    public void setMaxFutureRounds(Long value) { this.maxFutureRounds = value; }

    @JsonProperty("minHiddenIntel")
    public Long getMinHiddenIntel() { return minHiddenIntel; }
    @JsonProperty("minHiddenIntel")
    public void setMinHiddenIntel(Long value) { this.minHiddenIntel = value; }

    @JsonProperty("maxHiddenIntel")
    public Long getMaxHiddenIntel() { return maxHiddenIntel; }
    @JsonProperty("maxHiddenIntel")
    public void setMaxHiddenIntel(Long value) { this.maxHiddenIntel = value; }

    @JsonProperty("boonWhitelistTags")
    public List<BoonWhitelistTagElement> getBoonWhitelistTags() { return boonWhitelistTags; }
    @JsonProperty("boonWhitelistTags")
    public void setBoonWhitelistTags(List<BoonWhitelistTagElement> value) { this.boonWhitelistTags = value; }

    @JsonProperty("boonWhitelistRarities")
    public List<NameElement> getBoonWhitelistRarities() { return boonWhitelistRarities; }
    @JsonProperty("boonWhitelistRarities")
    public void setBoonWhitelistRarities(List<NameElement> value) { this.boonWhitelistRarities = value; }
}
