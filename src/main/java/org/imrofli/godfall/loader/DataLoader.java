package org.imrofli.godfall.loader;

import org.imrofli.godfall.dao.intf.*;
import org.imrofli.godfall.dao.model.*;
import org.imrofli.godfall.dao.model.ItemScaling;
import org.imrofli.godfall.dao.model.ItemType;
import org.imrofli.godfall.data.*;
import org.imrofli.godfall.helpers.ItemHelper;
import org.imrofli.godfall.services.intf.WeaponService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class DataLoader implements ApplicationRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataLoader.class);

    @Autowired
    private DataDao dataDao;

    @Autowired
    private WeaponService weaponService;

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
    private ItemScalingDao itemScalingDao;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        LOGGER.info("Starting data Ingestion");
        loadTierInfo();
        loadTraits();
        loadLootInfo();
        loadWeapons();
        loadBanners();
        loadLifeStones();
        loadTrinkets();
        loadAugments();
        LOGGER.info("Data Ingestion Done");
    }

    private void loadTierInfo(){
        LOGGER.info("Loading Tier Info");
        for (ItemScalingCollection tagsCollection : dataDao.getMainData().getItemScaling().getCollection()) {
            ItemScaling itemScaling = new ItemScaling();
            itemScaling.setTierIdentifier(tagsCollection.getTierIdentifier());
            itemScaling.setRarity(ItemHelper.getRarity(tagsCollection.getRarityIdentifier()));
            itemScaling.setPlayerTierRequirement(tagsCollection.getPlayerTierRequirement());
            itemScaling.setMinWeaponDamage(tagsCollection.getMinWeaponDamage());
            itemScaling.setMaxWeaponDamage(tagsCollection.getMaxWeaponDamage());
            itemScaling.setMinPotionHeal(tagsCollection.getMinPotionHeal());
            itemScaling.setMaxPotionHeal(tagsCollection.getMaxPotionHeal());
            itemScaling.setMinBannerOvershield(tagsCollection.getMinBannerOvershield());
            itemScaling.setMaxBannerOvershield(tagsCollection.getMaxBannerOvershield());
            itemScaling.setPowerDrain(tagsCollection.getPowerDrain());
            itemScaling.setItemStrengthIndex(tagsCollection.getItemStrengthIndex());
            itemScaling.setCoreAttributeMax(tagsCollection.getCoreAttribute().getMax());
            itemScaling.setCoreAttributeMin(tagsCollection.getCoreAttribute().getMin());
            itemScaling.setCoreAttributePercentMax(tagsCollection.getCoreAttributePercent().getMax());
            itemScaling.setCoreAttributePercentMin(tagsCollection.getCoreAttributePercent().getMin());
            itemScaling.setDefensePercentMax(tagsCollection.getDefensePercent().getMax());
            itemScaling.setDefensePercentMin(tagsCollection.getDefensePercent().getMin());
            itemScaling.setReverseScalingMax(tagsCollection.getReverseScaling().getMax());
            itemScaling.setReverseScalingMin(tagsCollection.getReverseScaling().getMin());
            itemScaling.setNonScalingMax(tagsCollection.getNonScaling().getMax());
            itemScaling.setNonScalingMin(tagsCollection.getNonScaling().getMin());
            itemScaling.setPlayerPowerMax(tagsCollection.getPlayerPower().getMax());
            itemScaling.setPlayerPowerMin(tagsCollection.getPlayerPower().getMin());
            itemScaling.setPlayerHealthMax(tagsCollection.getPlayerHealth().getMax());
            itemScaling.setPlayerHealthMin(tagsCollection.getPlayerHealth().getMin());
            itemScaling.setAttributeNoVarianceMax(tagsCollection.getAttributeNoVariance().getMax());
            itemScaling.setAttributeNoVarianceMin(tagsCollection.getAttributeNoVariance().getMin());
            itemScaling.setHealthToDamageMax(tagsCollection.getHealthToDamage().getMax());
            itemScaling.setHealthToDamageMin(tagsCollection.getHealthToDamage().getMin());
            itemScaling.setNonScalingVarianceMax(tagsCollection.getNonScalingVariance().getMax());
            itemScaling.setNonScalingVarianceMin(tagsCollection.getNonScalingVariance().getMin());
            itemScaling.setNoVarianceCoreAttributePercentMax(tagsCollection.getNoVarianceCoreAttributePercent().getMax());
            itemScaling.setNoVarianceCoreAttributePercentMin(tagsCollection.getNoVarianceCoreAttributePercent().getMin());
            itemScaling.setNoVarianceDefensePercentMax(tagsCollection.getNoVarianceDefensePercent().getMax());
            itemScaling.setNoVarianceDefensePercentMin(tagsCollection.getNoVarianceDefensePercent().getMin());
            itemScaling.setNoVariancePlayerPowerMax(tagsCollection.getNoVariancePlayerPower().getMax());
            itemScaling.setNoVariancePlayerPowerMin(tagsCollection.getNoVariancePlayerPower().getMin());
            itemScaling.setNoVariancePlayerHealthMax(tagsCollection.getNoVariancePlayerHealth().getMax());
            itemScaling.setNoVariancePlayerHealthMin(tagsCollection.getNoVariancePlayerHealth().getMin());
            itemScaling.setNoVarianceHealthToDamageMax(tagsCollection.getNoVarianceHealthToDamage().getMax());
            itemScaling.setNoVarianceHealthToDamageMin(tagsCollection.getNoVarianceHealthToDamage().getMin());
            itemScalingDao.save(itemScaling);

        }
        itemScalingDao.flush();
    }

    private void loadLootInfo(){
        LOGGER.info("Loading Loot Info");
        for (LootItemCollection tagsCollection : dataDao.getMainData().getLootItem().getCollection()) {
            if(tagsCollection.getName() != null && tagsCollection.getGameplayTag()!= null) {
                LootInfo lootInfo = new LootInfo();
                lootInfo.setName(ItemHelper.formatWeaponName(tagsCollection.getName().stringValue, tagsCollection.getName().stringArrayValue));
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
                        if(s.startsWith("Keyword.")){
                            String sub = s.substring("Keyword.".length());
                            keywords.add(sub);
                        }
                        else{
                            keywords.add(s);
                        }
                    }
                }
                trait.setKeywords(keywords);
                traitDao.save(trait);
            }
        }
        traitDao.flush();
    }


    private void loadWeapons(){
        LOGGER.info("Loading Weapons");
        for(WeaponsCollection entry : dataDao.getMainData().getWeapons().getCollection()){
            Weapon weaponSave = new Weapon();
            weaponSave.setName(ItemHelper.formatWeaponName(entry.getName().stringValue, entry.getName().stringArrayValue));
            weaponSave.setElements(ItemHelper.getElements(entry.getElementTraitTagGroups()));
            weaponSave.setWeaponType(ItemHelper.getWeaponType(entry.getWeaponClassIdentifier()));
            weaponSave.setMinimumRarity(ItemHelper.getRarityByIndex(entry.getRarityIdentifier()));
            weaponSave.setGameplayTag(entry.getGameplayTag());
            weaponSave.setAffinities(ItemHelper.getAffinities(entry.getTraitTagGroups()));
            weaponSave.setItemType(ItemType.WEAPON);
            weaponSave.setLootInfo(lootInfoDao.findByGameplayTag(weaponSave.getGameplayTag()));
            String group = ItemHelper.getTraitName(entry.getTraitTagGroups());
            Set<Affinity> affinitySet = weaponSave.getAffinities();
            Set<Element> elementSet = weaponSave.getElements();
            Set<ItemType> itemTypeSet = new HashSet<>();
            itemTypeSet.add(weaponSave.getItemType());
            Set<WeaponType> weaponTypeSet = new HashSet<>();
            weaponTypeSet.add(weaponSave.getWeaponType());
           // Set<Trait> traitSet = getAdditionalTraits(group, weaponSave.getMinimumRarity(), affinitySet, elementSet, itemTypeSet, weaponTypeSet);
           // weaponSave.setTraits(traitSet);
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
            String group = ItemHelper.getTraitName(entry.getDefaultTraitTagGroups());
            Set<Affinity> affinitySet = bannerSave.getAffinities();
            Set<Element> elementSet = bannerSave.getElements();
            Set<ItemType> itemTypeSet = new HashSet<>();
            itemTypeSet.add(bannerSave.getItemType());
            Set<WeaponType> weaponTypeSet = new HashSet<>();
            /*if(!group.equals("Nothing")){
                Set<Trait> traits = traitDao.findAllByTraitGroup(group);
                if(traits!=null){
                    bannerSave.setTraits(traits);
                }
            }*/
           // Set<Trait> traitSet = getAdditionalTraits(group, Rarity.COMMON, affinitySet, elementSet, itemTypeSet, weaponTypeSet);
           // bannerSave.setTraits(traitSet);
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
            lifeStone.setHasPrimary(true);
            lifeStone.setItemType(ItemType.LIFESTONE);
            lifeStone.setLootInfo(lootInfoDao.findByGameplayTag(lifeStone.getGameplayTag()));
            if(entry.getTraitSlotGroups().toValue()!=null){
                if (entry.getTraitSlotGroups().toValue().contains("No Primary Trait")){
                    lifeStone.setHasPrimary(false);
                }
            }
            String group = ItemHelper.getTraitName(entry.getTraitTagGroups());
            Set<Affinity> affinitySet = lifeStone.getAffinities();
            Set<Element> elementSet = lifeStone.getElements();
            Set<ItemType> itemTypeSet = new HashSet<>();
            itemTypeSet.add(lifeStone.getItemType());
            Set<WeaponType> weaponTypeSet = new HashSet<>();
            /*if(!group.equals("Nothing")){
                Set<Trait> traits = traitDao.findAllByTraitGroup(group);
                if(traits!=null){
                    lifeStone.setTraits(traits);
                }
            }*/
           // Set<Trait> traitSet = getAdditionalTraits(group, Rarity.COMMON, affinitySet, elementSet, itemTypeSet, weaponTypeSet);
           // lifeStone.setTraits(traitSet);
            lifeStoneDao.save(lifeStone);
        }
        lifeStoneDao.flush();
    }

    private void loadTrinkets(){
        LOGGER.info("Loading Trinkets");
        for(TrinketsCollection entry : dataDao.getMainData().getTrinkets().getCollection()){
            Trinket trinket = new Trinket();
            trinket.setName(entry.getName());
            if(entry.getName().equals("Witherbone Amulet")){
                trinket.setName("Amulet of the Betrayer");
            }
            else if(entry.getName().equals("Amulet of the Betrayer")){
                trinket.setName("Empyrean Crest");
            }
            else if(entry.getName().equals("Empyrean Amulet")){
                trinket.setName("Whitherbone Pendant");
            }
            trinket.setElements(ItemHelper.getElements(entry.getElementTraitTagGroups()));
            trinket.setMinimumRarity(ItemHelper.getRarityByIndex(entry.getRarityIdentifier()));
            trinket.setGameplayTag(entry.getGameplayTag());
            trinket.setAffinities(ItemHelper.getAffinities(entry.getTraitTagGroups()));
            trinket.setItemType(ItemHelper.getItemType(entry.getClassName().toValue()));
            String group = ItemHelper.getTraitName(entry.getTraitTagGroups());
            trinket.setLootInfo(lootInfoDao.findByGameplayTag(trinket.getGameplayTag()));

            Set<Affinity> affinitySet = trinket.getAffinities();
            Set<Element> elementSet = trinket.getElements();
            Set<ItemType> itemTypeSet = new HashSet<>();
            itemTypeSet.add(trinket.getItemType());
            Set<WeaponType> weaponTypeSet = new HashSet<>();
            /*if(!group.equals("Nothing")){
                Set<Trait> traits = traitDao.findAllByTraitGroup(group);
                if(traits!=null){
                    trinket.setTraits(traits);
                }
            }*/
           // Set<Trait> traitSet = getAdditionalTraits(group, trinket.getMinimumRarity(), affinitySet, elementSet, itemTypeSet, weaponTypeSet);
           // trinket.setTraits(traitSet);
            trinketDao.save(trinket);
        }
        trinketDao.flush();
    }

    private void loadAugments(){
        LOGGER.info("Loading Augments");
        for(AugmentsCollection entry : dataDao.getMainData().getAugments().getCollection()){
            Augment augment = new Augment();
            augment.setName(entry.getName());
            augment.setElements(ItemHelper.getElements(entry.getTraitTagGroups()));
            augment.setMinimumRarity(ItemHelper.getRarity(entry.getRarityIdentifier()));
            augment.setGameplayTag(entry.getGameplayTag());
            augment.setAffinities(ItemHelper.getAffinities(entry.getTraitTagGroups()));
            augment.setItemType(ItemType.AUGMENT);
            augment.setLootInfo(lootInfoDao.findByGameplayTag(augment.getGameplayTag()));
            String group = ItemHelper.getTraitName(entry.getTraitTagGroups());
            Set<Affinity> affinitySet = augment.getAffinities();
            Set<Element> elementSet = augment.getElements();
            Set<ItemType> itemTypeSet = new HashSet<>();
            itemTypeSet.add(augment.getItemType());
            Set<WeaponType> weaponTypeSet = new HashSet<>();
            /*if(!group.equals("Nothing")){
                Set<Trait> traits = traitDao.findAllByTraitGroup(group);
                if(traits!=null){
                    augment.setTraits(traits);
                }
            }*/
           // Set<Trait> traitSet = getAdditionalTraits(group, augment.getMinimumRarity(), affinitySet, elementSet, itemTypeSet, weaponTypeSet);
            //augment.setTraits(traitSet);
            augmentDao.save(augment);
        }
        augmentDao.flush();
    }


   /* private Set<Trait> getAdditionalTraits(String traitGroup, Rarity rarity, Set<Affinity> affinitySet, Set<Element> elementSet, Set<ItemType> itemTypeSet, Set<WeaponType> weaponTypeSet){
        Set<AllowedTraitTags> allowedTraitTags = allowedTagDao.findAllByAffinityInAndElementInAndItemTypeInAndWeaponTypeIn(affinitySet, elementSet, itemTypeSet, weaponTypeSet);
        Set<AllowedTraitTags> allowedTraitTagsTwo = new HashSet<>();
        for (AllowedTraitTags allowedTraitTags1 : allowedTraitTags){
            if (allowedTraitTags1.getElement()!=Element.NA || allowedTraitTags1.getItemType()!=ItemType.NA || allowedTraitTags1.getAffinity()!=Affinity.NA || allowedTraitTags1.getWeaponType()!=WeaponType.NA){
                allowedTraitTagsTwo.add(allowedTraitTags1);
            }
        }
        Set<Trait> additionalTraits = traitDao.findAllByAllowedTraitTagsIn(allowedTraitTagsTwo);
        Set<Trait> traitSet = new HashSet<>();
        if(!traitGroup.equals("Nothing")){

            Set<Trait> traits = traitDao.findAllByTraitGroup(traitGroup);
            if(traits!=null){
                traitSet.addAll(traits);
            }
        }
        else{
            for(Trait tr : additionalTraits){
                if(tr.getTraitType()==TraitType.PRIMARY && rarity!=Rarity.COMMON) {
                    traitSet.add(tr);


                }
            }
        }
        for(Trait tr : additionalTraits) {
            if (tr.getTraitType() == TraitType.SECONDARY || tr.getTraitType() == TraitType.MASTERWORK) {
                traitSet.add(tr);
            }
        }
        return traitSet;
    }

    */
}
