package org.imrofli.godfall.dao.intf;


import org.imrofli.godfall.dao.model.EnemyClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface EnemyClassDao extends JpaRepository<EnemyClass, Long> {
    @Query(value = "SELECT a from EnemyClass a left JOIN FETCH a.enemyclasslevels")
    Set<EnemyClass> getAllEnemyClasses();

}
