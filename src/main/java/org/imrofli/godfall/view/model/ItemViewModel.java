package org.imrofli.godfall.view.model;

import org.imrofli.godfall.models.LootInfo;
import org.imrofli.godfall.models.TraitInfo;

public class ItemViewModel {

    protected String name;
    protected String element;
    protected String rarity;
    protected String description;
    protected String stat;

    public ItemViewModel(String name, String element, String rarity, String description, String stat) {
        this.name = name;
        this.element = element;
        this.rarity = rarity;
        this.description = description;
        this.stat = stat;
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

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    @Override
    public String toString() {
        return "ItemViewModel{" +
                "name='" + name + '\'' +
                ", element='" + element + '\'' +
                ", rarity='" + rarity + '\'' +
                ", description='" + description + '\'' +
                ", stat='" + stat + '\'' +
                '}';
    }
}
