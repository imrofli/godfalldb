package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class LootQuantityCollection {
    private String name;
    private String groupName;
    private String lootCategoryGroupName;
    private long minTier;
    private long maxTier;
    private long minThreat;
    private long maxThreat;
    private double chance;
    private long identifyChance;
    private long playerLootBonusScalar;
    private long targetLootBonusScalar;
    private Icon icon;
    private String title;
    private DescriptionEnum description;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("groupName")
    public String getGroupName() { return groupName; }
    @JsonProperty("groupName")
    public void setGroupName(String value) { this.groupName = value; }

    @JsonProperty("lootCategoryGroupName")
    public String getLootCategoryGroupName() { return lootCategoryGroupName; }
    @JsonProperty("lootCategoryGroupName")
    public void setLootCategoryGroupName(String value) { this.lootCategoryGroupName = value; }

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

    @JsonProperty("chance")
    public double getChance() { return chance; }
    @JsonProperty("chance")
    public void setChance(double value) { this.chance = value; }

    @JsonProperty("identifyChance")
    public long getIdentifyChance() { return identifyChance; }
    @JsonProperty("identifyChance")
    public void setIdentifyChance(long value) { this.identifyChance = value; }

    @JsonProperty("playerLootBonusScalar")
    public long getPlayerLootBonusScalar() { return playerLootBonusScalar; }
    @JsonProperty("playerLootBonusScalar")
    public void setPlayerLootBonusScalar(long value) { this.playerLootBonusScalar = value; }

    @JsonProperty("targetLootBonusScalar")
    public long getTargetLootBonusScalar() { return targetLootBonusScalar; }
    @JsonProperty("targetLootBonusScalar")
    public void setTargetLootBonusScalar(long value) { this.targetLootBonusScalar = value; }

    @JsonProperty("icon")
    public Icon getIcon() { return icon; }
    @JsonProperty("icon")
    public void setIcon(Icon value) { this.icon = value; }

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }

    @JsonProperty("description")
    public DescriptionEnum getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(DescriptionEnum value) { this.description = value; }
}
