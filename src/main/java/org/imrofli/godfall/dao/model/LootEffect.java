package org.imrofli.godfall.dao.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class LootEffect extends AbstractEntity{

    @NotNull
    @NotEmpty
    private String name = "";

    @OneToMany(cascade = {CascadeType.ALL})
    private Set<EffectMagnitude> effectMagnitudes;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<EffectMagnitude> getMagnitudes() {
        return effectMagnitudes;
    }

    public void setMagnitudes(Set<EffectMagnitude> effectMagnitudes) {
        this.effectMagnitudes = effectMagnitudes;
    }




}
