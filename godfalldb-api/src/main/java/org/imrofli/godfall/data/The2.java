package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class The2 {
    private double quantityScalar;
    private double experienceScalar;
    private double healthScalar;
    private long damageScalar;
    private double breachHealthScalar;
    private double breachRechargeDurationScalar;
    private double breachHealthRegenScalar;

    @JsonProperty("quantityScalar")
    public double getQuantityScalar() { return quantityScalar; }
    @JsonProperty("quantityScalar")
    public void setQuantityScalar(double value) { this.quantityScalar = value; }

    @JsonProperty("experienceScalar")
    public double getExperienceScalar() { return experienceScalar; }
    @JsonProperty("experienceScalar")
    public void setExperienceScalar(double value) { this.experienceScalar = value; }

    @JsonProperty("healthScalar")
    public double getHealthScalar() { return healthScalar; }
    @JsonProperty("healthScalar")
    public void setHealthScalar(double value) { this.healthScalar = value; }

    @JsonProperty("damageScalar")
    public long getDamageScalar() { return damageScalar; }
    @JsonProperty("damageScalar")
    public void setDamageScalar(long value) { this.damageScalar = value; }

    @JsonProperty("breachHealthScalar")
    public double getBreachHealthScalar() { return breachHealthScalar; }
    @JsonProperty("breachHealthScalar")
    public void setBreachHealthScalar(double value) { this.breachHealthScalar = value; }

    @JsonProperty("breachRechargeDurationScalar")
    public double getBreachRechargeDurationScalar() { return breachRechargeDurationScalar; }
    @JsonProperty("breachRechargeDurationScalar")
    public void setBreachRechargeDurationScalar(double value) { this.breachRechargeDurationScalar = value; }

    @JsonProperty("breachHealthRegenScalar")
    public double getBreachHealthRegenScalar() { return breachHealthRegenScalar; }
    @JsonProperty("breachHealthRegenScalar")
    public void setBreachHealthRegenScalar(double value) { this.breachHealthRegenScalar = value; }
}
