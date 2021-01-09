package org.imrofli.godfall.dao.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class EnemyTierModel extends AbstractEntity {

    private Long tier;
    private Double damageScalar;
    private Double healthScalar;
    private Double breachHealthScalar;
    private Double experienceScalar;

    @ManyToOne
    private VersionModel version;

    public Long getTier() {
        return tier;
    }

    public void setTier(Long tier) {
        this.tier = tier;
    }

    public Double getDamageScalar() {
        return damageScalar;
    }

    public void setDamageScalar(Double damageScalar) {
        this.damageScalar = damageScalar;
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

    public Double getExperienceScalar() {
        return experienceScalar;
    }

    public void setExperienceScalar(Double experienceScalar) {
        this.experienceScalar = experienceScalar;
    }

    public VersionModel getVersion() {
        return version;
    }

    public void setVersion(VersionModel version) {
        this.version = version;
    }
}
