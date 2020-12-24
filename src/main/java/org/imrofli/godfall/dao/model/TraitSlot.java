package org.imrofli.godfall.dao.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class TraitSlot extends AbstractEntity {

    private String name;
    private String slotIndex;
    private String groupName;
    @Enumerated(EnumType.STRING)
    @NotNull
    private SlotType slotType;
    private SlotType traitCategoryGroup;
    private Rarity minimumRarity;
    private Rarity maximumRarity;
    private Long slotChance;
    private Long traitChance;
    private String displayName;


    @ManyToMany(mappedBy = "traitSlots", cascade = {CascadeType.ALL})
    private Set<Weapon> weapons;

    @ManyToMany(mappedBy = "traitSlots", cascade = {CascadeType.ALL})
    private Set<Banner> banners;

    @ManyToMany(mappedBy = "traitSlots", cascade = {CascadeType.ALL})
    private Set<LifeStone> lifeStones;

    @ManyToMany(mappedBy = "traitSlots", cascade = {CascadeType.ALL})
    private Set<Trinket> trinkets;

    @ManyToMany(mappedBy = "traitSlots", cascade = {CascadeType.ALL})
    private Set<Augment> augments;


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

    public SlotType getSlotType() {
        return slotType;
    }

    public void setSlotType(SlotType slotType) {
        this.slotType = slotType;
    }

    public SlotType getTraitCategoryGroup() {
        return traitCategoryGroup;
    }

    public void setTraitCategoryGroup(SlotType traitCategoryGroup) {
        this.traitCategoryGroup = traitCategoryGroup;
    }

    public Rarity getMinimumRarity() {
        return minimumRarity;
    }

    public void setMinimumRarity(Rarity minimumRarity) {
        this.minimumRarity = minimumRarity;
    }

    public Rarity getMaximumRarity() {
        return maximumRarity;
    }

    public void setMaximumRarity(Rarity maximumRarity) {
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

    public Set<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(Set<Weapon> weapons) {
        this.weapons = weapons;
    }

    public Set<Banner> getBanners() {
        return banners;
    }

    public void setBanners(Set<Banner> banners) {
        this.banners = banners;
    }

    public Set<LifeStone> getLifeStones() {
        return lifeStones;
    }

    public void setLifeStones(Set<LifeStone> lifeStones) {
        this.lifeStones = lifeStones;
    }

    public Set<Trinket> getTrinkets() {
        return trinkets;
    }

    public void setTrinkets(Set<Trinket> trinkets) {
        this.trinkets = trinkets;
    }

    public Set<Augment> getAugments() {
        return augments;
    }

    public void setAugments(Set<Augment> augments) {
        this.augments = augments;
    }
}
