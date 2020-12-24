package org.imrofli.godfall.services.intf;


import org.imrofli.godfall.api.model.PlayerStrengthIndex;
import org.imrofli.godfall.exception.ServiceCallException;

import java.util.List;

public interface PlayerStrengthIndexService {

    PlayerStrengthIndex getPlayerStrengthIndexById(Long id) throws ServiceCallException;

    List<PlayerStrengthIndex> getAllPlayerStrengthIndexes() throws ServiceCallException;
}
