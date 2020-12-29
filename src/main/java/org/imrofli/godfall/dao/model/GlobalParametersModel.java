package org.imrofli.godfall.dao.model;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

@Entity
public class GlobalParametersModel extends AbstractEntity {

    private Double lootTierBonusScalar;
    private Double shieldBaseDamage;
    private Double shieldBaseCooldown;
    private Double archonModeBaseDamage;
    private Double baseValorplateHealth;
    private Double activityMaxNumDeaths;
    private Double spiritArchonDamageMultiplier;
    private Double spiritBombDamageMultiplier;
    private Double lowTierMissionXpPenalty;
    private Double lootComboChargePerAetherium;
    private String starterWeaponMain;
    private String starterWeaponOffhand;
    private Double weaponMasteryXpBaseAmount;
    private Double randomNumberExponent;
    private Double ailmentHealthRegenDelay;
    private Double ailmentHealthRegenRate;
    private Double baseTakedownHeal;
    private Double spiritTakedownHealMultiplier;
    private Double baseTakedownArchonCharge;
    private Double experienceInclusionRadius;
    private Double archonExplosionDamage;
    private Double archonExplosionBreachPower;
    private Double archonExplosionImpactDisplacement;
    private Double physicalResistanceMax;
    private Double fireResistanceMax;
    private Double waterResistanceMax;
    private Double airResistanceMax;
    private Double earthResistanceMax;
    private Double voidResistanceMax;
    private Double physicalResistancePostModifierMax;
    private Double fireResistancePostModifierMax;
    private Double waterResistancePostModifierMax;
    private Double airResistancePostModifierMax;
    private Double earthResistancePostModifierMax;
    private Double voidResistancePostModifierMax;
    private String mainQuestType;
    private String playerBaseMapIdentifier;
    private String ftueProgressionFlagId;
    private String progressionFlagRequiredForAchievements;
    private String progressionFlagRequiredForPersonalMenu;
    private String progressionFlagRequiredForCodexEntries;
    private String progressionFlagRequiredForDreamstoneMode;
    private Double towerOfTrialsEndgameStartingFloor;
    private Double defaultDifficultyIdentifier;
    private Double maxExpPenaltyScalar;
    private Double baseWeaponDamage;
    private Double mightWeaponDamageMultiplier;
    private Double spiritWeaponDamageMultiplier;
    private Double vitalityHealthMultiplier;
    private Double spiritSpectralDamageMultiplier;
    private Double potionBaseHealAmount;
    private Double spiritPotionHealScalar;
    private Double potionBaseCharges;
    private Double potionBaseHealDuration;
    private Double potionBaseSecondaryTraitDuration;
    private Double minCriticalHitChance;
    private Double maxCriticalHitChance;
    private Double defaultCriticalHitChance;
    private Double minCriticalHitMultiplier;
    private Double defaultCriticalHitMultiplier;
    private Double aetheriumArchonBaseChargeAmount;
    private Double aetheriumPotionRefillChargeAmount;
    private Double aetheriumPotionChargesGained;
    private Double aetheriumSpectralCooldownReduction;
    private Double bannerBaseCooldown;
    private Double bannerBaseDuration;
    private Double bannerBaseRadius;
    private Double bannerSpiritOvershieldScalar;
    private Double bombBaseDamage;
    private Double bombBaseCooldown;
    private Double bombBaseRadius;
    private Double bombBaseBreachDamage;
    private Double overshieldDegenDelay;
    private Double overshieldDegenRate;
    private Double damageReductionBuffProductMin;
    private Double damageDebuffProductMin;
    private Double archonChargeBaseChargePerSecond;
    private Double archonDrainPerAttack;
    private Double baseTakedownDamage;
    private Double spiritTakedownDamageMultiplier;
    private Double baseDrainDamage;
    private Double vitalityDrainDamageMultiplier;
    private Double polarityShockwaveBaseDamage;
    private Double spiritPolarityShockwaveDamageMultiplier;
    private Long ascendedItemInitialUpgradeRank;
    private Double ascendedItemImprovedTraitTierOffset;
    @Enumerated(EnumType.STRING)
    private RarityModel ascendedItemMinRarityIdentifier;
    private Double maxCoopAdjustedLootTier;

