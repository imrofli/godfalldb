package org.imrofli.godfall.services.intf;


import org.imrofli.godfall.api.model.LifeStone;
import org.imrofli.godfall.exception.ServiceCallException;

import java.util.List;

public interface LifeStoneService {

    List<LifeStone> getAllLifeStones() throws ServiceCallException;

    List<LifeStone> getAllLifeStonesByQuery(String name) throws ServiceCallException;

    LifeStone getLifeStoneById(Long id) throws ServiceCallException;

    LifeStone getLifeStoneNoFetch(Long lifeStone) throws ServiceCallException;
}
