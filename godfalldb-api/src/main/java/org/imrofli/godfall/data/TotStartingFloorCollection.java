package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class TotStartingFloorCollection {
    private String name;
    private long playerTier;
    private long totDefaultStartingFloor;
    private long totEndgameStartingFloor;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("playerTier")
    public long getPlayerTier() { return playerTier; }
    @JsonProperty("playerTier")
    public void setPlayerTier(long value) { this.playerTier = value; }

    @JsonProperty("totDefaultStartingFloor")
    public long getTotDefaultStartingFloor() { return totDefaultStartingFloor; }
    @JsonProperty("totDefaultStartingFloor")
    public void setTotDefaultStartingFloor(long value) { this.totDefaultStartingFloor = value; }

    @JsonProperty("totEndgameStartingFloor")
    public long getTotEndgameStartingFloor() { return totEndgameStartingFloor; }
    @JsonProperty("totEndgameStartingFloor")
    public void setTotEndgameStartingFloor(long value) { this.totEndgameStartingFloor = value; }
}
