package org.imrofli.godfall.dao.intf;


import org.imrofli.godfall.dao.model.PlayerTier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface PlayerTierDao extends JpaRepository<PlayerTier, Long> {
    @Query(value = "SELECT a from PlayerTier a")
    Set<PlayerTier> getAllPlayerTiers();

}
