package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class TotCostsCollection {
    private String name;
    private List<TotRoomRewardThemeTagElement> totRoomRewardThemeTags;
    private String gameplayTag;
    private long keyCost;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("totRoomRewardThemeTags")
    public List<TotRoomRewardThemeTagElement> getTotRoomRewardThemeTags() { return totRoomRewardThemeTags; }
    @JsonProperty("totRoomRewardThemeTags")
    public void setTotRoomRewardThemeTags(List<TotRoomRewardThemeTagElement> value) { this.totRoomRewardThemeTags = value; }

    @JsonProperty("gameplayTag")
    public String getGameplayTag() { return gameplayTag; }
    @JsonProperty("gameplayTag")
    public void setGameplayTag(String value) { this.gameplayTag = value; }

    @JsonProperty("keyCost")
    public long getKeyCost() { return keyCost; }
    @JsonProperty("keyCost")
    public void setKeyCost(long value) { this.keyCost = value; }
}
