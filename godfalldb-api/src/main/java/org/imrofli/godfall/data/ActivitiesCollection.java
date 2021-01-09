package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class ActivitiesCollection {
    private String id;
    private MissionRuleType missionRuleType;
    private GameMode gameMode;
    private String mapIdentifier;
    private Boolean onlineDisallowed;
    private Boolean autoGenerateObjective;
    private List<String> grantedProgressionFlags;
    private List<String> ignoreProgressionFlags;
    private long minTier;
    private long maxTier;
    private long minThreat;
    private long maxThreat;
    private Long maxNumDeaths;
    private DifficultyClass difficulty;
    private Double mapLocationX;
    private Double mapLocationY;
    private String title;
    private List<String> requiredProgressionFlags;
    private String config;
    private ID subzone;
    private Boolean coopScalingEnabled;
    private List<String> lootQuantityGroups;
    private Region region;
    private String description;
    private List<SpawnPointRedActorTag> spawnPointRequiredActorTags;
    private List<SpawnPointRedActorTag> spawnPointIgnoredActorTags;
    private Long expiresInSeconds;
    private List<String> objectives;
    private String iconSrc;
    private Long firstCompletionGrantedSkillPoints;
    private List<EntryFee> entryFee;
    private CollectionDreamstones dreamstones;
    private List<LootQuantityRandomizedWhitelistTag> lootQuantityRandomizedWhitelistTags;
    private List<IntelMetaTagUnion> intelMetaTags;
    private Long grantedXP;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("missionRuleType")
    public MissionRuleType getMissionRuleType() { return missionRuleType; }
    @JsonProperty("missionRuleType")
    public void setMissionRuleType(MissionRuleType value) { this.missionRuleType = value; }

    @JsonProperty("gameMode")
    public GameMode getGameMode() { return gameMode; }
    @JsonProperty("gameMode")
    public void setGameMode(GameMode value) { this.gameMode = value; }

    @JsonProperty("mapIdentifier")
    public String getMapIdentifier() { return mapIdentifier; }
    @JsonProperty("mapIdentifier")
    public void setMapIdentifier(String value) { this.mapIdentifier = value; }

    @JsonProperty("onlineDisallowed")
    public Boolean getOnlineDisallowed() { return onlineDisallowed; }
    @JsonProperty("onlineDisallowed")
    public void setOnlineDisallowed(Boolean value) { this.onlineDisallowed = value; }

    @JsonProperty("autoGenerateObjective")
    public Boolean getAutoGenerateObjective() { return autoGenerateObjective; }
    @JsonProperty("autoGenerateObjective")
    public void setAutoGenerateObjective(Boolean value) { this.autoGenerateObjective = value; }

    @JsonProperty("grantedProgressionFlags")
    public List<String> getGrantedProgressionFlags() { return grantedProgressionFlags; }
    @JsonProperty("grantedProgressionFlags")
    public void setGrantedProgressionFlags(List<String> value) { this.grantedProgressionFlags = value; }

    @JsonProperty("ignoreProgressionFlags")
    public List<String> getIgnoreProgressionFlags() { return ignoreProgressionFlags; }
    @JsonProperty("ignoreProgressionFlags")
    public void setIgnoreProgressionFlags(List<String> value) { this.ignoreProgressionFlags = value; }

    @JsonProperty("minTier")
    public long getMinTier() { return minTier; }
    @JsonProperty("minTier")
    public void setMinTier(long value) { this.minTier = value; }

    @JsonProperty("maxTier")
    public long getMaxTier() { return maxTier; }
    @JsonProperty("maxTier")
    public void setMaxTier(long value) { this.maxTier = value; }

    @JsonProperty("minThreat")
    public long getMinThreat() { return minThreat; }
    @JsonProperty("minThreat")
    public void setMinThreat(long value) { this.minThreat = value; }

    @JsonProperty("maxThreat")
    public long getMaxThreat() { return maxThreat; }
    @JsonProperty("maxThreat")
    public void setMaxThreat(long value) { this.maxThreat = value; }

    @JsonProperty("maxNumDeaths")
    public Long getMaxNumDeaths() { return maxNumDeaths; }
    @JsonProperty("maxNumDeaths")
    public void setMaxNumDeaths(Long value) { this.maxNumDeaths = value; }

    @JsonProperty("difficulty")
    public DifficultyClass getDifficulty() { return difficulty; }
    @JsonProperty("difficulty")
    public void setDifficulty(DifficultyClass value) { this.difficulty = value; }

    @JsonProperty("mapLocationX")
    public Double getMapLocationX() { return mapLocationX; }
    @JsonProperty("mapLocationX")
    public void setMapLocationX(Double value) { this.mapLocationX = value; }

    @JsonProperty("mapLocationY")
    public Double getMapLocationY() { return mapLocationY; }
    @JsonProperty("mapLocationY")
    public void setMapLocationY(Double value) { this.mapLocationY = value; }

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }

    @JsonProperty("requiredProgressionFlags")
    public List<String> getRequiredProgressionFlags() { return requiredProgressionFlags; }
    @JsonProperty("requiredProgressionFlags")
    public void setRequiredProgressionFlags(List<String> value) { this.requiredProgressionFlags = value; }

    @JsonProperty("config")
    public String getConfig() { return config; }
    @JsonProperty("config")
    public void setConfig(String value) { this.config = value; }

    @JsonProperty("subzone")
    public ID getSubzone() { return subzone; }
    @JsonProperty("subzone")
    public void setSubzone(ID value) { this.subzone = value; }

    @JsonProperty("coopScalingEnabled")
    public Boolean getCoopScalingEnabled() { return coopScalingEnabled; }
    @JsonProperty("coopScalingEnabled")
    public void setCoopScalingEnabled(Boolean value) { this.coopScalingEnabled = value; }

    @JsonProperty("lootQuantityGroups")
    public List<String> getLootQuantityGroups() { return lootQuantityGroups; }
    @JsonProperty("lootQuantityGroups")
    public void setLootQuantityGroups(List<String> value) { this.lootQuantityGroups = value; }

    @JsonProperty("region")
    public Region getRegion() { return region; }
    @JsonProperty("region")
    public void setRegion(Region value) { this.region = value; }

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("spawnPointRequiredActorTags")
    public List<SpawnPointRedActorTag> getSpawnPointRequiredActorTags() { return spawnPointRequiredActorTags; }
    @JsonProperty("spawnPointRequiredActorTags")
    public void setSpawnPointRequiredActorTags(List<SpawnPointRedActorTag> value) { this.spawnPointRequiredActorTags = value; }

    @JsonProperty("spawnPointIgnoredActorTags")
    public List<SpawnPointRedActorTag> getSpawnPointIgnoredActorTags() { return spawnPointIgnoredActorTags; }
    @JsonProperty("spawnPointIgnoredActorTags")
    public void setSpawnPointIgnoredActorTags(List<SpawnPointRedActorTag> value) { this.spawnPointIgnoredActorTags = value; }

    @JsonProperty("expiresInSeconds")
    public Long getExpiresInSeconds() { return expiresInSeconds; }
    @JsonProperty("expiresInSeconds")
    public void setExpiresInSeconds(Long value) { this.expiresInSeconds = value; }

    @JsonProperty("objectives")
    public List<String> getObjectives() { return objectives; }
    @JsonProperty("objectives")
    public void setObjectives(List<String> value) { this.objectives = value; }

    @JsonProperty("iconSrc")
    public String getIconSrc() { return iconSrc; }
    @JsonProperty("iconSrc")
    public void setIconSrc(String value) { this.iconSrc = value; }

    @JsonProperty("firstCompletionGrantedSkillPoints")
    public Long getFirstCompletionGrantedSkillPoints() { return firstCompletionGrantedSkillPoints; }
    @JsonProperty("firstCompletionGrantedSkillPoints")
    public void setFirstCompletionGrantedSkillPoints(Long value) { this.firstCompletionGrantedSkillPoints = value; }

    @JsonProperty("entryFee")
    public List<EntryFee> getEntryFee() { return entryFee; }
    @JsonProperty("entryFee")
    public void setEntryFee(List<EntryFee> value) { this.entryFee = value; }

    @JsonProperty("dreamstones")
    public CollectionDreamstones getDreamstones() { return dreamstones; }
    @JsonProperty("dreamstones")
    public void setDreamstones(CollectionDreamstones value) { this.dreamstones = value; }

    @JsonProperty("lootQuantityRandomizedWhitelistTags")
    public List<LootQuantityRandomizedWhitelistTag> getLootQuantityRandomizedWhitelistTags() { return lootQuantityRandomizedWhitelistTags; }
    @JsonProperty("lootQuantityRandomizedWhitelistTags")
    public void setLootQuantityRandomizedWhitelistTags(List<LootQuantityRandomizedWhitelistTag> value) { this.lootQuantityRandomizedWhitelistTags = value; }

    @JsonProperty("intelMetaTags")
    public List<IntelMetaTagUnion> getIntelMetaTags() { return intelMetaTags; }
    @JsonProperty("intelMetaTags")
    public void setIntelMetaTags(List<IntelMetaTagUnion> value) { this.intelMetaTags = value; }

    @JsonProperty("grantedXp")
    public Long getGrantedXP() { return grantedXP; }
    @JsonProperty("grantedXp")
    public void setGrantedXP(Long value) { this.grantedXP = value; }
}
