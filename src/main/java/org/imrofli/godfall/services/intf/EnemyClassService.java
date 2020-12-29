package org.imrofli.godfall.services.intf;


import org.imrofli.godfall.api.model.EnemyClass;
import org.imrofli.godfall.exception.ServiceCallException;

import java.util.List;

public interface EnemyClassService {

    EnemyClass getEnemyClassById(Long id) throws ServiceCallException;

    List<EnemyClass> getAllEnemyClasses(String version) throws ServiceCallException;

    List<EnemyClass> getAllEnemyClassesByQuery(String name, String version) throws ServiceCallException;
}