    @ManyToOne
    private VersionModel version;

    public Double getLootTierBonusScalar() {
        return lootTierBonusScalar;
    }

    public void setLootTierBonusScalar(Double lootTierBonusScalar) {
        this.lootTierBonusScalar = lootTierBonusScalar;
    }

    public Double getShieldBaseDamage() {
        return shieldBaseDamage;
    }

    public void setShieldBaseDamage(Double shieldBaseDamage) {
        this.shieldBaseDamage = shieldBaseDamage;
    }

    public Double getShieldBaseCooldown() {
        return shieldBaseCooldown;
    }

    public void setShieldBaseCooldown(Double shieldBaseCooldown) {
        this.shieldBaseCooldown = shieldBaseCooldown;
    }

    public Double getArchonModeBaseDamage() {
        return archonModeBaseDamage;
    }

    public void setArchonModeBaseDamage(Double archonModeBaseDamage) {
        this.archonModeBaseDamage = archonModeBaseDamage;
    }

    public Double getBaseValorplateHealth() {
        return baseValorplateHealth;
    }

    public void setBaseValorplateHealth(Double baseValorplateHealth) {
        this.baseValorplateHealth = baseValorplateHealth;
    }

    public Double getActivityMaxNumDeaths() {
        return activityMaxNumDeaths;
    }

    public void setActivityMaxNumDeaths(Double activityMaxNumDeaths) {
        this.activityMaxNumDeaths = activityMaxNumDeaths;
    }

    public Double getSpiritArchonDamageMultiplier() {
        return spiritArchonDamageMultiplier;
    }

    public void setSpiritArchonDamageMultiplier(Double spiritArchonDamageMultiplier) {
        this.spiritArchonDamageMultiplier = spiritArchonDamageMultiplier;
    }

    public Double getSpiritBombDamageMultiplier() {
        return spiritBombDamageMultiplier;
    }

    public void setSpiritBombDamageMultiplier(Double spiritBombDamageMultiplier) {
        this.spiritBombDamageMultiplier = spiritBombDamageMultiplier;
    }

    public Double getLowTierMissionXpPenalty() {
        return lowTierMissionXpPenalty;
    }

    public void setLowTierMissionXpPenalty(Double lowTierMissionXpPenalty) {
        this.lowTierMissionXpPenalty = lowTierMissionXpPenalty;
    }

    public Double getLootComboChargePerAetherium() {
        return lootComboChargePerAetherium;
    }

    public void setLootComboChargePerAetherium(Double lootComboChargePerAetherium) {
        this.lootComboChargePerAetherium = lootComboChargePerAetherium;
    }

    public String getStarterWeaponMain() {
        return starterWeaponMain;
    }

    public void setStarterWeaponMain(String starterWeaponMain) {
        this.starterWeaponMain = starterWeaponMain;
    }

    public String getStarterWeaponOffhand() {
        return starterWeaponOffhand;
    }

    public void setStarterWeaponOffhand(String starterWeaponOffhand) {
        this.starterWeaponOffhand = starterWeaponOffhand;
    }

    public Double getWeaponMasteryXpBaseAmount() {
        return weaponMasteryXpBaseAmount;
    }

    public void setWeaponMasteryXpBaseAmount(Double weaponMasteryXpBaseAmount) {
        this.weaponMasteryXpBaseAmount = weaponMasteryXpBaseAmount;
    }

    public Double getRandomNumberExponent() {
        return randomNumberExponent;
    }

    public void setRandomNumberExponent(Double randomNumberExponent) {
        this.randomNumberExponent = randomNumberExponent;
    }

    public Double getAilmentHealthRegenDelay() {
        return ailmentHealthRegenDelay;
    }

    public void setAilmentHealthRegenDelay(Double ailmentHealthRegenDelay) {
        this.ailmentHealthRegenDelay = ailmentHealthRegenDelay;
    }

