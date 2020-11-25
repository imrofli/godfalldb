package org.imrofli.godfall.models;

public class LifeStone {
    private String name;
    private String element;
    private LootInfo lootInfo;
    private TraitInfo traitInfo;

    public LifeStone() {
    }

    public LifeStone(String name, String element, LootInfo lootInfo, TraitInfo traitInfo) {
        this.name = name;
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
        return "LifeStone{" +
                "name='" + name + '\'' +
                ", element='" + element + '\'' +
                ", lootInfo=" + lootInfo +
                ", traitInfo=" + traitInfo +
                '}';
    }
}
