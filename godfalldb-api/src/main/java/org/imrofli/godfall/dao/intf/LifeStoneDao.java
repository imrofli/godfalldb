package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.LifeStoneModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface LifeStoneDao extends JpaRepository<LifeStoneModel, Long> {

    @Query(value = "SELECT a from LifeStoneModel a LEFT join fetch a.elements LEFT join fetch a.affinities left JOIN FETCH a.traitSlots left JOIN FETCH a.version v where v.version=:version order by a.name")
    Set<LifeStoneModel> findAllAndFetchElementsAndAffinitiesOrderByName(@Param("version") String version);

    @Query(value = "SELECT a from LifeStoneModel a LEFT join fetch a.elements LEFT join fetch a.affinities left JOIN FETCH a.traitSlots left JOIN FETCH a.version v where v.version=:version and lower(a.displayName) like lower(:name) order by a.name")
    Set<LifeStoneModel> findAllAndFetchElementsAndAffinitiesByNameOrderByName(@Param("name") String name, @Param("version") String version);

    @Query(value = "SELECT a from LifeStoneModel a LEFT join fetch a.elements LEFT join fetch a.affinities left JOIN FETCH a.traitSlots where a.id = :id")
    LifeStoneModel findByIdAndFetchElementsAndAffinities(@Param("id") Long id);

    @Query(value = "SELECT a from LifeStoneModel a LEFT join fetch a.affinities where a.id = :id")
    LifeStoneModel findByIdAndFetchAffinities(@Param("id") Long id);

    @Query(value = "SELECT * from Life_Stone w where w.loot_info_id in(SELECT l.LOOT_INFO_ID from LOOT_INFO_DROP_TAGS l where l.DROP_TAGS=:tag) ", nativeQuery = true)
    Set<LifeStoneModel> findAllByLootInfoTag(@Param("tag") String lootInfoTag);
}
