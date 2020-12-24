package org.imrofli.godfall.dao.intf;


import org.imrofli.godfall.dao.model.EnemyTier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface EnemyTierDao extends JpaRepository<EnemyTier, Long> {
    @Query(value = "SELECT a from EnemyTier a")
    Set<EnemyTier> getAllEnemyTiers();

}
