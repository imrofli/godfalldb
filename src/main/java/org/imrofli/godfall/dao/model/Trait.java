package org.imrofli.godfall.dao.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class Trait extends AbstractEntity{

    @NotNull
    @NotEmpty
    private String name = "";

    @NotNull
    @NotEmpty
    private String traitGroup = "";

    @Enumerated(EnumType.STRING)
    @NotNull
    private TraitType traitType;

    @NotNull
    @NotEmpty
    private String description = "";

    private Long minimumTier = 1L;

    private Long maximumTier = 1L;

    @Enumerated(EnumType.STRING)
    private Rarity minimumRarity;

    @Enumerated(EnumType.STRING)
    private Rarity maximumRarity;

    private Long weight = 1L;

    @ElementCollection
    private Set<String> keywords;

    @OneToMany(cascade = {CascadeType.ALL})
    private Set<LootEffect> lootEffects;

    @OneToMany(cascade = {CascadeType.ALL})
    private Set<TagRequirement> tagRequirements;

    private Boolean matchModifierMagnitudes = false;

    @ManyToMany(mappedBy = "traits",cascade = {CascadeType.ALL})
    private Set<Weapon> weapons;

    @ManyToMany(mappedBy = "traits",cascade = {CascadeType.ALL})
    private Set<Banner> banners;

    @ManyToMany(mappedBy = "traits",cascade = {CascadeType.ALL})
    private Set<LifeStone> lifeStones;

    @ManyToMany(mappedBy = "traits",cascade = {CascadeType.ALL})
    private Set<Trinket> trinkets;

    @ManyToMany(mappedBy = "traits",cascade = {CascadeType.ALL})
    private Set<Augment> augments;

    @ManyToMany
    @JoinTable(
            name = "trait_tags",
            joinColumns = @JoinColumn(name = "trait_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id"))
    private Set<AllowedTraitTags> allowedTraitTags;

    @ElementCollection
    private Set<String> tagExclusionGroups;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTraitGroup() {
        return traitGroup;
    }

    public void setTraitGroup(String traitGroup) {
        this.traitGroup = traitGroup;
    }

    public TraitType getTraitType() {
        return traitType;
    }

    public void setTraitType(TraitType traitType) {
        this.traitType = traitType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public void setMaximumTier(Long maxiumumTier) {
        this.maximumTier = maxiumumTier;
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

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public Set<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(Set<Weapon> weapons) {
        this.weapons = weapons;
    }

    public Set<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(Set<String> keywords) {
        this.keywords = keywords;
    }

    public Boolean getMatchModifierMagnitudes() {
        return matchModifierMagnitudes;
    }

    public void setMatchModifierMagnitudes(Boolean matchModifierMagnitudes) {
        this.matchModifierMagnitudes = matchModifierMagnitudes;
    }

    public Set<LootEffect> getLootEffects() {
        return lootEffects;
    }

    public void setLootEffects(Set<LootEffect> lootEffects) {
        this.lootEffects = lootEffects;
    }

    public Set<TagRequirement> getTagRequirements() {
        return tagRequirements;
    }

    public void setTagRequirements(Set<TagRequirement> tagRequirements) {
        this.tagRequirements = tagRequirements;
    }

    public Set<Banner> getBanners() {
        return banners;
    }

    public void setBanners(Set<Banner> banners) {
        this.banners = banners;
    }

    public Set<LifeStone> getLifeStones() {
        return lifeStones;
    }

    public void setLifeStones(Set<LifeStone> lifeStones) {
        this.lifeStones = lifeStones;
    }

    public Set<Trinket> getTrinkets() {
        return trinkets;
    }

    public void setTrinkets(Set<Trinket> trinkets) {
        this.trinkets = trinkets;
    }

    public Set<Augment> getAugments() {
        return augments;
    }

    public void setAugments(Set<Augment> augments) {
        this.augments = augments;
    }

    public Set<AllowedTraitTags> getAllowedTraitTags() {
        return allowedTraitTags;
    }

    public void setAllowedTraitTags(Set<AllowedTraitTags> allowedTraitTags) {
        this.allowedTraitTags = allowedTraitTags;
    }

    public Set<String> getTagExclusionGroups() {
        return tagExclusionGroups;
    }

    public void setTagExclusionGroups(Set<String> tagExclusionGroups) {
        this.tagExclusionGroups = tagExclusionGroups;
    }

    @Override
    public String toString() {
        return "Trait{" +
                "description='" + description + '\'' +
                '}';
    }
}
