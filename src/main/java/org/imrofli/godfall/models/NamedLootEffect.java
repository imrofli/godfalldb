package org.imrofli.godfall.models;

import org.imrofli.godfall.data.Magnitude;

import java.util.List;

public class NamedLootEffect {
    private String name;
    private List<Magnitude> magnitudes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Magnitude> getMagnitudes() {
        return magnitudes;
    }

    public void setMagnitudes(List<Magnitude> magnitudes) {
        this.magnitudes = magnitudes;
    }

    @Override
    public String toString() {
        return "NamedLootEffect{" +
                "name='" + name + '\'' +
                ", magnitudes=" + magnitudes +
                '}';
    }
}
