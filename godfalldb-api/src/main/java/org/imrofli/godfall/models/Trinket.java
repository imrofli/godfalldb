package org.imrofli.godfall.models;

import org.imrofli.godfall.data.Index;

public class Trinket {
    private String name;
    private ItemType itemType;
    private Index rarity;
    private String element;
    private String stat;
    private LootInfo lootInfo;
    private TraitInfo traitInfo;


    public Trinket() {
    }

    public Trinket(String name, ItemType itemType, Index rarity, String element, String stat, LootInfo lootInfo, TraitInfo traitInfo) {
        this.name = name;
        this.itemType = itemType;
        this.rarity = rarity;
        this.element = element;
        this.stat = stat;
        this.lootInfo = lootInfo;
        this.traitInfo = traitInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ItemType getTrinketType() {
        return itemType;
    }

    public void setTrinketType(ItemType itemType) {
        this.itemType = itemType;
    }

    public Index getRarity() {
        return rarity;
    }

    public void setRarity(Index rarity) {
        this.rarity = rarity;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public TraitInfo getTraitInfo() {
        return traitInfo;
    }

    public void setTraitInfo(TraitInfo traitInfo) {
        this.traitInfo = traitInfo;
    }

    public LootInfo getLootInfo() {
        return lootInfo;
    }

    public void setLootInfo(LootInfo lootInfo) {
        this.lootInfo = lootInfo;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    @Override
    public String toString() {
        return "Trinket{" +
                "name='" + name + '\'' +
                ", trinketType=" + itemType +
                ", rarity=" + rarity +
                ", element='" + element + '\'' +
                ", stat='" + stat + '\'' +
                ", lootInfo=" + lootInfo +
                ", traitInfo=" + traitInfo +
                '}';
    }
}
