package org.imrofli.godfall.services.intf;

import org.imrofli.godfall.dao.model.LifeStone;
import org.imrofli.godfall.dao.model.Trinket;

import java.util.List;
import java.util.Set;

public interface TrinketService {

    public Set<Trinket> getTrinkets();
    public Set<Trinket> getAmulets();
    public Set<Trinket> getRings();
    public Set<Trinket> getCharms();
    Trinket getTrinketById(Long id);
    Trinket getTrinketByIdLoadAffinity(Long id);
    Set<Trinket> getAllByLootInfoDropTag(String dropTag);



}
