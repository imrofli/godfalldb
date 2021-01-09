package org.imrofli.godfall.services.intf;

import org.imrofli.godfall.api.model.Rarity;
import org.imrofli.godfall.api.model.Scaling;
import org.imrofli.godfall.exception.ServiceCallException;

import java.util.List;

public interface ScalingService {

    List<Scaling> getScalingByRarityAndLevel(Rarity rarity, Long tier, String version) throws ServiceCallException;

    Scaling getScalingById(Long id) throws ServiceCallException;

    List<Scaling> getAllScalings() throws ServiceCallException;
}
