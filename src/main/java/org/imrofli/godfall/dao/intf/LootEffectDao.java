package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.LootEffectModel;
import org.imrofli.godfall.dao.model.LootInfoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface LootEffectDao extends JpaRepository<LootInfoModel, Long> {

    LootEffectModel findByName(String name);

    @Query(value = "SELECT l from LootEffectModel l left JOIN FETCH l.effectMagnitudes where l.name=:nam")
    Set<LootEffectModel> findByNameAndFetch(@Param("nam") String name);

    @Query(value = "SELECT l from LootEffectModel l left JOIN FETCH l.effectMagnitudes where l.id=:id")
    LootEffectModel findByIdAndFetch(@Param("id") Long id);

}
