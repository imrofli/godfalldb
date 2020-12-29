package org.imrofli.godfall.services.intf;



import org.imrofli.godfall.api.model.Amulet;
import org.imrofli.godfall.api.model.Charm;
import org.imrofli.godfall.api.model.Ring;
import org.imrofli.godfall.dao.model.TrinketModel;
import org.imrofli.godfall.exception.ServiceCallException;

import java.util.List;

public interface TrinketService {

    List<Amulet> getAllAmulets(String version) throws ServiceCallException;

    List<Ring> getAllRings(String version) throws ServiceCallException;

    List<Charm> getAllCharms(String version) throws ServiceCallException;

    List<Amulet> getAllAmuletsByQuery(String name, String version) throws ServiceCallException;

    List<Ring> getAllRingsByQuery(String name, String version) throws ServiceCallException;

    List<Charm> getAllCharmsByQuery(String name, String version) throws ServiceCallException;

    TrinketModel getTrinketById(Long id) throws ServiceCallException;

    Ring getRingById(Long id) throws ServiceCallException;

    Charm getCharmById(Long id) throws ServiceCallException;

    Amulet getAmuletById(Long id) throws ServiceCallException;

    Amulet getAmuletNoFetch(Long trinketId) throws ServiceCallException;

    Ring getRingNoFetch(Long trinketId) throws ServiceCallException;

    Charm getCharmNoFetch(Long trinketId) throws ServiceCallException;
}
