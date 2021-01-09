package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class PlayerStrengthIndexModifier {
    private long playerStrengthIndex;
    private double powerMultiplierArchonMode;
    private double powerMultiplierWeaponSpectral;
    private double powerMultiplierPolarityShockwave;
    private double takedownMultiplier;
    private double powerMultiplierDrain;

    @JsonProperty("playerStrengthIndex")
    public long getPlayerStrengthIndex() { return playerStrengthIndex; }
    @JsonProperty("playerStrengthIndex")
    public void setPlayerStrengthIndex(long value) { this.playerStrengthIndex = value; }

    @JsonProperty("PowerMultiplierArchonMode")
    public double getPowerMultiplierArchonMode() { return powerMultiplierArchonMode; }
    @JsonProperty("PowerMultiplierArchonMode")
    public void setPowerMultiplierArchonMode(double value) { this.powerMultiplierArchonMode = value; }

    @JsonProperty("PowerMultiplierWeaponSpectral")
    public double getPowerMultiplierWeaponSpectral() { return powerMultiplierWeaponSpectral; }
    @JsonProperty("PowerMultiplierWeaponSpectral")
    public void setPowerMultiplierWeaponSpectral(double value) { this.powerMultiplierWeaponSpectral = value; }

    @JsonProperty("PowerMultiplierPolarityShockwave")
    public double getPowerMultiplierPolarityShockwave() { return powerMultiplierPolarityShockwave; }
    @JsonProperty("PowerMultiplierPolarityShockwave")
    public void setPowerMultiplierPolarityShockwave(double value) { this.powerMultiplierPolarityShockwave = value; }

    @JsonProperty("TakedownMultiplier")
    public double getTakedownMultiplier() { return takedownMultiplier; }
    @JsonProperty("TakedownMultiplier")
    public void setTakedownMultiplier(double value) { this.takedownMultiplier = value; }

    @JsonProperty("PowerMultiplierDrain")
    public double getPowerMultiplierDrain() { return powerMultiplierDrain; }
    @JsonProperty("PowerMultiplierDrain")
    public void setPowerMultiplierDrain(double value) { this.powerMultiplierDrain = value; }
}
