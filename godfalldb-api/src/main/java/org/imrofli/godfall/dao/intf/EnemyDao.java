package org.imrofli.godfall.dao.intf;


import org.imrofli.godfall.dao.model.EnemyModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface EnemyDao extends JpaRepository<EnemyModel, Long> {
    @Query(value = "SELECT a from EnemyModel a left  JOIN FETCH a.version v where v.version = :version")
    Set<EnemyModel> getAllEnemies(@Param("version") String version);

    @Query(value = "SELECT a from EnemyModel a left  JOIN FETCH a.version v where v.version = :version and lower(a.name) like lower(:name)")
    Set<EnemyModel> getAllEnemiesByQuery(@Param("name") String name, @Param("version") String version);
}
