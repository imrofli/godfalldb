package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.AllowedTraitTags;
import org.imrofli.godfall.dao.model.Trait;
import org.imrofli.godfall.dao.model.TraitType;
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
    @Query(value = "SELECT t from Trait t JOIN FETCH t.weapons JOIN fetch t.augments join fetch t.trinkets join fetch t.lifeStones join fetch t.banners")
    Set<Trait> findAllAndFetch();
    @Query(value = "SELECT distinct t from Trait t order by t.traitType")
    Set<Trait> findAllAndOrderByTraitType();
    Set<Trait> findAllByTraitGroup(String traitGroup);
    @Query(value = "SELECT t from Trait t LEFT JOIN FETCH t.weapons LEFT JOIN fetch t.augments LEFT JOIN fetch t.trinkets LEFT JOIN fetch t.lifeStones LEFT JOIN fetch t.banners WHERE t.id = :id")
    Trait findByIdAndFetchAll(@Param("id") Long id);
    @Query(value = "SELECT t from Trait t JOIN FETCH t.weapons where t.id = :id")
    Trait findByIdAndFetchWeapons(@Param("id") Long id);
    @Query(value = "SELECT t from Trait t JOIN FETCH t.lootEffects where t.id = :id")
    Trait findByIdAndFetchLootEffects(@Param("id") Long id);
    Set<Trait> findAllByAllowedTraitTagsIn(Set<AllowedTraitTags> allowedTraitTags);
}
