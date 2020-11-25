package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class MissionObjectiveTypesCollection {
    private String objectiveIdentifier;
    private String verb;
    private String gameplayTag;
    private Long progressDenominator;
    private Boolean mainObjective;

    @JsonProperty("objectiveIdentifier")
    public String getObjectiveIdentifier() { return objectiveIdentifier; }
    @JsonProperty("objectiveIdentifier")
    public void setObjectiveIdentifier(String value) { this.objectiveIdentifier = value; }

    @JsonProperty("verb")
    public String getVerb() { return verb; }
    @JsonProperty("verb")
    public void setVerb(String value) { this.verb = value; }

    @JsonProperty("gameplayTag")
    public String getGameplayTag() { return gameplayTag; }
    @JsonProperty("gameplayTag")
    public void setGameplayTag(String value) { this.gameplayTag = value; }

    @JsonProperty("progressDenominator")
    public Long getProgressDenominator() { return progressDenominator; }
    @JsonProperty("progressDenominator")
    public void setProgressDenominator(Long value) { this.progressDenominator = value; }

    @JsonProperty("mainObjective")
    public Boolean getMainObjective() { return mainObjective; }
    @JsonProperty("mainObjective")
    public void setMainObjective(Boolean value) { this.mainObjective = value; }
}
