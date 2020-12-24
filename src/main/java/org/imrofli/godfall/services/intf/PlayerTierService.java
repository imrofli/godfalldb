package org.imrofli.godfall.services.intf;


import org.imrofli.godfall.api.model.PlayerTier;
import org.imrofli.godfall.exception.ServiceCallException;

import java.util.List;

public interface PlayerTierService {

    PlayerTier getPlayerTierById(Long id) throws ServiceCallException;

    List<PlayerTier> getAllPlayerTier() throws ServiceCallException;
}
