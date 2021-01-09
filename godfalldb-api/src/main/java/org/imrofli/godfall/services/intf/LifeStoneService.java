package org.imrofli.godfall.services.intf;


import org.imrofli.godfall.api.model.LifeStone;
import org.imrofli.godfall.exception.ServiceCallException;

import java.util.List;

public interface LifeStoneService {

    List<LifeStone> getAllLifeStones(String version) throws ServiceCallException;

    List<LifeStone> getAllLifeStonesByQuery(String name, String version) throws ServiceCallException;

    LifeStone getLifeStoneById(Long id) throws ServiceCallException;

    LifeStone getLifeStoneNoFetch(Long lifeStone) throws ServiceCallException;
}