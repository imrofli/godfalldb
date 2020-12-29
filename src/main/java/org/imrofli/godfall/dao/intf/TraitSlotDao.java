package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.TraitSlotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface TraitSlotDao extends JpaRepository<TraitSlotModel, Long> {

    TraitSlotModel findByName(String name);

    Set<TraitSlotModel> findAllByGroupName(String groupName);

    @Query(value = "SELECT l from TraitSlotModel l left JOIN FETCH l.version v where l.groupName = :groupName and v.version = :version")
    Set<TraitSlotModel> findAllByGroupNameAndVersion(@Param("groupName") String groupName, @Param("version") String version);

    @Query(value = "SELECT l from TraitSlotModel l left JOIN FETCH l.augments left JOIN FETCH l.banners left JOIN FETCH l.lifeStones left JOIN FETCH l.trinkets left JOIN FETCH l.weapons")
    Set<TraitSlotModel> findAllByGroupNameAndFetchAll(String groupName);

    @Query(value = "SELECT l from TraitSlotModel l")
    Set<TraitSlotModel> findByNameAndFetch(@Param("nam") String name);

    @Query(value = "SELECT l from TraitSlotModel l where l.id=:id")
    TraitSlotModel findByIdAndFetch(@Param("id") Long id);

}
