package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class TotRoomRewardThemesCollection {
    private String name;
    private String displayName;
    private List<TotRoomRewardThemeTagElement> tags;
    private long weight;
    private List<String> roomRewardWhitelistTags;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("display_name")
    public String getDisplayName() { return displayName; }
    @JsonProperty("display_name")
    public void setDisplayName(String value) { this.displayName = value; }

    @JsonProperty("tags")
    public List<TotRoomRewardThemeTagElement> getTags() { return tags; }
    @JsonProperty("tags")
    public void setTags(List<TotRoomRewardThemeTagElement> value) { this.tags = value; }

    @JsonProperty("weight")
    public long getWeight() { return weight; }
    @JsonProperty("weight")
    public void setWeight(long value) { this.weight = value; }

    @JsonProperty("roomRewardWhitelistTags")
    public List<String> getRoomRewardWhitelistTags() { return roomRewardWhitelistTags; }
    @JsonProperty("roomRewardWhitelistTags")
    public void setRoomRewardWhitelistTags(List<String> value) { this.roomRewardWhitelistTags = value; }
}
