package org.imrofli.godfall.dao.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;

@Entity
public class Magnitude extends AbstractEntity{

    @NotNull
    private String name;

    @Enumerated(EnumType.STRING)
    private ParameterType parameterType;

    private Double scalar;

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

    @Override
    public String toString() {
        return "Magnitude{" +
                "name='" + name + '\'' +
                ", parameterType=" + parameterType +
                ", scalar=" + scalar +
                '}';
    }
}
