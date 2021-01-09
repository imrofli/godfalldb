package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class AugmentAffinitiesCollection {
    private String name;
    private long identifier;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("identifier")
    public long getIdentifier() { return identifier; }
    @JsonProperty("identifier")
    public void setIdentifier(long value) { this.identifier = value; }
}
