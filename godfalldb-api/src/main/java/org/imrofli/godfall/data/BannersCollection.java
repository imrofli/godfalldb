package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class BannersCollection {
    private String gameplayTag;
    private String name;
    private long overshieldScalar;
    private long radiusScalar;
    private long durationScalar;
    private long cooldownScalar;
    private String traitSlotGroups;
    private List<String> defaultTraitTagGroups;
    private List<String> elementTraitTagGroups;
    private List<ItemType> traitTagGroups;

    @JsonProperty("gameplayTag")
    public String getGameplayTag() { return gameplayTag; }
    @JsonProperty("gameplayTag")
    public void setGameplayTag(String value) { this.gameplayTag = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("overshieldScalar")
    public long getOvershieldScalar() { return overshieldScalar; }
    @JsonProperty("overshieldScalar")
    public void setOvershieldScalar(long value) { this.overshieldScalar = value; }

    @JsonProperty("radiusScalar")
    public long getRadiusScalar() { return radiusScalar; }
    @JsonProperty("radiusScalar")
    public void setRadiusScalar(long value) { this.radiusScalar = value; }

    @JsonProperty("durationScalar")
    public long getDurationScalar() { return durationScalar; }
    @JsonProperty("durationScalar")
    public void setDurationScalar(long value) { this.durationScalar = value; }

    @JsonProperty("cooldownScalar")
    public long getCooldownScalar() { return cooldownScalar; }
    @JsonProperty("cooldownScalar")
    public void setCooldownScalar(long value) { this.cooldownScalar = value; }

    @JsonProperty("traitSlotGroups")
    public String getTraitSlotGroups() { return traitSlotGroups; }
    @JsonProperty("traitSlotGroups")
    public void setTraitSlotGroups(String value) { this.traitSlotGroups = value; }

    @JsonProperty("defaultTraitTagGroups")
    public List<String> getDefaultTraitTagGroups() { return defaultTraitTagGroups; }
    @JsonProperty("defaultTraitTagGroups")
    public void setDefaultTraitTagGroups(List<String> value) { this.defaultTraitTagGroups = value; }

    @JsonProperty("elementTraitTagGroups")
    public List<String> getElementTraitTagGroups() { return elementTraitTagGroups; }
    @JsonProperty("elementTraitTagGroups")
    public void setElementTraitTagGroups(List<String> value) { this.elementTraitTagGroups = value; }

    @JsonProperty("traitTagGroups")
    public List<ItemType> getTraitTagGroups() { return traitTagGroups; }
    @JsonProperty("traitTagGroups")
    public void setTraitTagGroups(List<ItemType> value) { this.traitTagGroups = value; }
}
