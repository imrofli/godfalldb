package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.LootEffect;
import org.imrofli.godfall.dao.model.LootInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface LootEffectDao extends JpaRepository<LootInfo,Long> {

    LootEffect findByName(String name);
    @Query(value = "SELECT l from LootEffect l left JOIN FETCH l.effectMagnitudes where l.name=:nam")
    Set<LootEffect> findByNameAndFetch(@Param("nam") String name);
    @Query(value = "SELECT l from LootEffect l left JOIN FETCH l.effectMagnitudes where l.id=:id")
    LootEffect findByIdAndFetch(@Param("id") Long id);

}
