package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class MissionRequirementsCollection {
    private long maxPlayers;
    private String identifier;

    @JsonProperty("maxPlayers")
    public long getMaxPlayers() { return maxPlayers; }
    @JsonProperty("maxPlayers")
    public void setMaxPlayers(long value) { this.maxPlayers = value; }

    @JsonProperty("identifier")
    public String getIdentifier() { return identifier; }
    @JsonProperty("identifier")
    public void setIdentifier(String value) { this.identifier = value; }
}
