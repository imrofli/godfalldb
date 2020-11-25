package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class TotFloorTagsCollection {
    private String name;
    private FluffyType type;
    private long minFloor;
    private long maxFloor;
    private long weight;
    private List<EncounterWhitelistTag> elevatorEncounterWhitelistTags;
    private List<EncounterWhitelistTag> roomEncounterWhitelistTags;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("type")
    public FluffyType getType() { return type; }
    @JsonProperty("type")
    public void setType(FluffyType value) { this.type = value; }

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

    @JsonProperty("elevatorEncounterWhitelistTags")
    public List<EncounterWhitelistTag> getElevatorEncounterWhitelistTags() { return elevatorEncounterWhitelistTags; }
    @JsonProperty("elevatorEncounterWhitelistTags")
    public void setElevatorEncounterWhitelistTags(List<EncounterWhitelistTag> value) { this.elevatorEncounterWhitelistTags = value; }

    @JsonProperty("roomEncounterWhitelistTags")
    public List<EncounterWhitelistTag> getRoomEncounterWhitelistTags() { return roomEncounterWhitelistTags; }
    @JsonProperty("roomEncounterWhitelistTags")
    public void setRoomEncounterWhitelistTags(List<EncounterWhitelistTag> value) { this.roomEncounterWhitelistTags = value; }
}
