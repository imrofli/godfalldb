package org.imrofli.godfall.models;

import org.imrofli.godfall.data.Index;

public class Augment {
    private String name;
    private Affinity affinitiy;
    private Index rarity;
    private String element;
    private LootInfo lootInfo;
    private TraitInfo traitInfo;

    public Augment() {
    }

    public Augment(String name, Affinity affinitiy, Index rarity, String element, LootInfo lootInfo, TraitInfo traitInfo) {
        this.name = name;
        this.affinitiy = affinitiy;
        this.rarity = rarity;
        this.element = element;
        this.lootInfo = lootInfo;
        this.traitInfo = traitInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Affinity getAffinitiy() {
        return affinitiy;
    }

    public void setAffinitiy(Affinity affinitiy) {
        this.affinitiy = affinitiy;
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

    public LootInfo getLootInfo() {
        return lootInfo;
    }

    public void setLootInfo(LootInfo lootInfo) {
        this.lootInfo = lootInfo;
    }

    public TraitInfo getTraitInfo() {
        return traitInfo;
    }

    public void setTraitInfo(TraitInfo traitInfo) {
        this.traitInfo = traitInfo;
    }

    @Override
    public String toString() {
        return "Augment{" +
                "name='" + name + '\'' +
                ", affinitiy=" + affinitiy +
                ", rarity=" + rarity +
                ", element='" + element + '\'' +
                ", lootInfo=" + lootInfo +
                ", traitInfo=" + traitInfo +
                '}';
    }
}
