package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.LifeStone;
import org.imrofli.godfall.dao.model.LifeStone;
import org.imrofli.godfall.dao.model.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface LifeStoneDao extends JpaRepository<LifeStone, Long> {

    @Query(value = "SELECT a from LifeStone a LEFT join fetch a.elements LEFT join fetch a.affinities order by a.name")
    Set<LifeStone> findAllAndFetchElementsAndAffinities();
    @Query(value = "SELECT a from LifeStone a LEFT join fetch a.traits LEFT join fetch a.lootInfo LEFT join fetch a.elements LEFT join fetch a.affinities where a.id = :id")
    LifeStone findByIdAndFetchTraits(@Param("id") Long id);
}
