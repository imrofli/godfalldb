package org.imrofli.godfall.dao.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class LootInfoModel extends AbstractEntity {

    @NotNull
    @NotEmpty
    private String name = "";

    private String gameplayTag;

    @Enumerated(EnumType.STRING)
    private RarityModel minimumRarity;

    @Enumerated(EnumType.STRING)
    private RarityModel maximumRarity;

    private Long minimumTier;

    private Long maximumTier;

    private Long weight;

    private Boolean isTowerDrop;

    private Boolean isPreorderDrop;

    private Boolean isSpecificDrop;

    @Enumerated(EnumType.STRING)
    private ItemTypeModel itemType;

    @ElementCollection
    private Set<String> dropTags;

    @ManyToOne
    private VersionModel version;


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

    public RarityModel getMinimumRarity() {
        return minimumRarity;
    }

    public void setMinimumRarity(RarityModel minimumRarity) {
        this.minimumRarity = minimumRarity;
    }

    public RarityModel getMaximumRarity() {
        return maximumRarity;
    }

    public void setMaximumRarity(RarityModel maximumRarity) {
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

    public ItemTypeModel getItemType() {
        return itemType;
    }

    public void setItemType(ItemTypeModel itemType) {
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

    public VersionModel getVersion() {
        return version;
    }

    public void setVersion(VersionModel version) {
        this.version = version;
    }
}
