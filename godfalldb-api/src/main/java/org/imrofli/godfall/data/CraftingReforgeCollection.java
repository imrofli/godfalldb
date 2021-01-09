package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class CraftingReforgeCollection {
    private String name;
    private List<String> tags;
    private String recipeType;
    private List<ItemType> whitelistItemClasses;
    private List<Long> whitelistRarityIdentifiers;
    private Long numPinnedTraits;
    private List<TraitElement> traits;
    private List<Currency> currencies;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("tags")
    public List<String> getTags() { return tags; }
    @JsonProperty("tags")
    public void setTags(List<String> value) { this.tags = value; }

    @JsonProperty("recipeType")
    public String getRecipeType() { return recipeType; }
    @JsonProperty("recipeType")
    public void setRecipeType(String value) { this.recipeType = value; }

    @JsonProperty("whitelistItemClasses")
    public List<ItemType> getWhitelistItemClasses() { return whitelistItemClasses; }
    @JsonProperty("whitelistItemClasses")
    public void setWhitelistItemClasses(List<ItemType> value) { this.whitelistItemClasses = value; }

    @JsonProperty("whitelistRarityIdentifiers")
    public List<Long> getWhitelistRarityIdentifiers() { return whitelistRarityIdentifiers; }
    @JsonProperty("whitelistRarityIdentifiers")
    public void setWhitelistRarityIdentifiers(List<Long> value) { this.whitelistRarityIdentifiers = value; }

    @JsonProperty("numPinnedTraits")
    public Long getNumPinnedTraits() { return numPinnedTraits; }
    @JsonProperty("numPinnedTraits")
    public void setNumPinnedTraits(Long value) { this.numPinnedTraits = value; }

    @JsonProperty("traits")
    public List<TraitElement> getTraits() { return traits; }
    @JsonProperty("traits")
    public void setTraits(List<TraitElement> value) { this.traits = value; }

    @JsonProperty("currencies")
    public List<Currency> getCurrencies() { return currencies; }
    @JsonProperty("currencies")
    public void setCurrencies(List<Currency> value) { this.currencies = value; }
}
