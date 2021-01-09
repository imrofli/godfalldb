package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class EnemyClassesCollection {
    private The2 the2;
    private The2 the3;
    private EnemyType name;
    private double archonChargeGainMultiplier;

    @JsonProperty("2")
    public The2 getThe2() { return the2; }
    @JsonProperty("2")
    public void setThe2(The2 value) { this.the2 = value; }

    @JsonProperty("3")
    public The2 getThe3() { return the3; }
    @JsonProperty("3")
    public void setThe3(The2 value) { this.the3 = value; }

    @JsonProperty("name")
    public EnemyType getName() { return name; }
    @JsonProperty("name")
    public void setName(EnemyType value) { this.name = value; }

    @JsonProperty("archonChargeGainMultiplier")
    public double getArchonChargeGainMultiplier() { return archonChargeGainMultiplier; }
    @JsonProperty("archonChargeGainMultiplier")
    public void setArchonChargeGainMultiplier(double value) { this.archonChargeGainMultiplier = value; }
}
