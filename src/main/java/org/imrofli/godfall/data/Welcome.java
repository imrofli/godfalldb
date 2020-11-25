package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.Map;

public class Welcome {
    private Activities activities;
    private Map<String, Ailment> ailments;
    private ArchonModes archonModes;
    private Augments augments;
    private AugmentGraphs augmentGraphs;
    private AugmentAffinities augmentAffinities;
    private Banners banners;
    private Biomes biomes;
    private Boons boons;
    private CodexEntries codexEntries;
    private CollectionCompositing collectionCompositing;
    private ConditionalLootEffects conditionalLootEffects;
    private Cosmetics cosmetics;
    private CraftingEnchant craftingEnchant;
    private CraftingReforge craftingReforge;
    private CraftingSalvage craftingSalvage;
    private CraftingUpgrade craftingUpgrade;
    private Currencies currencies;
    private Map<String, SummonedAllies> damageTypes;
    private Difficulties difficulties;
    private WelcomeDreamstones dreamstones;
    private DreamstoneEffects dreamstoneEffects;
    private Encounters encounters;
    private Enemies enemies;
    private EnemyClasses enemyClasses;
    private Map<String, EnemyTier> enemyTiers;
    private GameplayEvents gameplayEvents;
    private GlobalParameters globalParameters;
    private Intel intel;
    private ItemScaling itemScaling;
    private Keywords keywords;
    private Map<String, Localization> localization;
    private LootCategory lootCategory;
    private Loot lootCurrency;
    private LootDamageTypes lootDamageTypes;
    private LootEffects lootEffects;
    private LootEventRules lootEventRules;
    private LootGameplayTags lootGameplayTags;
    private LootGameplayTriggers lootGameplayTriggers;
    private LootItem lootItem;
    private LootItemClass lootItemClass;
    private Loot lootPowerups;
    private LootQuantity lootQuantity;
    private LootQuantityRandomized lootQuantityRandomized;
    private LootRarity lootRarity;
    private Maps maps;
    private MapSubzones mapSubzones;
    private MasteryEntitlements masteryEntitlements;
    private Merits merits;
    private MissionObjectiveTargetVariants missionObjectiveTargetVariants;
    private MissionObjectiveTypes missionObjectiveTypes;
    private MissionRequirements missionRequirements;
    private Map<String, MissionRule> missionRules;
    private MissionStateObjectives missionStateObjectives;
    private Objectives objectives;
    private Map<String, PlayerStrengthIndexModifier> playerStrengthIndexModifiers;
    private Map<String, Map<String, Long>> playerTier;
    private Potions potions;
    private Currencies powerups;
    private ProgressionFlags progressionFlags;
    private Quests quests;
    private Rarities rarities;
    private SummonedAllies summonedAllies;
    private Map<String, Map<String, Double>> threat;
    private Tiers tiers;
    private TotCosts totCosts;
    private TotFloor totFloor;
    private TotFloorTags totFloorTags;
    private TotRewards totRewards;
    private TotRoomCount totRoomCount;
    private TotRoomRarity totRoomRarity;
    private TotRoomRewards totRoomRewards;
    private TotRoomRewardThemes totRoomRewardThemes;
    private TotStartingFloor totStartingFloor;
    private WelcomeTrait trait;
    private TraitCategory traitCategory;
    private WelcomeTraitModifiers traitModifiers;
    private TraitSlot traitSlot;
    private TraitTags traitTags;
    private Trinkets trinkets;
    private ValorplateAttributes valorplateAttributes;
    private ValorplateLeveling valorplateLeveling;
    private Valorplates valorplates;
    private Rarities weaponClass;
    private WeaponMastery weaponMastery;
    private Weapons weapons;

    @JsonProperty("activities")
    public Activities getActivities() { return activities; }
    @JsonProperty("activities")
    public void setActivities(Activities value) { this.activities = value; }

    @JsonProperty("ailments")
    public Map<String, Ailment> getAilments() { return ailments; }
    @JsonProperty("ailments")
    public void setAilments(Map<String, Ailment> value) { this.ailments = value; }

