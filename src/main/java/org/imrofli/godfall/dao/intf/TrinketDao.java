package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.ItemType;
import org.imrofli.godfall.dao.model.Trinket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.Set;

public interface TrinketDao extends JpaRepository<Trinket, Long> {

    @Query(value = "SELECT a from Trinket a LEFT join fetch a.elements LEFT join fetch a.affinities left JOIN FETCH a.traitSlots order by a.name")
    Set<Trinket> findAllAndFetchElementsAndAffinities();

    @Query(value = "SELECT a from Trinket a LEFT join fetch a.elements LEFT join fetch a.affinities left JOIN FETCH a.traitSlots where a.itemType=:typ order by a.name")
    Set<Trinket> findAllAndFetchElementsAndAffinitiesWhereTrinketTypeOrderByName(@Param("typ") ItemType type);

    @Query(value = "SELECT a from Trinket a LEFT join fetch a.elements LEFT join fetch a.affinities where a.id = :id and a.itemType=:typ")
    Trinket findByIdAndFetchElementsAndAffinitiesWhereTrinketType(@Param("id") Long id, @Param("typ") ItemType type);

    Optional<Trinket> findByIdAndItemType(Long id, ItemType type);

    @Query(value = "SELECT a from Trinket a LEFT join fetch a.affinities where a.id = :id")
    Trinket findByIdAndFetchAffinities(@Param("id") Long id);

    @Query(value = "SELECT * from Trinket w where w.loot_info_id in(SELECT l.LOOT_INFO_ID from LOOT_INFO_DROP_TAGS l where l.DROP_TAGS=:tag) ", nativeQuery = true)
    Set<Trinket> findAllByLootInfoTag(@Param("tag") String lootInfoTag);
}
