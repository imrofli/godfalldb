package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class EnemyTier {
    private long tier;
    private double damageScalar;
    private double healthScalar;
    private double breachHealthScalar;
    private double experienceScalar;

    @JsonProperty("tier")
    public long getTier() { return tier; }
    @JsonProperty("tier")
    public void setTier(long value) { this.tier = value; }

    @JsonProperty("damageScalar")
    public double getDamageScalar() { return damageScalar; }
    @JsonProperty("damageScalar")
    public void setDamageScalar(double value) { this.damageScalar = value; }

    @JsonProperty("healthScalar")
    public double getHealthScalar() { return healthScalar; }
    @JsonProperty("healthScalar")
    public void setHealthScalar(double value) { this.healthScalar = value; }

    @JsonProperty("breachHealthScalar")
    public double getBreachHealthScalar() { return breachHealthScalar; }
    @JsonProperty("breachHealthScalar")
    public void setBreachHealthScalar(double value) { this.breachHealthScalar = value; }

    @JsonProperty("experienceScalar")
    public double getExperienceScalar() { return experienceScalar; }
    @JsonProperty("experienceScalar")
    public void setExperienceScalar(double value) { this.experienceScalar = value; }
}
