package org.imrofli.godfall.dao.model;

import javax.persistence.Entity;

@Entity
public class EnemyClassLvl extends AbstractEntity {

    private Double quantityScalar;
    private Double experienceScalar;
    private Double healthScalar;
    private Double breachHealthScalar;
    private Double breachRechargeDurationScalar;
    private Double breachHealthRegenScalar;

    public Double getQuantityScalar() {
        return quantityScalar;
    }

    public void setQuantityScalar(Double quantityScalar) {
        this.quantityScalar = quantityScalar;
    }

    public Double getExperienceScalar() {
        return experienceScalar;
    }

    public void setExperienceScalar(Double experienceScalar) {
        this.experienceScalar = experienceScalar;
    }

    public Double getHealthScalar() {
        return healthScalar;
    }

    public void setHealthScalar(Double healthScalar) {
        this.healthScalar = healthScalar;
    }

    public Double getBreachHealthScalar() {
        return breachHealthScalar;
    }

    public void setBreachHealthScalar(Double breachHealthScalar) {
        this.breachHealthScalar = breachHealthScalar;
    }

    public Double getBreachRechargeDurationScalar() {
        return breachRechargeDurationScalar;
    }

    public void setBreachRechargeDurationScalar(Double breachRechargeDurationScalar) {
        this.breachRechargeDurationScalar = breachRechargeDurationScalar;
    }

    public Double getBreachHealthRegenScalar() {
        return breachHealthRegenScalar;
    }

    public void setBreachHealthRegenScalar(Double breachHealthRegenScalar) {
        this.breachHealthRegenScalar = breachHealthRegenScalar;
    }
}