    @JsonProperty("archonModes")
    public ArchonModes getArchonModes() { return archonModes; }
    @JsonProperty("archonModes")
    public void setArchonModes(ArchonModes value) { this.archonModes = value; }

    @JsonProperty("augments")
    public Augments getAugments() { return augments; }
    @JsonProperty("augments")
    public void setAugments(Augments value) { this.augments = value; }

    @JsonProperty("augmentGraphs")
    public AugmentGraphs getAugmentGraphs() { return augmentGraphs; }
    @JsonProperty("augmentGraphs")
    public void setAugmentGraphs(AugmentGraphs value) { this.augmentGraphs = value; }

    @JsonProperty("augmentAffinities")
    public AugmentAffinities getAugmentAffinities() { return augmentAffinities; }
    @JsonProperty("augmentAffinities")
    public void setAugmentAffinities(AugmentAffinities value) { this.augmentAffinities = value; }

    @JsonProperty("banners")
    public Banners getBanners() { return banners; }
    @JsonProperty("banners")
    public void setBanners(Banners value) { this.banners = value; }

    @JsonProperty("biomes")
    public Biomes getBiomes() { return biomes; }
    @JsonProperty("biomes")
    public void setBiomes(Biomes value) { this.biomes = value; }

    @JsonProperty("boons")
    public Boons getBoons() { return boons; }
    @JsonProperty("boons")
    public void setBoons(Boons value) { this.boons = value; }

    @JsonProperty("codexEntries")
    public CodexEntries getCodexEntries() { return codexEntries; }
    @JsonProperty("codexEntries")
    public void setCodexEntries(CodexEntries value) { this.codexEntries = value; }

    @JsonProperty("collectionCompositing")
    public CollectionCompositing getCollectionCompositing() { return collectionCompositing; }
    @JsonProperty("collectionCompositing")
    public void setCollectionCompositing(CollectionCompositing value) { this.collectionCompositing = value; }

    @JsonProperty("conditionalLootEffects")
    public ConditionalLootEffects getConditionalLootEffects() { return conditionalLootEffects; }
    @JsonProperty("conditionalLootEffects")
    public void setConditionalLootEffects(ConditionalLootEffects value) { this.conditionalLootEffects = value; }

    @JsonProperty("cosmetics")
    public Cosmetics getCosmetics() { return cosmetics; }
    @JsonProperty("cosmetics")
    public void setCosmetics(Cosmetics value) { this.cosmetics = value; }

    @JsonProperty("craftingEnchant")
    public CraftingEnchant getCraftingEnchant() { return craftingEnchant; }
    @JsonProperty("craftingEnchant")
    public void setCraftingEnchant(CraftingEnchant value) { this.craftingEnchant = value; }

    @JsonProperty("craftingReforge")
    public CraftingReforge getCraftingReforge() { return craftingReforge; }
    @JsonProperty("craftingReforge")
    public void setCraftingReforge(CraftingReforge value) { this.craftingReforge = value; }

    @JsonProperty("craftingSalvage")
    public CraftingSalvage getCraftingSalvage() { return craftingSalvage; }
    @JsonProperty("craftingSalvage")
    public void setCraftingSalvage(CraftingSalvage value) { this.craftingSalvage = value; }

    @JsonProperty("craftingUpgrade")
    public CraftingUpgrade getCraftingUpgrade() { return craftingUpgrade; }
    @JsonProperty("craftingUpgrade")
    public void setCraftingUpgrade(CraftingUpgrade value) { this.craftingUpgrade = value; }

    @JsonProperty("currencies")
    public Currencies getCurrencies() { return currencies; }
    @JsonProperty("currencies")
    public void setCurrencies(Currencies value) { this.currencies = value; }

    @JsonProperty("damageTypes")
    public Map<String, SummonedAllies> getDamageTypes() { return damageTypes; }
    @JsonProperty("damageTypes")
    public void setDamageTypes(Map<String, SummonedAllies> value) { this.damageTypes = value; }

