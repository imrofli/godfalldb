package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class WeaponsCollection {
    private String gameplayTag;
    private NameUnion name;
    private Index rarityIdentifier;
    private List<String> traitTagGroups;
    private List<String> defaultTraitTagGroups;
    private List<String> elementTraitTagGroups;
    private List<String> blacklistReforgeRecipeTags;
    private long damageMultiplier;
    private long weaponClassIdentifier;
    private StickyTraitSlotGroups traitSlotGroups;
    private String engineAssetName;

    @JsonProperty("gameplayTag")
    public String getGameplayTag() { return gameplayTag; }
    @JsonProperty("gameplayTag")
    public void setGameplayTag(String value) { this.gameplayTag = value; }

    @JsonProperty("name")
    public NameUnion getName() { return name; }
    @JsonProperty("name")
    public void setName(NameUnion value) { this.name = value; }

    @JsonProperty("rarityIdentifier")
    public Index getRarityIdentifier() { return rarityIdentifier; }
    @JsonProperty("rarityIdentifier")
    public void setRarityIdentifier(Index value) { this.rarityIdentifier = value; }

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

    @JsonProperty("blacklistReforgeRecipeTags")
    public List<String> getBlacklistReforgeRecipeTags() { return blacklistReforgeRecipeTags; }
    @JsonProperty("blacklistReforgeRecipeTags")
    public void setBlacklistReforgeRecipeTags(List<String> value) { this.blacklistReforgeRecipeTags = value; }

    @JsonProperty("damageMultiplier")
    public long getDamageMultiplier() { return damageMultiplier; }
    @JsonProperty("damageMultiplier")
    public void setDamageMultiplier(long value) { this.damageMultiplier = value; }

    @JsonProperty("weaponClassIdentifier")
    public long getWeaponClassIdentifier() { return weaponClassIdentifier; }
    @JsonProperty("weaponClassIdentifier")
    public void setWeaponClassIdentifier(long value) { this.weaponClassIdentifier = value; }

    @JsonProperty("traitSlotGroups")
    public StickyTraitSlotGroups getTraitSlotGroups() { return traitSlotGroups; }
    @JsonProperty("traitSlotGroups")
    public void setTraitSlotGroups(StickyTraitSlotGroups value) { this.traitSlotGroups = value; }

    @JsonProperty("engineAssetName")
    public String getEngineAssetName() { return engineAssetName; }
    @JsonProperty("engineAssetName")
    public void setEngineAssetName(String value) { this.engineAssetName = value; }
}
