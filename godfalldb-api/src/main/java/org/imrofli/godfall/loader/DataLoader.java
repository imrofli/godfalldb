package org.imrofli.godfall.loader;

import org.imrofli.godfall.config.GodfallDBProperties;
import org.imrofli.godfall.dao.intf.*;
import org.imrofli.godfall.dao.model.*;
import org.imrofli.godfall.data.*;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.helpers.DataHelper;
import org.imrofli.godfall.helpers.ItemHelper;
import org.imrofli.godfall.services.intf.CalculationService;
import org.imrofli.godfall.services.intf.VersionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Timestamp;
import java.time.Duration;
import java.time.Instant;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Service
public class DataLoader implements DataLoaderIntf {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataLoader.class);

    @Autowired
    private DataDao dataDao;

    @Autowired
    private WeaponDao weaponDao;

    @Autowired
    private TraitDao traitDao;

    @Autowired
    private BannerDao bannerDao;

    @Autowired
    private LifeStoneDao lifeStoneDao;

    @Autowired
    private TrinketDao trinketDao;

    @Autowired
    private AugmentDao augmentDao;

    @Autowired
    private LootInfoDao lootInfoDao;

    @Autowired
    private ScalingDao scalingDao;

    @Autowired
    private TraitSlotDao traitSlotDao;

    @Autowired
    private GlobalParameterDao globalParameterDao;

    @Autowired
    private PlayerStrengthIndexDao playerStrengthIndexDao;

    @Autowired
    private PlayerTierDao playerTierDao;

    @Autowired
    private EnemyTierDao enemyTierDao;

    @Autowired
    private EnemyClassDao enemyClassDao;

    @Autowired
    private EnemyDao enemyDao;

    @Autowired
    private CalculationService calculationService;

    @Autowired
    private ValorplateDao valorplateDao;

    @Autowired
    private SkillDao skillDao;

    @Autowired
    private VersionDao versionDao;

    @Autowired
    private VersionService versionService;

    @Autowired
    private GodfallDBProperties godfallDBProperties;


    public void loadData(File dataset) throws Exception {
        DataHelper.setDatasetPath(dataset);
        String vers = dataset.getName().replace(".json", "");
        LOGGER.info("Starting Data Ingestion");
        Instant start = Instant.now();
        try {
            loadVersion(vers);
            loadGlobalInfo();
            loadPlayerStrengthIndex();
            loadTierInfo();
            loadPlayerTiers();
            loadEnemyTiers();
            loadEnemyClasses();
            loadEnemies();
            loadTraits();
            loadTraitSlots();
            loadLootInfo();
            loadValorPlates();
            loadWeapons();
            loadBanners();
            loadLifeStones();
            loadTrinkets();
            loadAugments();
            loadSkills();
            moveInputFile(dataset);
            Instant stop = Instant.now();
            LOGGER.info("Data Ingestion done in {}", Duration.between(start, stop));
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
        }

    }


    private void loadVersion(String version) throws ServiceCallException {
        LOGGER.info("Loading Version");
        Instant start = Instant.now();
        Set<VersionModel> versionModelSet = versionDao.findAllByVersionOrderByTime(version);
        if (versionModelSet != null && !versionModelSet.isEmpty()) {
            throw new ServiceCallException("Version " + version + " has already been loaded!");
        }
        VersionModel vs = new VersionModel();
        vs.setLoadTime(Timestamp.from(start));
        vs.setVersion(version);
        versionDao.save(vs);
        Instant stop = Instant.now();
        LOGGER.info("Loaded Version in {}", Duration.between(start, stop));
    }

    private void loadGlobalInfo() {
        LOGGER.info("Loading GlobalParameters");
        Instant start = Instant.now();
        VersionModel version = null;
        try {
            version = versionService.getLatestVersionModel();
        } catch (ServiceCallException e) {
            e.printStackTrace();
        }
        LOGGER.info("version {}", version.getVersion());
        GlobalParametersModel globalParameters = new GlobalParametersModel();
        globalParameters.setVersion(version);
        org.imrofli.godfall.data.GlobalParameters entry = dataDao.getMainData().getGlobalParameters();
        globalParameters.setLootTierBonusScalar(entry.getLootTierBonusScalar());
        globalParameters.setShieldBaseDamage(Double.valueOf(entry.getShieldBaseDamage()));
        globalParameters.setShieldBaseCooldown(Double.valueOf(entry.getShieldBaseCooldown()));
        globalParameters.setArchonModeBaseDamage(Double.valueOf(entry.getArchonModeBaseDamage()));
        globalParameters.setBaseValorplateHealth(Double.valueOf(entry.getBaseValorplateHealth()));
        globalParameters.setActivityMaxNumDeaths(Double.valueOf(entry.getActivityMaxNumDeaths()));
        globalParameters.setSpiritArchonDamageMultiplier(entry.getSpiritArchonDamageMultiplier());
        globalParameters.setSpiritBombDamageMultiplier(entry.getSpiritBombDamageMultiplier());
        globalParameters.setLowTierMissionXpPenalty(entry.getLowTierMissionXPPenalty());
        globalParameters.setLootComboChargePerAetherium(Double.valueOf(entry.getLootComboChargePerAetherium()));
        globalParameters.setStarterWeaponMain(entry.getStarterWeaponMain());
        globalParameters.setStarterWeaponOffhand(entry.getStarterWeaponOffhand());
        globalParameters.setWeaponMasteryXpBaseAmount(Double.valueOf(entry.getWeaponMasteryXPBaseAmount()));
        globalParameters.setRandomNumberExponent(Double.valueOf(entry.getRandomNumberExponent()));
        globalParameters.setAilmentHealthRegenDelay(Double.valueOf(entry.getAilmentHealthRegenDelay()));
        globalParameters.setAilmentHealthRegenRate(entry.getAilmentHealthRegenRate());
        globalParameters.setBaseTakedownHeal(Double.valueOf(entry.getBaseTakedownHeal()));
        globalParameters.setSpiritTakedownHealMultiplier(Double.valueOf(entry.getSpiritTakedownHealMultiplier()));
        globalParameters.setBaseTakedownArchonCharge(Double.valueOf(entry.getBaseTakedownArchonCharge()));
        globalParameters.setExperienceInclusionRadius(Double.valueOf(entry.getExperienceInclusionRadius()));
        globalParameters.setArchonExplosionDamage(Double.valueOf(entry.getArchonExplosionDamage()));
        globalParameters.setArchonExplosionBreachPower(Double.valueOf(entry.getArchonExplosionBreachPower()));
        globalParameters.setArchonExplosionImpactDisplacement(Double.valueOf(entry.getArchonExplosionImpactDisplacement()));
        globalParameters.setPhysicalResistanceMax(entry.getPhysicalResistanceMax());
        globalParameters.setFireResistanceMax(entry.getFireResistanceMax());
        globalParameters.setWaterResistanceMax(entry.getWaterResistanceMax());
        globalParameters.setAirResistanceMax(entry.getAirResistanceMax());
        globalParameters.setEarthResistanceMax(entry.getEarthResistanceMax());
        globalParameters.setVoidResistanceMax(entry.getVoidResistanceMax());
        globalParameters.setPhysicalResistancePostModifierMax(entry.getPhysicalResistancePostModifierMax());
        globalParameters.setFireResistancePostModifierMax(entry.getFireResistancePostModifierMax());
        globalParameters.setWaterResistancePostModifierMax(entry.getWaterResistancePostModifierMax());
        globalParameters.setAirResistancePostModifierMax(entry.getAirResistancePostModifierMax());
        globalParameters.setEarthResistancePostModifierMax(entry.getEarthResistancePostModifierMax());
        globalParameters.setVoidResistancePostModifierMax(entry.getVoidResistancePostModifierMax());
        globalParameters.setMainQuestType(entry.getMainQuestType().toValue());
        globalParameters.setPlayerBaseMapIdentifier(entry.getPlayerBaseMapIdentifier());
        globalParameters.setFtueProgressionFlagId(entry.getFtueProgressionFlagID());
        globalParameters.setProgressionFlagRequiredForAchievements(entry.getProgressionFlagRequiredForAchievements());
        globalParameters.setProgressionFlagRequiredForPersonalMenu(entry.getProgressionFlagRequiredForPersonalMenu());
        globalParameters.setProgressionFlagRequiredForCodexEntries(entry.getProgressionFlagRequiredForCodexEntries());
        globalParameters.setProgressionFlagRequiredForDreamstoneMode(entry.getProgressionFlagRequiredForDreamstoneMode());
        globalParameters.setTowerOfTrialsEndgameStartingFloor(Double.valueOf(entry.getTowerOfTrialsEndgameStartingFloor()));
        globalParameters.setDefaultDifficultyIdentifier(Double.valueOf(entry.getDefaultDifficultyIdentifier()));
        globalParameters.setMaxExpPenaltyScalar(entry.getMaxExpPenaltyScalar());
        globalParameters.setBaseWeaponDamage(Double.valueOf(entry.getBaseWeaponDamage()));
        globalParameters.setMightWeaponDamageMultiplier(entry.getMightWeaponDamageMultiplier());
        globalParameters.setSpiritWeaponDamageMultiplier(entry.getSpiritWeaponDamageMultiplier());
        globalParameters.setVitalityHealthMultiplier(Double.valueOf(entry.getVitalityHealthMultiplier()));
        globalParameters.setSpiritSpectralDamageMultiplier(entry.getSpiritSpectralDamageMultiplier());
        globalParameters.setPotionBaseHealAmount(Double.valueOf(entry.getPotionBaseHealAmount()));
        globalParameters.setSpiritPotionHealScalar(entry.getSpiritPotionHealScalar());
        globalParameters.setPotionBaseCharges(Double.valueOf(entry.getPotionBaseCharges()));
        globalParameters.setPotionBaseHealDuration(Double.valueOf(entry.getPotionBaseHealDuration()));
        globalParameters.setPotionBaseSecondaryTraitDuration(Double.valueOf(entry.getPotionBaseSecondaryTraitDuration()));
        globalParameters.setMinCriticalHitChance(Double.valueOf(entry.getMinCriticalHitChance()));
        globalParameters.setMaxCriticalHitChance(Double.valueOf(entry.getMaxCriticalHitChance()));
        globalParameters.setDefaultCriticalHitChance(entry.getDefaultCriticalHitChance());
        globalParameters.setMinCriticalHitMultiplier(Double.valueOf(entry.getMinCriticalHitMultiplier()));
        globalParameters.setDefaultCriticalHitMultiplier(entry.getDefaultCriticalHitMultiplier());
        globalParameters.setAetheriumArchonBaseChargeAmount(Double.valueOf(entry.getAetheriumArchonBaseChargeAmount()));
        globalParameters.setAetheriumPotionRefillChargeAmount(Double.valueOf(entry.getAetheriumPotionRefillChargeAmount()));
        globalParameters.setAetheriumPotionChargesGained(Double.valueOf(entry.getAetheriumPotionChargesGained()));
        globalParameters.setAetheriumSpectralCooldownReduction(Double.valueOf(entry.getAetheriumSpectralCooldownReduction()));
        globalParameters.setBannerBaseCooldown(Double.valueOf(entry.getBannerBaseCooldown()));
        globalParameters.setBannerBaseDuration(Double.valueOf(entry.getBannerBaseDuration()));
        globalParameters.setBannerBaseRadius(Double.valueOf(entry.getBannerBaseRadius()));
        globalParameters.setBannerSpiritOvershieldScalar(entry.getBannerSpiritOvershieldScalar());
        globalParameters.setBombBaseDamage(Double.valueOf(entry.getBombBaseDamage()));
        globalParameters.setBombBaseCooldown(Double.valueOf(entry.getBombBaseCooldown()));
        globalParameters.setBombBaseRadius(Double.valueOf(entry.getBombBaseRadius()));
        globalParameters.setBombBaseBreachDamage(Double.valueOf(entry.getBombBaseBreachDamage()));
        globalParameters.setOvershieldDegenDelay(Double.valueOf(entry.getOvershieldDegenDelay()));
        globalParameters.setOvershieldDegenRate(Double.valueOf(entry.getOvershieldDegenRate()));
        globalParameters.setDamageReductionBuffProductMin(Double.valueOf(entry.getDamageReductionBuffProductMin()));
        globalParameters.setDamageDebuffProductMin(Double.valueOf(entry.getDamageDebuffProductMin()));
        globalParameters.setArchonChargeBaseChargePerSecond(entry.getArchonChargeBaseChargePerSecond());
        globalParameters.setArchonDrainPerAttack(entry.getArchonDrainPerAttack());
        globalParameters.setBaseTakedownDamage(Double.valueOf(entry.getBaseTakedownDamage()));
        globalParameters.setSpiritTakedownDamageMultiplier(entry.getSpiritTakedownDamageMultiplier());
        globalParameters.setBaseDrainDamage(Double.valueOf(entry.getBaseDrainDamage()));
        globalParameters.setVitalityDrainDamageMultiplier(entry.getVitalityDrainDamageMultiplier());
        globalParameters.setPolarityShockwaveBaseDamage(Double.valueOf(entry.getPolarityShockwaveBaseDamage()));
        globalParameters.setSpiritPolarityShockwaveDamageMultiplier(entry.getSpiritPolarityShockwaveDamageMultiplier());
        globalParameters.setAscendedItemInitialUpgradeRank(entry.getAscendedItemInitialUpgradeRank());
        globalParameters.setAscendedItemImprovedTraitTierOffset(Double.valueOf(entry.getAscendedItemImprovedTraitTierOffset()));
        globalParameters.setAscendedItemMinRarityIdentifier(ItemHelper.getRarity(entry.getAscendedItemMinRarityIdentifier()));
        globalParameters.setMaxCoopAdjustedLootTier(Double.valueOf(entry.getMaxCoopAdjustedLootTier()));
        globalParameterDao.save(globalParameters);
        globalParameterDao.flush();
        Instant stop = Instant.now();
        LOGGER.info("Loaded GlobalParameters in {}", Duration.between(start, stop));

    }

    private void loadPlayerStrengthIndex() {
        LOGGER.info("Loading PlayerStrengthIndex Info");
        Instant start = Instant.now();
        VersionModel version = null;
        try {
            version = versionService.getLatestVersionModel();
        } catch (ServiceCallException e) {
            e.printStackTrace();
        }
        for (Map.Entry<String, PlayerStrengthIndexModifier> entry : dataDao.getMainData().getPlayerStrengthIndexModifiers().entrySet()) {
            PlayerStrengthIndexModel playerStrengthIndex = new PlayerStrengthIndexModel();
            playerStrengthIndex.setVersion(version);
            playerStrengthIndex.setPlayerStrengthIndex(entry.getValue().getPlayerStrengthIndex());
            playerStrengthIndex.setPowerMultiplierArchonMode(entry.getValue().getPowerMultiplierArchonMode());
            playerStrengthIndex.setPowerMultiplierDrain(entry.getValue().getPowerMultiplierDrain());
            playerStrengthIndex.setTakedownMultiplier(entry.getValue().getTakedownMultiplier());
            playerStrengthIndex.setPowerMultiplierWeaponSpectral(entry.getValue().getPowerMultiplierWeaponSpectral());
            playerStrengthIndex.setPowerMultiplierPolarityShockwave(entry.getValue().getPowerMultiplierPolarityShockwave());
            playerStrengthIndexDao.save(playerStrengthIndex);
        }
        playerStrengthIndexDao.flush();
        Instant stop = Instant.now();
        LOGGER.info("Loaded PlayerStrengthIndex in {}", Duration.between(start, stop));

    }

    private void loadPlayerTiers() {
        LOGGER.info("Loading PlayerTiers");
        Instant start = Instant.now();
        VersionModel version = null;
        try {
            version = versionService.getLatestVersionModel();
        } catch (ServiceCallException e) {
            e.printStackTrace();
        }
        for (Map.Entry<String, Map<String, Long>> entry : dataDao.getMainData().getPlayerTier().entrySet()) {
            PlayerTierModel out = new PlayerTierModel();
            out.setVersion(version);
            out.setTier(entry.getValue().get("tier"));
            out.setCoopScalingPlayerMinTier(entry.getValue().get("coopScalingPlayerMinTier"));
            out.setCoopScalingPlayerMaxTier(entry.getValue().get("coopScalingPlayerMaxTier"));
            out.setTotalXpRequired(entry.getValue().get("totalXpRequired"));
            out.setTotalSkillPoints(entry.getValue().get("totalSkillPoints"));
            out.setMight(entry.getValue().get("Might"));
            out.setVitality(entry.getValue().get("Vitality"));
            out.setSpirit(entry.getValue().get("Spirit"));
            out.setBaseHealth(entry.getValue().get("baseHealth"));
            out.setExpPenaltySafeTierDifference(entry.getValue().get("expPenaltySafeTierDifference"));
            out.setExpPenaltyMaxTierDifference(entry.getValue().get("expPenaltyMaxTierDifference"));
            out.setPowerCapacity(entry.getValue().get("powerCapacity"));
            playerTierDao.save(out);
        }
        playerTierDao.flush();
        Instant stop = Instant.now();
        LOGGER.info("Loaded PlayerTiers in {}", Duration.between(start, stop));
    }

    private void loadEnemies() {
        LOGGER.info("Loading Enemies");
        Instant start = Instant.now();
        VersionModel version = null;
        try {
            version = versionService.getLatestVersionModel();
        } catch (ServiceCallException e) {
            e.printStackTrace();
        }
        for (EnemiesCollection entry : dataDao.getMainData().getEnemies().getCollection()) {
            EnemyModel out = new EnemyModel();
            out.setVersion(version);
            out.setEnemyType(entry.getEnemyType().toValue());
            out.setName(entry.getName());
            out.setExperienceGranted(entry.getExperienceGranted());
            out.setGameplayTag(entry.getGameplayTag());
            out.setLootEventRulesType(entry.getLootEventRulesType().toValue());
            enemyDao.save(out);
        }
        enemyDao.flush();
        Instant stop = Instant.now();
        LOGGER.info("Loaded Enemies in {}", Duration.between(start, stop));
    }

    private void loadEnemyClasses() {
        LOGGER.info("Loading EnemyClasses");
        Instant start = Instant.now();
        VersionModel version = null;
        try {
            version = versionService.getLatestVersionModel();
        } catch (ServiceCallException e) {
            e.printStackTrace();
        }
        for (EnemyClassesCollection entry : dataDao.getMainData().getEnemyClasses().getCollection()) {
            EnemyClassModel out = new EnemyClassModel();
            out.setVersion(version);
            out.setName(entry.getName().toValue());
            out.setArchonChargeGainMultiplier(entry.getArchonChargeGainMultiplier());
            out.setEnemyclasslevels(ItemHelper.getEnemyClassLevels(entry.getThe2(), entry.getThe3()));
            enemyClassDao.save(out);
        }
        enemyClassDao.flush();
        Instant stop = Instant.now();
        LOGGER.info("Loaded EnemyClasses in {}", Duration.between(start, stop));
    }

    private void loadEnemyTiers() {
        LOGGER.info("Loading EnemyTiers");
        Instant start = Instant.now();
        VersionModel version = null;
        try {
            version = versionService.getLatestVersionModel();
        } catch (ServiceCallException e) {
            e.printStackTrace();
        }
        for (Map.Entry<String, EnemyTier> entry : dataDao.getMainData().getEnemyTiers().entrySet()) {
            EnemyTierModel out = new EnemyTierModel();
            out.setVersion(version);
            out.setTier(entry.getValue().getTier());
            out.setBreachHealthScalar(entry.getValue().getBreachHealthScalar());
            out.setExperienceScalar(entry.getValue().getExperienceScalar());
            out.setHealthScalar(entry.getValue().getHealthScalar());
            out.setDamageScalar(entry.getValue().getDamageScalar());
            enemyTierDao.save(out);
        }
        enemyTierDao.flush();
        Instant stop = Instant.now();
        LOGGER.info("Loaded EnemyTiers in {}", Duration.between(start, stop));
    }

    private void loadTierInfo() {
        LOGGER.info("Loading Tier Info");
        Instant start = Instant.now();
        VersionModel version = null;
        try {
            version = versionService.getLatestVersionModel();
        } catch (ServiceCallException e) {
            e.printStackTrace();
        }
        for (ItemScalingCollection tagsCollection : dataDao.getMainData().getItemScaling().getCollection()) {
            ScalingModel scaling = new ScalingModel();
            scaling.setVersion(version);
            scaling.setTierIdentifier(tagsCollection.getTierIdentifier());
            scaling.setRarity(ItemHelper.getRarity(tagsCollection.getRarityIdentifier()));
            scaling.setPlayerTierRequirement(tagsCollection.getPlayerTierRequirement());
            scaling.setMinWeaponDamage(tagsCollection.getMinWeaponDamage());
            scaling.setMaxWeaponDamage(tagsCollection.getMaxWeaponDamage());
            scaling.setMinPotionHeal(tagsCollection.getMinPotionHeal());
            scaling.setMaxPotionHeal(tagsCollection.getMaxPotionHeal());
            scaling.setMinBannerOvershield(tagsCollection.getMinBannerOvershield());
            scaling.setMaxBannerOvershield(tagsCollection.getMaxBannerOvershield());
            scaling.setPowerDrain(tagsCollection.getPowerDrain());
            scaling.setItemStrengthIndex(tagsCollection.getItemStrengthIndex());
            scaling.setCoreAttributeMax(tagsCollection.getCoreAttribute().getMax());
            scaling.setCoreAttributeMin(tagsCollection.getCoreAttribute().getMin());
            scaling.setCoreAttributePercentMax(tagsCollection.getCoreAttributePercent().getMax());
            scaling.setCoreAttributePercentMin(tagsCollection.getCoreAttributePercent().getMin());
            scaling.setDefensePercentMax(tagsCollection.getDefensePercent().getMax());
            scaling.setDefensePercentMin(tagsCollection.getDefensePercent().getMin());
            scaling.setReverseScalingMax(tagsCollection.getReverseScaling().getMax());
            scaling.setReverseScalingMin(tagsCollection.getReverseScaling().getMin());
            scaling.setNonScalingMax(tagsCollection.getNonScaling().getMax());
            scaling.setNonScalingMin(tagsCollection.getNonScaling().getMin());
            scaling.setPlayerPowerMax(tagsCollection.getPlayerPower().getMax());
            scaling.setPlayerPowerMin(tagsCollection.getPlayerPower().getMin());
            scaling.setPlayerHealthMax(tagsCollection.getPlayerHealth().getMax());
            scaling.setPlayerHealthMin(tagsCollection.getPlayerHealth().getMin());
            scaling.setAttributeNoVarianceMax(tagsCollection.getAttributeNoVariance().getMax());
            scaling.setAttributeNoVarianceMin(tagsCollection.getAttributeNoVariance().getMin());
            scaling.setHealthToDamageMax(tagsCollection.getHealthToDamage().getMax());
            scaling.setHealthToDamageMin(tagsCollection.getHealthToDamage().getMin());
            scaling.setNonScalingVarianceMax(tagsCollection.getNonScalingVariance().getMax());
            scaling.setNonScalingVarianceMin(tagsCollection.getNonScalingVariance().getMin());
            scaling.setNoVarianceCoreAttributePercentMax(tagsCollection.getNoVarianceCoreAttributePercent().getMax());
            scaling.setNoVarianceCoreAttributePercentMin(tagsCollection.getNoVarianceCoreAttributePercent().getMin());
            scaling.setNoVarianceDefensePercentMax(tagsCollection.getNoVarianceDefensePercent().getMax());
            scaling.setNoVarianceDefensePercentMin(tagsCollection.getNoVarianceDefensePercent().getMin());
            scaling.setNoVariancePlayerPowerMax(tagsCollection.getNoVariancePlayerPower().getMax());
            scaling.setNoVariancePlayerPowerMin(tagsCollection.getNoVariancePlayerPower().getMin());
            scaling.setNoVariancePlayerHealthMax(tagsCollection.getNoVariancePlayerHealth().getMax());
            scaling.setNoVariancePlayerHealthMin(tagsCollection.getNoVariancePlayerHealth().getMin());
            scaling.setNoVarianceHealthToDamageMax(tagsCollection.getNoVarianceHealthToDamage().getMax());
            scaling.setNoVarianceHealthToDamageMin(tagsCollection.getNoVarianceHealthToDamage().getMin());
            scalingDao.save(scaling);

        }
        scalingDao.flush();
        Instant stop = Instant.now();
        LOGGER.info("Loaded Tier Info in {}", Duration.between(start, stop));
    }

    private void loadLootInfo() {
        LOGGER.info("Loading Loot Info");
        Instant start = Instant.now();
        VersionModel version = null;
        try {
            version = versionService.getLatestVersionModel();
        } catch (ServiceCallException e) {
            e.printStackTrace();
        }
        for (LootItemCollection tagsCollection : dataDao.getMainData().getLootItem().getCollection()) {
            if (tagsCollection.getName() != null && tagsCollection.getGameplayTag() != null) {
                LootInfoModel lootInfo = new LootInfoModel();
                lootInfo.setVersion(version);
                lootInfo.setName(ItemHelper.formatName(tagsCollection.getName().stringValue, tagsCollection.getName().stringArrayValue));
                lootInfo.setGameplayTag(tagsCollection.getGameplayTag());
                lootInfo.setItemType(ItemHelper.getItemType(tagsCollection.getItemType().toValue()));
                lootInfo.setMinimumTier(tagsCollection.getMinTier());
                lootInfo.setMaximumTier(tagsCollection.getMaxTier());
                lootInfo.setWeight(tagsCollection.getWeight());
                lootInfo.setMinimumRarity(ItemHelper.getRarity(tagsCollection.getMinRarity()));
                lootInfo.setMaximumRarity(ItemHelper.getRarity(tagsCollection.getMaxRarity()));
                lootInfo.setPreorderDrop(false);
                lootInfo.setTowerDrop(false);
                lootInfo.setSpecificDrop(false);
                Set<String> dropTags = new HashSet<>();
                if(tagsCollection.getAllowedDropTags()!=null) {
                    for (String tags : tagsCollection.getAllowedDropTags()) {
                        if(tags.contains("ToT")){
                            lootInfo.setTowerDrop(true);
                        }
                        if(tags.contains("Deluxe")){
                            lootInfo.setPreorderDrop(true);
                        }
                        if(tags.contains("SpecificDrop")){
                            lootInfo.setSpecificDrop(true);
                        }
                        dropTags.add(tags.replace("\"", ""));
                    }
                }
                lootInfo.setDropTags(dropTags);
                lootInfoDao.save(lootInfo);
            }
        }
        lootInfoDao.flush();
        Instant stop = Instant.now();
        LOGGER.info("Loaded Loot Info in {}", Duration.between(start, stop));
    }


    private void loadTraits() {
        LOGGER.info("Loading Traits");
        Instant start = Instant.now();
        VersionModel version = null;
        try {
            version = versionService.getLatestVersionModel();
        } catch (ServiceCallException e) {
            e.printStackTrace();
        }
        for (TraitCollection tagsCollection : dataDao.getMainData().getTrait().getCollection()) {
            if (tagsCollection.getTraitName() != null && tagsCollection.getDescription() != null && tagsCollection.getGroupName() != null) {
                TraitModel trait = new TraitModel();
                trait.setVersion(version);
                trait.setName(tagsCollection.getTraitName());
                trait.setTraitGroup(tagsCollection.getGroupName());
                trait.setDescription(tagsCollection.getDescription().replaceAll("\"", ""));
                trait.setTagRequirements(ItemHelper.getTagRequirements(tagsCollection.getOngoingTagRequirements()));
                trait.setLootEffects(ItemHelper.getLootEffects(tagsCollection.getNamedLootEffects()));
                trait.setConditionalLootEffects(ItemHelper.getConditionalLootEffects(tagsCollection.getConditionalLootEffects(), dataDao.getMainData().getConditionalLootEffects().getCollection()));
                trait.setMinimumRarity(ItemHelper.getRarity(tagsCollection.getMinRarity()));
                trait.setMaximumRarity(ItemHelper.getRarity(tagsCollection.getMaxRarity()));
                trait.setMinimumTier(tagsCollection.getMinTier());
                trait.setMaximumTier(tagsCollection.getMaxTier());
                trait.setMatchModifierMagnitudes(tagsCollection.getMatchModifierMagnitudes());
                trait.setWeight(tagsCollection.getWeight());
                trait.setTraitCategory(ItemHelper.getTraitCategory(tagsCollection.getTraitName(), dataDao.getMainData().getTraitCategory().getCollection()));

                Set<String> keywords = new HashSet<>();
                if (tagsCollection.getKeywords() != null) {
                    for(String s : tagsCollection.getKeywords()){
                        if (s.startsWith("Keyword.")) {
                            String sub = s.substring("Keyword.".length());
                            keywords.add(sub);
                        } else {
                            keywords.add(s);
                        }
                    }
                }
                trait.setKeywords(keywords);
                traitDao.save(trait);
            }
        }
        traitDao.flush();
        Instant stop = Instant.now();
        LOGGER.info("Loaded Traits in {}", Duration.between(start, stop));
    }

    private void loadTraitSlots() {
        LOGGER.info("Loading TraitSlots");
        Instant start = Instant.now();
        VersionModel version = null;
        try {
            version = versionService.getLatestVersionModel();
        } catch (ServiceCallException e) {
            e.printStackTrace();
        }
        for (TraitSlotCollection tagsCollection : dataDao.getMainData().getTraitSlot().getCollection()) {
            if (tagsCollection.getName() != null && tagsCollection.getGroupName() != null) {
                TraitSlotModel ts = new TraitSlotModel();
                ts.setVersion(version);
                ts.setName(tagsCollection.getName());
                ts.setSlotIndex(tagsCollection.getSlotIndex().toValue());
                ts.setGroupName(tagsCollection.getGroupName());
                ts.setSlotType(ItemHelper.getSlotTypeFromIndex(tagsCollection.getSlotType()));
                ts.setTraitCategoryGroup(ItemHelper.getSlotTypeFromIndex(tagsCollection.getTraitCategoryGroups()));
                ts.setMinimumRarity(ItemHelper.getRarity(tagsCollection.getMinRarity()));
                ts.setMaximumRarity(ItemHelper.getRarity(tagsCollection.getMaxRarity()));
                ts.setSlotChance(tagsCollection.getSlotChance());
                ts.setTraitChance(tagsCollection.getTraitChance());
                if (tagsCollection.getDisplayName() != null) {
                    ts.setDisplayName(tagsCollection.getDisplayName().toValue());
                }

                traitSlotDao.save(ts);
            }
        }
        traitSlotDao.flush();
        Instant stop = Instant.now();
        LOGGER.info("Loaded TraitSlots in {}", Duration.between(start, stop));
    }

    private void loadValorPlates() {
        LOGGER.info("Loading ValorPlates");
        Instant start = Instant.now();
        VersionModel version = null;
        try {
            version = versionService.getLatestVersionModel();
        } catch (ServiceCallException e) {
            e.printStackTrace();
        }
        for (ValorplatesCollection entry : dataDao.getMainData().getValorplates().getCollection()) {
            ValorplateModel valorplateSave = new ValorplateModel();
            valorplateSave.setVersion(version);
            valorplateSave.setName(entry.getName());
            valorplateSave.setGameplayTag(entry.getGameplayTag());
            valorplateSave.setAetheriumArchonChargeRate(Double.valueOf(entry.getAetheriumArchonChargeRate()));
            valorplateSave.setArchonDamageScalar(Double.valueOf(entry.getArchonDamageScalar()));
            valorplateSave.setEnabled(entry.getEnabled());
            valorplateSave.setArchonModeDamageReduction(Double.valueOf(entry.getArchonModeDamageReduction()));
            valorplateSave.setArchonModeDrainRate(Double.valueOf(entry.getArchonModeDrainRate()));
            valorplateSave.setArchonChargeGainMultiplier(Double.valueOf(entry.getArchonChargeGainMultiplier()));
            if (entry.getStartingLevel() != null) {
                valorplateSave.setStartinglevel(Math.toIntExact(entry.getStartingLevel()));
            } else {
                valorplateSave.setStartinglevel(0);
            }
            Localization locale = dataDao.getMainData().getLocalization().get(valorplateSave.getName());
            if (locale != null) {
                if (locale.getName() != null) {
                    valorplateSave.setDisplayname(ItemHelper.formatName(locale.getName().stringValue, locale.getName().stringArrayValue));
                }
            }
            valorplateSave.setArchonmode(ItemHelper.getArchonMode(entry.getArchonModeID(), dataDao.getMainData().getArchonModes()));
            valorplateSave.setAugmentGraphs(ItemHelper.getAugmentGraphs(valorplateSave.getGameplayTag(), dataDao.getMainData().getAugmentGraphs().getCollection()));
            valorplateDao.save(valorplateSave);
        }
        valorplateDao.flush();
        Instant stop = Instant.now();
        LOGGER.info("Loaded ValorPlates in {}", Duration.between(start, stop));
    }


    private void loadWeapons() {
        LOGGER.info("Loading Weapons");
        Instant start = Instant.now();
        VersionModel version = null;
        try {
            version = versionService.getLatestVersionModel();
        } catch (ServiceCallException e) {
            e.printStackTrace();
        }
        for (WeaponsCollection entry : dataDao.getMainData().getWeapons().getCollection()) {
            WeaponModel weaponSave = new WeaponModel();
            weaponSave.setVersion(version);
            weaponSave.setName(ItemHelper.formatName(entry.getName().stringValue, entry.getName().stringArrayValue));
            weaponSave.setElements(ItemHelper.getElements(entry.getElementTraitTagGroups()));
            weaponSave.setWeaponType(ItemHelper.getWeaponType(entry.getWeaponClassIdentifier()));
            weaponSave.setMinimumRarity(ItemHelper.getRarityByIndex(entry.getRarityIdentifier()));
            weaponSave.setGameplayTag(entry.getGameplayTag());
            weaponSave.setAffinities(ItemHelper.getAffinities(entry.getTraitTagGroups()));
            weaponSave.setLootInfo(lootInfoDao.findByGameplayTagAndVersion(weaponSave.getGameplayTag(), version.getVersion()));
            weaponSave.setBlacklistTags(ItemHelper.getBlacklistSet(entry.getBlacklistReforgeRecipeTags()));
            weaponSave.setTags(ItemHelper.getItemTags(dataDao.getMainData().getTraitTags().getCollection(), entry.getTraitTagGroups(), entry.getDefaultTraitTagGroups(), entry.getElementTraitTagGroups()));
            Localization locale = dataDao.getMainData().getLocalization().get(weaponSave.getGameplayTag());
            if (locale != null) {
                if (locale.getDescription() != null) {
                    weaponSave.setDisplayDescription(ItemHelper.formatName(locale.getDescription().stringValue, locale.getDescription().stringArrayValue));
                }
                if (locale.getName() != null) {
                    weaponSave.setDisplayName(ItemHelper.formatName(locale.getName().stringValue, locale.getName().stringArrayValue));
                }
            }
            Set<TraitSlotModel> buffer = traitSlotDao.findAllByGroupNameAndVersion(entry.getTraitSlotGroups().toValue(), version.getVersion());
            weaponSave.setTraitSlots(buffer);
            weaponDao.save(weaponSave);

        }
        weaponDao.flush();
        Instant stop = Instant.now();
        LOGGER.info("Loaded Weapons in {}", Duration.between(start, stop));
    }

    private void loadBanners() {
        LOGGER.info("Loading Banners");
        Instant start = Instant.now();
        VersionModel version = null;
        try {
            version = versionService.getLatestVersionModel();
        } catch (ServiceCallException e) {
            e.printStackTrace();
        }
        for (BannersCollection entry : dataDao.getMainData().getBanners().getCollection()) {
            BannerModel bannerSave = new BannerModel();
            bannerSave.setVersion(version);
            bannerSave.setName(entry.getName());
            bannerSave.setElements(ItemHelper.getElements(entry.getElementTraitTagGroups()));
            bannerSave.setGameplayTag(entry.getGameplayTag());
            bannerSave.setAffinities(ItemHelper.getAffinities(entry.getDefaultTraitTagGroups()));
            bannerSave.setCooldownScalar(entry.getCooldownScalar());
            bannerSave.setOvershieldScalar(entry.getOvershieldScalar());
            bannerSave.setRadiusScalar(entry.getRadiusScalar());
            bannerSave.setItemType(ItemTypeModel.BANNER);
            bannerSave.setLootInfo(lootInfoDao.findByGameplayTagAndVersion(bannerSave.getGameplayTag(), version.getVersion()));
            bannerSave.setTags(ItemHelper.getItemTagsWithItemType(dataDao.getMainData().getTraitTags().getCollection(), entry.getTraitTagGroups(), entry.getDefaultTraitTagGroups(), entry.getElementTraitTagGroups()));
            //bannerSave.setBlacklistTags(ItemHelper.getBlacklistSet(entry.getBlacklistReforgeRecipeTags())); // No blacklists yet
            Localization locale = dataDao.getMainData().getLocalization().get(bannerSave.getGameplayTag());
            if (locale != null) {
                if (locale.getDescription() != null) {
                    bannerSave.setDisplayDescription(ItemHelper.formatName(locale.getDescription().stringValue, locale.getDescription().stringArrayValue));
                }
                if (locale.getName() != null) {
                    bannerSave.setDisplayName(ItemHelper.formatName(locale.getName().stringValue, locale.getName().stringArrayValue));
                }
            }
            Set<TraitSlotModel> buffer = traitSlotDao.findAllByGroupNameAndVersion(entry.getTraitSlotGroups(), version.getVersion());
            bannerSave.setTraitSlots(buffer);
            bannerDao.save(bannerSave);
        }
        bannerDao.flush();
        Instant stop = Instant.now();
        LOGGER.info("Loaded Banners in {}", Duration.between(start, stop));
    }

    private void loadLifeStones() {
        LOGGER.info("Loading LifeStones");
        Instant start = Instant.now();
        VersionModel version = null;
        try {
            version = versionService.getLatestVersionModel();
        } catch (ServiceCallException e) {
            e.printStackTrace();
        }
        for (PotionsCollection entry : dataDao.getMainData().getPotions().getCollection()) {
            LifeStoneModel lifeStone = new LifeStoneModel();
            lifeStone.setVersion(version);
            lifeStone.setName(entry.getName());
            lifeStone.setElements(ItemHelper.getElements(entry.getElementTraitTagGroups()));
            lifeStone.setMinimumRarity(ItemHelper.getRarityByIndex(entry.getRarityIdentifier()));
            lifeStone.setGameplayTag(entry.getGameplayTag());
            lifeStone.setAffinities(ItemHelper.getAffinities(entry.getTraitTagGroups()));
            lifeStone.setChargesScalar(entry.getChargesScalar());
            lifeStone.setHealDurationScalar(entry.getHealDurationScalar());
            lifeStone.setHealScalar(entry.getHealScalar());
            lifeStone.setSecondaryTraitDurationScalar(entry.getSecondaryTraitDurationScalar());
            lifeStone.setItemType(ItemTypeModel.LIFESTONE);
            lifeStone.setLootInfo(lootInfoDao.findByGameplayTagAndVersion(lifeStone.getGameplayTag(), version.getVersion()));
            lifeStone.setTags(ItemHelper.getItemTags(dataDao.getMainData().getTraitTags().getCollection(), entry.getTraitTagGroups(), entry.getDefaultTraitTagGroups(), entry.getElementTraitTagGroups()));
            Localization locale = dataDao.getMainData().getLocalization().get(lifeStone.getGameplayTag());
            if (locale != null) {
                if (locale.getDescription() != null) {
                    lifeStone.setDisplayDescription(ItemHelper.formatName(locale.getDescription().stringValue, locale.getDescription().stringArrayValue));
                }
                if (locale.getName() != null) {
                    lifeStone.setDisplayName(ItemHelper.formatName(locale.getName().stringValue, locale.getName().stringArrayValue));
                }
            }
            Set<TraitSlotModel> buffer = traitSlotDao.findAllByGroupNameAndVersion(entry.getTraitSlotGroups().toValue(), version.getVersion());
            lifeStone.setTraitSlots(buffer);
            lifeStoneDao.save(lifeStone);
        }
        lifeStoneDao.flush();
        Instant stop = Instant.now();
        LOGGER.info("Loaded LifeStones in {}", Duration.between(start, stop));
    }

    private void loadTrinkets() {
        LOGGER.info("Loading Trinkets");
        Instant start = Instant.now();
        VersionModel version = null;
        try {
            version = versionService.getLatestVersionModel();
        } catch (ServiceCallException e) {
            e.printStackTrace();
        }
        for (TrinketsCollection entry : dataDao.getMainData().getTrinkets().getCollection()) {
            TrinketModel trinket = new TrinketModel();
            trinket.setVersion(version);
            trinket.setName(entry.getName());
            trinket.setElements(ItemHelper.getElements(entry.getElementTraitTagGroups()));
            trinket.setMinimumRarity(ItemHelper.getRarityByIndex(entry.getRarityIdentifier()));
            trinket.setGameplayTag(entry.getGameplayTag());
            trinket.setAffinities(ItemHelper.getAffinities(entry.getTraitTagGroups()));
            trinket.setItemType(ItemHelper.getItemType(entry.getClassName().toValue()));
            trinket.setLootInfo(lootInfoDao.findByGameplayTagAndVersion(trinket.getGameplayTag(), version.getVersion()));
            trinket.setTags(ItemHelper.getItemTags(dataDao.getMainData().getTraitTags().getCollection(), entry.getTraitTagGroups(), entry.getDefaultTraitTagGroups(), entry.getElementTraitTagGroups()));
            Localization locale = dataDao.getMainData().getLocalization().get(trinket.getGameplayTag());
            if (locale != null) {
                if (locale.getDescription() != null) {
                    trinket.setDisplayDescription(ItemHelper.formatName(locale.getDescription().stringValue, locale.getDescription().stringArrayValue));
                }
                if (locale.getName() != null) {
                    trinket.setDisplayName(ItemHelper.formatName(locale.getName().stringValue, locale.getName().stringArrayValue));
                }
            }
            Set<TraitSlotModel> buffer = traitSlotDao.findAllByGroupNameAndVersion(entry.getTraitSlotGroups().toValue(), version.getVersion());
            trinket.setTraitSlots(buffer);
            trinketDao.save(trinket);
        }
        trinketDao.flush();
        Instant stop = Instant.now();
        LOGGER.info("Loaded Trinkets in {}", Duration.between(start, stop));
    }

    private void loadAugments() {
        LOGGER.info("Loading Augments");
        Instant start = Instant.now();
        VersionModel version = null;
        try {
            version = versionService.getLatestVersionModel();
        } catch (ServiceCallException e) {
            e.printStackTrace();
        }
        for (AugmentsCollection entry : dataDao.getMainData().getAugments().getCollection()) {
            AugmentModel augment = new AugmentModel();
            augment.setVersion(version);
            augment.setName(entry.getName());
            augment.setElements(ItemHelper.getElements(entry.getTraitTagGroups()));
            augment.setMinimumRarity(ItemHelper.getRarity(entry.getRarityIdentifier()));
            augment.setGameplayTag(entry.getGameplayTag());
            augment.setAffinities(ItemHelper.getAffinities(entry.getTraitTagGroups()));
            augment.setItemType(ItemTypeModel.AUGMENT);
            augment.setLootInfo(lootInfoDao.findByGameplayTagAndVersion(augment.getGameplayTag(), version.getVersion()));
            augment.setTags(ItemHelper.getItemTagsElementTraitTag(dataDao.getMainData().getTraitTags().getCollection(), entry.getTraitTagGroups(), entry.getDefaultTraitTagGroups(), entry.getElementTraitTagGroups()));
            Localization locale = dataDao.getMainData().getLocalization().get(augment.getGameplayTag());
            if (locale != null) {
                if (locale.getDescription() != null) {
                    augment.setDisplayDescription(ItemHelper.formatName(locale.getDescription().stringValue, locale.getDescription().stringArrayValue));
                }
                if (locale.getName() != null) {
                    augment.setDisplayName(ItemHelper.formatName(locale.getName().stringValue, locale.getName().stringArrayValue));
                }
            }
            Set<TraitSlotModel> buffer = traitSlotDao.findAllByGroupNameAndVersion(entry.getTraitSlotGroups().toValue(), version.getVersion());
            augment.setTraitSlots(buffer);
            augmentDao.save(augment);
        }
        augmentDao.flush();
        Instant stop = Instant.now();
        LOGGER.info("Loaded Augments in {}", Duration.between(start, stop));
    }

    private void loadSkills() {
        LOGGER.info("Loading Skills");
        Instant start = Instant.now();
        VersionModel version = null;
        try {
            version = versionService.getLatestVersionModel();
        } catch (ServiceCallException e) {
            e.printStackTrace();
        }
        for (MasteryEntitlementsCollection entry : dataDao.getMainData().getMasteryEntitlements().getCollection()) {
            SkillModel skill = new SkillModel();
            skill.setVersion(version);
            skill.setName(entry.getID());
            skill.setSkillgroup(entry.getMasteryID());
            skill.setMinPoints(entry.getMinPoints());
            skill.setTraitname(entry.getTraitName());
            Localization locale = dataDao.getMainData().getLocalization().get(skill.getName());
            if (locale != null) {
                if (locale.getDescription() != null) {
                    skill.setDisplaydescription(ItemHelper.formatName(locale.getDescription().stringValue, locale.getDescription().stringArrayValue));
                }
                if (locale.getName() != null) {
                    skill.setDisplayname(ItemHelper.formatName(locale.getName().stringValue, locale.getName().stringArrayValue));
                }
            }
            skillDao.save(skill);
        }
        skillDao.flush();
        Instant stop = Instant.now();
        LOGGER.info("Loaded Skills in {}", Duration.between(start, stop));
    }

    private void moveInputFile(File dataset) {
        try {
            if (Files.notExists(Paths.get(godfallDBProperties.getArchiveDirectory()))) {
                Files.createDirectory(Paths.get(godfallDBProperties.getArchiveDirectory()));
            }
            Path sourcepath = Paths.get(dataset.getCanonicalPath());
            Path destinationpath = Paths.get(godfallDBProperties.getArchiveDirectory() + File.separator + dataset.getName());
            Files.move(sourcepath, destinationpath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
