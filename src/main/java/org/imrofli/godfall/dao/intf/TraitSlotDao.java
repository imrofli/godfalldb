package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.TraitSlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface TraitSlotDao extends JpaRepository<TraitSlot, Long> {

    TraitSlot findByName(String name);

    Set<TraitSlot> findAllByGroupName(String groupName);

    @Query(value = "SELECT l from TraitSlot l left JOIN FETCH l.augments left JOIN FETCH l.banners left JOIN FETCH l.lifeStones left JOIN FETCH l.trinkets left JOIN FETCH l.weapons")
    Set<TraitSlot> findAllByGroupNameAndFetchAll(String groupName);

    @Query(value = "SELECT l from TraitSlot l")
    Set<TraitSlot> findByNameAndFetch(@Param("nam") String name);

    @Query(value = "SELECT l from TraitSlot l where l.id=:id")
    TraitSlot findByIdAndFetch(@Param("id") Long id);

}
