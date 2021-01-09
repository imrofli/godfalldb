package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class WeaponMasteryCollection {
    private long masteryCategory;
    private long points;
    private long experienceThreshold;

    @JsonProperty("masteryCategory")
    public long getMasteryCategory() { return masteryCategory; }
    @JsonProperty("masteryCategory")
    public void setMasteryCategory(long value) { this.masteryCategory = value; }

    @JsonProperty("points")
    public long getPoints() { return points; }
    @JsonProperty("points")
    public void setPoints(long value) { this.points = value; }

    @JsonProperty("experienceThreshold")
    public long getExperienceThreshold() { return experienceThreshold; }
    @JsonProperty("experienceThreshold")
    public void setExperienceThreshold(long value) { this.experienceThreshold = value; }
}
