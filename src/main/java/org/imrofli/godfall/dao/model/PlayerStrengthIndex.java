package org.imrofli.godfall.dao.model;


import javax.persistence.Entity;

@Entity
public class PlayerStrengthIndex extends AbstractEntity {

    private Long playerStrengthIndex;
    private Double powerMultiplierArchonMode;
    private Double powerMultiplierWeaponSpectral;
    private Double powerMultiplierPolarityShockwave;
    private Double takedownMultiplier;
    private Double powerMultiplierDrain;

    public Long getPlayerStrengthIndex() {
        return playerStrengthIndex;
    }

    public void setPlayerStrengthIndex(Long playerStrengthIndex) {
        this.playerStrengthIndex = playerStrengthIndex;
    }

    public Double getPowerMultiplierArchonMode() {
        return powerMultiplierArchonMode;
    }

    public void setPowerMultiplierArchonMode(Double powerMultiplierArchonMode) {
        this.powerMultiplierArchonMode = powerMultiplierArchonMode;
    }

    public Double getPowerMultiplierWeaponSpectral() {
        return powerMultiplierWeaponSpectral;
    }

    public void setPowerMultiplierWeaponSpectral(Double powerMultiplierWeaponSpectral) {
        this.powerMultiplierWeaponSpectral = powerMultiplierWeaponSpectral;
    }

    public Double getPowerMultiplierPolarityShockwave() {
        return powerMultiplierPolarityShockwave;
    }

    public void setPowerMultiplierPolarityShockwave(Double powerMultiplierPolarityShockwave) {
        this.powerMultiplierPolarityShockwave = powerMultiplierPolarityShockwave;
    }

    public Double getTakedownMultiplier() {
        return takedownMultiplier;
    }

    public void setTakedownMultiplier(Double takedownMultiplier) {
        this.takedownMultiplier = takedownMultiplier;
    }

    public Double getPowerMultiplierDrain() {
        return powerMultiplierDrain;
    }

    public void setPowerMultiplierDrain(Double powerMultiplierDrain) {
        this.powerMultiplierDrain = powerMultiplierDrain;
    }
}
