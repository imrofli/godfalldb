package org.imrofli.godfall.dao.model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Set;

@Entity
public class BuildAmuletModel extends AbstractEntity{

    private Long level;
    @ManyToOne
    private TrinketModel amulet;
    @ManyToMany
    private Set<TraitModel> traits;
    private ElementModel element;
    private AffinityModel affinity;
    private RarityModel rarity;

    @ManyToOne
    private TrinketModel alternateAmulet;
    @ManyToMany
    private Set<TraitModel> alternateTraits;
    private ElementModel alternateElement;
    private AffinityModel alternateAffinity;
    private RarityModel alternateRarity;



}
