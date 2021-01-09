package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class TotRewardsCollection {
    private String name;
    private String gameplayTag;
    private List<BoonWhitelistTagElement> boonWhitelistTags;
    private List<NameElement> boonWhitelistRarities;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("gameplayTag")
    public String getGameplayTag() { return gameplayTag; }
    @JsonProperty("gameplayTag")
    public void setGameplayTag(String value) { this.gameplayTag = value; }

    @JsonProperty("boonWhitelistTags")
    public List<BoonWhitelistTagElement> getBoonWhitelistTags() { return boonWhitelistTags; }
    @JsonProperty("boonWhitelistTags")
    public void setBoonWhitelistTags(List<BoonWhitelistTagElement> value) { this.boonWhitelistTags = value; }

    @JsonProperty("boonWhitelistRarities")
    public List<NameElement> getBoonWhitelistRarities() { return boonWhitelistRarities; }
    @JsonProperty("boonWhitelistRarities")
    public void setBoonWhitelistRarities(List<NameElement> value) { this.boonWhitelistRarities = value; }
}
