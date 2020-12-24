package org.imrofli.godfall.dao.model;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class LifeStone extends AbstractEntity {

    @NotNull
    @NotEmpty
    private String name = "";

    private String displayName;

    @Lob
    @Column(length = 10000)
    private String displayDescription;

    private Long healScalar;

    private Long chargesScalar;

    private Long healDurationScalar;

    private Long secondaryTraitDurationScalar;

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

    @ElementCollection
    private Set<String> tags;

    @ElementCollection
    private Set<String> blacklistTags;

    @ManyToMany
    @JoinTable(
            name = "lifestone_traitslot",
            joinColumns = @JoinColumn(name = "lifestone_id"),
            inverseJoinColumns = @JoinColumn(name = "traitslot_id"))
    private Set<TraitSlot> traitSlots;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public Long getHealScalar() {
        return healScalar;
    }

    public void setHealScalar(Long healScalar) {
        this.healScalar = healScalar;
    }

    public Long getChargesScalar() {
        return chargesScalar;
    }

    public void setChargesScalar(Long chargesScalar) {
        this.chargesScalar = chargesScalar;
    }

    public Long getHealDurationScalar() {
        return healDurationScalar;
    }

    public void setHealDurationScalar(Long healDurationScalar) {
        this.healDurationScalar = healDurationScalar;
    }

    public Long getSecondaryTraitDurationScalar() {
        return secondaryTraitDurationScalar;
    }

    public void setSecondaryTraitDurationScalar(Long secondaryTraitDurationScalar) {
        this.secondaryTraitDurationScalar = secondaryTraitDurationScalar;
    }

    public Set<Element> getElements() {
        return elements;
    }

    public void setElements(Set<Element> elements) {
        this.elements = elements;
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

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    public Set<String> getBlacklistTags() {
        return blacklistTags;
    }

    public void setBlacklistTags(Set<String> blacklistTags) {
        this.blacklistTags = blacklistTags;
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

    public Set<TraitSlot> getTraitSlots() {
        return traitSlots;
    }

    public void setTraitSlots(Set<TraitSlot> traitSlots) {
        this.traitSlots = traitSlots;
    }
}
