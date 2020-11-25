package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class GlobalParameters {
    private double lootTierBonusScalar;
    private long shieldBaseDamage;
    private long shieldBaseCooldown;
    private long archonModeBaseDamage;
    private long baseValorplateHealth;
    private long activityMaxNumDeaths;
    private double spiritArchonDamageMultiplier;
    private double spiritBombDamageMultiplier;
    private double lowTierMissionXPPenalty;
    private long lootComboChargePerAetherium;
    private String starterWeaponMain;
    private String starterWeaponOffhand;
    private long weaponMasteryXPBaseAmount;
    private long randomNumberExponent;
    private long ailmentHealthRegenDelay;
    private double ailmentHealthRegenRate;
    private long baseTakedownHeal;
    private long spiritTakedownHealMultiplier;
    private long baseTakedownArchonCharge;
    private long experienceInclusionRadius;
    private long archonExplosionDamage;
    private long archonExplosionBreachPower;
    private long archonExplosionImpactDisplacement;
    private double physicalResistanceMax;
    private double fireResistanceMax;
    private double waterResistanceMax;
    private double airResistanceMax;
    private double earthResistanceMax;
    private double voidResistanceMax;
    private double physicalResistancePostModifierMax;
    private double fireResistancePostModifierMax;
    private double waterResistancePostModifierMax;
    private double airResistancePostModifierMax;
    private double earthResistancePostModifierMax;
    private double voidResistancePostModifierMax;
    private Type mainQuestType;
    private String playerBaseMapIdentifier;
    private String ftueProgressionFlagID;
    private String progressionFlagRequiredForAchievements;
    private String progressionFlagRequiredForPersonalMenu;
    private String progressionFlagRequiredForCodexEntries;
    private String progressionFlagRequiredForDreamstoneMode;
    private long towerOfTrialsEndgameStartingFloor;
    private long defaultDifficultyIdentifier;
    private double maxExpPenaltyScalar;
    private long baseWeaponDamage;
    private double mightWeaponDamageMultiplier;
    private double spiritWeaponDamageMultiplier;
    private long vitalityHealthMultiplier;
    private double spiritSpectralDamageMultiplier;
    private long potionBaseHealAmount;
    private double spiritPotionHealScalar;
    private long potionBaseCharges;
    private long potionBaseHealDuration;
    private long potionBaseSecondaryTraitDuration;
    private long minCriticalHitChance;
    private long maxCriticalHitChance;
    private double defaultCriticalHitChance;
    private long minCriticalHitMultiplier;
    private double defaultCriticalHitMultiplier;
    private long aetheriumArchonBaseChargeAmount;
    private long aetheriumPotionRefillChargeAmount;
    private long aetheriumPotionChargesGained;
    private long aetheriumSpectralCooldownReduction;
    private long bannerBaseCooldown;
    private long bannerBaseDuration;
    private long bannerBaseRadius;
    private double bannerSpiritOvershieldScalar;
    private long bombBaseDamage;
    private long bombBaseCooldown;
    private long bombBaseRadius;
    private long bombBaseBreachDamage;
    private long overshieldDegenDelay;
    private long overshieldDegenRate;
    private long damageReductionBuffProductMin;
    private long damageDebuffProductMin;
    private double archonChargeBaseChargePerSecond;
    private double archonDrainPerAttack;
    private long baseTakedownDamage;
    private double spiritTakedownDamageMultiplier;
    private long baseDrainDamage;
    private double vitalityDrainDamageMultiplier;
    private long polarityShockwaveBaseDamage;
    private double spiritPolarityShockwaveDamageMultiplier;
    private long ascendedItemInitialUpgradeRank;
    private long ascendedItemImprovedTraitTierOffset;
    private long ascendedItemMinRarityIdentifier;
    private long maxCoopAdjustedLootTier;
    private List<String> credits;

    @JsonProperty("lootTierBonusScalar")
    public double getLootTierBonusScalar() { return lootTierBonusScalar; }
    @JsonProperty("lootTierBonusScalar")
    public void setLootTierBonusScalar(double value) { this.lootTierBonusScalar = value; }

    @JsonProperty("shieldBaseDamage")
    public long getShieldBaseDamage() { return shieldBaseDamage; }
    @JsonProperty("shieldBaseDamage")
    public void setShieldBaseDamage(long value) { this.shieldBaseDamage = value; }

    @JsonProperty("shieldBaseCooldown")
    public long getShieldBaseCooldown() { return shieldBaseCooldown; }
    @JsonProperty("shieldBaseCooldown")
    public void setShieldBaseCooldown(long value) { this.shieldBaseCooldown = value; }

    @JsonProperty("archonModeBaseDamage")
    public long getArchonModeBaseDamage() { return archonModeBaseDamage; }
    @JsonProperty("archonModeBaseDamage")
    public void setArchonModeBaseDamage(long value) { this.archonModeBaseDamage = value; }

    @JsonProperty("baseValorplateHealth")
    public long getBaseValorplateHealth() { return baseValorplateHealth; }
    @JsonProperty("baseValorplateHealth")
    public void setBaseValorplateHealth(long value) { this.baseValorplateHealth = value; }

    @JsonProperty("activityMaxNumDeaths")
    public long getActivityMaxNumDeaths() { return activityMaxNumDeaths; }
    @JsonProperty("activityMaxNumDeaths")
    public void setActivityMaxNumDeaths(long value) { this.activityMaxNumDeaths = value; }

    @JsonProperty("spiritArchonDamageMultiplier")
    public double getSpiritArchonDamageMultiplier() { return spiritArchonDamageMultiplier; }
    @JsonProperty("spiritArchonDamageMultiplier")
    public void setSpiritArchonDamageMultiplier(double value) { this.spiritArchonDamageMultiplier = value; }

    @JsonProperty("spiritBombDamageMultiplier")
    public double getSpiritBombDamageMultiplier() { return spiritBombDamageMultiplier; }
    @JsonProperty("spiritBombDamageMultiplier")
    public void setSpiritBombDamageMultiplier(double value) { this.spiritBombDamageMultiplier = value; }

    @JsonProperty("lowTierMissionXpPenalty")
    public double getLowTierMissionXPPenalty() { return lowTierMissionXPPenalty; }
    @JsonProperty("lowTierMissionXpPenalty")
    public void setLowTierMissionXPPenalty(double value) { this.lowTierMissionXPPenalty = value; }

    @JsonProperty("lootComboChargePerAetherium")
    public long getLootComboChargePerAetherium() { return lootComboChargePerAetherium; }
    @JsonProperty("lootComboChargePerAetherium")
    public void setLootComboChargePerAetherium(long value) { this.lootComboChargePerAetherium = value; }

    @JsonProperty("starterWeaponMain")
    public String getStarterWeaponMain() { return starterWeaponMain; }
    @JsonProperty("starterWeaponMain")
    public void setStarterWeaponMain(String value) { this.starterWeaponMain = value; }

    @JsonProperty("starterWeaponOffhand")
    public String getStarterWeaponOffhand() { return starterWeaponOffhand; }
    @JsonProperty("starterWeaponOffhand")
    public void setStarterWeaponOffhand(String value) { this.starterWeaponOffhand = value; }

    @JsonProperty("weaponMasteryXpBaseAmount")
    public long getWeaponMasteryXPBaseAmount() { return weaponMasteryXPBaseAmount; }
    @JsonProperty("weaponMasteryXpBaseAmount")
    public void setWeaponMasteryXPBaseAmount(long value) { this.weaponMasteryXPBaseAmount = value; }

    @JsonProperty("randomNumberExponent")
    public long getRandomNumberExponent() { return randomNumberExponent; }
    @JsonProperty("randomNumberExponent")
    public void setRandomNumberExponent(long value) { this.randomNumberExponent = value; }

    @JsonProperty("ailmentHealthRegenDelay")
    public long getAilmentHealthRegenDelay() { return ailmentHealthRegenDelay; }
    @JsonProperty("ailmentHealthRegenDelay")
    public void setAilmentHealthRegenDelay(long value) { this.ailmentHealthRegenDelay = value; }

    @JsonProperty("ailmentHealthRegenRate")
    public double getAilmentHealthRegenRate() { return ailmentHealthRegenRate; }
    @JsonProperty("ailmentHealthRegenRate")
    public void setAilmentHealthRegenRate(double value) { this.ailmentHealthRegenRate = value; }

    @JsonProperty("baseTakedownHeal")
    public long getBaseTakedownHeal() { return baseTakedownHeal; }
    @JsonProperty("baseTakedownHeal")
    public void setBaseTakedownHeal(long value) { this.baseTakedownHeal = value; }

    @JsonProperty("spiritTakedownHealMultiplier")
    public long getSpiritTakedownHealMultiplier() { return spiritTakedownHealMultiplier; }
    @JsonProperty("spiritTakedownHealMultiplier")
    public void setSpiritTakedownHealMultiplier(long value) { this.spiritTakedownHealMultiplier = value; }

    @JsonProperty("baseTakedownArchonCharge")
    public long getBaseTakedownArchonCharge() { return baseTakedownArchonCharge; }
    @JsonProperty("baseTakedownArchonCharge")
    public void setBaseTakedownArchonCharge(long value) { this.baseTakedownArchonCharge = value; }

    @JsonProperty("experienceInclusionRadius")
    public long getExperienceInclusionRadius() { return experienceInclusionRadius; }
    @JsonProperty("experienceInclusionRadius")
    public void setExperienceInclusionRadius(long value) { this.experienceInclusionRadius = value; }

    @JsonProperty("archonExplosionDamage")
    public long getArchonExplosionDamage() { return archonExplosionDamage; }
    @JsonProperty("archonExplosionDamage")
    public void setArchonExplosionDamage(long value) { this.archonExplosionDamage = value; }

    @JsonProperty("archonExplosionBreachPower")
    public long getArchonExplosionBreachPower() { return archonExplosionBreachPower; }
    @JsonProperty("archonExplosionBreachPower")
    public void setArchonExplosionBreachPower(long value) { this.archonExplosionBreachPower = value; }

    @JsonProperty("archonExplosionImpactDisplacement")
    public long getArchonExplosionImpactDisplacement() { return archonExplosionImpactDisplacement; }
    @JsonProperty("archonExplosionImpactDisplacement")
    public void setArchonExplosionImpactDisplacement(long value) { this.archonExplosionImpactDisplacement = value; }

    @JsonProperty("physicalResistanceMax")
    public double getPhysicalResistanceMax() { return physicalResistanceMax; }
    @JsonProperty("physicalResistanceMax")
    public void setPhysicalResistanceMax(double value) { this.physicalResistanceMax = value; }

    @JsonProperty("fireResistanceMax")
    public double getFireResistanceMax() { return fireResistanceMax; }
    @JsonProperty("fireResistanceMax")
    public void setFireResistanceMax(double value) { this.fireResistanceMax = value; }

    @JsonProperty("waterResistanceMax")
    public double getWaterResistanceMax() { return waterResistanceMax; }
    @JsonProperty("waterResistanceMax")
    public void setWaterResistanceMax(double value) { this.waterResistanceMax = value; }

    @JsonProperty("airResistanceMax")
    public double getAirResistanceMax() { return airResistanceMax; }
    @JsonProperty("airResistanceMax")
    public void setAirResistanceMax(double value) { this.airResistanceMax = value; }

    @JsonProperty("earthResistanceMax")
    public double getEarthResistanceMax() { return earthResistanceMax; }
    @JsonProperty("earthResistanceMax")
    public void setEarthResistanceMax(double value) { this.earthResistanceMax = value; }

    @JsonProperty("voidResistanceMax")
    public double getVoidResistanceMax() { return voidResistanceMax; }
    @JsonProperty("voidResistanceMax")
    public void setVoidResistanceMax(double value) { this.voidResistanceMax = value; }

    @JsonProperty("physicalResistancePostModifierMax")
    public double getPhysicalResistancePostModifierMax() { return physicalResistancePostModifierMax; }
    @JsonProperty("physicalResistancePostModifierMax")
    public void setPhysicalResistancePostModifierMax(double value) { this.physicalResistancePostModifierMax = value; }

    @JsonProperty("fireResistancePostModifierMax")
    public double getFireResistancePostModifierMax() { return fireResistancePostModifierMax; }
    @JsonProperty("fireResistancePostModifierMax")
    public void setFireResistancePostModifierMax(double value) { this.fireResistancePostModifierMax = value; }

    @JsonProperty("waterResistancePostModifierMax")
    public double getWaterResistancePostModifierMax() { return waterResistancePostModifierMax; }
    @JsonProperty("waterResistancePostModifierMax")
    public void setWaterResistancePostModifierMax(double value) { this.waterResistancePostModifierMax = value; }

    @JsonProperty("airResistancePostModifierMax")
    public double getAirResistancePostModifierMax() { return airResistancePostModifierMax; }
    @JsonProperty("airResistancePostModifierMax")
    public void setAirResistancePostModifierMax(double value) { this.airResistancePostModifierMax = value; }

    @JsonProperty("earthResistancePostModifierMax")
    public double getEarthResistancePostModifierMax() { return earthResistancePostModifierMax; }
    @JsonProperty("earthResistancePostModifierMax")
    public void setEarthResistancePostModifierMax(double value) { this.earthResistancePostModifierMax = value; }

    @JsonProperty("voidResistancePostModifierMax")
    public double getVoidResistancePostModifierMax() { return voidResistancePostModifierMax; }
    @JsonProperty("voidResistancePostModifierMax")
    public void setVoidResistancePostModifierMax(double value) { this.voidResistancePostModifierMax = value; }

    @JsonProperty("mainQuestType")
    public Type getMainQuestType() { return mainQuestType; }
    @JsonProperty("mainQuestType")
    public void setMainQuestType(Type value) { this.mainQuestType = value; }

    @JsonProperty("playerBaseMapIdentifier")
    public String getPlayerBaseMapIdentifier() { return playerBaseMapIdentifier; }
    @JsonProperty("playerBaseMapIdentifier")
    public void setPlayerBaseMapIdentifier(String value) { this.playerBaseMapIdentifier = value; }

    @JsonProperty("ftueProgressionFlagId")
    public String getFtueProgressionFlagID() { return ftueProgressionFlagID; }
    @JsonProperty("ftueProgressionFlagId")
    public void setFtueProgressionFlagID(String value) { this.ftueProgressionFlagID = value; }

    @JsonProperty("progressionFlagRequiredForAchievements")
    public String getProgressionFlagRequiredForAchievements() { return progressionFlagRequiredForAchievements; }
    @JsonProperty("progressionFlagRequiredForAchievements")
    public void setProgressionFlagRequiredForAchievements(String value) { this.progressionFlagRequiredForAchievements = value; }

    @JsonProperty("progressionFlagRequiredForPersonalMenu")
    public String getProgressionFlagRequiredForPersonalMenu() { return progressionFlagRequiredForPersonalMenu; }
    @JsonProperty("progressionFlagRequiredForPersonalMenu")
    public void setProgressionFlagRequiredForPersonalMenu(String value) { this.progressionFlagRequiredForPersonalMenu = value; }

    @JsonProperty("progressionFlagRequiredForCodexEntries")
    public String getProgressionFlagRequiredForCodexEntries() { return progressionFlagRequiredForCodexEntries; }
    @JsonProperty("progressionFlagRequiredForCodexEntries")
    public void setProgressionFlagRequiredForCodexEntries(String value) { this.progressionFlagRequiredForCodexEntries = value; }

    @JsonProperty("progressionFlagRequiredForDreamstoneMode")
    public String getProgressionFlagRequiredForDreamstoneMode() { return progressionFlagRequiredForDreamstoneMode; }
    @JsonProperty("progressionFlagRequiredForDreamstoneMode")
    public void setProgressionFlagRequiredForDreamstoneMode(String value) { this.progressionFlagRequiredForDreamstoneMode = value; }

    @JsonProperty("towerOfTrialsEndgameStartingFloor")
    public long getTowerOfTrialsEndgameStartingFloor() { return towerOfTrialsEndgameStartingFloor; }
    @JsonProperty("towerOfTrialsEndgameStartingFloor")
    public void setTowerOfTrialsEndgameStartingFloor(long value) { this.towerOfTrialsEndgameStartingFloor = value; }

    @JsonProperty("defaultDifficultyIdentifier")
    public long getDefaultDifficultyIdentifier() { return defaultDifficultyIdentifier; }
    @JsonProperty("defaultDifficultyIdentifier")
    public void setDefaultDifficultyIdentifier(long value) { this.defaultDifficultyIdentifier = value; }

    @JsonProperty("maxExpPenaltyScalar")
    public double getMaxExpPenaltyScalar() { return maxExpPenaltyScalar; }
    @JsonProperty("maxExpPenaltyScalar")
    public void setMaxExpPenaltyScalar(double value) { this.maxExpPenaltyScalar = value; }

    @JsonProperty("baseWeaponDamage")
    public long getBaseWeaponDamage() { return baseWeaponDamage; }
    @JsonProperty("baseWeaponDamage")
    public void setBaseWeaponDamage(long value) { this.baseWeaponDamage = value; }

    @JsonProperty("mightWeaponDamageMultiplier")
    public double getMightWeaponDamageMultiplier() { return mightWeaponDamageMultiplier; }
    @JsonProperty("mightWeaponDamageMultiplier")
    public void setMightWeaponDamageMultiplier(double value) { this.mightWeaponDamageMultiplier = value; }

    @JsonProperty("spiritWeaponDamageMultiplier")
    public double getSpiritWeaponDamageMultiplier() { return spiritWeaponDamageMultiplier; }
    @JsonProperty("spiritWeaponDamageMultiplier")
    public void setSpiritWeaponDamageMultiplier(double value) { this.spiritWeaponDamageMultiplier = value; }

    @JsonProperty("vitalityHealthMultiplier")
    public long getVitalityHealthMultiplier() { return vitalityHealthMultiplier; }
    @JsonProperty("vitalityHealthMultiplier")
    public void setVitalityHealthMultiplier(long value) { this.vitalityHealthMultiplier = value; }

    @JsonProperty("spiritSpectralDamageMultiplier")
    public double getSpiritSpectralDamageMultiplier() { return spiritSpectralDamageMultiplier; }
    @JsonProperty("spiritSpectralDamageMultiplier")
    public void setSpiritSpectralDamageMultiplier(double value) { this.spiritSpectralDamageMultiplier = value; }

    @JsonProperty("potionBaseHealAmount")
    public long getPotionBaseHealAmount() { return potionBaseHealAmount; }
    @JsonProperty("potionBaseHealAmount")
    public void setPotionBaseHealAmount(long value) { this.potionBaseHealAmount = value; }

    @JsonProperty("spiritPotionHealScalar")
    public double getSpiritPotionHealScalar() { return spiritPotionHealScalar; }
    @JsonProperty("spiritPotionHealScalar")
    public void setSpiritPotionHealScalar(double value) { this.spiritPotionHealScalar = value; }

    @JsonProperty("potionBaseCharges")
    public long getPotionBaseCharges() { return potionBaseCharges; }
    @JsonProperty("potionBaseCharges")
    public void setPotionBaseCharges(long value) { this.potionBaseCharges = value; }

    @JsonProperty("potionBaseHealDuration")
    public long getPotionBaseHealDuration() { return potionBaseHealDuration; }
    @JsonProperty("potionBaseHealDuration")
    public void setPotionBaseHealDuration(long value) { this.potionBaseHealDuration = value; }

    @JsonProperty("potionBaseSecondaryTraitDuration")
    public long getPotionBaseSecondaryTraitDuration() { return potionBaseSecondaryTraitDuration; }
    @JsonProperty("potionBaseSecondaryTraitDuration")
    public void setPotionBaseSecondaryTraitDuration(long value) { this.potionBaseSecondaryTraitDuration = value; }

    @JsonProperty("minCriticalHitChance")
    public long getMinCriticalHitChance() { return minCriticalHitChance; }
    @JsonProperty("minCriticalHitChance")
    public void setMinCriticalHitChance(long value) { this.minCriticalHitChance = value; }

    @JsonProperty("maxCriticalHitChance")
    public long getMaxCriticalHitChance() { return maxCriticalHitChance; }
    @JsonProperty("maxCriticalHitChance")
    public void setMaxCriticalHitChance(long value) { this.maxCriticalHitChance = value; }

    @JsonProperty("defaultCriticalHitChance")
    public double getDefaultCriticalHitChance() { return defaultCriticalHitChance; }
    @JsonProperty("defaultCriticalHitChance")
    public void setDefaultCriticalHitChance(double value) { this.defaultCriticalHitChance = value; }

    @JsonProperty("minCriticalHitMultiplier")
    public long getMinCriticalHitMultiplier() { return minCriticalHitMultiplier; }
    @JsonProperty("minCriticalHitMultiplier")
    public void setMinCriticalHitMultiplier(long value) { this.minCriticalHitMultiplier = value; }

    @JsonProperty("defaultCriticalHitMultiplier")
    public double getDefaultCriticalHitMultiplier() { return defaultCriticalHitMultiplier; }
    @JsonProperty("defaultCriticalHitMultiplier")
    public void setDefaultCriticalHitMultiplier(double value) { this.defaultCriticalHitMultiplier = value; }

    @JsonProperty("aetheriumArchonBaseChargeAmount")
    public long getAetheriumArchonBaseChargeAmount() { return aetheriumArchonBaseChargeAmount; }
    @JsonProperty("aetheriumArchonBaseChargeAmount")
    public void setAetheriumArchonBaseChargeAmount(long value) { this.aetheriumArchonBaseChargeAmount = value; }

    @JsonProperty("aetheriumPotionRefillChargeAmount")
    public long getAetheriumPotionRefillChargeAmount() { return aetheriumPotionRefillChargeAmount; }
    @JsonProperty("aetheriumPotionRefillChargeAmount")
    public void setAetheriumPotionRefillChargeAmount(long value) { this.aetheriumPotionRefillChargeAmount = value; }

    @JsonProperty("aetheriumPotionChargesGained")
    public long getAetheriumPotionChargesGained() { return aetheriumPotionChargesGained; }
    @JsonProperty("aetheriumPotionChargesGained")
    public void setAetheriumPotionChargesGained(long value) { this.aetheriumPotionChargesGained = value; }

    @JsonProperty("aetheriumSpectralCooldownReduction")
    public long getAetheriumSpectralCooldownReduction() { return aetheriumSpectralCooldownReduction; }
    @JsonProperty("aetheriumSpectralCooldownReduction")
    public void setAetheriumSpectralCooldownReduction(long value) { this.aetheriumSpectralCooldownReduction = value; }

    @JsonProperty("bannerBaseCooldown")
    public long getBannerBaseCooldown() { return bannerBaseCooldown; }
    @JsonProperty("bannerBaseCooldown")
    public void setBannerBaseCooldown(long value) { this.bannerBaseCooldown = value; }

    @JsonProperty("bannerBaseDuration")
    public long getBannerBaseDuration() { return bannerBaseDuration; }
    @JsonProperty("bannerBaseDuration")
    public void setBannerBaseDuration(long value) { this.bannerBaseDuration = value; }

    @JsonProperty("bannerBaseRadius")
    public long getBannerBaseRadius() { return bannerBaseRadius; }
    @JsonProperty("bannerBaseRadius")
    public void setBannerBaseRadius(long value) { this.bannerBaseRadius = value; }

    @JsonProperty("bannerSpiritOvershieldScalar")
    public double getBannerSpiritOvershieldScalar() { return bannerSpiritOvershieldScalar; }
    @JsonProperty("bannerSpiritOvershieldScalar")
    public void setBannerSpiritOvershieldScalar(double value) { this.bannerSpiritOvershieldScalar = value; }

    @JsonProperty("bombBaseDamage")
    public long getBombBaseDamage() { return bombBaseDamage; }
    @JsonProperty("bombBaseDamage")
    public void setBombBaseDamage(long value) { this.bombBaseDamage = value; }

    @JsonProperty("bombBaseCooldown")
    public long getBombBaseCooldown() { return bombBaseCooldown; }
    @JsonProperty("bombBaseCooldown")
    public void setBombBaseCooldown(long value) { this.bombBaseCooldown = value; }

    @JsonProperty("bombBaseRadius")
    public long getBombBaseRadius() { return bombBaseRadius; }
    @JsonProperty("bombBaseRadius")
    public void setBombBaseRadius(long value) { this.bombBaseRadius = value; }

    @JsonProperty("bombBaseBreachDamage")
    public long getBombBaseBreachDamage() { return bombBaseBreachDamage; }
    @JsonProperty("bombBaseBreachDamage")
    public void setBombBaseBreachDamage(long value) { this.bombBaseBreachDamage = value; }

    @JsonProperty("overshieldDegenDelay")
    public long getOvershieldDegenDelay() { return overshieldDegenDelay; }
    @JsonProperty("overshieldDegenDelay")
    public void setOvershieldDegenDelay(long value) { this.overshieldDegenDelay = value; }

    @JsonProperty("overshieldDegenRate")
    public long getOvershieldDegenRate() { return overshieldDegenRate; }
    @JsonProperty("overshieldDegenRate")
    public void setOvershieldDegenRate(long value) { this.overshieldDegenRate = value; }

    @JsonProperty("damageReductionBuffProductMin")
    public long getDamageReductionBuffProductMin() { return damageReductionBuffProductMin; }
    @JsonProperty("damageReductionBuffProductMin")
    public void setDamageReductionBuffProductMin(long value) { this.damageReductionBuffProductMin = value; }

    @JsonProperty("damageDebuffProductMin")
    public long getDamageDebuffProductMin() { return damageDebuffProductMin; }
    @JsonProperty("damageDebuffProductMin")
    public void setDamageDebuffProductMin(long value) { this.damageDebuffProductMin = value; }

    @JsonProperty("archonChargeBaseChargePerSecond")
    public double getArchonChargeBaseChargePerSecond() { return archonChargeBaseChargePerSecond; }
    @JsonProperty("archonChargeBaseChargePerSecond")
    public void setArchonChargeBaseChargePerSecond(double value) { this.archonChargeBaseChargePerSecond = value; }

    @JsonProperty("archonDrainPerAttack")
    public double getArchonDrainPerAttack() { return archonDrainPerAttack; }
    @JsonProperty("archonDrainPerAttack")
    public void setArchonDrainPerAttack(double value) { this.archonDrainPerAttack = value; }

    @JsonProperty("baseTakedownDamage")
    public long getBaseTakedownDamage() { return baseTakedownDamage; }
    @JsonProperty("baseTakedownDamage")
    public void setBaseTakedownDamage(long value) { this.baseTakedownDamage = value; }

    @JsonProperty("spiritTakedownDamageMultiplier")
    public double getSpiritTakedownDamageMultiplier() { return spiritTakedownDamageMultiplier; }
    @JsonProperty("spiritTakedownDamageMultiplier")
    public void setSpiritTakedownDamageMultiplier(double value) { this.spiritTakedownDamageMultiplier = value; }

    @JsonProperty("baseDrainDamage")
    public long getBaseDrainDamage() { return baseDrainDamage; }
    @JsonProperty("baseDrainDamage")
    public void setBaseDrainDamage(long value) { this.baseDrainDamage = value; }

    @JsonProperty("vitalityDrainDamageMultiplier")
    public double getVitalityDrainDamageMultiplier() { return vitalityDrainDamageMultiplier; }
    @JsonProperty("vitalityDrainDamageMultiplier")
    public void setVitalityDrainDamageMultiplier(double value) { this.vitalityDrainDamageMultiplier = value; }

    @JsonProperty("polarityShockwaveBaseDamage")
    public long getPolarityShockwaveBaseDamage() { return polarityShockwaveBaseDamage; }
    @JsonProperty("polarityShockwaveBaseDamage")
    public void setPolarityShockwaveBaseDamage(long value) { this.polarityShockwaveBaseDamage = value; }

    @JsonProperty("spiritPolarityShockwaveDamageMultiplier")
    public double getSpiritPolarityShockwaveDamageMultiplier() { return spiritPolarityShockwaveDamageMultiplier; }
    @JsonProperty("spiritPolarityShockwaveDamageMultiplier")
    public void setSpiritPolarityShockwaveDamageMultiplier(double value) { this.spiritPolarityShockwaveDamageMultiplier = value; }

    @JsonProperty("ascendedItemInitialUpgradeRank")
    public long getAscendedItemInitialUpgradeRank() { return ascendedItemInitialUpgradeRank; }
    @JsonProperty("ascendedItemInitialUpgradeRank")
    public void setAscendedItemInitialUpgradeRank(long value) { this.ascendedItemInitialUpgradeRank = value; }

    @JsonProperty("ascendedItemImprovedTraitTierOffset")
    public long getAscendedItemImprovedTraitTierOffset() { return ascendedItemImprovedTraitTierOffset; }
    @JsonProperty("ascendedItemImprovedTraitTierOffset")
    public void setAscendedItemImprovedTraitTierOffset(long value) { this.ascendedItemImprovedTraitTierOffset = value; }

    @JsonProperty("ascendedItemMinRarityIdentifier")
    public long getAscendedItemMinRarityIdentifier() { return ascendedItemMinRarityIdentifier; }
    @JsonProperty("ascendedItemMinRarityIdentifier")
    public void setAscendedItemMinRarityIdentifier(long value) { this.ascendedItemMinRarityIdentifier = value; }

    @JsonProperty("maxCoopAdjustedLootTier")
    public long getMaxCoopAdjustedLootTier() { return maxCoopAdjustedLootTier; }
    @JsonProperty("maxCoopAdjustedLootTier")
    public void setMaxCoopAdjustedLootTier(long value) { this.maxCoopAdjustedLootTier = value; }

    @JsonProperty("credits")
    public List<String> getCredits() { return credits; }
    @JsonProperty("credits")
    public void setCredits(List<String> value) { this.credits = value; }
}
