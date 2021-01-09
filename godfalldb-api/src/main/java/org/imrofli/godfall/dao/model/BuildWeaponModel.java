package org.imrofli.godfall.dao.model;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class BuildWeaponModel extends AbstractEntity {

    @NotNull
    @ManyToOne
    private WeaponModel selectedWeapon;

    private Long itemLevel;

    @ManyToOne
    private TraitModel primaryTraitOne;

    @ManyToOne
    private TraitModel primaryTraitTwo;

    @ManyToOne
    private TraitModel SecondaryTraitOne;

    @ManyToOne
    private TraitModel SecondaryTraitTwo;

    @ManyToOne
    private TraitModel SecondaryTraitThree;

    @ManyToOne
    private TraitModel SecondaryTraitFour;

    public WeaponModel getSelectedWeapon() {
        return selectedWeapon;
    }

    public void setSelectedWeapon(WeaponModel selectedWeapon) {
        this.selectedWeapon = selectedWeapon;
    }

    public Long getItemLevel() {
        return itemLevel;
    }

    public void setItemLevel(Long itemLevel) {
        this.itemLevel = itemLevel;
    }

    public TraitModel getPrimaryTraitOne() {
        return primaryTraitOne;
    }

    public void setPrimaryTraitOne(TraitModel primaryTraitOne) {
        this.primaryTraitOne = primaryTraitOne;
    }

    public TraitModel getPrimaryTraitTwo() {
        return primaryTraitTwo;
    }

    public void setPrimaryTraitTwo(TraitModel primaryTraitTwo) {
        this.primaryTraitTwo = primaryTraitTwo;
    }

    public TraitModel getSecondaryTraitOne() {
        return SecondaryTraitOne;
    }

    public void setSecondaryTraitOne(TraitModel secondaryTraitOne) {
        SecondaryTraitOne = secondaryTraitOne;
    }

    public TraitModel getSecondaryTraitTwo() {
        return SecondaryTraitTwo;
    }

    public void setSecondaryTraitTwo(TraitModel secondaryTraitTwo) {
        SecondaryTraitTwo = secondaryTraitTwo;
    }

    public TraitModel getSecondaryTraitThree() {
        return SecondaryTraitThree;
    }

    public void setSecondaryTraitThree(TraitModel secondaryTraitThree) {
        SecondaryTraitThree = secondaryTraitThree;
    }

    public TraitModel getSecondaryTraitFour() {
        return SecondaryTraitFour;
    }

    public void setSecondaryTraitFour(TraitModel secondaryTraitFour) {
        SecondaryTraitFour = secondaryTraitFour;
    }
}
