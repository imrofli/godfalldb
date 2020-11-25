package org.imrofli.godfall.dao.model;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class LootInfo extends AbstractEntity{

    @NotNull
    @NotEmpty
    private String name = "";

    private String gameplayTag;

    @Enumerated(EnumType.STRING)
    private Rarity minimumRarity;

    @Enumerated(EnumType.STRING)
    private Rarity maximumRarity;

    private Long minimumTier;

    private Long maximumTier;

    private Long weight;

    private Boolean isTowerDrop;

    private Boolean isPreorderDrop;

    private Boolean isSpecificDrop;

    @Enumerated(EnumType.STRING)
    private ItemType itemType;

    @ElementCollection
    private Set<String> dropTags;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGameplayTag() {
        return gameplayTag;
    }

    public void setGameplayTag(String gameplayTag) {
        this.gameplayTag = gameplayTag;
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

    public Long getMinimumTier() {
        return minimumTier;
    }

    public void setMinimumTier(Long minimumTier) {
        this.minimumTier = minimumTier;
    }

    public Long getMaximumTier() {
        return maximumTier;
    }

    public void setMaximumTier(Long maximumTier) {
        this.maximumTier = maximumTier;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public Set<String> getDropTags() {
        return dropTags;
    }

    public void setDropTags(Set<String> dropTags) {
        this.dropTags = dropTags;
    }

    public Boolean getTowerDrop() {
        return isTowerDrop;
    }

    public void setTowerDrop(Boolean towerDrop) {
        isTowerDrop = towerDrop;
    }

    public Boolean getPreorderDrop() {
        return isPreorderDrop;
    }

    public void setPreorderDrop(Boolean preorderDrop) {
        isPreorderDrop = preorderDrop;
    }

    public Boolean getSpecificDrop() {
        return isSpecificDrop;
    }

    public void setSpecificDrop(Boolean specificDrop) {
        isSpecificDrop = specificDrop;
    }

    @Override
    public String toString() {
        return "LootInfo{" +
                "name='" + name + '\'' +
                ", gameplayTag='" + gameplayTag + '\'' +
                ", minimumRarity=" + minimumRarity +
                ", maximumRarity=" + maximumRarity +
                ", minimumTier=" + minimumTier +
                ", maximumTier=" + maximumTier +
                ", weight=" + weight +
                ", isTowerDrop=" + isTowerDrop +
                ", isPreorderDrop=" + isPreorderDrop +
                ", isSpecificDrop=" + isSpecificDrop +
                ", itemType=" + itemType +
                ", dropTags=" + dropTags +
                '}';
    }
}
