package org.imrofli.godfall.dao.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class EffectMagnitudeModel extends AbstractEntity {

    @NotNull
    private String name;

    @Enumerated(EnumType.STRING)
    private ParameterTypeModel parameterType;

    private Double scalar;

    @OneToMany(cascade = {CascadeType.ALL})
    private Set<CalculatedMagnitudeModel> calculatedMagnitudes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ParameterTypeModel getParameterType() {
        return parameterType;
    }

    public void setParameterType(ParameterTypeModel parameterType) {
        this.parameterType = parameterType;
    }

    public Double getScalar() {
        return scalar;
    }

    public void setScalar(Double scalar) {
        this.scalar = scalar;
    }

    public Set<CalculatedMagnitudeModel> getCalculatedMagnitudes() {
        return calculatedMagnitudes;
    }

    public void setCalculatedMagnitudes(Set<CalculatedMagnitudeModel> calculatedMagnitudes) {
        this.calculatedMagnitudes = calculatedMagnitudes;
    }
}
