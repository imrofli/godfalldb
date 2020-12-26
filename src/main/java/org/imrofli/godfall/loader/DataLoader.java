package org.imrofli.godfall.loader;

import org.imrofli.godfall.dao.intf.*;
import org.imrofli.godfall.dao.model.GlobalParameters;
import org.imrofli.godfall.dao.model.ItemType;
import org.imrofli.godfall.dao.model.TraitSlot;
import org.imrofli.godfall.dao.model.*;
import org.imrofli.godfall.data.EnemyTier;
import org.imrofli.godfall.data.*;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.helpers.ItemHelper;
import org.imrofli.godfall.services.intf.CalculationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Component
public class DataLoader implements ApplicationRunner {

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


    @Override
    public void run(ApplicationArguments args) throws Exception {
        LOGGER.info("Starting data Ingestion");
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
        loadWeapons();
        loadBanners();
        loadLifeStones();
        loadTrinkets();
        loadAugments();
        LOGGER.info("Data Ingestion Done");
    }


    private void loadGlobalInfo() {
        LOGGER.info("Loading GlobalParameters");
        GlobalParameters globalParameters = new GlobalParameters();
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

    }

    private void loadPlayerStrengthIndex() {
        LOGGER.info("Loading PlayerStrengthIndex Info");
        for (Map.Entry<String, PlayerStrengthIndexModifier> entry : dataDao.getMainData().getPlayerStrengthIndexModifiers().entrySet()) {
            PlayerStrengthIndex playerStrengthIndex = new PlayerStrengthIndex();
            playerStrengthIndex.setPlayerStrengthIndex(entry.getValue().getPlayerStrengthIndex());
            playerStrengthIndex.setPowerMultiplierArchonMode(entry.getValue().getPowerMultiplierArchonMode());
            playerStrengthIndex.setPowerMultiplierDrain(entry.getValue().getPowerMultiplierDrain());
            playerStrengthIndex.setTakedownMultiplier(entry.getValue().getTakedownMultiplier());
            playerStrengthIndex.setPowerMultiplierWeaponSpectral(entry.getValue().getPowerMultiplierWeaponSpectral());
            playerStrengthIndex.setPowerMultiplierPolarityShockwave(entry.getValue().getPowerMultiplierPolarityShockwave());
            playerStrengthIndexDao.save(playerStrengthIndex);
        }
        playerStrengthIndexDao.flush();

    }

