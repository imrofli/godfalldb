package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class ObjectivesCollection {
    private String id;
    private List<Objective> objectives;
    private long priority;
    private long weight;
    private List<String> objectiveTags;
    private Rules rules;
    private FluffyGameplayTag gameplayTag;
    private Boolean useWorldStateSynchronizer;
    private String stringTableKey;
    private AttributeNoVariance progressDenominator;
    private Long preferredNumberOfSpawnPoints;
    private Long preferredDistanceToObjective;
    private List<String> targetTags;
    private String triggerType;
    private Boolean markRelatedObject;
    private Boolean markOnCompass;
    private ActorType triggerActorType;
    private List<String> targetVariants;
    private String objectStringTableKey;
    private Boolean hideOnHud;
    private Boolean hideOnHudNotification;
    private Boolean hideOnHudProgress;
    private List<TentacledLootQuantityGroup> lootQuantityGroups;
    private Long expiresInSeconds;
    private Boolean useOwnerAsForActor;
    private Boolean ownerMustBeRelated;
    private List<String> compassDisableTriggerTags;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("objectives")
    public List<Objective> getObjectives() { return objectives; }
    @JsonProperty("objectives")
    public void setObjectives(List<Objective> value) { this.objectives = value; }

    @JsonProperty("priority")
    public long getPriority() { return priority; }
    @JsonProperty("priority")
    public void setPriority(long value) { this.priority = value; }

    @JsonProperty("weight")
    public long getWeight() { return weight; }
    @JsonProperty("weight")
    public void setWeight(long value) { this.weight = value; }

    @JsonProperty("objectiveTags")
    public List<String> getObjectiveTags() { return objectiveTags; }
    @JsonProperty("objectiveTags")
    public void setObjectiveTags(List<String> value) { this.objectiveTags = value; }

    @JsonProperty("rules")
    public Rules getRules() { return rules; }
    @JsonProperty("rules")
    public void setRules(Rules value) { this.rules = value; }

    @JsonProperty("gameplayTag")
    public FluffyGameplayTag getGameplayTag() { return gameplayTag; }
    @JsonProperty("gameplayTag")
    public void setGameplayTag(FluffyGameplayTag value) { this.gameplayTag = value; }

    @JsonProperty("useWorldStateSynchronizer")
    public Boolean getUseWorldStateSynchronizer() { return useWorldStateSynchronizer; }
    @JsonProperty("useWorldStateSynchronizer")
    public void setUseWorldStateSynchronizer(Boolean value) { this.useWorldStateSynchronizer = value; }

    @JsonProperty("stringTableKey")
    public String getStringTableKey() { return stringTableKey; }
    @JsonProperty("stringTableKey")
    public void setStringTableKey(String value) { this.stringTableKey = value; }

    @JsonProperty("progressDenominator")
    public AttributeNoVariance getProgressDenominator() { return progressDenominator; }
    @JsonProperty("progressDenominator")
    public void setProgressDenominator(AttributeNoVariance value) { this.progressDenominator = value; }

    @JsonProperty("preferredNumberOfSpawnPoints")
    public Long getPreferredNumberOfSpawnPoints() { return preferredNumberOfSpawnPoints; }
    @JsonProperty("preferredNumberOfSpawnPoints")
    public void setPreferredNumberOfSpawnPoints(Long value) { this.preferredNumberOfSpawnPoints = value; }

    @JsonProperty("preferredDistanceToObjective")
    public Long getPreferredDistanceToObjective() { return preferredDistanceToObjective; }
    @JsonProperty("preferredDistanceToObjective")
    public void setPreferredDistanceToObjective(Long value) { this.preferredDistanceToObjective = value; }

    @JsonProperty("targetTags")
    public List<String> getTargetTags() { return targetTags; }
    @JsonProperty("targetTags")
    public void setTargetTags(List<String> value) { this.targetTags = value; }

    @JsonProperty("triggerType")
    public String getTriggerType() { return triggerType; }
    @JsonProperty("triggerType")
    public void setTriggerType(String value) { this.triggerType = value; }

    @JsonProperty("markRelatedObject")
    public Boolean getMarkRelatedObject() { return markRelatedObject; }
    @JsonProperty("markRelatedObject")
    public void setMarkRelatedObject(Boolean value) { this.markRelatedObject = value; }

    @JsonProperty("markOnCompass")
    public Boolean getMarkOnCompass() { return markOnCompass; }
    @JsonProperty("markOnCompass")
    public void setMarkOnCompass(Boolean value) { this.markOnCompass = value; }

    @JsonProperty("triggerActorType")
    public ActorType getTriggerActorType() { return triggerActorType; }
    @JsonProperty("triggerActorType")
    public void setTriggerActorType(ActorType value) { this.triggerActorType = value; }

    @JsonProperty("targetVariants")
    public List<String> getTargetVariants() { return targetVariants; }
    @JsonProperty("targetVariants")
    public void setTargetVariants(List<String> value) { this.targetVariants = value; }

    @JsonProperty("objectStringTableKey")
    public String getObjectStringTableKey() { return objectStringTableKey; }
    @JsonProperty("objectStringTableKey")
    public void setObjectStringTableKey(String value) { this.objectStringTableKey = value; }

    @JsonProperty("hideOnHud")
    public Boolean getHideOnHud() { return hideOnHud; }
    @JsonProperty("hideOnHud")
    public void setHideOnHud(Boolean value) { this.hideOnHud = value; }

    @JsonProperty("hideOnHudNotification")
    public Boolean getHideOnHudNotification() { return hideOnHudNotification; }
    @JsonProperty("hideOnHudNotification")
    public void setHideOnHudNotification(Boolean value) { this.hideOnHudNotification = value; }

    @JsonProperty("hideOnHudProgress")
    public Boolean getHideOnHudProgress() { return hideOnHudProgress; }
    @JsonProperty("hideOnHudProgress")
    public void setHideOnHudProgress(Boolean value) { this.hideOnHudProgress = value; }

    @JsonProperty("lootQuantityGroups")
    public List<TentacledLootQuantityGroup> getLootQuantityGroups() { return lootQuantityGroups; }
    @JsonProperty("lootQuantityGroups")
    public void setLootQuantityGroups(List<TentacledLootQuantityGroup> value) { this.lootQuantityGroups = value; }

    @JsonProperty("expiresInSeconds")
    public Long getExpiresInSeconds() { return expiresInSeconds; }
    @JsonProperty("expiresInSeconds")
    public void setExpiresInSeconds(Long value) { this.expiresInSeconds = value; }

    @JsonProperty("useOwnerAsForActor")
    public Boolean getUseOwnerAsForActor() { return useOwnerAsForActor; }
    @JsonProperty("useOwnerAsForActor")
    public void setUseOwnerAsForActor(Boolean value) { this.useOwnerAsForActor = value; }

    @JsonProperty("ownerMustBeRelated")
    public Boolean getOwnerMustBeRelated() { return ownerMustBeRelated; }
    @JsonProperty("ownerMustBeRelated")
    public void setOwnerMustBeRelated(Boolean value) { this.ownerMustBeRelated = value; }

    @JsonProperty("compassDisableTriggerTags")
    public List<String> getCompassDisableTriggerTags() { return compassDisableTriggerTags; }
    @JsonProperty("compassDisableTriggerTags")
    public void setCompassDisableTriggerTags(List<String> value) { this.compassDisableTriggerTags = value; }
}
