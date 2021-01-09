package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class RaritiesCollection {
    private String name;
    private String locKey;
    private long identifier;
    private String masteryType;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("locKey")
    public String getLOCKey() { return locKey; }
    @JsonProperty("locKey")
    public void setLOCKey(String value) { this.locKey = value; }

    @JsonProperty("identifier")
    public long getIdentifier() { return identifier; }
    @JsonProperty("identifier")
    public void setIdentifier(long value) { this.identifier = value; }

    @JsonProperty("masteryType")
    public String getMasteryType() { return masteryType; }
    @JsonProperty("masteryType")
    public void setMasteryType(String value) { this.masteryType = value; }
}
