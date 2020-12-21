package org.imrofli.godfall.dao.model;

import javax.persistence.Entity;

@Entity
public class ConditionParamCategory extends AbstractEntity{

    private Affinity affinity;

    private Color color;

    public Affinity getAffinity() {
        return affinity;
    }

    public void setAffinity(Affinity affinity) {
        this.affinity = affinity;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
