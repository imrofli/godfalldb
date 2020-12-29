package org.imrofli.godfall.dao.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


@Entity
public class TagRequirementModel extends AbstractEntity {

    @NotNull
    private String name;

    private String requireOrIgnore;

    private String actorType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRequireOrIgnore() {
        return requireOrIgnore;
    }

    public void setRequireOrIgnore(String requireOrIgnore) {
        this.requireOrIgnore = requireOrIgnore;
    }

    public String getActorType() {
        return actorType;
    }

    public void setActorType(String actorType) {
        this.actorType = actorType;
    }

    @Override
    public String toString() {
        return "TagRequirement{" +
                "name='" + name + '\'' +
                ", requireOrIgnore='" + requireOrIgnore + '\'' +
                ", actorType='" + actorType + '\'' +
                '}';
    }
}
