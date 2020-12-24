package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.LifeStone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface LifeStoneDao extends JpaRepository<LifeStone, Long> {

    @Query(value = "SELECT a from LifeStone a LEFT join fetch a.elements LEFT join fetch a.affinities left JOIN FETCH a.traitSlots order by a.name")
    Set<LifeStone> findAllAndFetchElementsAndAffinitiesOrderByName();

    @Query(value = "SELECT a from LifeStone a LEFT join fetch a.elements LEFT join fetch a.affinities left JOIN FETCH a.traitSlots where a.id = :id")
    LifeStone findByIdAndFetchElementsAndAffinities(@Param("id") Long id);
    @Query(value = "SELECT a from LifeStone a LEFT join fetch a.affinities where a.id = :id")
    LifeStone findByIdAndFetchAffinities(@Param("id") Long id);

    @Query(value = "SELECT * from Life_Stone w where w.loot_info_id in(SELECT l.LOOT_INFO_ID from LOOT_INFO_DROP_TAGS l where l.DROP_TAGS=:tag) ", nativeQuery = true)
    Set<LifeStone> findAllByLootInfoTag(@Param("tag") String lootInfoTag);
}
