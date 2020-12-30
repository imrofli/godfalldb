package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.PlayerStrengthIndexModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface PlayerStrengthIndexDao extends JpaRepository<PlayerStrengthIndexModel, Long> {
    @Query(value = "SELECT a from PlayerStrengthIndexModel a left JOIN FETCH a.version v where v.version=:version")
    Set<PlayerStrengthIndexModel> getAllPlayerStrengthIndex(@Param("version") String version);

}