    public Double getAilmentHealthRegenRate() {
        return ailmentHealthRegenRate;
    }

    public void setAilmentHealthRegenRate(Double ailmentHealthRegenRate) {
        this.ailmentHealthRegenRate = ailmentHealthRegenRate;
    }

    public Double getBaseTakedownHeal() {
        return baseTakedownHeal;
    }

    public void setBaseTakedownHeal(Double baseTakedownHeal) {
        this.baseTakedownHeal = baseTakedownHeal;
    }

    public Double getSpiritTakedownHealMultiplier() {
        return spiritTakedownHealMultiplier;
    }

    public void setSpiritTakedownHealMultiplier(Double spiritTakedownHealMultiplier) {
        this.spiritTakedownHealMultiplier = spiritTakedownHealMultiplier;
    }

    public Double getBaseTakedownArchonCharge() {
        return baseTakedownArchonCharge;
    }

    public void setBaseTakedownArchonCharge(Double baseTakedownArchonCharge) {
        this.baseTakedownArchonCharge = baseTakedownArchonCharge;
    }

    public Double getExperienceInclusionRadius() {
        return experienceInclusionRadius;
    }

    public void setExperienceInclusionRadius(Double experienceInclusionRadius) {
        this.experienceInclusionRadius = experienceInclusionRadius;
    }

    public Double getArchonExplosionDamage() {
        return archonExplosionDamage;
    }

    public void setArchonExplosionDamage(Double archonExplosionDamage) {
        this.archonExplosionDamage = archonExplosionDamage;
    }

    public Double getArchonExplosionBreachPower() {
        return archonExplosionBreachPower;
    }

    public void setArchonExplosionBreachPower(Double archonExplosionBreachPower) {
        this.archonExplosionBreachPower = archonExplosionBreachPower;
    }

    public Double getArchonExplosionImpactDisplacement() {
        return archonExplosionImpactDisplacement;
    }

    public void setArchonExplosionImpactDisplacement(Double archonExplosionImpactDisplacement) {
        this.archonExplosionImpactDisplacement = archonExplosionImpactDisplacement;
    }

    public Double getPhysicalResistanceMax() {
        return physicalResistanceMax;
    }

    public void setPhysicalResistanceMax(Double physicalResistanceMax) {
        this.physicalResistanceMax = physicalResistanceMax;
    }

    public Double getFireResistanceMax() {
        return fireResistanceMax;
    }

    public void setFireResistanceMax(Double fireResistanceMax) {
        this.fireResistanceMax = fireResistanceMax;
    }

    public Double getWaterResistanceMax() {
        return waterResistanceMax;
    }

    public void setWaterResistanceMax(Double waterResistanceMax) {
        this.waterResistanceMax = waterResistanceMax;
    }

    public Double getAirResistanceMax() {
        return airResistanceMax;
    }

    public void setAirResistanceMax(Double airResistanceMax) {
        this.airResistanceMax = airResistanceMax;
    }

    public Double getEarthResistanceMax() {
        return earthResistanceMax;
    }

    public void setEarthResistanceMax(Double earthResistanceMax) {
        this.earthResistanceMax = earthResistanceMax;
    }

    public Double getVoidResistanceMax() {
        return voidResistanceMax;
    }

    public void setVoidResistanceMax(Double voidResistanceMax) {
        this.voidResistanceMax = voidResistanceMax;
    }

    public Double getPhysicalResistancePostModifierMax() {
        return physicalResistancePostModifierMax;
    }

    public void setPhysicalResistancePostModifierMax(Double physicalResistancePostModifierMax) {
        this.physicalResistancePostModifierMax = physicalResistancePostModifierMax;
    }

    public Double getFireResistancePostModifierMax() {
        return fireResistancePostModifierMax;
    }

    public void setFireResistancePostModifierMax(Double fireResistancePostModifierMax) {
        this.fireResistancePostModifierMax = fireResistancePostModifierMax;
    }

