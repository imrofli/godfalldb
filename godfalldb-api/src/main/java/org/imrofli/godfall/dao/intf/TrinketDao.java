package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.ItemTypeModel;
import org.imrofli.godfall.dao.model.TrinketModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.Set;

public interface TrinketDao extends JpaRepository<TrinketModel, Long> {

    @Query(value = "SELECT a from TrinketModel a LEFT join fetch a.elements LEFT join fetch a.affinities left JOIN FETCH a.traitSlots order by a.name")
    Set<TrinketModel> findAllAndFetchElementsAndAffinities();

    @Query(value = "SELECT a from TrinketModel a LEFT join fetch a.elements LEFT join fetch a.affinities left JOIN FETCH a.traitSlots left JOIN FETCH a.version v where v.version=:version and a.itemType=:typ order by a.name")
    Set<TrinketModel> findAllAndFetchElementsAndAffinitiesWhereTrinketTypeOrderByName(@Param("typ") ItemTypeModel type, @Param("version") String version);

    @Query(value = "SELECT a from TrinketModel a LEFT join fetch a.elements LEFT join fetch a.affinities left JOIN FETCH a.traitSlots left JOIN FETCH a.version v where v.version=:version and a.itemType=:typ and lower(a.displayName) like lower(:name) order by a.name")
    Set<TrinketModel> findAllAndFetchElementsAndAffinitiesWhereTrinketTypeAndNameOrderByName(@Param("typ") ItemTypeModel type, @Param("name") String name, @Param("version") String version);

    @Query(value = "SELECT a from TrinketModel a LEFT join fetch a.elements LEFT join fetch a.affinities where a.id = :id and a.itemType=:typ")
    TrinketModel findByIdAndFetchElementsAndAffinitiesWhereTrinketType(@Param("id") Long id, @Param("typ") ItemTypeModel type);

    Optional<TrinketModel> findByIdAndItemType(Long id, ItemTypeModel type);

    @Query(value = "SELECT a from TrinketModel a LEFT join fetch a.affinities where a.id = :id")
    TrinketModel findByIdAndFetchAffinities(@Param("id") Long id);

    @Query(value = "SELECT * from Trinket w where w.loot_info_id in(SELECT l.LOOT_INFO_ID from LOOT_INFO_DROP_TAGS l where l.DROP_TAGS=:tag) ", nativeQuery = true)
    Set<TrinketModel> findAllByLootInfoTag(@Param("tag") String lootInfoTag);
}