    @JsonProperty("difficulties")
    public Difficulties getDifficulties() { return difficulties; }
    @JsonProperty("difficulties")
    public void setDifficulties(Difficulties value) { this.difficulties = value; }

    @JsonProperty("dreamstones")
    public WelcomeDreamstones getDreamstones() { return dreamstones; }
    @JsonProperty("dreamstones")
    public void setDreamstones(WelcomeDreamstones value) { this.dreamstones = value; }

    @JsonProperty("dreamstoneEffects")
    public DreamstoneEffects getDreamstoneEffects() { return dreamstoneEffects; }
    @JsonProperty("dreamstoneEffects")
    public void setDreamstoneEffects(DreamstoneEffects value) { this.dreamstoneEffects = value; }

    @JsonProperty("encounters")
    public Encounters getEncounters() { return encounters; }
    @JsonProperty("encounters")
    public void setEncounters(Encounters value) { this.encounters = value; }

    @JsonProperty("enemies")
    public Enemies getEnemies() { return enemies; }
    @JsonProperty("enemies")
    public void setEnemies(Enemies value) { this.enemies = value; }

    @JsonProperty("enemyClasses")
    public EnemyClasses getEnemyClasses() { return enemyClasses; }
    @JsonProperty("enemyClasses")
    public void setEnemyClasses(EnemyClasses value) { this.enemyClasses = value; }

    @JsonProperty("enemyTiers")
    public Map<String, EnemyTier> getEnemyTiers() { return enemyTiers; }
    @JsonProperty("enemyTiers")
    public void setEnemyTiers(Map<String, EnemyTier> value) { this.enemyTiers = value; }

    @JsonProperty("gameplayEvents")
    public GameplayEvents getGameplayEvents() { return gameplayEvents; }
    @JsonProperty("gameplayEvents")
    public void setGameplayEvents(GameplayEvents value) { this.gameplayEvents = value; }

    @JsonProperty("globalParameters")
    public GlobalParameters getGlobalParameters() { return globalParameters; }
    @JsonProperty("globalParameters")
    public void setGlobalParameters(GlobalParameters value) { this.globalParameters = value; }

    @JsonProperty("intel")
    public Intel getIntel() { return intel; }
    @JsonProperty("intel")
    public void setIntel(Intel value) { this.intel = value; }

    @JsonProperty("itemScaling")
    public ItemScaling getItemScaling() { return itemScaling; }
    @JsonProperty("itemScaling")
    public void setItemScaling(ItemScaling value) { this.itemScaling = value; }

    @JsonProperty("keywords")
    public Keywords getKeywords() { return keywords; }
    @JsonProperty("keywords")
    public void setKeywords(Keywords value) { this.keywords = value; }

    @JsonProperty("localization")
    public Map<String, Localization> getLocalization() { return localization; }
    @JsonProperty("localization")
    public void setLocalization(Map<String, Localization> value) { this.localization = value; }

    @JsonProperty("lootCategory")
    public LootCategory getLootCategory() { return lootCategory; }
    @JsonProperty("lootCategory")
    public void setLootCategory(LootCategory value) { this.lootCategory = value; }

    @JsonProperty("lootCurrency")
    public Loot getLootCurrency() { return lootCurrency; }
    @JsonProperty("lootCurrency")
    public void setLootCurrency(Loot value) { this.lootCurrency = value; }

    @JsonProperty("lootDamageTypes")
    public LootDamageTypes getLootDamageTypes() { return lootDamageTypes; }
    @JsonProperty("lootDamageTypes")
    public void setLootDamageTypes(LootDamageTypes value) { this.lootDamageTypes = value; }

    @JsonProperty("lootEffects")
    public LootEffects getLootEffects() { return lootEffects; }
    @JsonProperty("lootEffects")
    public void setLootEffects(LootEffects value) { this.lootEffects = value; }

