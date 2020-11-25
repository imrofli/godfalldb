package org.imrofli.godfall.dao.model;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class ItemScaling extends AbstractEntity {

    @NotNull
    private Long tierIdentifier;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Rarity rarity;

    private Long playerTierRequirement;

    private Double minWeaponDamage;

    private Double maxWeaponDamage;

    private Double minPotionHeal;

    private Double maxPotionHeal;

    private Double minBannerOvershield;

    private Double maxBannerOvershield;

    private Long powerDrain;

    private Long itemStrengthIndex;

    private Double coreAttributeMin;

    private Double coreAttributeMax;

    private Double coreAttributePercentMin;

    private Double coreAttributePercentMax;

    private Double defensePercentMin;

    private Double defensePercentMax;

    private Double reverseScalingMin;

    private Double reverseScalingMax;

    private Double nonScalingMin;

    private Double nonScalingMax;

    private Double playerPowerMin;

    private Double playerPowerMax;

    private Double playerHealthMin;

    private Double playerHealthMax;

    private Double attributeNoVarianceMin;

    private Double attributeNoVarianceMax;

    private Double healthToDamageMin;

    private Double healthToDamageMax;

    private Double nonScalingVarianceMin;

    private Double nonScalingVarianceMax;

    private Double noVarianceCoreAttributePercentMin;

    private Double noVarianceCoreAttributePercentMax;

    private Double noVarianceDefensePercentMin;

    private Double noVarianceDefensePercentMax;

    private Double noVariancePlayerPowerMin;

    private Double noVariancePlayerPowerMax;

    private Double noVariancePlayerHealthMin;

    private Double noVariancePlayerHealthMax;

    private Double noVarianceHealthToDamageMin;

    private Double noVarianceHealthToDamageMax;

    public Long getTierIdentifier() {
        return tierIdentifier;
    }

    public void setTierIdentifier(Long tierIdentifier) {
        this.tierIdentifier = tierIdentifier;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    public Long getPlayerTierRequirement() {
        return playerTierRequirement;
    }

    public void setPlayerTierRequirement(Long playerTierRequirement) {
        this.playerTierRequirement = playerTierRequirement;
    }

    public Double getMinWeaponDamage() {
        return minWeaponDamage;
    }

    public void setMinWeaponDamage(Double minWeaponDamage) {
        this.minWeaponDamage = minWeaponDamage;
    }

    public Double getMaxWeaponDamage() {
        return maxWeaponDamage;
    }

    public void setMaxWeaponDamage(Double maxWeaponDamage) {
        this.maxWeaponDamage = maxWeaponDamage;
    }

    public Double getMinPotionHeal() {
        return minPotionHeal;
    }

    public void setMinPotionHeal(Double minPotionHeal) {
        this.minPotionHeal = minPotionHeal;
    }

    public Double getMaxPotionHeal() {
        return maxPotionHeal;
    }

    public void setMaxPotionHeal(Double maxPotionHeal) {
        this.maxPotionHeal = maxPotionHeal;
    }

    public Double getMinBannerOvershield() {
        return minBannerOvershield;
    }

    public void setMinBannerOvershield(Double minBannerOvershield) {
        this.minBannerOvershield = minBannerOvershield;
    }

    public Double getMaxBannerOvershield() {
        return maxBannerOvershield;
    }

    public void setMaxBannerOvershield(Double maxBannerOvershield) {
        this.maxBannerOvershield = maxBannerOvershield;
    }

    public Long getPowerDrain() {
        return powerDrain;
    }

    public void setPowerDrain(Long powerDrain) {
        this.powerDrain = powerDrain;
    }

    public Long getItemStrengthIndex() {
        return itemStrengthIndex;
    }

    public void setItemStrengthIndex(Long itemStrengthIndex) {
        this.itemStrengthIndex = itemStrengthIndex;
    }

    public Double getCoreAttributeMin() {
        return coreAttributeMin;
    }

    public void setCoreAttributeMin(Double coreAttributeMin) {
        this.coreAttributeMin = coreAttributeMin;
    }

    public Double getCoreAttributeMax() {
        return coreAttributeMax;
    }

    public void setCoreAttributeMax(Double coreAttributeMax) {
        this.coreAttributeMax = coreAttributeMax;
    }

    public Double getCoreAttributePercentMin() {
        return coreAttributePercentMin;
    }

    public void setCoreAttributePercentMin(Double coreAttributePercentMin) {
        this.coreAttributePercentMin = coreAttributePercentMin;
    }

    public Double getCoreAttributePercentMax() {
        return coreAttributePercentMax;
    }

    public void setCoreAttributePercentMax(Double coreAttributePercentMax) {
        this.coreAttributePercentMax = coreAttributePercentMax;
    }

    public Double getDefensePercentMin() {
        return defensePercentMin;
    }

    public void setDefensePercentMin(Double defensePercentMin) {
        this.defensePercentMin = defensePercentMin;
    }

    public Double getDefensePercentMax() {
        return defensePercentMax;
    }

    public void setDefensePercentMax(Double defensePercentMax) {
        this.defensePercentMax = defensePercentMax;
    }

    public Double getReverseScalingMin() {
        return reverseScalingMin;
    }

    public void setReverseScalingMin(Double reverseScalingMin) {
        this.reverseScalingMin = reverseScalingMin;
    }

    public Double getReverseScalingMax() {
        return reverseScalingMax;
    }

    public void setReverseScalingMax(Double reverseScalingMax) {
        this.reverseScalingMax = reverseScalingMax;
    }

    public Double getNonScalingMin() {
        return nonScalingMin;
    }

    public void setNonScalingMin(Double nonScalingMin) {
        this.nonScalingMin = nonScalingMin;
    }

    public Double getNonScalingMax() {
        return nonScalingMax;
    }

    public void setNonScalingMax(Double nonScalingMax) {
        this.nonScalingMax = nonScalingMax;
    }

    public Double getPlayerPowerMin() {
        return playerPowerMin;
    }

    public void setPlayerPowerMin(Double playerPowerMin) {
        this.playerPowerMin = playerPowerMin;
    }

    public Double getPlayerPowerMax() {
        return playerPowerMax;
    }

    public void setPlayerPowerMax(Double playerPowerMax) {
        this.playerPowerMax = playerPowerMax;
    }

    public Double getPlayerHealthMin() {
        return playerHealthMin;
    }

    public void setPlayerHealthMin(Double playerHealthMin) {
        this.playerHealthMin = playerHealthMin;
    }

    public Double getPlayerHealthMax() {
        return playerHealthMax;
    }

    public void setPlayerHealthMax(Double playerHealthMax) {
        this.playerHealthMax = playerHealthMax;
    }

    public Double getAttributeNoVarianceMin() {
        return attributeNoVarianceMin;
    }

    public void setAttributeNoVarianceMin(Double attributeNoVarianceMin) {
        this.attributeNoVarianceMin = attributeNoVarianceMin;
    }

    public Double getAttributeNoVarianceMax() {
        return attributeNoVarianceMax;
    }

    public void setAttributeNoVarianceMax(Double attributeNoVarianceMax) {
        this.attributeNoVarianceMax = attributeNoVarianceMax;
    }

    public Double getHealthToDamageMin() {
        return healthToDamageMin;
    }

    public void setHealthToDamageMin(Double healthToDamageMin) {
        this.healthToDamageMin = healthToDamageMin;
    }

    public Double getHealthToDamageMax() {
        return healthToDamageMax;
    }

    public void setHealthToDamageMax(Double healthToDamageMax) {
        this.healthToDamageMax = healthToDamageMax;
    }

    public Double getNonScalingVarianceMin() {
        return nonScalingVarianceMin;
    }

    public void setNonScalingVarianceMin(Double nonScalingVarianceMin) {
        this.nonScalingVarianceMin = nonScalingVarianceMin;
    }

    public Double getNonScalingVarianceMax() {
        return nonScalingVarianceMax;
    }

    public void setNonScalingVarianceMax(Double nonScalingVarianceMax) {
        this.nonScalingVarianceMax = nonScalingVarianceMax;
    }

    public Double getNoVarianceCoreAttributePercentMin() {
        return noVarianceCoreAttributePercentMin;
    }

    public void setNoVarianceCoreAttributePercentMin(Double noVarianceCoreAttributePercentMin) {
        this.noVarianceCoreAttributePercentMin = noVarianceCoreAttributePercentMin;
    }

    public Double getNoVarianceCoreAttributePercentMax() {
        return noVarianceCoreAttributePercentMax;
    }

    public void setNoVarianceCoreAttributePercentMax(Double noVarianceCoreAttributePercentMax) {
        this.noVarianceCoreAttributePercentMax = noVarianceCoreAttributePercentMax;
    }

    public Double getNoVarianceDefensePercentMin() {
        return noVarianceDefensePercentMin;
    }

    public void setNoVarianceDefensePercentMin(Double noVarianceDefensePercentMin) {
        this.noVarianceDefensePercentMin = noVarianceDefensePercentMin;
    }

    public Double getNoVarianceDefensePercentMax() {
        return noVarianceDefensePercentMax;
    }

    public void setNoVarianceDefensePercentMax(Double noVarianceDefensePercentMax) {
        this.noVarianceDefensePercentMax = noVarianceDefensePercentMax;
    }

    public Double getNoVariancePlayerPowerMin() {
        return noVariancePlayerPowerMin;
    }

    public void setNoVariancePlayerPowerMin(Double noVariancePlayerPowerMin) {
        this.noVariancePlayerPowerMin = noVariancePlayerPowerMin;
    }

    public Double getNoVariancePlayerPowerMax() {
        return noVariancePlayerPowerMax;
    }

    public void setNoVariancePlayerPowerMax(Double noVariancePlayerPowerMax) {
        this.noVariancePlayerPowerMax = noVariancePlayerPowerMax;
    }

    public Double getNoVariancePlayerHealthMin() {
        return noVariancePlayerHealthMin;
    }

    public void setNoVariancePlayerHealthMin(Double noVariancePlayerHealthMin) {
        this.noVariancePlayerHealthMin = noVariancePlayerHealthMin;
    }

    public Double getNoVariancePlayerHealthMax() {
        return noVariancePlayerHealthMax;
    }

    public void setNoVariancePlayerHealthMax(Double noVariancePlayerHealthMax) {
        this.noVariancePlayerHealthMax = noVariancePlayerHealthMax;
    }

    public Double getNoVarianceHealthToDamageMin() {
        return noVarianceHealthToDamageMin;
    }

    public void setNoVarianceHealthToDamageMin(Double noVarianceHealthToDamageMin) {
        this.noVarianceHealthToDamageMin = noVarianceHealthToDamageMin;
    }

    public Double getNoVarianceHealthToDamageMax() {
        return noVarianceHealthToDamageMax;
    }

    public void setNoVarianceHealthToDamageMax(Double noVarianceHealthToDamageMax) {
        this.noVarianceHealthToDamageMax = noVarianceHealthToDamageMax;
    }
}
