package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class AugmentsCollection {
    private String gameplayTag;
    private String name;
    private long affinityIdentifier;
    private long powerDrainMultiplier;
    private long rarityIdentifier;
    private PurpleTraitSlotGroups traitSlotGroups;
    private List<String> traitTagGroups;
    private List<String> defaultTraitTagGroups;
    private List<ElementTraitTagGroup> elementTraitTagGroups;

    @JsonProperty("gameplayTag")
    public String getGameplayTag() { return gameplayTag; }
    @JsonProperty("gameplayTag")
    public void setGameplayTag(String value) { this.gameplayTag = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("affinityIdentifier")
    public long getAffinityIdentifier() { return affinityIdentifier; }
    @JsonProperty("affinityIdentifier")
    public void setAffinityIdentifier(long value) { this.affinityIdentifier = value; }

    @JsonProperty("powerDrainMultiplier")
    public long getPowerDrainMultiplier() { return powerDrainMultiplier; }
    @JsonProperty("powerDrainMultiplier")
    public void setPowerDrainMultiplier(long value) { this.powerDrainMultiplier = value; }

    @JsonProperty("rarityIdentifier")
    public long getRarityIdentifier() { return rarityIdentifier; }
    @JsonProperty("rarityIdentifier")
    public void setRarityIdentifier(long value) { this.rarityIdentifier = value; }

    @JsonProperty("traitSlotGroups")
    public PurpleTraitSlotGroups getTraitSlotGroups() { return traitSlotGroups; }
    @JsonProperty("traitSlotGroups")
    public void setTraitSlotGroups(PurpleTraitSlotGroups value) { this.traitSlotGroups = value; }

    @JsonProperty("traitTagGroups")
    public List<String> getTraitTagGroups() { return traitTagGroups; }
    @JsonProperty("traitTagGroups")
    public void setTraitTagGroups(List<String> value) { this.traitTagGroups = value; }

    @JsonProperty("defaultTraitTagGroups")
    public List<String> getDefaultTraitTagGroups() { return defaultTraitTagGroups; }
    @JsonProperty("defaultTraitTagGroups")
    public void setDefaultTraitTagGroups(List<String> value) { this.defaultTraitTagGroups = value; }

    @JsonProperty("elementTraitTagGroups")
    public List<ElementTraitTagGroup> getElementTraitTagGroups() { return elementTraitTagGroups; }
    @JsonProperty("elementTraitTagGroups")
    public void setElementTraitTagGroups(List<ElementTraitTagGroup> value) { this.elementTraitTagGroups = value; }
}
