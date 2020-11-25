package org.imrofli.godfall.services.intf;

import org.imrofli.godfall.dao.model.LifeStone;

import java.util.List;
import java.util.Set;

public interface LifeStoneService {

    public Set<LifeStone> getLifeStones();
    public LifeStone getLifeStoneById(Long id);
}
