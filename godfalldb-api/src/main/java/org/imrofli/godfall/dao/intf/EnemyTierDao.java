package org.imrofli.godfall.dao.intf;


import org.imrofli.godfall.dao.model.EnemyTierModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface EnemyTierDao extends JpaRepository<EnemyTierModel, Long> {
    @Query(value = "SELECT a from EnemyTierModel a left JOIN FETCH a.version v where v.version = :version")
    Set<EnemyTierModel> getAllEnemyTiers(@Param("version") String version);

}
