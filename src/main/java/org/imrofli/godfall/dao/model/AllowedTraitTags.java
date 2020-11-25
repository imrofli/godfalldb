package org.imrofli.godfall.dao.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class AllowedTraitTags extends AbstractEntity{

    @NotNull
    private String name = "";

    @NotNull
    private String groupName = "";

    @NotNull
    private String traitGroup = "";

    @Enumerated(EnumType.STRING)
    private ItemType itemType;

    @Enumerated(EnumType.STRING)
    private Element element;

    @Enumerated(EnumType.STRING)
    private WeaponType weaponType;

    @Enumerated(EnumType.STRING)
    private Affinity affinity;

    @ElementCollection
    private Set<String> exclusionGroups;

    @ManyToMany(mappedBy = "allowedTraitTags",cascade = {CascadeType.ALL})
    private Set<Trait> traits;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupName() {
        return groupName;
    }

    public Affinity getAffinity() {
        return affinity;
    }

    public void setAffinity(Affinity affinity) {
        this.affinity = affinity;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getTraitGroup() {
        return traitGroup;
    }

    public void setTraitGroup(String traitGroup) {
        this.traitGroup = traitGroup;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    public Set<Trait> getTraits() {
        return traits;
    }

    public void setTraits(Set<Trait> traits) {
        this.traits = traits;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public Set<String> getExclusionGroups() {
        return exclusionGroups;
    }

    public void setExclusionGroups(Set<String> exclusionGroups) {
        this.exclusionGroups = exclusionGroups;
    }

    @Override
    public String toString() {
        return "AllowedTraitTags{" +
                "itemType=" + itemType +
                ", element=" + element +
                '}';
    }
}
