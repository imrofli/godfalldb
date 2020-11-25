package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class Chest {
    private String name;
    private boolean autoAcquireLoot;
    private boolean lootForInstigatorOnly;
    private long lootInclusionRadius;
    private double extraLootBonusPerPlayer;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("autoAcquireLoot")
    public boolean getAutoAcquireLoot() { return autoAcquireLoot; }
    @JsonProperty("autoAcquireLoot")
    public void setAutoAcquireLoot(boolean value) { this.autoAcquireLoot = value; }

    @JsonProperty("lootForInstigatorOnly")
    public boolean getLootForInstigatorOnly() { return lootForInstigatorOnly; }
    @JsonProperty("lootForInstigatorOnly")
    public void setLootForInstigatorOnly(boolean value) { this.lootForInstigatorOnly = value; }

    @JsonProperty("lootInclusionRadius")
    public long getLootInclusionRadius() { return lootInclusionRadius; }
    @JsonProperty("lootInclusionRadius")
    public void setLootInclusionRadius(long value) { this.lootInclusionRadius = value; }

    @JsonProperty("extraLootBonusPerPlayer")
    public double getExtraLootBonusPerPlayer() { return extraLootBonusPerPlayer; }
    @JsonProperty("extraLootBonusPerPlayer")
    public void setExtraLootBonusPerPlayer(double value) { this.extraLootBonusPerPlayer = value; }
}
