package org.imrofli.godfall.dao.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Set;

@Entity
public class Valorplate extends AbstractEntity {

    private String name;
    private String displayname;
    private String gameplayTag;
    @OneToOne(cascade = CascadeType.ALL)
    private ArchonMode archonmode;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<AugmentGraph> augmentGraphs;
    private Boolean enabled;
    private Integer startinglevel;
    private Double archonChargeGainMultiplier;
    private Double aetheriumArchonChargeRate;
    private Double archonModeDrainRate;
    private Double archonDamageScalar;
    private Double archonModeDamageReduction;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public ArchonMode getArchonmode() {
        return archonmode;
    }

    public void setArchonmode(ArchonMode archonmode) {
        this.archonmode = archonmode;
    }

    public String getGameplayTag() {
        return gameplayTag;
    }

    public void setGameplayTag(String gameplayTag) {
        this.gameplayTag = gameplayTag;
    }

    public Set<AugmentGraph> getAugmentGraphs() {
        return augmentGraphs;
    }

    public void setAugmentGraphs(Set<AugmentGraph> augmentGraphs) {
        this.augmentGraphs = augmentGraphs;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getStartinglevel() {
        return startinglevel;
    }

    public void setStartinglevel(Integer startinglevel) {
        this.startinglevel = startinglevel;
    }

    public Double getArchonChargeGainMultiplier() {
        return archonChargeGainMultiplier;
    }

    public void setArchonChargeGainMultiplier(Double archonChargeGainMultiplier) {
        this.archonChargeGainMultiplier = archonChargeGainMultiplier;
    }

    public Double getAetheriumArchonChargeRate() {
        return aetheriumArchonChargeRate;
    }

    public void setAetheriumArchonChargeRate(Double aetheriumArchonChargeRate) {
        this.aetheriumArchonChargeRate = aetheriumArchonChargeRate;
    }

    public Double getArchonModeDrainRate() {
        return archonModeDrainRate;
    }

    public void setArchonModeDrainRate(Double archonModeDrainRate) {
        this.archonModeDrainRate = archonModeDrainRate;
    }

    public Double getArchonDamageScalar() {
        return archonDamageScalar;
    }

    public void setArchonDamageScalar(Double archonDamageScalar) {
        this.archonDamageScalar = archonDamageScalar;
    }

    public Double getArchonModeDamageReduction() {
        return archonModeDamageReduction;
    }

    public void setArchonModeDamageReduction(Double archonModeDamageReduction) {
        this.archonModeDamageReduction = archonModeDamageReduction;
    }
}
