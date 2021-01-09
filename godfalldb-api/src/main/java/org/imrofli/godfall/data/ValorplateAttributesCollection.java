package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class ValorplateAttributesCollection {
    private long level;
    private long playerTierRequirement;
    private long experienceThreshold;
    private long health;
    private long powerCapacity;
    private double archonDamageScalar;

    @JsonProperty("level")
    public long getLevel() { return level; }
    @JsonProperty("level")
    public void setLevel(long value) { this.level = value; }

    @JsonProperty("playerTierRequirement")
    public long getPlayerTierRequirement() { return playerTierRequirement; }
    @JsonProperty("playerTierRequirement")
    public void setPlayerTierRequirement(long value) { this.playerTierRequirement = value; }

    @JsonProperty("experienceThreshold")
    public long getExperienceThreshold() { return experienceThreshold; }
    @JsonProperty("experienceThreshold")
    public void setExperienceThreshold(long value) { this.experienceThreshold = value; }

    @JsonProperty("health")
    public long getHealth() { return health; }
    @JsonProperty("health")
    public void setHealth(long value) { this.health = value; }

    @JsonProperty("powerCapacity")
    public long getPowerCapacity() { return powerCapacity; }
    @JsonProperty("powerCapacity")
    public void setPowerCapacity(long value) { this.powerCapacity = value; }

    @JsonProperty("archonDamageScalar")
    public double getArchonDamageScalar() { return archonDamageScalar; }
    @JsonProperty("archonDamageScalar")
    public void setArchonDamageScalar(double value) { this.archonDamageScalar = value; }
}
