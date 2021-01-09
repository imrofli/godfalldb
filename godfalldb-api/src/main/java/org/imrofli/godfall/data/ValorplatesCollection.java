package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class ValorplatesCollection {
    private String name;
    private String gameplayTag;
    private String archonModeID;
    private boolean enabled;
    private long archonChargeGainMultiplier;
    private long aetheriumArchonChargeRate;
    private long archonModeDrainRate;
    private long archonDamageScalar;
    private long archonModeDamageReduction;
    private String engineAssetName;
    private Long startingLevel;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("gameplayTag")
    public String getGameplayTag() { return gameplayTag; }
    @JsonProperty("gameplayTag")
    public void setGameplayTag(String value) { this.gameplayTag = value; }

    @JsonProperty("archonModeId")
    public String getArchonModeID() { return archonModeID; }
    @JsonProperty("archonModeId")
    public void setArchonModeID(String value) { this.archonModeID = value; }

    @JsonProperty("enabled")
    public boolean getEnabled() { return enabled; }
    @JsonProperty("enabled")
    public void setEnabled(boolean value) { this.enabled = value; }

    @JsonProperty("archonChargeGainMultiplier")
    public long getArchonChargeGainMultiplier() { return archonChargeGainMultiplier; }
    @JsonProperty("archonChargeGainMultiplier")
    public void setArchonChargeGainMultiplier(long value) { this.archonChargeGainMultiplier = value; }

    @JsonProperty("aetheriumArchonChargeRate")
    public long getAetheriumArchonChargeRate() { return aetheriumArchonChargeRate; }
    @JsonProperty("aetheriumArchonChargeRate")
    public void setAetheriumArchonChargeRate(long value) { this.aetheriumArchonChargeRate = value; }

    @JsonProperty("archonModeDrainRate")
    public long getArchonModeDrainRate() { return archonModeDrainRate; }
    @JsonProperty("archonModeDrainRate")
    public void setArchonModeDrainRate(long value) { this.archonModeDrainRate = value; }

    @JsonProperty("archonDamageScalar")
    public long getArchonDamageScalar() { return archonDamageScalar; }
    @JsonProperty("archonDamageScalar")
    public void setArchonDamageScalar(long value) { this.archonDamageScalar = value; }

    @JsonProperty("archonModeDamageReduction")
    public long getArchonModeDamageReduction() { return archonModeDamageReduction; }
    @JsonProperty("archonModeDamageReduction")
    public void setArchonModeDamageReduction(long value) { this.archonModeDamageReduction = value; }

    @JsonProperty("engineAssetName")
    public String getEngineAssetName() { return engineAssetName; }
    @JsonProperty("engineAssetName")
    public void setEngineAssetName(String value) { this.engineAssetName = value; }

    @JsonProperty("startingLevel")
    public Long getStartingLevel() { return startingLevel; }
    @JsonProperty("startingLevel")
    public void setStartingLevel(Long value) { this.startingLevel = value; }
}
