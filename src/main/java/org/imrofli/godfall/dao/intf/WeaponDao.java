package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface WeaponDao extends JpaRepository<Weapon, Long> {

    @Query(value = "SELECT w from Weapon w LEFT join fetch w.elements LEFT join fetch w.affinities left JOIN FETCH w.traitSlots order by w.name")
    Set<Weapon> findAllAndFetchElementsAndAffinitiesOrderByName();

    @Query(value = "SELECT w from Weapon w LEFT join fetch w.elements LEFT join fetch w.affinities left JOIN FETCH w.traitSlots where w.displayName like :name order by w.name")
    Set<Weapon> findAllAndFetchElementsAndAffinitiesByNameOrderByName(@Param("name") String name);

    @Query(value = "SELECT w from Weapon w LEFT join fetch w.elements LEFT join fetch w.affinities left JOIN FETCH w.traitSlots where w.id = :id")
    Weapon findByIdAndFetchElementsAndAffinities(@Param("id") Long id);

}
