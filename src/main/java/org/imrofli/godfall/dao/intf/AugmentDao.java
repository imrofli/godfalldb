package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.Augment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface AugmentDao extends JpaRepository<Augment, Long> {

    @Query(value = "SELECT a from Augment a LEFT join fetch a.elements LEFT join fetch a.affinities left JOIN FETCH a.traitSlots order by a.name")
    Set<Augment> findAllAndFetchElementsAndAffinitiesOrderByName();

    @Query(value = "SELECT a from Augment a LEFT join fetch a.lootInfo LEFT join fetch a.elements LEFT join fetch a.affinities left JOIN FETCH a.traitSlots where a.id = :id")
    Augment findByIdAndFetchElementsAndAffinities(@Param("id") Long id);

    @Query(value = "SELECT a from Augment a LEFT join fetch a.elements LEFT join fetch a.affinities left JOIN FETCH a.traitSlots where a.displayName like :name order by a.name")
    Set<Augment> findAllAndFetchElementsAndAffinitiesByNameOrderByName(@Param("name") String name);

    @Query(value = "SELECT a from Augment a LEFT join fetch a.affinities where a.id = :id")
    Augment findByIdAndFetchAffinities(@Param("id") Long id);

    @Query(value = "SELECT * from Augment w where w.loot_info_id in(SELECT l.LOOT_INFO_ID from LOOT_INFO_DROP_TAGS l where l.DROP_TAGS=:tag) ", nativeQuery = true)
    Set<Augment> findAllByLootInfoTag(@Param("tag") String lootInfoTag);

}
