package org.imrofli.godfall.dao.model;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Set;

@Entity
public class TraitCategory extends AbstractEntity{


    private String name;

    private String groupname;

    @Enumerated(EnumType.STRING)
    private TraitType traitType;

    @ElementCollection
    private Set<String> allowedTraitTags;

    private String traitGroup;

    @ElementCollection
    private Set<String> exclusionGroups;

    private Long minimumTier;

    private Long maximumTier;

    private Long weight;

    @Enumerated(EnumType.STRING)
    private Rarity minimumRarity;

    @Enumerated(EnumType.STRING)
    private Rarity maximumRarity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public TraitType getTraitType() {
        return traitType;
    }

    public void setTraitType(TraitType traitType) {
        this.traitType = traitType;
    }

    public Set<String> getAllowedTraitTags() {
        return allowedTraitTags;
    }

    public void setAllowedTraitTags(Set<String> allowedTraitTags) {
        this.allowedTraitTags = allowedTraitTags;
    }

    public String getTraitGroup() {
        return traitGroup;
    }

    public void setTraitGroup(String traitGroup) {
        this.traitGroup = traitGroup;
    }

    public Set<String> getExclusionGroups() {
        return exclusionGroups;
    }

    public void setExclusionGroups(Set<String> exclusionGroups) {
        this.exclusionGroups = exclusionGroups;
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
}
