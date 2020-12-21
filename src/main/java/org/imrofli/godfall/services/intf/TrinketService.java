package org.imrofli.godfall.services.intf;



import org.imrofli.godfall.api.model.Amulet;
import org.imrofli.godfall.api.model.Charm;
import org.imrofli.godfall.api.model.Ring;
import org.imrofli.godfall.dao.model.Trinket;
import org.imrofli.godfall.exception.ServiceCallException;

import java.util.List;

public interface TrinketService {

    List<Amulet> getAllAmulets() throws ServiceCallException;
    List<Ring> getAllRings() throws ServiceCallException;
    List<Charm> getAllCharms() throws ServiceCallException;
    Trinket getTrinketById(Long id) throws ServiceCallException;
    Ring getRingById(Long id) throws ServiceCallException;
    Charm getCharmById(Long id) throws ServiceCallException;
    Amulet getAmuletById(Long id) throws ServiceCallException;

}
