package org.imrofli.godfall.api.model;

import java.io.Serializable;

public class SelectedTraits implements Serializable {
    private Trait primaryTrait;
    private Trait secondaryTraitOne;
    private Trait secondaryTraitTwo;
    private Trait secondaryTraitThree;

    public Trait getPrimaryTrait() {
        return primaryTrait;
    }

    public void setPrimaryTrait(Trait primaryTrait) {
        this.primaryTrait = primaryTrait;
    }

    public Trait getSecondaryTraitOne() {
        return secondaryTraitOne;
    }

    public void setSecondaryTraitOne(Trait secondaryTraitOne) {
        this.secondaryTraitOne = secondaryTraitOne;
    }

    public Trait getSecondaryTraitTwo() {
        return secondaryTraitTwo;
    }

    public void setSecondaryTraitTwo(Trait secondaryTraitTwo) {
        this.secondaryTraitTwo = secondaryTraitTwo;
    }

    public Trait getSecondaryTraitThree() {
        return secondaryTraitThree;
    }

    public void setSecondaryTraitThree(Trait secondaryTraitThree) {
        this.secondaryTraitThree = secondaryTraitThree;
    }
}
