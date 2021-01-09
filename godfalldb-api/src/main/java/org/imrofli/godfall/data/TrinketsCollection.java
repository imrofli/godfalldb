package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class TrinketsCollection {
    private String gameplayTag;
    private String name;
    private ItemType className;
    private Index rarityIdentifier;
    private long elementalAffinityIdentifier;
    private TentacledTraitSlotGroups traitSlotGroups;
    private List<String> traitTagGroups;
    private List<String> defaultTraitTagGroups;
    private List<String> elementTraitTagGroups;

    @JsonProperty("gameplayTag")
    public String getGameplayTag() { return gameplayTag; }
    @JsonProperty("gameplayTag")
    public void setGameplayTag(String value) { this.gameplayTag = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("className")
    public ItemType getClassName() { return className; }
    @JsonProperty("className")
    public void setClassName(ItemType value) { this.className = value; }

    @JsonProperty("rarityIdentifier")
    public Index getRarityIdentifier() { return rarityIdentifier; }
    @JsonProperty("rarityIdentifier")
    public void setRarityIdentifier(Index value) { this.rarityIdentifier = value; }

    @JsonProperty("elementalAffinityIdentifier")
    public long getElementalAffinityIdentifier() { return elementalAffinityIdentifier; }
    @JsonProperty("elementalAffinityIdentifier")
    public void setElementalAffinityIdentifier(long value) { this.elementalAffinityIdentifier = value; }

    @JsonProperty("traitSlotGroups")
    public TentacledTraitSlotGroups getTraitSlotGroups() { return traitSlotGroups; }
    @JsonProperty("traitSlotGroups")
    public void setTraitSlotGroups(TentacledTraitSlotGroups value) { this.traitSlotGroups = value; }

    @JsonProperty("traitTagGroups")
    public List<String> getTraitTagGroups() { return traitTagGroups; }
    @JsonProperty("traitTagGroups")
    public void setTraitTagGroups(List<String> value) { this.traitTagGroups = value; }

    @JsonProperty("defaultTraitTagGroups")
    public List<String> getDefaultTraitTagGroups() { return defaultTraitTagGroups; }
    @JsonProperty("defaultTraitTagGroups")
    public void setDefaultTraitTagGroups(List<String> value) { this.defaultTraitTagGroups = value; }

    @JsonProperty("elementTraitTagGroups")
    public List<String> getElementTraitTagGroups() { return elementTraitTagGroups; }
    @JsonProperty("elementTraitTagGroups")
    public void setElementTraitTagGroups(List<String> value) { this.elementTraitTagGroups = value; }
}
