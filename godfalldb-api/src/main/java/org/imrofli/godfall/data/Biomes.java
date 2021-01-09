package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class Biomes {
    private BiomeAny biomeAny;
    private Biome biomeEarth;
    private Biome biomeWater;
    private Biome biomeAir;
    private Biome biomeFire;

    @JsonProperty("Biome - Any")
    public BiomeAny getBiomeAny() { return biomeAny; }
    @JsonProperty("Biome - Any")
    public void setBiomeAny(BiomeAny value) { this.biomeAny = value; }

    @JsonProperty("Biome - Earth")
    public Biome getBiomeEarth() { return biomeEarth; }
    @JsonProperty("Biome - Earth")
    public void setBiomeEarth(Biome value) { this.biomeEarth = value; }

    @JsonProperty("Biome - Water")
    public Biome getBiomeWater() { return biomeWater; }
    @JsonProperty("Biome - Water")
    public void setBiomeWater(Biome value) { this.biomeWater = value; }

    @JsonProperty("Biome - Air")
    public Biome getBiomeAir() { return biomeAir; }
    @JsonProperty("Biome - Air")
    public void setBiomeAir(Biome value) { this.biomeAir = value; }

    @JsonProperty("Biome - Fire")
    public Biome getBiomeFire() { return biomeFire; }
    @JsonProperty("Biome - Fire")
    public void setBiomeFire(Biome value) { this.biomeFire = value; }
}
