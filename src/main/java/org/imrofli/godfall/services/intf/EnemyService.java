package org.imrofli.godfall.services.intf;


import org.imrofli.godfall.api.model.Enemy;
import org.imrofli.godfall.exception.ServiceCallException;

import java.util.List;

public interface EnemyService {

    Enemy getEnemyById(Long id) throws ServiceCallException;

    List<Enemy> getAllEnemies(String version) throws ServiceCallException;

    List<Enemy> getAllEnemiesByQuery(String name, String version) throws ServiceCallException;
}
