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



    @NotNull
    @NotEmpty
    @Lob
    @Column( length = 100000 )
    private String description = "";

    @OneToMany(cascade = {CascadeType.ALL})
    private Set<TagRequirement> tagRequirements;

    @OneToMany(cascade = {CascadeType.ALL})
    private Set<LootEffect> lootEffects;

    @OneToMany(cascade = {CascadeType.ALL})
    private Set<ConditionalLootEffect> conditionalLootEffects;

    @Enumerated(EnumType.STRING)
    private Rarity minimumRarity;

    @Enumerated(EnumType.STRING)
    private Rarity maximumRarity;

    private Long minimumTier = 1L;

    private Long maximumTier = 1L;

    private Boolean matchModifierMagnitudes;

    private Long weight = 1L;

    @OneToOne(cascade = {CascadeType.ALL})
    private TraitCategory traitCategory;

    @ElementCollection
    private Set<String> keywords;

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

    public Set<TagRequirement> getTagRequirements() {
        return tagRequirements;
    }

    public void setTagRequirements(Set<TagRequirement> tagRequirements) {
        this.tagRequirements = tagRequirements;
    }

    public Set<LootEffect> getLootEffects() {
        return lootEffects;
    }

    public void setLootEffects(Set<LootEffect> lootEffects) {
        this.lootEffects = lootEffects;
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

    public Set<ConditionalLootEffect> getConditionalLootEffects() {
        return conditionalLootEffects;
    }

    public void setConditionalLootEffects(Set<ConditionalLootEffect> conditionalLootEffects) {
        this.conditionalLootEffects = conditionalLootEffects;
    }

    public TraitCategory getTraitCategory() {
        return traitCategory;
    }

    public void setTraitCategory(TraitCategory traitCategory) {
        this.traitCategory = traitCategory;
    }

    @Override
    public String toString() {
        return "Trait{" +
                "description='" + description + '\'' +
                '}';
    }
}
