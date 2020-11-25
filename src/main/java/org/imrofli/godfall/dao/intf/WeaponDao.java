package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface WeaponDao extends JpaRepository<Weapon, Long> {

    @Query(value = "SELECT w from Weapon w LEFT join fetch w.elements LEFT join fetch w.affinities order by w.name")
    Set<Weapon> findAllAndFetchElementsAndAffinities();
    @Query(value = "SELECT w from Weapon w join fetch w.traits LEFT join fetch w.lootInfo LEFT join fetch w.elements LEFT join fetch w.affinities where w.id = :id")
    Weapon findByIdAndFetchTraits(@Param("id") Long id);

    @Query(value = "SELECT w from Weapon w LEFT join fetch w.affinities where w.id = :id")
    Weapon findByIdAndFetchAffinities(@Param("id") Long id);

}
