package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class AttributeNoVariance {
    private double min;
    private double max;

    @JsonProperty("min")
    public double getMin() { return min; }
    @JsonProperty("min")
    public void setMin(double value) { this.min = value; }

    @JsonProperty("max")
    public double getMax() { return max; }
    @JsonProperty("max")
    public void setMax(double value) { this.max = value; }
}
