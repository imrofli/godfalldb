package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.AllowedTraitTags;
import org.imrofli.godfall.dao.model.Trait;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface TraitDao extends JpaRepository<Trait,Long> {

    Trait findByName(String name);
    Set<Trait> findAllByTraitGroup(String traitGroup);
    @Query(value = "SELECT t from Trait t JOIN FETCH t.weapons where t.id = :id")
    Trait findByIdAndFetchWeapons(@Param("id") Long id);
    @Query(value = "SELECT t from Trait t JOIN FETCH t.lootEffects where t.id = :id")
    Trait findByIdAndFetchLootEffects(@Param("id") Long id);
    @Query(value = "SELECT t from Trait t where t.traitGroup = :grp")
    List<Trait> test(@Param("grp") String traitGroup);
    Set<Trait> findAllByAllowedTraitTagsIn(Set<AllowedTraitTags> allowedTraitTags);
}
