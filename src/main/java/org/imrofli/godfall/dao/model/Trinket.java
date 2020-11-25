package org.imrofli.godfall.dao.model;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class Trinket extends AbstractEntity {

    @NotNull
    @NotEmpty
    private String name = "";

    @ElementCollection(targetClass = Element.class)
    private Set<Element> elements;

    private String gameplayTag;

    @Enumerated(EnumType.STRING)
    private Rarity minimumRarity;

    @Enumerated(EnumType.STRING)
    private ItemType itemType;

    @ElementCollection(targetClass = Affinity.class)
    private Set<Affinity> affinities;

    @OneToOne
    private LootInfo lootInfo;

    @ManyToMany
    @JoinTable(
            name = "trinket_traits",
            joinColumns = @JoinColumn(name = "trinket_id"),
            inverseJoinColumns = @JoinColumn(name = "trait_id"))
    private Set<Trait> traits;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Element> getElements() {
        return elements;
    }

    public void setElements(Set<Element> elements) {
        this.elements = elements;
    }

    public Set<Trait> getTraits() {
        return traits;
    }

    public void setTraits(Set<Trait> traits) {
        this.traits = traits;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public Rarity getMinimumRarity() {
        return minimumRarity;
    }

    public void setMinimumRarity(Rarity minimumRarity) {
        this.minimumRarity = minimumRarity;
    }

    public String getGameplayTag() {
        return gameplayTag;
    }

    public void setGameplayTag(String gameplayTag) {
        this.gameplayTag = gameplayTag;
    }

    public Set<Affinity> getAffinities() {
        return affinities;
    }

    public void setAffinities(Set<Affinity> affinities) {
        this.affinities = affinities;
    }

    public LootInfo getLootInfo() {
        return lootInfo;
    }

    public void setLootInfo(LootInfo lootInfo) {
        this.lootInfo = lootInfo;
    }

    @Override
    public String toString() {
        return "Trinket{" +
                "name='" + name + '\'' +
                ", elements=" + elements +
                ", gameplayTag='" + gameplayTag + '\'' +
                ", minimumRarity=" + minimumRarity +
                ", itemType=" + itemType +
                ", affinities=" + affinities +
                ", lootInfo=" + lootInfo +
                ", traits=" + traits +
                '}';
    }
}
