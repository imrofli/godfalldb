package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.PlayerStrengthIndex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface PlayerStrengthIndexDao extends JpaRepository<PlayerStrengthIndex, Long> {
    @Query(value = "SELECT a from PlayerStrengthIndex a")
    Set<PlayerStrengthIndex> getAllPlayerStrengthIndex();

}