    @JsonProperty("lootEventRules")
    public LootEventRules getLootEventRules() { return lootEventRules; }
    @JsonProperty("lootEventRules")
    public void setLootEventRules(LootEventRules value) { this.lootEventRules = value; }

    @JsonProperty("lootGameplayTags")
    public LootGameplayTags getLootGameplayTags() { return lootGameplayTags; }
    @JsonProperty("lootGameplayTags")
    public void setLootGameplayTags(LootGameplayTags value) { this.lootGameplayTags = value; }

    @JsonProperty("lootGameplayTriggers")
    public LootGameplayTriggers getLootGameplayTriggers() { return lootGameplayTriggers; }
    @JsonProperty("lootGameplayTriggers")
    public void setLootGameplayTriggers(LootGameplayTriggers value) { this.lootGameplayTriggers = value; }

    @JsonProperty("lootItem")
    public LootItem getLootItem() { return lootItem; }
    @JsonProperty("lootItem")
    public void setLootItem(LootItem value) { this.lootItem = value; }

    @JsonProperty("lootItemClass")
    public LootItemClass getLootItemClass() { return lootItemClass; }
    @JsonProperty("lootItemClass")
    public void setLootItemClass(LootItemClass value) { this.lootItemClass = value; }

    @JsonProperty("lootPowerups")
    public Loot getLootPowerups() { return lootPowerups; }
    @JsonProperty("lootPowerups")
    public void setLootPowerups(Loot value) { this.lootPowerups = value; }

    @JsonProperty("lootQuantity")
    public LootQuantity getLootQuantity() { return lootQuantity; }
    @JsonProperty("lootQuantity")
    public void setLootQuantity(LootQuantity value) { this.lootQuantity = value; }

    @JsonProperty("lootQuantityRandomized")
    public LootQuantityRandomized getLootQuantityRandomized() { return lootQuantityRandomized; }
    @JsonProperty("lootQuantityRandomized")
    public void setLootQuantityRandomized(LootQuantityRandomized value) { this.lootQuantityRandomized = value; }

    @JsonProperty("lootRarity")
    public LootRarity getLootRarity() { return lootRarity; }
    @JsonProperty("lootRarity")
    public void setLootRarity(LootRarity value) { this.lootRarity = value; }

    @JsonProperty("maps")
    public Maps getMaps() { return maps; }
    @JsonProperty("maps")
    public void setMaps(Maps value) { this.maps = value; }

    @JsonProperty("mapSubzones")
    public MapSubzones getMapSubzones() { return mapSubzones; }
    @JsonProperty("mapSubzones")
    public void setMapSubzones(MapSubzones value) { this.mapSubzones = value; }

    @JsonProperty("masteryEntitlements")
    public MasteryEntitlements getMasteryEntitlements() { return masteryEntitlements; }
    @JsonProperty("masteryEntitlements")
    public void setMasteryEntitlements(MasteryEntitlements value) { this.masteryEntitlements = value; }

    @JsonProperty("merits")
    public Merits getMerits() { return merits; }
    @JsonProperty("merits")
    public void setMerits(Merits value) { this.merits = value; }

    @JsonProperty("missionObjectiveTargetVariants")
    public MissionObjectiveTargetVariants getMissionObjectiveTargetVariants() { return missionObjectiveTargetVariants; }
    @JsonProperty("missionObjectiveTargetVariants")
    public void setMissionObjectiveTargetVariants(MissionObjectiveTargetVariants value) { this.missionObjectiveTargetVariants = value; }

    @JsonProperty("missionObjectiveTypes")
    public MissionObjectiveTypes getMissionObjectiveTypes() { return missionObjectiveTypes; }
    @JsonProperty("missionObjectiveTypes")
    public void setMissionObjectiveTypes(MissionObjectiveTypes value) { this.missionObjectiveTypes = value; }

    @JsonProperty("missionRequirements")
    public MissionRequirements getMissionRequirements() { return missionRequirements; }
    @JsonProperty("missionRequirements")
    public void setMissionRequirements(MissionRequirements value) { this.missionRequirements = value; }