    private void loadPlayerTiers() {
        LOGGER.info("Loading PlayerTiers");
        for (Map.Entry<String, Map<String, Long>> entry : dataDao.getMainData().getPlayerTier().entrySet()) {
            PlayerTier out = new PlayerTier();
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
    }

    private void loadEnemies() {
        LOGGER.info("Loading Enemies");
        for (EnemiesCollection entry : dataDao.getMainData().getEnemies().getCollection()) {
            Enemy out = new Enemy();
            out.setEnemyType(entry.getEnemyType().toValue());
            out.setName(entry.getName());
            out.setExperienceGranted(entry.getExperienceGranted());
            out.setGameplayTag(entry.getGameplayTag());
            out.setLootEventRulesType(entry.getLootEventRulesType().toValue());
            enemyDao.save(out);
        }
        enemyDao.flush();
    }

    private void loadEnemyClasses() {
        LOGGER.info("Loading EnemyClasses");
        for (EnemyClassesCollection entry : dataDao.getMainData().getEnemyClasses().getCollection()) {
            EnemyClass out = new EnemyClass();
            out.setName(entry.getName().toValue());
            out.setArchonChargeGainMultiplier(entry.getArchonChargeGainMultiplier());
            out.setEnemyclasslevels(ItemHelper.getEnemyClassLevels(entry.getThe2(), entry.getThe3()));
            enemyClassDao.save(out);
        }
        enemyClassDao.flush();
    }

    private void loadEnemyTiers() {
        LOGGER.info("Loading EnemyTiers");
        for (Map.Entry<String, EnemyTier> entry : dataDao.getMainData().getEnemyTiers().entrySet()) {
            org.imrofli.godfall.dao.model.EnemyTier out = new org.imrofli.godfall.dao.model.EnemyTier();
            out.setTier(entry.getValue().getTier());
            out.setBreachHealthScalar(entry.getValue().getBreachHealthScalar());
            out.setExperienceScalar(entry.getValue().getExperienceScalar());
            out.setHealthScalar(entry.getValue().getHealthScalar());
            out.setDamageScalar(entry.getValue().getDamageScalar());
            enemyTierDao.save(out);
        }
        enemyTierDao.flush();
    }

    private void loadTierInfo() {
        LOGGER.info("Loading Tier Info");
        for (ItemScalingCollection tagsCollection : dataDao.getMainData().getItemScaling().getCollection()) {
            Scaling scaling = new Scaling();
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
    }

    private void loadLootInfo(){
        LOGGER.info("Loading Loot Info");
        for (LootItemCollection tagsCollection : dataDao.getMainData().getLootItem().getCollection()) {
            if(tagsCollection.getName() != null && tagsCollection.getGameplayTag()!= null) {
                LootInfo lootInfo = new LootInfo();
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
    }


    private void loadTraits(){
        LOGGER.info("Loading Traits");
        for (TraitCollection tagsCollection : dataDao.getMainData().getTrait().getCollection()) {
            if(tagsCollection.getTraitName() != null && tagsCollection.getDescription()!= null && tagsCollection.getGroupName() != null) {
                Trait trait = new Trait();
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
                try {
                    calculationService.calculateTrait(trait);
                } catch (ServiceCallException e) {
                    e.printStackTrace();
                }
                traitDao.save(trait);
            }
        }
        traitDao.flush();
    }

    private void loadTraitSlots() {
        LOGGER.info("Loading TraitSlots");
        for (TraitSlotCollection tagsCollection : dataDao.getMainData().getTraitSlot().getCollection()) {
            if (tagsCollection.getName() != null && tagsCollection.getGroupName() != null) {
                TraitSlot ts = new TraitSlot();
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
    }


    private void loadWeapons() {
        LOGGER.info("Loading Weapons");
        for (WeaponsCollection entry : dataDao.getMainData().getWeapons().getCollection()) {
            Weapon weaponSave = new Weapon();
            weaponSave.setName(ItemHelper.formatName(entry.getName().stringValue, entry.getName().stringArrayValue));
            weaponSave.setElements(ItemHelper.getElements(entry.getElementTraitTagGroups()));
            weaponSave.setWeaponType(ItemHelper.getWeaponType(entry.getWeaponClassIdentifier()));
            weaponSave.setMinimumRarity(ItemHelper.getRarityByIndex(entry.getRarityIdentifier()));
            weaponSave.setGameplayTag(entry.getGameplayTag());
            weaponSave.setAffinities(ItemHelper.getAffinities(entry.getTraitTagGroups()));
            weaponSave.setLootInfo(lootInfoDao.findByGameplayTag(weaponSave.getGameplayTag()));
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
            Set<TraitSlot> buffer = traitSlotDao.findAllByGroupName(entry.getTraitSlotGroups().toValue());
            weaponSave.setTraitSlots(buffer);
            weaponDao.save(weaponSave);

        }
        weaponDao.flush();
    }

    private void loadBanners(){
        LOGGER.info("Loading Banners");
        for(BannersCollection entry : dataDao.getMainData().getBanners().getCollection()){
            Banner bannerSave = new Banner();
            bannerSave.setName(entry.getName());
            bannerSave.setElements(ItemHelper.getElements(entry.getElementTraitTagGroups()));
            bannerSave.setGameplayTag(entry.getGameplayTag());
            bannerSave.setAffinities(ItemHelper.getAffinities(entry.getDefaultTraitTagGroups()));
            bannerSave.setCooldownScalar(entry.getCooldownScalar());
            bannerSave.setOvershieldScalar(entry.getOvershieldScalar());
            bannerSave.setRadiusScalar(entry.getRadiusScalar());
            bannerSave.setItemType(ItemType.BANNER);
            bannerSave.setLootInfo(lootInfoDao.findByGameplayTag(bannerSave.getGameplayTag()));
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
            Set<TraitSlot> buffer = traitSlotDao.findAllByGroupName(entry.getTraitSlotGroups());
            bannerSave.setTraitSlots(buffer);
            bannerDao.save(bannerSave);
        }
        bannerDao.flush();
    }

    private void loadLifeStones(){
        LOGGER.info("Loading LifeStones");
        for(PotionsCollection entry : dataDao.getMainData().getPotions().getCollection()){
            LifeStone lifeStone = new LifeStone();
            lifeStone.setName(entry.getName());
            lifeStone.setElements(ItemHelper.getElements(entry.getElementTraitTagGroups()));
            lifeStone.setMinimumRarity(ItemHelper.getRarityByIndex(entry.getRarityIdentifier()));
            lifeStone.setGameplayTag(entry.getGameplayTag());
            lifeStone.setAffinities(ItemHelper.getAffinities(entry.getTraitTagGroups()));
            lifeStone.setChargesScalar(entry.getChargesScalar());
            lifeStone.setHealDurationScalar(entry.getHealDurationScalar());
            lifeStone.setHealScalar(entry.getHealScalar());
            lifeStone.setSecondaryTraitDurationScalar(entry.getSecondaryTraitDurationScalar());
            lifeStone.setItemType(ItemType.LIFESTONE);
            lifeStone.setLootInfo(lootInfoDao.findByGameplayTag(lifeStone.getGameplayTag()));
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
            Set<TraitSlot> buffer = traitSlotDao.findAllByGroupName(entry.getTraitSlotGroups().toValue());
            lifeStone.setTraitSlots(buffer);
            lifeStoneDao.save(lifeStone);
        }
        lifeStoneDao.flush();
    }

    private void loadTrinkets(){
        LOGGER.info("Loading Trinkets");
        for(TrinketsCollection entry : dataDao.getMainData().getTrinkets().getCollection()) {
            Trinket trinket = new Trinket();
            trinket.setName(entry.getName());
            trinket.setElements(ItemHelper.getElements(entry.getElementTraitTagGroups()));
            trinket.setMinimumRarity(ItemHelper.getRarityByIndex(entry.getRarityIdentifier()));
            trinket.setGameplayTag(entry.getGameplayTag());
            trinket.setAffinities(ItemHelper.getAffinities(entry.getTraitTagGroups()));
            trinket.setItemType(ItemHelper.getItemType(entry.getClassName().toValue()));
            trinket.setLootInfo(lootInfoDao.findByGameplayTag(trinket.getGameplayTag()));
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
            Set<TraitSlot> buffer = traitSlotDao.findAllByGroupName(entry.getTraitSlotGroups().toValue());
            trinket.setTraitSlots(buffer);
            trinketDao.save(trinket);
        }
        trinketDao.flush();
    }

    private void loadAugments(){
        LOGGER.info("Loading Augments");
        for(AugmentsCollection entry : dataDao.getMainData().getAugments().getCollection()) {
            Augment augment = new Augment();
            augment.setName(entry.getName());
            augment.setElements(ItemHelper.getElements(entry.getTraitTagGroups()));
            augment.setMinimumRarity(ItemHelper.getRarity(entry.getRarityIdentifier()));
            augment.setGameplayTag(entry.getGameplayTag());
            augment.setAffinities(ItemHelper.getAffinities(entry.getTraitTagGroups()));
            augment.setItemType(ItemType.AUGMENT);
            augment.setLootInfo(lootInfoDao.findByGameplayTag(augment.getGameplayTag()));
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
            Set<TraitSlot> buffer = traitSlotDao.findAllByGroupName(entry.getTraitSlotGroups().toValue());
            augment.setTraitSlots(buffer);
            augmentDao.save(augment);
        }
        augmentDao.flush();
    }

}
