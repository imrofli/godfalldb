package org.imrofli.godfall.dao.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class EnemyClassModel extends AbstractEntity {

    private String name;
    private Double archonChargeGainMultiplier;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<EnemyClassLvlModel> enemyclasslevels;

    @ManyToOne
    private VersionModel version;

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

    public Set<EnemyClassLvlModel> getEnemyclasslevels() {
        return enemyclasslevels;
    }

    public void setEnemyclasslevels(Set<EnemyClassLvlModel> enemyclasslevels) {
        this.enemyclasslevels = enemyclasslevels;
    }

    public VersionModel getVersion() {
        return version;
    }

    public void setVersion(VersionModel version) {
        this.version = version;
    }
}
