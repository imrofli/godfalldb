package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class TotRoomCountCollection {
    private String name;
    private long minFloor;
    private long maxFloor;
    private long weight;
    private long roomCount;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

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

    @JsonProperty("roomCount")
    public long getRoomCount() { return roomCount; }
    @JsonProperty("roomCount")
    public void setRoomCount(long value) { this.roomCount = value; }
}