    @JsonProperty("missionRules")
    public Map<String, MissionRule> getMissionRules() { return missionRules; }
    @JsonProperty("missionRules")
    public void setMissionRules(Map<String, MissionRule> value) { this.missionRules = value; }

    @JsonProperty("missionStateObjectives")
    public MissionStateObjectives getMissionStateObjectives() { return missionStateObjectives; }
    @JsonProperty("missionStateObjectives")
    public void setMissionStateObjectives(MissionStateObjectives value) { this.missionStateObjectives = value; }

    @JsonProperty("objectives")
    public Objectives getObjectives() { return objectives; }
    @JsonProperty("objectives")
    public void setObjectives(Objectives value) { this.objectives = value; }

    @JsonProperty("playerStrengthIndexModifiers")
    public Map<String, PlayerStrengthIndexModifier> getPlayerStrengthIndexModifiers() { return playerStrengthIndexModifiers; }
    @JsonProperty("playerStrengthIndexModifiers")
    public void setPlayerStrengthIndexModifiers(Map<String, PlayerStrengthIndexModifier> value) { this.playerStrengthIndexModifiers = value; }

    @JsonProperty("playerTier")
    public Map<String, Map<String, Long>> getPlayerTier() { return playerTier; }
    @JsonProperty("playerTier")
    public void setPlayerTier(Map<String, Map<String, Long>> value) { this.playerTier = value; }

    @JsonProperty("potions")
    public Potions getPotions() { return potions; }
    @JsonProperty("potions")
    public void setPotions(Potions value) { this.potions = value; }

    @JsonProperty("powerups")
    public Currencies getPowerups() { return powerups; }
    @JsonProperty("powerups")
    public void setPowerups(Currencies value) { this.powerups = value; }

    @JsonProperty("progressionFlags")
    public ProgressionFlags getProgressionFlags() { return progressionFlags; }
    @JsonProperty("progressionFlags")
    public void setProgressionFlags(ProgressionFlags value) { this.progressionFlags = value; }

    @JsonProperty("quests")
    public Quests getQuests() { return quests; }
    @JsonProperty("quests")
    public void setQuests(Quests value) { this.quests = value; }

    @JsonProperty("rarities")
    public Rarities getRarities() { return rarities; }
    @JsonProperty("rarities")
    public void setRarities(Rarities value) { this.rarities = value; }

    @JsonProperty("summonedAllies")
    public SummonedAllies getSummonedAllies() { return summonedAllies; }
    @JsonProperty("summonedAllies")
    public void setSummonedAllies(SummonedAllies value) { this.summonedAllies = value; }

    @JsonProperty("threat")
    public Map<String, Map<String, Double>> getThreat() { return threat; }
    @JsonProperty("threat")
    public void setThreat(Map<String, Map<String, Double>> value) { this.threat = value; }

    @JsonProperty("tiers")
    public Tiers getTiers() { return tiers; }
    @JsonProperty("tiers")
    public void setTiers(Tiers value) { this.tiers = value; }

    @JsonProperty("totCosts")
    public TotCosts getTotCosts() { return totCosts; }
    @JsonProperty("totCosts")
    public void setTotCosts(TotCosts value) { this.totCosts = value; }

    @JsonProperty("totFloor")
    public TotFloor getTotFloor() { return totFloor; }
    @JsonProperty("totFloor")
    public void setTotFloor(TotFloor value) { this.totFloor = value; }

    @JsonProperty("totFloorTags")
    public TotFloorTags getTotFloorTags() { return totFloorTags; }
    @JsonProperty("totFloorTags")
    public void setTotFloorTags(TotFloorTags value) { this.totFloorTags = value; }

    @JsonProperty("totRewards")
    public TotRewards getTotRewards() { return totRewards; }
    @JsonProperty("totRewards")
    public void setTotRewards(TotRewards value) { this.totRewards = value; }

    @JsonProperty("totRoomCount")
    public TotRoomCount getTotRoomCount() { return totRoomCount; }
    @JsonProperty("totRoomCount")
    public void setTotRoomCount(TotRoomCount value) { this.totRoomCount = value; }

