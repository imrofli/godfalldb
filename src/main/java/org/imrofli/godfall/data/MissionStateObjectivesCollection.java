package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class MissionStateObjectivesCollection {
    private String id;
    private String progressionFlagID;
    private String name;
    private String description;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("progressionFlagId")
    public String getProgressionFlagID() { return progressionFlagID; }
    @JsonProperty("progressionFlagId")
    public void setProgressionFlagID(String value) { this.progressionFlagID = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }
}
