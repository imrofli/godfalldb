package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class TiersCollection {
    private long tierIdentifier;
    private long minimumValorplateLevel;

    @JsonProperty("tierIdentifier")
    public long getTierIdentifier() { return tierIdentifier; }
    @JsonProperty("tierIdentifier")
    public void setTierIdentifier(long value) { this.tierIdentifier = value; }

    @JsonProperty("minimumValorplateLevel")
    public long getMinimumValorplateLevel() { return minimumValorplateLevel; }
    @JsonProperty("minimumValorplateLevel")
    public void setMinimumValorplateLevel(long value) { this.minimumValorplateLevel = value; }
}
