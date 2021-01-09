package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class MasteryEntitlementsCollection {
    private String id;
    private String masteryID;
    private long minPoints;
    private String traitName;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("masteryId")
    public String getMasteryID() { return masteryID; }
    @JsonProperty("masteryId")
    public void setMasteryID(String value) { this.masteryID = value; }

    @JsonProperty("minPoints")
    public long getMinPoints() { return minPoints; }
    @JsonProperty("minPoints")
    public void setMinPoints(long value) { this.minPoints = value; }

    @JsonProperty("traitName")
    public String getTraitName() { return traitName; }
    @JsonProperty("traitName")
    public void setTraitName(String value) { this.traitName = value; }
}
