package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class CraftingUpgradeCollection {
    private String name;
    private WhitelistItemClasses whitelistItemClasses;
    private long minTier;
    private long maxTier;
    private long minRarityIdentifier;
    private long rank;
    private long coreAttributeTierOffset;
    private long improvedTraitTierOffset;
    private List<SlotIndex> whitelistImprovedTraitSlotIndexes;
    private List<Currency> currencies;
    private List<SalvageLootQuantityGroup> salvageLootQuantityGroups;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("whitelistItemClasses")
    public WhitelistItemClasses getWhitelistItemClasses() { return whitelistItemClasses; }
    @JsonProperty("whitelistItemClasses")
    public void setWhitelistItemClasses(WhitelistItemClasses value) { this.whitelistItemClasses = value; }

    @JsonProperty("minTier")
    public long getMinTier() { return minTier; }
    @JsonProperty("minTier")
    public void setMinTier(long value) { this.minTier = value; }

    @JsonProperty("maxTier")
    public long getMaxTier() { return maxTier; }
    @JsonProperty("maxTier")
    public void setMaxTier(long value) { this.maxTier = value; }

    @JsonProperty("minRarityIdentifier")
    public long getMinRarityIdentifier() { return minRarityIdentifier; }
    @JsonProperty("minRarityIdentifier")
    public void setMinRarityIdentifier(long value) { this.minRarityIdentifier = value; }

    @JsonProperty("rank")
    public long getRank() { return rank; }
    @JsonProperty("rank")
    public void setRank(long value) { this.rank = value; }

    @JsonProperty("coreAttributeTierOffset")
    public long getCoreAttributeTierOffset() { return coreAttributeTierOffset; }
    @JsonProperty("coreAttributeTierOffset")
    public void setCoreAttributeTierOffset(long value) { this.coreAttributeTierOffset = value; }

    @JsonProperty("improvedTraitTierOffset")
    public long getImprovedTraitTierOffset() { return improvedTraitTierOffset; }
    @JsonProperty("improvedTraitTierOffset")
    public void setImprovedTraitTierOffset(long value) { this.improvedTraitTierOffset = value; }

    @JsonProperty("whitelistImprovedTraitSlotIndexes")
    public List<SlotIndex> getWhitelistImprovedTraitSlotIndexes() { return whitelistImprovedTraitSlotIndexes; }
    @JsonProperty("whitelistImprovedTraitSlotIndexes")
    public void setWhitelistImprovedTraitSlotIndexes(List<SlotIndex> value) { this.whitelistImprovedTraitSlotIndexes = value; }

    @JsonProperty("currencies")
    public List<Currency> getCurrencies() { return currencies; }
    @JsonProperty("currencies")
    public void setCurrencies(List<Currency> value) { this.currencies = value; }

    @JsonProperty("salvageLootQuantityGroups")
    public List<SalvageLootQuantityGroup> getSalvageLootQuantityGroups() { return salvageLootQuantityGroups; }
    @JsonProperty("salvageLootQuantityGroups")
    public void setSalvageLootQuantityGroups(List<SalvageLootQuantityGroup> value) { this.salvageLootQuantityGroups = value; }
}
