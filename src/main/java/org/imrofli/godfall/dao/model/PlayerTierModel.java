package org.imrofli.godfall.dao.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class PlayerTierModel extends AbstractEntity {

    private Long tier;
    private Long coopScalingPlayerMinTier;
    private Long coopScalingPlayerMaxTier;
    private Long totalXpRequired;
    private Long totalSkillPoints;
    private Long might;
    private Long vitality;
    private Long spirit;
    private Long baseHealth;
    private Long expPenaltySafeTierDifference;
    private Long expPenaltyMaxTierDifference;
    private Long powerCapacity;

    @ManyToOne
    private VersionModel version;

    public Long getTier() {
        return tier;
    }

    public void setTier(Long tier) {
        this.tier = tier;
    }

    public Long getCoopScalingPlayerMinTier() {
        return coopScalingPlayerMinTier;
    }

    public void setCoopScalingPlayerMinTier(Long coopScalingPlayerMinTier) {
        this.coopScalingPlayerMinTier = coopScalingPlayerMinTier;
    }

    public Long getCoopScalingPlayerMaxTier() {
        return coopScalingPlayerMaxTier;
    }

    public void setCoopScalingPlayerMaxTier(Long coopScalingPlayerMaxTier) {
        this.coopScalingPlayerMaxTier = coopScalingPlayerMaxTier;
    }

    public Long getTotalXpRequired() {
        return totalXpRequired;
    }

    public void setTotalXpRequired(Long totalXpRequired) {
        this.totalXpRequired = totalXpRequired;
    }

    public Long getTotalSkillPoints() {
        return totalSkillPoints;
    }

    public void setTotalSkillPoints(Long totalSkillPoints) {
        this.totalSkillPoints = totalSkillPoints;
    }

    public Long getMight() {
        return might;
    }

    public void setMight(Long might) {
        this.might = might;
    }

    public Long getVitality() {
        return vitality;
    }

    public void setVitality(Long vitality) {
        this.vitality = vitality;
    }

    public Long getSpirit() {
        return spirit;
    }

    public void setSpirit(Long spirit) {
        this.spirit = spirit;
    }

    public Long getBaseHealth() {
        return baseHealth;
    }

    public void setBaseHealth(Long baseHealth) {
        this.baseHealth = baseHealth;
    }

    public Long getExpPenaltySafeTierDifference() {
        return expPenaltySafeTierDifference;
    }

    public void setExpPenaltySafeTierDifference(Long expPenaltySafeTierDifference) {
        this.expPenaltySafeTierDifference = expPenaltySafeTierDifference;
    }

    public Long getExpPenaltyMaxTierDifference() {
        return expPenaltyMaxTierDifference;
    }

    public void setExpPenaltyMaxTierDifference(Long expPenaltyMaxTierDifference) {
        this.expPenaltyMaxTierDifference = expPenaltyMaxTierDifference;
    }

    public Long getPowerCapacity() {
        return powerCapacity;
    }

    public void setPowerCapacity(Long powerCapacity) {
        this.powerCapacity = powerCapacity;
    }

    public VersionModel getVersion() {
        return version;
    }

    public void setVersion(VersionModel version) {
        this.version = version;
    }
}