    public Double getWaterResistancePostModifierMax() {
        return waterResistancePostModifierMax;
    }

    public void setWaterResistancePostModifierMax(Double waterResistancePostModifierMax) {
        this.waterResistancePostModifierMax = waterResistancePostModifierMax;
    }

    public Double getAirResistancePostModifierMax() {
        return airResistancePostModifierMax;
    }

    public void setAirResistancePostModifierMax(Double airResistancePostModifierMax) {
        this.airResistancePostModifierMax = airResistancePostModifierMax;
    }

    public Double getEarthResistancePostModifierMax() {
        return earthResistancePostModifierMax;
    }

    public void setEarthResistancePostModifierMax(Double earthResistancePostModifierMax) {
        this.earthResistancePostModifierMax = earthResistancePostModifierMax;
    }

    public Double getVoidResistancePostModifierMax() {
        return voidResistancePostModifierMax;
    }

    public void setVoidResistancePostModifierMax(Double voidResistancePostModifierMax) {
        this.voidResistancePostModifierMax = voidResistancePostModifierMax;
    }

    public String getMainQuestType() {
        return mainQuestType;
    }

    public void setMainQuestType(String mainQuestType) {
        this.mainQuestType = mainQuestType;
    }

    public String getPlayerBaseMapIdentifier() {
        return playerBaseMapIdentifier;
    }

    public void setPlayerBaseMapIdentifier(String playerBaseMapIdentifier) {
        this.playerBaseMapIdentifier = playerBaseMapIdentifier;
    }

    public String getFtueProgressionFlagId() {
        return ftueProgressionFlagId;
    }

    public void setFtueProgressionFlagId(String ftueProgressionFlagId) {
        this.ftueProgressionFlagId = ftueProgressionFlagId;
    }

    public String getProgressionFlagRequiredForAchievements() {
        return progressionFlagRequiredForAchievements;
    }

    public void setProgressionFlagRequiredForAchievements(String progressionFlagRequiredForAchievements) {
        this.progressionFlagRequiredForAchievements = progressionFlagRequiredForAchievements;
    }

    public String getProgressionFlagRequiredForPersonalMenu() {
        return progressionFlagRequiredForPersonalMenu;
    }

    public void setProgressionFlagRequiredForPersonalMenu(String progressionFlagRequiredForPersonalMenu) {
        this.progressionFlagRequiredForPersonalMenu = progressionFlagRequiredForPersonalMenu;
    }

    public String getProgressionFlagRequiredForCodexEntries() {
        return progressionFlagRequiredForCodexEntries;
    }

    public void setProgressionFlagRequiredForCodexEntries(String progressionFlagRequiredForCodexEntries) {
        this.progressionFlagRequiredForCodexEntries = progressionFlagRequiredForCodexEntries;
    }

    public String getProgressionFlagRequiredForDreamstoneMode() {
        return progressionFlagRequiredForDreamstoneMode;
    }

    public void setProgressionFlagRequiredForDreamstoneMode(String progressionFlagRequiredForDreamstoneMode) {
        this.progressionFlagRequiredForDreamstoneMode = progressionFlagRequiredForDreamstoneMode;
    }

    public Double getTowerOfTrialsEndgameStartingFloor() {
        return towerOfTrialsEndgameStartingFloor;
    }

    public void setTowerOfTrialsEndgameStartingFloor(Double towerOfTrialsEndgameStartingFloor) {
        this.towerOfTrialsEndgameStartingFloor = towerOfTrialsEndgameStartingFloor;
    }

    public Double getDefaultDifficultyIdentifier() {
        return defaultDifficultyIdentifier;
    }

    public void setDefaultDifficultyIdentifier(Double defaultDifficultyIdentifier) {
        this.defaultDifficultyIdentifier = defaultDifficultyIdentifier;
    }

    public Double getMaxExpPenaltyScalar() {
        return maxExpPenaltyScalar;
    }

    public void setMaxExpPenaltyScalar(Double maxExpPenaltyScalar) {
        this.maxExpPenaltyScalar = maxExpPenaltyScalar;
    }

