package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class QuestsCollection {
    private String id;
    private Type missionRuleType;
    private String highlightActivity;
    private List<String> stateObjectives;
    private List<String> grantedProgressionFlags;
    private GameplayTag acquireGameplayTag;
    private ProgressGameplayTag progressGameplayTag;
    private GameplayTag turnInGameplayTag;
    private Text acquireText;
    private Text successText;
    private List<String> requiredProgressionFlags;
    private String title;
    private String description;
    private List<EntryFee> finishFee;
    private List<String> ignoreProgressionFlags;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("missionRuleType")
    public Type getMissionRuleType() { return missionRuleType; }
    @JsonProperty("missionRuleType")
    public void setMissionRuleType(Type value) { this.missionRuleType = value; }

    @JsonProperty("highlightActivity")
    public String getHighlightActivity() { return highlightActivity; }
    @JsonProperty("highlightActivity")
    public void setHighlightActivity(String value) { this.highlightActivity = value; }

    @JsonProperty("stateObjectives")
    public List<String> getStateObjectives() { return stateObjectives; }
    @JsonProperty("stateObjectives")
    public void setStateObjectives(List<String> value) { this.stateObjectives = value; }

    @JsonProperty("grantedProgressionFlags")
    public List<String> getGrantedProgressionFlags() { return grantedProgressionFlags; }
    @JsonProperty("grantedProgressionFlags")
    public void setGrantedProgressionFlags(List<String> value) { this.grantedProgressionFlags = value; }

    @JsonProperty("acquireGameplayTag")
    public GameplayTag getAcquireGameplayTag() { return acquireGameplayTag; }
    @JsonProperty("acquireGameplayTag")
    public void setAcquireGameplayTag(GameplayTag value) { this.acquireGameplayTag = value; }

    @JsonProperty("progressGameplayTag")
    public ProgressGameplayTag getProgressGameplayTag() { return progressGameplayTag; }
    @JsonProperty("progressGameplayTag")
    public void setProgressGameplayTag(ProgressGameplayTag value) { this.progressGameplayTag = value; }

    @JsonProperty("turnInGameplayTag")
    public GameplayTag getTurnInGameplayTag() { return turnInGameplayTag; }
    @JsonProperty("turnInGameplayTag")
    public void setTurnInGameplayTag(GameplayTag value) { this.turnInGameplayTag = value; }

    @JsonProperty("acquireText")
    public Text getAcquireText() { return acquireText; }
    @JsonProperty("acquireText")
    public void setAcquireText(Text value) { this.acquireText = value; }

    @JsonProperty("successText")
    public Text getSuccessText() { return successText; }
    @JsonProperty("successText")
    public void setSuccessText(Text value) { this.successText = value; }

    @JsonProperty("requiredProgressionFlags")
    public List<String> getRequiredProgressionFlags() { return requiredProgressionFlags; }
    @JsonProperty("requiredProgressionFlags")
    public void setRequiredProgressionFlags(List<String> value) { this.requiredProgressionFlags = value; }

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("finishFee")
    public List<EntryFee> getFinishFee() { return finishFee; }
    @JsonProperty("finishFee")
    public void setFinishFee(List<EntryFee> value) { this.finishFee = value; }

    @JsonProperty("ignoreProgressionFlags")
    public List<String> getIgnoreProgressionFlags() { return ignoreProgressionFlags; }
    @JsonProperty("ignoreProgressionFlags")
    public void setIgnoreProgressionFlags(List<String> value) { this.ignoreProgressionFlags = value; }
}
