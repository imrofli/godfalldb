package org.imrofli.godfall.dao.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class TraitSlotModel extends AbstractEntity {

    private String name;
    private String slotIndex;
    private String groupName;
    @Enumerated(EnumType.STRING)
    @NotNull
    private SlotTypeModel slotType;
    private SlotTypeModel traitCategoryGroup;
    private RarityModel minimumRarity;
    private RarityModel maximumRarity;
    private Long slotChance;
    private Long traitChance;
    private String displayName;

    @ManyToOne
    private VersionModel version;


    @ManyToMany(mappedBy = "traitSlots", cascade = {CascadeType.ALL})
    private Set<WeaponModel> weapons;

    @ManyToMany(mappedBy = "traitSlots", cascade = {CascadeType.ALL})
    private Set<BannerModel> banners;

    @ManyToMany(mappedBy = "traitSlots", cascade = {CascadeType.ALL})
    private Set<LifeStoneModel> lifeStones;

    @ManyToMany(mappedBy = "traitSlots", cascade = {CascadeType.ALL})
    private Set<TrinketModel> trinkets;

    @ManyToMany(mappedBy = "traitSlots", cascade = {CascadeType.ALL})
    private Set<AugmentModel> augments;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlotIndex() {
        return slotIndex;
    }

    public void setSlotIndex(String slotIndex) {
        this.slotIndex = slotIndex;
    }

    public SlotTypeModel getSlotType() {
        return slotType;
    }

    public void setSlotType(SlotTypeModel slotType) {
        this.slotType = slotType;
    }

    public SlotTypeModel getTraitCategoryGroup() {
        return traitCategoryGroup;
    }

    public void setTraitCategoryGroup(SlotTypeModel traitCategoryGroup) {
        this.traitCategoryGroup = traitCategoryGroup;
    }

    public RarityModel getMinimumRarity() {
        return minimumRarity;
    }

    public void setMinimumRarity(RarityModel minimumRarity) {
        this.minimumRarity = minimumRarity;
    }

    public RarityModel getMaximumRarity() {
        return maximumRarity;
    }

    public void setMaximumRarity(RarityModel maximumRarity) {
        this.maximumRarity = maximumRarity;
    }

    public Long getSlotChance() {
        return slotChance;
    }

    public void setSlotChance(Long slotChance) {
        this.slotChance = slotChance;
    }

    public Long getTraitChance() {
        return traitChance;
    }

    public void setTraitChance(Long traitChance) {
        this.traitChance = traitChance;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Set<WeaponModel> getWeapons() {
        return weapons;
    }

    public void setWeapons(Set<WeaponModel> weapons) {
        this.weapons = weapons;
    }

    public Set<BannerModel> getBanners() {
        return banners;
    }

    public void setBanners(Set<BannerModel> banners) {
        this.banners = banners;
    }

    public Set<LifeStoneModel> getLifeStones() {
        return lifeStones;
    }

    public void setLifeStones(Set<LifeStoneModel> lifeStones) {
        this.lifeStones = lifeStones;
    }

    public Set<TrinketModel> getTrinkets() {
        return trinkets;
    }

    public void setTrinkets(Set<TrinketModel> trinkets) {
        this.trinkets = trinkets;
    }

    public Set<AugmentModel> getAugments() {
        return augments;
    }

    public void setAugments(Set<AugmentModel> augments) {
        this.augments = augments;
    }

    public VersionModel getVersion() {
        return version;
    }

    public void setVersion(VersionModel version) {
        this.version = version;
    }
}
