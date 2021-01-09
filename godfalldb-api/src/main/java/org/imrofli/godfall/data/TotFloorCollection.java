package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class TotFloorCollection {
    private long floor;
    private FluffyType type;
    private List<TotRoomRewardThemeTagElement> roomRewardThemeWhitelistTags;
    private List<NameElement> roomRarityWhitelistTags;
    private long tier;
    private long threat;
    private double enemyHealthScalar;
    private double enemyDamageScalar;
    private long elevatorTimerSeconds;
    private List<Double> elevatorEncounterAwardKeyThresholds;
    private long elevatorEncounterComplexityMin;
    private long elevatorEncounterComplexityMax;
    private long commonRoomEncounterComplexityMin;
    private long commonRoomEncounterComplexityMax;
    private long uncommonRoomEncounterComplexityMin;
    private long uncommonRoomEncounterComplexityMax;
    private long rareRoomEncounterComplexityMin;
    private long rareRoomEncounterComplexityMax;
    private long epicRoomEncounterComplexityMin;
    private long epicRoomEncounterComplexityMax;
    private long legendaryRoomEncounterComplexityMin;
    private long legendaryRoomEncounterComplexityMax;
    private long elevatorMinGold;
    private long elevatorMaxGold;
    private long bossFloorEncounterComplexityMin;
    private long bossFloorEncounterComplexityMax;
    private long bossFloorRewardComplexityMin;
    private long bossFloorRewardComplexityMax;
    private long commonRoomRewardComplexityMin;
    private long commonRoomRewardComplexityMax;
    private long uncommonRoomRewardComplexityMin;
    private long uncommonRoomRewardComplexityMax;
    private long rareRoomRewardComplexityMin;
    private long rareRoomRewardComplexityMax;
    private long epicRoomRewardComplexityMin;
    private long epicRoomRewardComplexityMax;
    private long legendaryRoomRewardComplexityMin;
    private long legendaryRoomRewardComplexityMax;
    private String name;
    private Long numBaneInteractions;
    private List<BoonWhitelistTag> boonWhitelistTags;
    private List<NameElement> boonWhitelistRarities;
    private Long roomEncounterTimerSeconds;
    private List<Double> roomEncounterAwardKeyThresholds;
    private Long bossFightTimerSeconds;
    private List<Double> bossFightAwardKeyThresholds;
    private Boolean isExitFloor;

    @JsonProperty("floor")
    public long getFloor() { return floor; }
    @JsonProperty("floor")
    public void setFloor(long value) { this.floor = value; }

    @JsonProperty("type")
    public FluffyType getType() { return type; }
    @JsonProperty("type")
    public void setType(FluffyType value) { this.type = value; }

    @JsonProperty("roomRewardThemeWhitelistTags")
    public List<TotRoomRewardThemeTagElement> getRoomRewardThemeWhitelistTags() { return roomRewardThemeWhitelistTags; }
    @JsonProperty("roomRewardThemeWhitelistTags")
    public void setRoomRewardThemeWhitelistTags(List<TotRoomRewardThemeTagElement> value) { this.roomRewardThemeWhitelistTags = value; }

    @JsonProperty("roomRarityWhitelistTags")
    public List<NameElement> getRoomRarityWhitelistTags() { return roomRarityWhitelistTags; }
    @JsonProperty("roomRarityWhitelistTags")
    public void setRoomRarityWhitelistTags(List<NameElement> value) { this.roomRarityWhitelistTags = value; }

    @JsonProperty("tier")
    public long getTier() { return tier; }
    @JsonProperty("tier")
    public void setTier(long value) { this.tier = value; }

    @JsonProperty("threat")
    public long getThreat() { return threat; }
    @JsonProperty("threat")
    public void setThreat(long value) { this.threat = value; }

    @JsonProperty("enemyHealthScalar")
    public double getEnemyHealthScalar() { return enemyHealthScalar; }
    @JsonProperty("enemyHealthScalar")
    public void setEnemyHealthScalar(double value) { this.enemyHealthScalar = value; }

    @JsonProperty("enemyDamageScalar")
    public double getEnemyDamageScalar() { return enemyDamageScalar; }
    @JsonProperty("enemyDamageScalar")
    public void setEnemyDamageScalar(double value) { this.enemyDamageScalar = value; }

    @JsonProperty("elevatorTimerSeconds")
    public long getElevatorTimerSeconds() { return elevatorTimerSeconds; }
    @JsonProperty("elevatorTimerSeconds")
    public void setElevatorTimerSeconds(long value) { this.elevatorTimerSeconds = value; }

    @JsonProperty("elevatorEncounterAwardKeyThresholds")
    public List<Double> getElevatorEncounterAwardKeyThresholds() { return elevatorEncounterAwardKeyThresholds; }
    @JsonProperty("elevatorEncounterAwardKeyThresholds")
    public void setElevatorEncounterAwardKeyThresholds(List<Double> value) { this.elevatorEncounterAwardKeyThresholds = value; }

    @JsonProperty("elevatorEncounterComplexityMin")
    public long getElevatorEncounterComplexityMin() { return elevatorEncounterComplexityMin; }
    @JsonProperty("elevatorEncounterComplexityMin")
    public void setElevatorEncounterComplexityMin(long value) { this.elevatorEncounterComplexityMin = value; }

    @JsonProperty("elevatorEncounterComplexityMax")
    public long getElevatorEncounterComplexityMax() { return elevatorEncounterComplexityMax; }
    @JsonProperty("elevatorEncounterComplexityMax")
    public void setElevatorEncounterComplexityMax(long value) { this.elevatorEncounterComplexityMax = value; }

    @JsonProperty("commonRoomEncounterComplexityMin")
    public long getCommonRoomEncounterComplexityMin() { return commonRoomEncounterComplexityMin; }
    @JsonProperty("commonRoomEncounterComplexityMin")
    public void setCommonRoomEncounterComplexityMin(long value) { this.commonRoomEncounterComplexityMin = value; }

    @JsonProperty("commonRoomEncounterComplexityMax")
    public long getCommonRoomEncounterComplexityMax() { return commonRoomEncounterComplexityMax; }
    @JsonProperty("commonRoomEncounterComplexityMax")
    public void setCommonRoomEncounterComplexityMax(long value) { this.commonRoomEncounterComplexityMax = value; }

    @JsonProperty("uncommonRoomEncounterComplexityMin")
    public long getUncommonRoomEncounterComplexityMin() { return uncommonRoomEncounterComplexityMin; }
    @JsonProperty("uncommonRoomEncounterComplexityMin")
    public void setUncommonRoomEncounterComplexityMin(long value) { this.uncommonRoomEncounterComplexityMin = value; }

    @JsonProperty("uncommonRoomEncounterComplexityMax")
    public long getUncommonRoomEncounterComplexityMax() { return uncommonRoomEncounterComplexityMax; }
    @JsonProperty("uncommonRoomEncounterComplexityMax")
    public void setUncommonRoomEncounterComplexityMax(long value) { this.uncommonRoomEncounterComplexityMax = value; }

    @JsonProperty("rareRoomEncounterComplexityMin")
    public long getRareRoomEncounterComplexityMin() { return rareRoomEncounterComplexityMin; }
    @JsonProperty("rareRoomEncounterComplexityMin")
    public void setRareRoomEncounterComplexityMin(long value) { this.rareRoomEncounterComplexityMin = value; }

    @JsonProperty("rareRoomEncounterComplexityMax")
    public long getRareRoomEncounterComplexityMax() { return rareRoomEncounterComplexityMax; }
    @JsonProperty("rareRoomEncounterComplexityMax")
    public void setRareRoomEncounterComplexityMax(long value) { this.rareRoomEncounterComplexityMax = value; }

    @JsonProperty("epicRoomEncounterComplexityMin")
    public long getEpicRoomEncounterComplexityMin() { return epicRoomEncounterComplexityMin; }
    @JsonProperty("epicRoomEncounterComplexityMin")
    public void setEpicRoomEncounterComplexityMin(long value) { this.epicRoomEncounterComplexityMin = value; }

    @JsonProperty("epicRoomEncounterComplexityMax")
    public long getEpicRoomEncounterComplexityMax() { return epicRoomEncounterComplexityMax; }
    @JsonProperty("epicRoomEncounterComplexityMax")
    public void setEpicRoomEncounterComplexityMax(long value) { this.epicRoomEncounterComplexityMax = value; }

    @JsonProperty("legendaryRoomEncounterComplexityMin")
    public long getLegendaryRoomEncounterComplexityMin() { return legendaryRoomEncounterComplexityMin; }
    @JsonProperty("legendaryRoomEncounterComplexityMin")
    public void setLegendaryRoomEncounterComplexityMin(long value) { this.legendaryRoomEncounterComplexityMin = value; }

    @JsonProperty("legendaryRoomEncounterComplexityMax")
    public long getLegendaryRoomEncounterComplexityMax() { return legendaryRoomEncounterComplexityMax; }
    @JsonProperty("legendaryRoomEncounterComplexityMax")
    public void setLegendaryRoomEncounterComplexityMax(long value) { this.legendaryRoomEncounterComplexityMax = value; }

    @JsonProperty("elevatorMinGold")
    public long getElevatorMinGold() { return elevatorMinGold; }
    @JsonProperty("elevatorMinGold")
    public void setElevatorMinGold(long value) { this.elevatorMinGold = value; }

    @JsonProperty("elevatorMaxGold")
    public long getElevatorMaxGold() { return elevatorMaxGold; }
    @JsonProperty("elevatorMaxGold")
    public void setElevatorMaxGold(long value) { this.elevatorMaxGold = value; }

    @JsonProperty("bossFloorEncounterComplexityMin")
    public long getBossFloorEncounterComplexityMin() { return bossFloorEncounterComplexityMin; }
    @JsonProperty("bossFloorEncounterComplexityMin")
    public void setBossFloorEncounterComplexityMin(long value) { this.bossFloorEncounterComplexityMin = value; }

    @JsonProperty("bossFloorEncounterComplexityMax")
    public long getBossFloorEncounterComplexityMax() { return bossFloorEncounterComplexityMax; }
    @JsonProperty("bossFloorEncounterComplexityMax")
    public void setBossFloorEncounterComplexityMax(long value) { this.bossFloorEncounterComplexityMax = value; }

    @JsonProperty("bossFloorRewardComplexityMin")
    public long getBossFloorRewardComplexityMin() { return bossFloorRewardComplexityMin; }
    @JsonProperty("bossFloorRewardComplexityMin")
    public void setBossFloorRewardComplexityMin(long value) { this.bossFloorRewardComplexityMin = value; }

    @JsonProperty("bossFloorRewardComplexityMax")
    public long getBossFloorRewardComplexityMax() { return bossFloorRewardComplexityMax; }
    @JsonProperty("bossFloorRewardComplexityMax")
    public void setBossFloorRewardComplexityMax(long value) { this.bossFloorRewardComplexityMax = value; }

    @JsonProperty("commonRoomRewardComplexityMin")
    public long getCommonRoomRewardComplexityMin() { return commonRoomRewardComplexityMin; }
    @JsonProperty("commonRoomRewardComplexityMin")
    public void setCommonRoomRewardComplexityMin(long value) { this.commonRoomRewardComplexityMin = value; }

    @JsonProperty("commonRoomRewardComplexityMax")
    public long getCommonRoomRewardComplexityMax() { return commonRoomRewardComplexityMax; }
    @JsonProperty("commonRoomRewardComplexityMax")
    public void setCommonRoomRewardComplexityMax(long value) { this.commonRoomRewardComplexityMax = value; }

    @JsonProperty("uncommonRoomRewardComplexityMin")
    public long getUncommonRoomRewardComplexityMin() { return uncommonRoomRewardComplexityMin; }
    @JsonProperty("uncommonRoomRewardComplexityMin")
    public void setUncommonRoomRewardComplexityMin(long value) { this.uncommonRoomRewardComplexityMin = value; }

    @JsonProperty("uncommonRoomRewardComplexityMax")
    public long getUncommonRoomRewardComplexityMax() { return uncommonRoomRewardComplexityMax; }
    @JsonProperty("uncommonRoomRewardComplexityMax")
    public void setUncommonRoomRewardComplexityMax(long value) { this.uncommonRoomRewardComplexityMax = value; }

    @JsonProperty("rareRoomRewardComplexityMin")
    public long getRareRoomRewardComplexityMin() { return rareRoomRewardComplexityMin; }
    @JsonProperty("rareRoomRewardComplexityMin")
    public void setRareRoomRewardComplexityMin(long value) { this.rareRoomRewardComplexityMin = value; }

    @JsonProperty("rareRoomRewardComplexityMax")
    public long getRareRoomRewardComplexityMax() { return rareRoomRewardComplexityMax; }
    @JsonProperty("rareRoomRewardComplexityMax")
    public void setRareRoomRewardComplexityMax(long value) { this.rareRoomRewardComplexityMax = value; }

    @JsonProperty("epicRoomRewardComplexityMin")
    public long getEpicRoomRewardComplexityMin() { return epicRoomRewardComplexityMin; }
    @JsonProperty("epicRoomRewardComplexityMin")
    public void setEpicRoomRewardComplexityMin(long value) { this.epicRoomRewardComplexityMin = value; }

    @JsonProperty("epicRoomRewardComplexityMax")
    public long getEpicRoomRewardComplexityMax() { return epicRoomRewardComplexityMax; }
    @JsonProperty("epicRoomRewardComplexityMax")
    public void setEpicRoomRewardComplexityMax(long value) { this.epicRoomRewardComplexityMax = value; }

    @JsonProperty("legendaryRoomRewardComplexityMin")
    public long getLegendaryRoomRewardComplexityMin() { return legendaryRoomRewardComplexityMin; }
    @JsonProperty("legendaryRoomRewardComplexityMin")
    public void setLegendaryRoomRewardComplexityMin(long value) { this.legendaryRoomRewardComplexityMin = value; }

    @JsonProperty("legendaryRoomRewardComplexityMax")
    public long getLegendaryRoomRewardComplexityMax() { return legendaryRoomRewardComplexityMax; }
    @JsonProperty("legendaryRoomRewardComplexityMax")
    public void setLegendaryRoomRewardComplexityMax(long value) { this.legendaryRoomRewardComplexityMax = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("numBaneInteractions")
    public Long getNumBaneInteractions() { return numBaneInteractions; }
    @JsonProperty("numBaneInteractions")
    public void setNumBaneInteractions(Long value) { this.numBaneInteractions = value; }

    @JsonProperty("boonWhitelistTags")
    public List<BoonWhitelistTag> getBoonWhitelistTags() { return boonWhitelistTags; }
    @JsonProperty("boonWhitelistTags")
    public void setBoonWhitelistTags(List<BoonWhitelistTag> value) { this.boonWhitelistTags = value; }

    @JsonProperty("boonWhitelistRarities")
    public List<NameElement> getBoonWhitelistRarities() { return boonWhitelistRarities; }
    @JsonProperty("boonWhitelistRarities")
    public void setBoonWhitelistRarities(List<NameElement> value) { this.boonWhitelistRarities = value; }

    @JsonProperty("roomEncounterTimerSeconds")
    public Long getRoomEncounterTimerSeconds() { return roomEncounterTimerSeconds; }
    @JsonProperty("roomEncounterTimerSeconds")
    public void setRoomEncounterTimerSeconds(Long value) { this.roomEncounterTimerSeconds = value; }

    @JsonProperty("roomEncounterAwardKeyThresholds")
    public List<Double> getRoomEncounterAwardKeyThresholds() { return roomEncounterAwardKeyThresholds; }
    @JsonProperty("roomEncounterAwardKeyThresholds")
    public void setRoomEncounterAwardKeyThresholds(List<Double> value) { this.roomEncounterAwardKeyThresholds = value; }

    @JsonProperty("bossFightTimerSeconds")
    public Long getBossFightTimerSeconds() { return bossFightTimerSeconds; }
    @JsonProperty("bossFightTimerSeconds")
    public void setBossFightTimerSeconds(Long value) { this.bossFightTimerSeconds = value; }

    @JsonProperty("bossFightAwardKeyThresholds")
    public List<Double> getBossFightAwardKeyThresholds() { return bossFightAwardKeyThresholds; }
    @JsonProperty("bossFightAwardKeyThresholds")
    public void setBossFightAwardKeyThresholds(List<Double> value) { this.bossFightAwardKeyThresholds = value; }

    @JsonProperty("isExitFloor")
    public Boolean getIsExitFloor() { return isExitFloor; }
    @JsonProperty("isExitFloor")
    public void setIsExitFloor(Boolean value) { this.isExitFloor = value; }
}
