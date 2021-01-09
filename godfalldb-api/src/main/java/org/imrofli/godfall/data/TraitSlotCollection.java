package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class TraitSlotCollection {
    private String name;
    private SlotIndex slotIndex;
    private String groupName;
    private SlotIndex slotType;
    private SlotIndex traitCategoryGroups;
    private long minRarity;
    private long maxRarity;
    private long slotChance;
    private long traitChance;
    private DisplayName displayName;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("slotIndex")
    public SlotIndex getSlotIndex() { return slotIndex; }
    @JsonProperty("slotIndex")
    public void setSlotIndex(SlotIndex value) { this.slotIndex = value; }

    @JsonProperty("groupName")
    public String getGroupName() { return groupName; }
    @JsonProperty("groupName")
    public void setGroupName(String value) { this.groupName = value; }

    @JsonProperty("slotType")
    public SlotIndex getSlotType() { return slotType; }
    @JsonProperty("slotType")
    public void setSlotType(SlotIndex value) { this.slotType = value; }

    @JsonProperty("traitCategoryGroups")
    public SlotIndex getTraitCategoryGroups() { return traitCategoryGroups; }
    @JsonProperty("traitCategoryGroups")
    public void setTraitCategoryGroups(SlotIndex value) { this.traitCategoryGroups = value; }

    @JsonProperty("minRarity")
    public long getMinRarity() { return minRarity; }
    @JsonProperty("minRarity")
    public void setMinRarity(long value) { this.minRarity = value; }

    @JsonProperty("maxRarity")
    public long getMaxRarity() { return maxRarity; }
    @JsonProperty("maxRarity")
    public void setMaxRarity(long value) { this.maxRarity = value; }

    @JsonProperty("slotChance")
    public long getSlotChance() { return slotChance; }
    @JsonProperty("slotChance")
    public void setSlotChance(long value) { this.slotChance = value; }

    @JsonProperty("traitChance")
    public long getTraitChance() { return traitChance; }
    @JsonProperty("traitChance")
    public void setTraitChance(long value) { this.traitChance = value; }

    @JsonProperty("displayName")
    public DisplayName getDisplayName() { return displayName; }
    @JsonProperty("displayName")
    public void setDisplayName(DisplayName value) { this.displayName = value; }
}
