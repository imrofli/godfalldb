package org.imrofli.godfall.models;

import java.util.List;

public class TraitInfo {
    private String name;
    private List<NamedLootEffect> namedLootEffects;
    private String description;

    public TraitInfo() {
    }

    public TraitInfo(String name, List<NamedLootEffect> namedLootEffects, String description) {
        this.name = name;
        this.namedLootEffects = namedLootEffects;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<NamedLootEffect> getNamedLootEffects() {
        return namedLootEffects;
    }

    public void setNamedLootEffects(List<NamedLootEffect> namedLootEffects) {
        this.namedLootEffects = namedLootEffects;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "TraitInfo{" +
                "name='" + name + '\'' +
                ", namedLootEffects=" + namedLootEffects +
                ", description='" + description + '\'' +
                '}';
    }
}
