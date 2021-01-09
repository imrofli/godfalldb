package org.imrofli.godfall.dao.intf;


import org.imrofli.godfall.dao.model.PlayerTierModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface PlayerTierDao extends JpaRepository<PlayerTierModel, Long> {
    @Query(value = "SELECT a from PlayerTierModel a left JOIN FETCH a.version v where v.version=:version")
    Set<PlayerTierModel> getAllPlayerTiers(@Param("version") String version);

}
