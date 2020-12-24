package org.imrofli.godfall.dao.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class EnemyClass extends AbstractEntity {

    private String name;
    private Double archonChargeGainMultiplier;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<EnemyClassLvl> enemyclasslevels;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getArchonChargeGainMultiplier() {
        return archonChargeGainMultiplier;
    }

    public void setArchonChargeGainMultiplier(Double archonChargeGainMultiplier) {
        this.archonChargeGainMultiplier = archonChargeGainMultiplier;
    }

    public Set<EnemyClassLvl> getEnemyclasslevels() {
        return enemyclasslevels;
    }

    public void setEnemyclasslevels(Set<EnemyClassLvl> enemyclasslevels) {
        this.enemyclasslevels = enemyclasslevels;
    }
}
