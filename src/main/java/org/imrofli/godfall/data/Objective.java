package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Objective {
    private String subObjectiveID;
    private List<String> allowedTags;
    private List<AnyElement> connections;

    @JsonProperty("subObjectiveId")
    public String getSubObjectiveID() { return subObjectiveID; }
    @JsonProperty("subObjectiveId")
    public void setSubObjectiveID(String value) { this.subObjectiveID = value; }

    @JsonProperty("allowedTags")
    public List<String> getAllowedTags() { return allowedTags; }
    @JsonProperty("allowedTags")
    public void setAllowedTags(List<String> value) { this.allowedTags = value; }

    @JsonProperty("connections")
    public List<AnyElement> getConnections() { return connections; }
    @JsonProperty("connections")
    public void setConnections(List<AnyElement> value) { this.connections = value; }
}
