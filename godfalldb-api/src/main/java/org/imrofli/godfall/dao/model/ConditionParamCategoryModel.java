package org.imrofli.godfall.dao.model;

import javax.persistence.Entity;

@Entity
public class ConditionParamCategoryModel extends AbstractEntity {

    private AffinityModel affinity;

    private ColorModel color;

    public AffinityModel getAffinity() {
        return affinity;
    }

    public void setAffinity(AffinityModel affinity) {
        this.affinity = affinity;
    }

    public ColorModel getColor() {
        return color;
    }

    public void setColor(ColorModel color) {
        this.color = color;
    }
}