    @JsonProperty("totRoomRarity")
    public TotRoomRarity getTotRoomRarity() { return totRoomRarity; }
    @JsonProperty("totRoomRarity")
    public void setTotRoomRarity(TotRoomRarity value) { this.totRoomRarity = value; }

    @JsonProperty("totRoomRewards")
    public TotRoomRewards getTotRoomRewards() { return totRoomRewards; }
    @JsonProperty("totRoomRewards")
    public void setTotRoomRewards(TotRoomRewards value) { this.totRoomRewards = value; }

    @JsonProperty("totRoomRewardThemes")
    public TotRoomRewardThemes getTotRoomRewardThemes() { return totRoomRewardThemes; }
    @JsonProperty("totRoomRewardThemes")
    public void setTotRoomRewardThemes(TotRoomRewardThemes value) { this.totRoomRewardThemes = value; }

    @JsonProperty("totStartingFloor")
    public TotStartingFloor getTotStartingFloor() { return totStartingFloor; }
    @JsonProperty("totStartingFloor")
    public void setTotStartingFloor(TotStartingFloor value) { this.totStartingFloor = value; }

    @JsonProperty("trait")
    public WelcomeTrait getTrait() { return trait; }
    @JsonProperty("trait")
    public void setTrait(WelcomeTrait value) { this.trait = value; }

    @JsonProperty("traitCategory")
    public TraitCategory getTraitCategory() { return traitCategory; }
    @JsonProperty("traitCategory")
    public void setTraitCategory(TraitCategory value) { this.traitCategory = value; }

    @JsonProperty("traitModifiers")
    public WelcomeTraitModifiers getTraitModifiers() { return traitModifiers; }
    @JsonProperty("traitModifiers")
    public void setTraitModifiers(WelcomeTraitModifiers value) { this.traitModifiers = value; }

    @JsonProperty("traitSlot")
    public TraitSlot getTraitSlot() { return traitSlot; }
    @JsonProperty("traitSlot")
    public void setTraitSlot(TraitSlot value) { this.traitSlot = value; }

    @JsonProperty("traitTags")
    public TraitTags getTraitTags() { return traitTags; }
    @JsonProperty("traitTags")
    public void setTraitTags(TraitTags value) { this.traitTags = value; }

    @JsonProperty("trinkets")
    public Trinkets getTrinkets() { return trinkets; }
    @JsonProperty("trinkets")
    public void setTrinkets(Trinkets value) { this.trinkets = value; }

    @JsonProperty("valorplateAttributes")
    public ValorplateAttributes getValorplateAttributes() { return valorplateAttributes; }
    @JsonProperty("valorplateAttributes")
    public void setValorplateAttributes(ValorplateAttributes value) { this.valorplateAttributes = value; }

    @JsonProperty("valorplateLeveling")
    public ValorplateLeveling getValorplateLeveling() { return valorplateLeveling; }
    @JsonProperty("valorplateLeveling")
    public void setValorplateLeveling(ValorplateLeveling value) { this.valorplateLeveling = value; }

    @JsonProperty("valorplates")
    public Valorplates getValorplates() { return valorplates; }
    @JsonProperty("valorplates")
    public void setValorplates(Valorplates value) { this.valorplates = value; }

    @JsonProperty("weaponClass")
    public Rarities getWeaponClass() { return weaponClass; }
    @JsonProperty("weaponClass")
    public void setWeaponClass(Rarities value) { this.weaponClass = value; }

    @JsonProperty("weaponMastery")
    public WeaponMastery getWeaponMastery() { return weaponMastery; }
    @JsonProperty("weaponMastery")
    public void setWeaponMastery(WeaponMastery value) { this.weaponMastery = value; }

    @JsonProperty("weapons")
    public Weapons getWeapons() { return weapons; }
    @JsonProperty("weapons")
    public void setWeapons(Weapons value) { this.weapons = value; }
}
