package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class ItemScalingCollection {
    private long tierIdentifier;
    private long rarityIdentifier;
    private long playerTierRequirement;
    private double minWeaponDamage;
    private double maxWeaponDamage;
    private double minPotionHeal;
    private double maxPotionHeal;
    private double minBannerOvershield;
    private double maxBannerOvershield;
    private long powerDrain;
    private long itemStrengthIndex;
    private AttributeNoVariance coreAttribute;
    private AttributeNoVariance coreAttributePercent;
    private AttributeNoVariance defensePercent;
    private AttributeNoVariance reverseScaling;
    private AttributeNoVariance nonScaling;
    private AttributeNoVariance playerPower;
    private AttributeNoVariance playerHealth;
    private AttributeNoVariance attributeNoVariance;
    private AttributeNoVariance healthToDamage;
    private AttributeNoVariance nonScalingVariance;
    private AttributeNoVariance noVarianceCoreAttributePercent;
    private AttributeNoVariance noVarianceDefensePercent;
    private AttributeNoVariance noVariancePlayerPower;
    private AttributeNoVariance noVariancePlayerHealth;
    private AttributeNoVariance noVarianceHealthToDamage;

    @JsonProperty("tierIdentifier")
    public long getTierIdentifier() { return tierIdentifier; }
    @JsonProperty("tierIdentifier")
    public void setTierIdentifier(long value) { this.tierIdentifier = value; }

    @JsonProperty("rarityIdentifier")
    public long getRarityIdentifier() { return rarityIdentifier; }
    @JsonProperty("rarityIdentifier")
    public void setRarityIdentifier(long value) { this.rarityIdentifier = value; }

    @JsonProperty("playerTierRequirement")
    public long getPlayerTierRequirement() { return playerTierRequirement; }
    @JsonProperty("playerTierRequirement")
    public void setPlayerTierRequirement(long value) { this.playerTierRequirement = value; }

    @JsonProperty("minWeaponDamage")
    public double getMinWeaponDamage() { return minWeaponDamage; }
    @JsonProperty("minWeaponDamage")
    public void setMinWeaponDamage(double value) { this.minWeaponDamage = value; }

    @JsonProperty("maxWeaponDamage")
    public double getMaxWeaponDamage() { return maxWeaponDamage; }
    @JsonProperty("maxWeaponDamage")
    public void setMaxWeaponDamage(double value) { this.maxWeaponDamage = value; }

    @JsonProperty("minPotionHeal")
    public double getMinPotionHeal() { return minPotionHeal; }
    @JsonProperty("minPotionHeal")
    public void setMinPotionHeal(double value) { this.minPotionHeal = value; }

    @JsonProperty("maxPotionHeal")
    public double getMaxPotionHeal() { return maxPotionHeal; }
    @JsonProperty("maxPotionHeal")
    public void setMaxPotionHeal(double value) { this.maxPotionHeal = value; }

    @JsonProperty("minBannerOvershield")
    public double getMinBannerOvershield() { return minBannerOvershield; }
    @JsonProperty("minBannerOvershield")
    public void setMinBannerOvershield(double value) { this.minBannerOvershield = value; }

    @JsonProperty("maxBannerOvershield")
    public double getMaxBannerOvershield() { return maxBannerOvershield; }
    @JsonProperty("maxBannerOvershield")
    public void setMaxBannerOvershield(double value) { this.maxBannerOvershield = value; }

    @JsonProperty("powerDrain")
    public long getPowerDrain() { return powerDrain; }
    @JsonProperty("powerDrain")
    public void setPowerDrain(long value) { this.powerDrain = value; }

    @JsonProperty("itemStrengthIndex")
    public long getItemStrengthIndex() { return itemStrengthIndex; }
    @JsonProperty("itemStrengthIndex")
    public void setItemStrengthIndex(long value) { this.itemStrengthIndex = value; }

    @JsonProperty("coreAttribute")
    public AttributeNoVariance getCoreAttribute() { return coreAttribute; }
    @JsonProperty("coreAttribute")
    public void setCoreAttribute(AttributeNoVariance value) { this.coreAttribute = value; }

    @JsonProperty("coreAttributePercent")
    public AttributeNoVariance getCoreAttributePercent() { return coreAttributePercent; }
    @JsonProperty("coreAttributePercent")
    public void setCoreAttributePercent(AttributeNoVariance value) { this.coreAttributePercent = value; }

    @JsonProperty("defensePercent")
    public AttributeNoVariance getDefensePercent() { return defensePercent; }
    @JsonProperty("defensePercent")
    public void setDefensePercent(AttributeNoVariance value) { this.defensePercent = value; }

    @JsonProperty("reverseScaling")
    public AttributeNoVariance getReverseScaling() { return reverseScaling; }
    @JsonProperty("reverseScaling")
    public void setReverseScaling(AttributeNoVariance value) { this.reverseScaling = value; }

    @JsonProperty("nonScaling")
    public AttributeNoVariance getNonScaling() { return nonScaling; }
    @JsonProperty("nonScaling")
    public void setNonScaling(AttributeNoVariance value) { this.nonScaling = value; }

    @JsonProperty("playerPower")
    public AttributeNoVariance getPlayerPower() { return playerPower; }
    @JsonProperty("playerPower")
    public void setPlayerPower(AttributeNoVariance value) { this.playerPower = value; }

    @JsonProperty("playerHealth")
    public AttributeNoVariance getPlayerHealth() { return playerHealth; }
    @JsonProperty("playerHealth")
    public void setPlayerHealth(AttributeNoVariance value) { this.playerHealth = value; }

    @JsonProperty("attributeNoVariance")
    public AttributeNoVariance getAttributeNoVariance() { return attributeNoVariance; }
    @JsonProperty("attributeNoVariance")
    public void setAttributeNoVariance(AttributeNoVariance value) { this.attributeNoVariance = value; }

    @JsonProperty("healthToDamage")
    public AttributeNoVariance getHealthToDamage() { return healthToDamage; }
    @JsonProperty("healthToDamage")
    public void setHealthToDamage(AttributeNoVariance value) { this.healthToDamage = value; }

    @JsonProperty("nonScalingVariance")
    public AttributeNoVariance getNonScalingVariance() { return nonScalingVariance; }
    @JsonProperty("nonScalingVariance")
    public void setNonScalingVariance(AttributeNoVariance value) { this.nonScalingVariance = value; }

    @JsonProperty("noVarianceCoreAttributePercent")
    public AttributeNoVariance getNoVarianceCoreAttributePercent() { return noVarianceCoreAttributePercent; }
    @JsonProperty("noVarianceCoreAttributePercent")
    public void setNoVarianceCoreAttributePercent(AttributeNoVariance value) { this.noVarianceCoreAttributePercent = value; }

    @JsonProperty("noVarianceDefensePercent")
    public AttributeNoVariance getNoVarianceDefensePercent() { return noVarianceDefensePercent; }
    @JsonProperty("noVarianceDefensePercent")
    public void setNoVarianceDefensePercent(AttributeNoVariance value) { this.noVarianceDefensePercent = value; }

    @JsonProperty("noVariancePlayerPower")
    public AttributeNoVariance getNoVariancePlayerPower() { return noVariancePlayerPower; }
    @JsonProperty("noVariancePlayerPower")
    public void setNoVariancePlayerPower(AttributeNoVariance value) { this.noVariancePlayerPower = value; }

    @JsonProperty("noVariancePlayerHealth")
    public AttributeNoVariance getNoVariancePlayerHealth() { return noVariancePlayerHealth; }
    @JsonProperty("noVariancePlayerHealth")
    public void setNoVariancePlayerHealth(AttributeNoVariance value) { this.noVariancePlayerHealth = value; }

    @JsonProperty("noVarianceHealthToDamage")
    public AttributeNoVariance getNoVarianceHealthToDamage() { return noVarianceHealthToDamage; }
    @JsonProperty("noVarianceHealthToDamage")
    public void setNoVarianceHealthToDamage(AttributeNoVariance value) { this.noVarianceHealthToDamage = value; }
}
