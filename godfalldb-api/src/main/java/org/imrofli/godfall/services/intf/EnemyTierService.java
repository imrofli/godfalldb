package org.imrofli.godfall.services.intf;


import org.imrofli.godfall.api.model.EnemyTier;
import org.imrofli.godfall.exception.ServiceCallException;

import java.util.List;

public interface EnemyTierService {

    EnemyTier getEnemyTierById(Long id) throws ServiceCallException;

    List<EnemyTier> getAllEnemyTiers(String version) throws ServiceCallException;
}
