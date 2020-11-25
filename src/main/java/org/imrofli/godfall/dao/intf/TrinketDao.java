package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.LifeStone;
import org.imrofli.godfall.dao.model.Trinket;
import org.imrofli.godfall.dao.model.ItemType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface TrinketDao extends JpaRepository<Trinket, Long> {

    @Query(value = "SELECT a from Trinket a LEFT join fetch a.elements LEFT join fetch a.affinities order by a.name")
    Set<Trinket> findAllAndFetchElementsAndAffinities();
    @Query(value = "SELECT a from Trinket a LEFT join fetch a.elements LEFT join fetch a.affinities where a.itemType=:typ order by a.name")
    Set<Trinket> findAllAndFetchElementsAndAffinitiesWhereTrinketType(@Param("typ") ItemType type);

    @Query(value = "SELECT a from Trinket a LEFT join fetch a.traits LEFT join fetch a.lootInfo LEFT join fetch a.elements LEFT join fetch a.affinities where a.id = :id")
    Trinket findByIdAndFetchTraits(@Param("id") Long id);

    @Query(value = "SELECT a from Trinket a LEFT join fetch a.affinities where a.id = :id")
    Trinket findByIdAndFetchAffinities(@Param("id") Long id);
}
