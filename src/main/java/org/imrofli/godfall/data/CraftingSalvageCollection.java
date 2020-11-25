package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class CraftingSalvageCollection {
    private String name;
    private List<ItemType> whitelistItemClasses;
    private long minTier;
    private long maxTier;
    private long rarityIdentifier;
    private List<String> salvageLootQuantityGroups;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("whitelistItemClasses")
    public List<ItemType> getWhitelistItemClasses() { return whitelistItemClasses; }
    @JsonProperty("whitelistItemClasses")
    public void setWhitelistItemClasses(List<ItemType> value) { this.whitelistItemClasses = value; }

    @JsonProperty("minTier")
    public long getMinTier() { return minTier; }
    @JsonProperty("minTier")
    public void setMinTier(long value) { this.minTier = value; }

    @JsonProperty("maxTier")
    public long getMaxTier() { return maxTier; }
    @JsonProperty("maxTier")
    public void setMaxTier(long value) { this.maxTier = value; }

    @JsonProperty("rarityIdentifier")
    public long getRarityIdentifier() { return rarityIdentifier; }
    @JsonProperty("rarityIdentifier")
    public void setRarityIdentifier(long value) { this.rarityIdentifier = value; }

    @JsonProperty("salvageLootQuantityGroups")
    public List<String> getSalvageLootQuantityGroups() { return salvageLootQuantityGroups; }
    @JsonProperty("salvageLootQuantityGroups")
    public void setSalvageLootQuantityGroups(List<String> value) { this.salvageLootQuantityGroups = value; }
}
