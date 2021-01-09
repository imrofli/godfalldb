package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class PotionsCollection {
    private String gameplayTag;
    private String name;
    private Index rarityIdentifier;
    private long healScalar;
    private long chargesScalar;
    private long healDurationScalar;
    private long secondaryTraitDurationScalar;
    private FluffyTraitSlotGroups traitSlotGroups;
    private List<String> traitTagGroups;
    private List<String> defaultTraitTagGroups;
    private List<String> elementTraitTagGroups;
    private long gearSlot;

    @JsonProperty("gameplayTag")
    public String getGameplayTag() { return gameplayTag; }
    @JsonProperty("gameplayTag")
    public void setGameplayTag(String value) { this.gameplayTag = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("rarityIdentifier")
    public Index getRarityIdentifier() { return rarityIdentifier; }
    @JsonProperty("rarityIdentifier")
    public void setRarityIdentifier(Index value) { this.rarityIdentifier = value; }

    @JsonProperty("healScalar")
    public long getHealScalar() { return healScalar; }
    @JsonProperty("healScalar")
    public void setHealScalar(long value) { this.healScalar = value; }

    @JsonProperty("chargesScalar")
    public long getChargesScalar() { return chargesScalar; }
    @JsonProperty("chargesScalar")
    public void setChargesScalar(long value) { this.chargesScalar = value; }

    @JsonProperty("healDurationScalar")
    public long getHealDurationScalar() { return healDurationScalar; }
    @JsonProperty("healDurationScalar")
    public void setHealDurationScalar(long value) { this.healDurationScalar = value; }

    @JsonProperty("secondaryTraitDurationScalar")
    public long getSecondaryTraitDurationScalar() { return secondaryTraitDurationScalar; }
    @JsonProperty("secondaryTraitDurationScalar")
    public void setSecondaryTraitDurationScalar(long value) { this.secondaryTraitDurationScalar = value; }

    @JsonProperty("traitSlotGroups")
    public FluffyTraitSlotGroups getTraitSlotGroups() { return traitSlotGroups; }
    @JsonProperty("traitSlotGroups")
    public void setTraitSlotGroups(FluffyTraitSlotGroups value) { this.traitSlotGroups = value; }

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

    @JsonProperty("gearSlot")
    public long getGearSlot() { return gearSlot; }
    @JsonProperty("gearSlot")
    public void setGearSlot(long value) { this.gearSlot = value; }
}
