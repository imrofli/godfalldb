package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.WeaponModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface WeaponDao extends JpaRepository<WeaponModel, Long> {

    @Query(value = "SELECT w from WeaponModel w LEFT join fetch w.elements LEFT join fetch w.affinities left JOIN FETCH w.traitSlots left JOIN FETCH w.version v where v.version = :version order by w.name")
    Set<WeaponModel> findAllAndFetchElementsAndAffinitiesOrderByName(@Param("version") String version);

    @Query(value = "SELECT w from WeaponModel w LEFT join fetch w.elements LEFT join fetch w.affinities left JOIN FETCH w.traitSlots left JOIN FETCH w.version v where v.version = :version and lower(w.displayName) like lower(:name) order by w.name")
    Set<WeaponModel> findAllAndFetchElementsAndAffinitiesByNameOrderByName(@Param("name") String name, @Param("version") String version);

    @Query(value = "SELECT w from WeaponModel w LEFT join fetch w.elements LEFT join fetch w.affinities left JOIN FETCH w.traitSlots where w.id = :id")
    WeaponModel findByIdAndFetchElementsAndAffinities(@Param("id") Long id);

}