    public Double getBaseWeaponDamage() {
        return baseWeaponDamage;
    }

    public void setBaseWeaponDamage(Double baseWeaponDamage) {
        this.baseWeaponDamage = baseWeaponDamage;
    }

    public Double getMightWeaponDamageMultiplier() {
        return mightWeaponDamageMultiplier;
    }

    public void setMightWeaponDamageMultiplier(Double mightWeaponDamageMultiplier) {
        this.mightWeaponDamageMultiplier = mightWeaponDamageMultiplier;
    }

    public Double getSpiritWeaponDamageMultiplier() {
        return spiritWeaponDamageMultiplier;
    }

    public void setSpiritWeaponDamageMultiplier(Double spiritWeaponDamageMultiplier) {
        this.spiritWeaponDamageMultiplier = spiritWeaponDamageMultiplier;
    }

    public Double getVitalityHealthMultiplier() {
        return vitalityHealthMultiplier;
    }

    public void setVitalityHealthMultiplier(Double vitalityHealthMultiplier) {
        this.vitalityHealthMultiplier = vitalityHealthMultiplier;
    }

    public Double getSpiritSpectralDamageMultiplier() {
        return spiritSpectralDamageMultiplier;
    }

    public void setSpiritSpectralDamageMultiplier(Double spiritSpectralDamageMultiplier) {
        this.spiritSpectralDamageMultiplier = spiritSpectralDamageMultiplier;
    }

    public Double getPotionBaseHealAmount() {
        return potionBaseHealAmount;
    }

    public void setPotionBaseHealAmount(Double potionBaseHealAmount) {
        this.potionBaseHealAmount = potionBaseHealAmount;
    }

    public Double getSpiritPotionHealScalar() {
        return spiritPotionHealScalar;
    }

    public void setSpiritPotionHealScalar(Double spiritPotionHealScalar) {
        this.spiritPotionHealScalar = spiritPotionHealScalar;
    }

    public Double getPotionBaseCharges() {
        return potionBaseCharges;
    }

    public void setPotionBaseCharges(Double potionBaseCharges) {
        this.potionBaseCharges = potionBaseCharges;
    }

    public Double getPotionBaseHealDuration() {
        return potionBaseHealDuration;
    }

    public void setPotionBaseHealDuration(Double potionBaseHealDuration) {
        this.potionBaseHealDuration = potionBaseHealDuration;
    }

    public Double getPotionBaseSecondaryTraitDuration() {
        return potionBaseSecondaryTraitDuration;
    }

    public void setPotionBaseSecondaryTraitDuration(Double potionBaseSecondaryTraitDuration) {
        this.potionBaseSecondaryTraitDuration = potionBaseSecondaryTraitDuration;
    }

    public Double getMinCriticalHitChance() {
        return minCriticalHitChance;
    }

    public void setMinCriticalHitChance(Double minCriticalHitChance) {
        this.minCriticalHitChance = minCriticalHitChance;
    }

    public Double getMaxCriticalHitChance() {
        return maxCriticalHitChance;
    }

    public void setMaxCriticalHitChance(Double maxCriticalHitChance) {
        this.maxCriticalHitChance = maxCriticalHitChance;
    }

    public Double getDefaultCriticalHitChance() {
        return defaultCriticalHitChance;
    }

    public void setDefaultCriticalHitChance(Double defaultCriticalHitChance) {
        this.defaultCriticalHitChance = defaultCriticalHitChance;
    }

    public Double getMinCriticalHitMultiplier() {
        return minCriticalHitMultiplier;
    }

    public void setMinCriticalHitMultiplier(Double minCriticalHitMultiplier) {
        this.minCriticalHitMultiplier = minCriticalHitMultiplier;
    }

    public Double getDefaultCriticalHitMultiplier() {
        return defaultCriticalHitMultiplier;
    }

    public void setDefaultCriticalHitMultiplier(Double defaultCriticalHitMultiplier) {
        this.defaultCriticalHitMultiplier = defaultCriticalHitMultiplier;
    }

