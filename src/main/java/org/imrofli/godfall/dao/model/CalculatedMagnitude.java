package org.imrofli.godfall.dao.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;

@Entity
public class CalculatedMagnitude extends AbstractEntity implements Comparable<CalculatedMagnitude> {

    @Enumerated(EnumType.STRING)
    @NotNull
    private Rarity rarity;
    private Long level;
    Double minimum;
    Double maximum;

    public Rarity getRarity() {
        return rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public Double getMinimum() {
        return minimum;
    }

    public void setMinimum(Double minimum) {
        this.minimum = minimum;
    }

    public Double getMaximum() {
        return maximum;
    }

    public void setMaximum(Double maximum) {
        this.maximum = maximum;
    }

    @Override
    public int compareTo(CalculatedMagnitude o) {
        int compareLevel = this.level.compareTo(o.level);
        //Sorting by rarity if level is same
        return compareLevel == 0 ? this.rarity.compareTo(o.rarity) : compareLevel;
    }
}
