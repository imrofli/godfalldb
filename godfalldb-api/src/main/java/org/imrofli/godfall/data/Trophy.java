package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class Trophy {
    private String id;
    private String name;
    private TrophyAilmentsCategory category;
    private String objectiveID;
    private String trophyName;
    private long progressDenominator1;
    private long progressDenominator2;
    private long progressDenominator3;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("category")
    public TrophyAilmentsCategory getCategory() { return category; }
    @JsonProperty("category")
    public void setCategory(TrophyAilmentsCategory value) { this.category = value; }

    @JsonProperty("objectiveId")
    public String getObjectiveID() { return objectiveID; }
    @JsonProperty("objectiveId")
    public void setObjectiveID(String value) { this.objectiveID = value; }

    @JsonProperty("trophyName")
    public String getTrophyName() { return trophyName; }
    @JsonProperty("trophyName")
    public void setTrophyName(String value) { this.trophyName = value; }

    @JsonProperty("progressDenominator.1")
    public long getProgressDenominator1() { return progressDenominator1; }
    @JsonProperty("progressDenominator.1")
    public void setProgressDenominator1(long value) { this.progressDenominator1 = value; }

    @JsonProperty("progressDenominator.2")
    public long getProgressDenominator2() { return progressDenominator2; }
    @JsonProperty("progressDenominator.2")
    public void setProgressDenominator2(long value) { this.progressDenominator2 = value; }

    @JsonProperty("progressDenominator.3")
    public long getProgressDenominator3() { return progressDenominator3; }
    @JsonProperty("progressDenominator.3")
    public void setProgressDenominator3(long value) { this.progressDenominator3 = value; }
}
