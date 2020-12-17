package org.imrofli.godfall.dao.model;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class BuildWeapon extends AbstractEntity {

    @NotNull
    @ManyToOne
    private Weapon selectedWeapon;

    private Long itemLevel;

    @ManyToOne
    private Trait primaryTraitOne;

    @ManyToOne
    private Trait primaryTraitTwo;

    @ManyToOne
    private Trait SecondaryTraitOne;

    @ManyToOne
    private Trait SecondaryTraitTwo;

    @ManyToOne
    private Trait SecondaryTraitThree;

    @ManyToOne
    private Trait SecondaryTraitFour;

    public Weapon getSelectedWeapon() {
        return selectedWeapon;
    }

    public void setSelectedWeapon(Weapon selectedWeapon) {
        this.selectedWeapon = selectedWeapon;
    }

    public Long getItemLevel() {
        return itemLevel;
    }

    public void setItemLevel(Long itemLevel) {
        this.itemLevel = itemLevel;
    }

    public Trait getPrimaryTraitOne() {
        return primaryTraitOne;
    }

    public void setPrimaryTraitOne(Trait primaryTraitOne) {
        this.primaryTraitOne = primaryTraitOne;
    }

    public Trait getPrimaryTraitTwo() {
        return primaryTraitTwo;
    }

    public void setPrimaryTraitTwo(Trait primaryTraitTwo) {
        this.primaryTraitTwo = primaryTraitTwo;
    }

    public Trait getSecondaryTraitOne() {
        return SecondaryTraitOne;
    }

    public void setSecondaryTraitOne(Trait secondaryTraitOne) {
        SecondaryTraitOne = secondaryTraitOne;
    }

    public Trait getSecondaryTraitTwo() {
        return SecondaryTraitTwo;
    }

    public void setSecondaryTraitTwo(Trait secondaryTraitTwo) {
        SecondaryTraitTwo = secondaryTraitTwo;
    }

    public Trait getSecondaryTraitThree() {
        return SecondaryTraitThree;
    }

    public void setSecondaryTraitThree(Trait secondaryTraitThree) {
        SecondaryTraitThree = secondaryTraitThree;
    }

    public Trait getSecondaryTraitFour() {
        return SecondaryTraitFour;
    }

    public void setSecondaryTraitFour(Trait secondaryTraitFour) {
        SecondaryTraitFour = secondaryTraitFour;
    }
}
