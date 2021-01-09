package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class ActivityOverride {
    private long minTier;
    private long maxTier;
    private long minThreat;
    private long maxThreat;

    @JsonProperty("minTier")
    public long getMinTier() { return minTier; }
    @JsonProperty("minTier")
    public void setMinTier(long value) { this.minTier = value; }

    @JsonProperty("maxTier")
    public long getMaxTier() { return maxTier; }
    @JsonProperty("maxTier")
    public void setMaxTier(long value) { this.maxTier = value; }

    @JsonProperty("minThreat")
    public long getMinThreat() { return minThreat; }
    @JsonProperty("minThreat")
    public void setMinThreat(long value) { this.minThreat = value; }

    @JsonProperty("maxThreat")
    public long getMaxThreat() { return maxThreat; }
    @JsonProperty("maxThreat")
    public void setMaxThreat(long value) { this.maxThreat = value; }
}
