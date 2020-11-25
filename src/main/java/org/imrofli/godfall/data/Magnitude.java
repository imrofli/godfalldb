package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class Magnitude {
    private MagnitudeName magnitudeName;
    private ParamType paramType;
    private Double scalar;

    @JsonProperty("magnitudeName")
    public MagnitudeName getMagnitudeName() { return magnitudeName; }
    @JsonProperty("magnitudeName")
    public void setMagnitudeName(MagnitudeName value) { this.magnitudeName = value; }

    @JsonProperty("paramType")
    public ParamType getParamType() { return paramType; }
    @JsonProperty("paramType")
    public void setParamType(ParamType value) { this.paramType = value; }

    @JsonProperty("scalar")
    public Double getScalar() { return scalar; }
    @JsonProperty("scalar")
    public void setScalar(Double value) { this.scalar = value; }

    @Override
    public String toString() {
        return "Magnitude{" +
                "magnitudeName=" + magnitudeName +
                ", paramType=" + paramType +
                ", scalar=" + scalar +
                '}';
    }
}
