package org.imrofli.godfall.dao.intf;


import org.imrofli.godfall.dao.model.Enemy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface EnemyDao extends JpaRepository<Enemy, Long> {
    @Query(value = "SELECT a from Enemy a")
    Set<Enemy> getAllEnemies();

}
