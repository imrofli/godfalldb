package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class EncountersCollection {
    private String name;
    private String spawnPointRequiredRadius;
    private DifficultyEnum difficulty;
    private String complexity;
    private List<CategoryElement> category;
    private EncounterType encounterType;
    private String encounterMetaDataTags;
    private String staleOnceStartedAfterSeconds;
    private String spawnPointCooldownOnceCompleted;
    private String itemClassAssetID;
    private String itemClassPayload;
    private SampleFromTable sampleFromTable;
    private String weight;
    private String guardAreaRadius;
    private List<String> systemsValid;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("spawnPointRequiredRadius")
    public String getSpawnPointRequiredRadius() { return spawnPointRequiredRadius; }
    @JsonProperty("spawnPointRequiredRadius")
    public void setSpawnPointRequiredRadius(String value) { this.spawnPointRequiredRadius = value; }

    @JsonProperty("difficulty")
    public DifficultyEnum getDifficulty() { return difficulty; }
    @JsonProperty("difficulty")
    public void setDifficulty(DifficultyEnum value) { this.difficulty = value; }

    @JsonProperty("complexity")
    public String getComplexity() { return complexity; }
    @JsonProperty("complexity")
    public void setComplexity(String value) { this.complexity = value; }

    @JsonProperty("category")
    public List<CategoryElement> getCategory() { return category; }
    @JsonProperty("category")
    public void setCategory(List<CategoryElement> value) { this.category = value; }

    @JsonProperty("encounterType")
    public EncounterType getEncounterType() { return encounterType; }
    @JsonProperty("encounterType")
    public void setEncounterType(EncounterType value) { this.encounterType = value; }

    @JsonProperty("encounterMetaDataTags")
    public String getEncounterMetaDataTags() { return encounterMetaDataTags; }
    @JsonProperty("encounterMetaDataTags")
    public void setEncounterMetaDataTags(String value) { this.encounterMetaDataTags = value; }

    @JsonProperty("staleOnceStartedAfterSeconds")
    public String getStaleOnceStartedAfterSeconds() { return staleOnceStartedAfterSeconds; }
    @JsonProperty("staleOnceStartedAfterSeconds")
    public void setStaleOnceStartedAfterSeconds(String value) { this.staleOnceStartedAfterSeconds = value; }

    @JsonProperty("spawnPointCooldownOnceCompleted")
    public String getSpawnPointCooldownOnceCompleted() { return spawnPointCooldownOnceCompleted; }
    @JsonProperty("spawnPointCooldownOnceCompleted")
    public void setSpawnPointCooldownOnceCompleted(String value) { this.spawnPointCooldownOnceCompleted = value; }

    @JsonProperty("itemClassAssetId")
    public String getItemClassAssetID() { return itemClassAssetID; }
    @JsonProperty("itemClassAssetId")
    public void setItemClassAssetID(String value) { this.itemClassAssetID = value; }

    @JsonProperty("itemClassPayload")
    public String getItemClassPayload() { return itemClassPayload; }
    @JsonProperty("itemClassPayload")
    public void setItemClassPayload(String value) { this.itemClassPayload = value; }

    @JsonProperty("sampleFromTable")
    public SampleFromTable getSampleFromTable() { return sampleFromTable; }
    @JsonProperty("sampleFromTable")
    public void setSampleFromTable(SampleFromTable value) { this.sampleFromTable = value; }

    @JsonProperty("weight")
    public String getWeight() { return weight; }
    @JsonProperty("weight")
    public void setWeight(String value) { this.weight = value; }

    @JsonProperty("guardAreaRadius")
    public String getGuardAreaRadius() { return guardAreaRadius; }
    @JsonProperty("guardAreaRadius")
    public void setGuardAreaRadius(String value) { this.guardAreaRadius = value; }

    @JsonProperty("systemsValid")
    public List<String> getSystemsValid() { return systemsValid; }
    @JsonProperty("systemsValid")
    public void setSystemsValid(List<String> value) { this.systemsValid = value; }
}
