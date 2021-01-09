package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class ArchonModeDefault {
    private String id;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }
}
