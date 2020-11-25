package org.imrofli.godfall.dao.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class LootEffect extends AbstractEntity{

    @NotNull
    @NotEmpty
    private String name = "";

    @OneToMany(cascade = {CascadeType.ALL})
    private Set<Magnitude> magnitudes;

    @Enumerated(EnumType.STRING)
    private LootEffectType lootEffectType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Magnitude> getMagnitudes() {
        return magnitudes;
    }

    public void setMagnitudes(Set<Magnitude> magnitudes) {
        this.magnitudes = magnitudes;
    }

    public LootEffectType getLootEffectType() {
        return lootEffectType;
    }

    public void setLootEffectType(LootEffectType lootEffectType) {
        this.lootEffectType = lootEffectType;
    }

    @Override
    public String toString() {
        return "LootEffect{" +
                "name='" + name + '\'' +
                ", magnitudes=" + magnitudes +
                ", lootEffectType=" + lootEffectType +
                '}';
    }
}
