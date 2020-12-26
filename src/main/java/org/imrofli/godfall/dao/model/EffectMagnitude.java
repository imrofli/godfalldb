package org.imrofli.godfall.dao.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class EffectMagnitude extends AbstractEntity {

    @NotNull
    private String name;

    @Enumerated(EnumType.STRING)
    private ParameterType parameterType;

    private Double scalar;

    @OneToMany(cascade = {CascadeType.ALL})
    private Set<CalculatedMagnitude> calculatedMagnitudes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ParameterType getParameterType() {
        return parameterType;
    }

    public void setParameterType(ParameterType parameterType) {
        this.parameterType = parameterType;
    }

    public Double getScalar() {
        return scalar;
    }

    public void setScalar(Double scalar) {
        this.scalar = scalar;
    }

    public Set<CalculatedMagnitude> getCalculatedMagnitudes() {
        return calculatedMagnitudes;
    }

    public void setCalculatedMagnitudes(Set<CalculatedMagnitude> calculatedMagnitudes) {
        this.calculatedMagnitudes = calculatedMagnitudes;
    }
}