    public Double getAetheriumArchonBaseChargeAmount() {
        return aetheriumArchonBaseChargeAmount;
    }

    public void setAetheriumArchonBaseChargeAmount(Double aetheriumArchonBaseChargeAmount) {
        this.aetheriumArchonBaseChargeAmount = aetheriumArchonBaseChargeAmount;
    }

    public Double getAetheriumPotionRefillChargeAmount() {
        return aetheriumPotionRefillChargeAmount;
    }

    public void setAetheriumPotionRefillChargeAmount(Double aetheriumPotionRefillChargeAmount) {
        this.aetheriumPotionRefillChargeAmount = aetheriumPotionRefillChargeAmount;
    }

    public Double getAetheriumPotionChargesGained() {
        return aetheriumPotionChargesGained;
    }

    public void setAetheriumPotionChargesGained(Double aetheriumPotionChargesGained) {
        this.aetheriumPotionChargesGained = aetheriumPotionChargesGained;
    }

    public Double getAetheriumSpectralCooldownReduction() {
        return aetheriumSpectralCooldownReduction;
    }

    public void setAetheriumSpectralCooldownReduction(Double aetheriumSpectralCooldownReduction) {
        this.aetheriumSpectralCooldownReduction = aetheriumSpectralCooldownReduction;
    }

    public Double getBannerBaseCooldown() {
        return bannerBaseCooldown;
    }

    public void setBannerBaseCooldown(Double bannerBaseCooldown) {
        this.bannerBaseCooldown = bannerBaseCooldown;
    }

    public Double getBannerBaseDuration() {
        return bannerBaseDuration;
    }

    public void setBannerBaseDuration(Double bannerBaseDuration) {
        this.bannerBaseDuration = bannerBaseDuration;
    }

    public Double getBannerBaseRadius() {
        return bannerBaseRadius;
    }

    public void setBannerBaseRadius(Double bannerBaseRadius) {
        this.bannerBaseRadius = bannerBaseRadius;
    }

    public Double getBannerSpiritOvershieldScalar() {
        return bannerSpiritOvershieldScalar;
    }

    public void setBannerSpiritOvershieldScalar(Double bannerSpiritOvershieldScalar) {
        this.bannerSpiritOvershieldScalar = bannerSpiritOvershieldScalar;
    }

    public Double getBombBaseDamage() {
        return bombBaseDamage;
    }

    public void setBombBaseDamage(Double bombBaseDamage) {
        this.bombBaseDamage = bombBaseDamage;
    }

    public Double getBombBaseCooldown() {
        return bombBaseCooldown;
    }

    public void setBombBaseCooldown(Double bombBaseCooldown) {
        this.bombBaseCooldown = bombBaseCooldown;
    }

    public Double getBombBaseRadius() {
        return bombBaseRadius;
    }

    public void setBombBaseRadius(Double bombBaseRadius) {
        this.bombBaseRadius = bombBaseRadius;
    }

    public Double getBombBaseBreachDamage() {
        return bombBaseBreachDamage;
    }

    public void setBombBaseBreachDamage(Double bombBaseBreachDamage) {
        this.bombBaseBreachDamage = bombBaseBreachDamage;
    }

    public Double getOvershieldDegenDelay() {
        return overshieldDegenDelay;
    }

    public void setOvershieldDegenDelay(Double overshieldDegenDelay) {
        this.overshieldDegenDelay = overshieldDegenDelay;
    }

    public Double getOvershieldDegenRate() {
        return overshieldDegenRate;
    }

    public void setOvershieldDegenRate(Double overshieldDegenRate) {
        this.overshieldDegenRate = overshieldDegenRate;
    }

    public Double getDamageReductionBuffProductMin() {
        return damageReductionBuffProductMin;
    }

    public void setDamageReductionBuffProductMin(Double damageReductionBuffProductMin) {
        this.damageReductionBuffProductMin = damageReductionBuffProductMin;
    }

