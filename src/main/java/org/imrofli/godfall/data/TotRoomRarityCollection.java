package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class TotRoomRarityCollection {
    private NameElement name;
    private List<NameElement> tags;
    private long minFloor;
    private long maxFloor;
    private long weight;
    private long rarityIndex;
    private NameElement roomRewardRarity;

    @JsonProperty("name")
    public NameElement getName() { return name; }
    @JsonProperty("name")
    public void setName(NameElement value) { this.name = value; }

    @JsonProperty("tags")
    public List<NameElement> getTags() { return tags; }
    @JsonProperty("tags")
    public void setTags(List<NameElement> value) { this.tags = value; }

    @JsonProperty("minFloor")
    public long getMinFloor() { return minFloor; }
    @JsonProperty("minFloor")
    public void setMinFloor(long value) { this.minFloor = value; }

    @JsonProperty("maxFloor")
    public long getMaxFloor() { return maxFloor; }
    @JsonProperty("maxFloor")
    public void setMaxFloor(long value) { this.maxFloor = value; }

    @JsonProperty("weight")
    public long getWeight() { return weight; }
    @JsonProperty("weight")
    public void setWeight(long value) { this.weight = value; }

    @JsonProperty("rarityIndex")
    public long getRarityIndex() { return rarityIndex; }
    @JsonProperty("rarityIndex")
    public void setRarityIndex(long value) { this.rarityIndex = value; }

    @JsonProperty("roomRewardRarity")
    public NameElement getRoomRewardRarity() { return roomRewardRarity; }
    @JsonProperty("roomRewardRarity")
    public void setRoomRewardRarity(NameElement value) { this.roomRewardRarity = value; }
}
