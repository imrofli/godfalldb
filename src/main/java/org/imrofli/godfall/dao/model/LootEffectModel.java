package org.imrofli.godfall.dao.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class LootEffectModel extends AbstractEntity {

    @NotNull
    @NotEmpty
    private String name = "";

    @OneToMany(cascade = {CascadeType.ALL})
    private Set<EffectMagnitudeModel> effectMagnitudes;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<EffectMagnitudeModel> getMagnitudes() {
        return effectMagnitudes;
    }

    public void setMagnitudes(Set<EffectMagnitudeModel> effectMagnitudes) {
        this.effectMagnitudes = effectMagnitudes;
    }




}
