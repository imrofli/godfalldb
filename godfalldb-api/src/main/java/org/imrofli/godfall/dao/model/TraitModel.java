package org.imrofli.godfall.dao.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class TraitModel extends AbstractEntity {

    @NotNull
    @NotEmpty
    private String name = "";

    @NotNull
    @NotEmpty
    private String traitGroup = "";



    @NotNull
    @NotEmpty
    @Lob
    @Column(length = 10000)
    private String description = "";

    @OneToMany(cascade = {CascadeType.ALL})
    private Set<TagRequirementModel> tagRequirements;

    @OneToMany(cascade = {CascadeType.ALL})
    private Set<LootEffectModel> lootEffects;

    @OneToMany(cascade = {CascadeType.ALL})
    private Set<ConditionalLootEffectModel> conditionalLootEffects;

    @Enumerated(EnumType.STRING)
    private RarityModel minimumRarity;

    @Enumerated(EnumType.STRING)
    private RarityModel maximumRarity;

    private Long minimumTier = 1L;

    private Long maximumTier = 1L;

    private Boolean matchModifierMagnitudes;

    private Long weight = 1L;

    @OneToOne(cascade = {CascadeType.ALL})
    private TraitCategoryModel traitCategory;

    @ElementCollection
    private Set<String> keywords;

    @ManyToOne
    private VersionModel version;


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

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
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

    public Set<TagRequirementModel> getTagRequirements() {
        return tagRequirements;
    }

    public void setTagRequirements(Set<TagRequirementModel> tagRequirements) {
        this.tagRequirements = tagRequirements;
    }

    public Set<LootEffectModel> getLootEffects() {
        return lootEffects;
    }

    public void setLootEffects(Set<LootEffectModel> lootEffects) {
        this.lootEffects = lootEffects;
    }


    public Set<ConditionalLootEffectModel> getConditionalLootEffects() {
        return conditionalLootEffects;
    }

    public void setConditionalLootEffects(Set<ConditionalLootEffectModel> conditionalLootEffects) {
        this.conditionalLootEffects = conditionalLootEffects;
    }

    public TraitCategoryModel getTraitCategory() {
        return traitCategory;
    }

    public void setTraitCategory(TraitCategoryModel traitCategory) {
        this.traitCategory = traitCategory;
    }

    public VersionModel getVersion() {
        return version;
    }

    public void setVersion(VersionModel version) {
        this.version = version;
    }
}
