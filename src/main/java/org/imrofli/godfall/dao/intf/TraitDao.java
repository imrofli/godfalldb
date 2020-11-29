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
    @Query(value = "SELECT distinct t from Trait t LEFT JOIN FETCH t.weapons LEFT JOIN fetch t.augments LEFT join fetch t.trinkets LEFT join fetch t.lifeStones LEFT join fetch t.banners where t.traitType not in :types order by t.traitType")
    Set<Trait> findAllAndOrderByTraitType(@Param("types") Set<TraitType> traitTypes);
    @Query(value = "SELECT distinct t from Trait t where t.traitType =:typ order by t.traitGroup")
    Set<Trait> findAllbyTraitType(@Param("typ") TraitType traitType);
    @Query(value = "SELECT * from Trait t where t.trait_Type not in ('SKILLGRID', 'BOON') and (t.id in(Select b.trait_id from banner_traits b) or  (t.id in(Select au.trait_id from augment_traits au)) or (t.id in(Select lf.trait_id from lifestone_traits lf)) or (t.id in(Select tr.trait_id from trinket_traits tr)) or (t.id in(Select w.trait_id from weapon_traits w))) order by t.trait_Type", nativeQuery = true)
    Set<Trait> findAllThatHavEntryAndOrderByTraitType(@Param("types") Set<TraitType> traitTypes);

    Set<Trait> findAllByTraitGroup(String traitGroup);
    @Query(value = "SELECT t from Trait t LEFT JOIN FETCH t.weapons LEFT JOIN fetch t.augments LEFT JOIN fetch t.trinkets LEFT JOIN fetch t.lifeStones LEFT JOIN fetch t.banners WHERE t.id = :id")
    Trait findByIdAndFetchAll(@Param("id") Long id);
    @Query(value = "SELECT t from Trait t JOIN FETCH t.weapons where t.id = :id")
    Trait findByIdAndFetchWeapons(@Param("id") Long id);
    @Query(value = "SELECT t from Trait t JOIN FETCH t.lootEffects where t.id = :id")
    Trait findByIdAndFetchLootEffects(@Param("id") Long id);
    Set<Trait> findAllByAllowedTraitTagsIn(Set<AllowedTraitTags> allowedTraitTags);
    @Query(value = "SELECT t from Trait t LEFT JOIN FETCH t.lootEffects where t.traitGroupBulk = :blk")
    Set<Trait> findAllByTraitGroupBulkAndFetchLootEffects(@Param("blk") String traitGroupBulk);
    @Query(value = "SELECT t from Trait t JOIN FETCH t.lootEffects where t.traitGroupBulkId = :id")
    Set<Trait> findAllByTraitGroupBulkIdAndFetchLootEffects(@Param("id") int BulkId);
    @Query(value = "SELECT t from Trait t where t.gridY = :id and t.traitType = 'SKILLGRID' order by t.gridX asc")
    Set<Trait> findAllByGridYAndFetchLootEffects(@Param("id") Integer gridY);
    Trait findByMasteryEntitlements(String masteryEntitlements);
}