    public Double getDamageDebuffProductMin() {
        return damageDebuffProductMin;
    }

    public void setDamageDebuffProductMin(Double damageDebuffProductMin) {
        this.damageDebuffProductMin = damageDebuffProductMin;
    }

    public Double getArchonChargeBaseChargePerSecond() {
        return archonChargeBaseChargePerSecond;
    }

    public void setArchonChargeBaseChargePerSecond(Double archonChargeBaseChargePerSecond) {
        this.archonChargeBaseChargePerSecond = archonChargeBaseChargePerSecond;
    }

    public Double getArchonDrainPerAttack() {
        return archonDrainPerAttack;
    }

    public void setArchonDrainPerAttack(Double archonDrainPerAttack) {
        this.archonDrainPerAttack = archonDrainPerAttack;
    }

    public Double getBaseTakedownDamage() {
        return baseTakedownDamage;
    }

    public void setBaseTakedownDamage(Double baseTakedownDamage) {
        this.baseTakedownDamage = baseTakedownDamage;
    }

    public Double getSpiritTakedownDamageMultiplier() {
        return spiritTakedownDamageMultiplier;
    }

    public void setSpiritTakedownDamageMultiplier(Double spiritTakedownDamageMultiplier) {
        this.spiritTakedownDamageMultiplier = spiritTakedownDamageMultiplier;
    }

    public Double getBaseDrainDamage() {
        return baseDrainDamage;
    }

    public void setBaseDrainDamage(Double baseDrainDamage) {
        this.baseDrainDamage = baseDrainDamage;
    }

    public Double getVitalityDrainDamageMultiplier() {
        return vitalityDrainDamageMultiplier;
    }

    public void setVitalityDrainDamageMultiplier(Double vitalityDrainDamageMultiplier) {
        this.vitalityDrainDamageMultiplier = vitalityDrainDamageMultiplier;
    }

    public Double getPolarityShockwaveBaseDamage() {
        return polarityShockwaveBaseDamage;
    }

    public void setPolarityShockwaveBaseDamage(Double polarityShockwaveBaseDamage) {
        this.polarityShockwaveBaseDamage = polarityShockwaveBaseDamage;
    }

    public Double getSpiritPolarityShockwaveDamageMultiplier() {
        return spiritPolarityShockwaveDamageMultiplier;
    }

    public void setSpiritPolarityShockwaveDamageMultiplier(Double spiritPolarityShockwaveDamageMultiplier) {
        this.spiritPolarityShockwaveDamageMultiplier = spiritPolarityShockwaveDamageMultiplier;
    }

    public Long getAscendedItemInitialUpgradeRank() {
        return ascendedItemInitialUpgradeRank;
    }

    public void setAscendedItemInitialUpgradeRank(Long ascendedItemInitialUpgradeRank) {
        this.ascendedItemInitialUpgradeRank = ascendedItemInitialUpgradeRank;
    }

    public Double getAscendedItemImprovedTraitTierOffset() {
        return ascendedItemImprovedTraitTierOffset;
    }

    public void setAscendedItemImprovedTraitTierOffset(Double ascendedItemImprovedTraitTierOffset) {
        this.ascendedItemImprovedTraitTierOffset = ascendedItemImprovedTraitTierOffset;
    }

    public RarityModel getAscendedItemMinRarityIdentifier() {
        return ascendedItemMinRarityIdentifier;
    }

    public void setAscendedItemMinRarityIdentifier(RarityModel ascendedItemMinRarityIdentifier) {
        this.ascendedItemMinRarityIdentifier = ascendedItemMinRarityIdentifier;
    }

    public Double getMaxCoopAdjustedLootTier() {
        return maxCoopAdjustedLootTier;
    }

    public void setMaxCoopAdjustedLootTier(Double maxCoopAdjustedLootTier) {
        this.maxCoopAdjustedLootTier = maxCoopAdjustedLootTier;
    }

    public VersionModel getVersion() {
        return version;
    }

    public void setVersion(VersionModel version) {
        this.version = version;
    }
}
