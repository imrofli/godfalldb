package org.imrofli.godfall.models;

import java.util.List;

public class Weapon {

    private String name;
    private WeaponClass weaponClass;
    private String element;
    private LootInfo lootInfo;
    private List<TraitInfo> traitInfo;

    public Weapon() {
    }

    public Weapon(String name, WeaponClass weaponClass, String element, LootInfo lootInfo, List<TraitInfo> traitInfo) {
        this.name = name;
        this.weaponClass = weaponClass;
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

    public WeaponClass getWeaponClass() {
        return weaponClass;
    }

    public void setWeaponClass(WeaponClass weaponClass) {
        this.weaponClass = weaponClass;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public List<TraitInfo> getTraitInfo() {
        return traitInfo;
    }

    public void setTraitInfo(List<TraitInfo> traitInfo) {
        this.traitInfo = traitInfo;
    }

    public LootInfo getLootInfo() {
        return lootInfo;
    }

    public void setLootInfo(LootInfo lootInfo) {
        this.lootInfo = lootInfo;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", weaponClass=" + weaponClass +
                ", element='" + element + '\'' +
                ", lootInfo=" + lootInfo +
                ", traitInfo=" + traitInfo +
                '}';
    }
}
