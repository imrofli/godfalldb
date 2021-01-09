package org.imrofli.godfall.dao.model;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class BannerModel extends AbstractEntity {

    @NotNull
    @NotEmpty
    private String name = "";

    private String displayName;

    @Lob
    @Column(length = 10000)
    private String displayDescription;

    @ElementCollection(targetClass = ElementModel.class)
    private Set<ElementModel> elements;

    private String gameplayTag;

    private Long overshieldScalar;

    private Long radiusScalar;

    private Long cooldownScalar;

    @Enumerated(EnumType.STRING)
    private ItemTypeModel itemType;

    @ElementCollection(targetClass = AffinityModel.class)
    private Set<AffinityModel> affinities;

    @OneToOne
    private LootInfoModel lootInfo;

    @ElementCollection
    private Set<String> tags;

    @ElementCollection
    private Set<String> blacklistTags;

    @ManyToMany
    @JoinTable(
            name = "banner_traitslot",
            joinColumns = @JoinColumn(name = "banner_id"),
            inverseJoinColumns = @JoinColumn(name = "traitslot_id"))
    private Set<TraitSlotModel> traitSlots;

    @ManyToOne
    private VersionModel version;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<ElementModel> getElements() {
        return elements;
    }

    public void setElements(Set<ElementModel> elements) {
        this.elements = elements;
    }

    public Long getOvershieldScalar() {
        return overshieldScalar;
    }

    public void setOvershieldScalar(Long overshieldScalar) {
        this.overshieldScalar = overshieldScalar;
    }

    public Long getRadiusScalar() {
        return radiusScalar;
    }

    public void setRadiusScalar(Long radiusScalar) {
        this.radiusScalar = radiusScalar;
    }

    public Long getCooldownScalar() {
        return cooldownScalar;
    }

    public void setCooldownScalar(Long cooldownScalar) {
        this.cooldownScalar = cooldownScalar;
    }


    public String getGameplayTag() {
        return gameplayTag;
    }

    public void setGameplayTag(String gameplayTag) {
        this.gameplayTag = gameplayTag;
    }

    public Set<AffinityModel> getAffinities() {
        return affinities;
    }

    public void setAffinities(Set<AffinityModel> affinities) {
        this.affinities = affinities;
    }

    public ItemTypeModel getItemType() {
        return itemType;
    }

    public void setItemType(ItemTypeModel itemType) {
        this.itemType = itemType;
    }

    public LootInfoModel getLootInfo() {
        return lootInfo;
    }

    public void setLootInfo(LootInfoModel lootInfo) {
        this.lootInfo = lootInfo;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayDescription() {
        return displayDescription;
    }

    public void setDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
    }

    public Set<String> getBlacklistTags() {
        return blacklistTags;
    }

    public void setBlacklistTags(Set<String> blacklistTags) {
        this.blacklistTags = blacklistTags;
    }

    public Set<TraitSlotModel> getTraitSlots() {
        return traitSlots;
    }

    public void setTraitSlots(Set<TraitSlotModel> traitSlots) {
        this.traitSlots = traitSlots;
    }

    public VersionModel getVersion() {
        return version;
    }

    public void setVersion(VersionModel version) {
        this.version = version;
    }
}
