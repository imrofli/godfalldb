package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class CraftingEnchantCollection {
    private String name;
    private long minTier;
    private long maxTier;
    private long currentRarityIdentifier;
    private long resultRarityIdentifier;
    private List<ItemType> whitelistItemClasses;
    private List<Currency> currencies;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("minTier")
    public long getMinTier() { return minTier; }
    @JsonProperty("minTier")
    public void setMinTier(long value) { this.minTier = value; }

    @JsonProperty("maxTier")
    public long getMaxTier() { return maxTier; }
    @JsonProperty("maxTier")
    public void setMaxTier(long value) { this.maxTier = value; }

    @JsonProperty("currentRarityIdentifier")
    public long getCurrentRarityIdentifier() { return currentRarityIdentifier; }
    @JsonProperty("currentRarityIdentifier")
    public void setCurrentRarityIdentifier(long value) { this.currentRarityIdentifier = value; }

    @JsonProperty("resultRarityIdentifier")
    public long getResultRarityIdentifier() { return resultRarityIdentifier; }
    @JsonProperty("resultRarityIdentifier")
    public void setResultRarityIdentifier(long value) { this.resultRarityIdentifier = value; }

    @JsonProperty("whitelistItemClasses")
    public List<ItemType> getWhitelistItemClasses() { return whitelistItemClasses; }
    @JsonProperty("whitelistItemClasses")
    public void setWhitelistItemClasses(List<ItemType> value) { this.whitelistItemClasses = value; }

    @JsonProperty("currencies")
    public List<Currency> getCurrencies() { return currencies; }
    @JsonProperty("currencies")
    public void setCurrencies(List<Currency> value) { this.currencies = value; }
}
