package org.imrofli.godfall.dao.intf;


import org.imrofli.godfall.dao.model.EnemyClassModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface EnemyClassDao extends JpaRepository<EnemyClassModel, Long> {
    @Query(value = "SELECT a from EnemyClassModel a left JOIN FETCH a.enemyclasslevels left JOIN FETCH a.version v where v.version=:version")
    Set<EnemyClassModel> getAllEnemyClasses(@Param("version") String version);

    @Query(value = "SELECT a from EnemyClassModel a left JOIN FETCH a.enemyclasslevels left JOIN FETCH a.version v where v.version=:version and lower(a.name) like lower(:name)")
    Set<EnemyClassModel> getAllEnemyClassesByQuery(@Param("name") String name, @Param("version") String version);
}
