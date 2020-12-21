package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.Trait;
import org.imrofli.godfall.dao.model.TraitType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface TraitDao extends JpaRepository<Trait,Long> {

    @Query(value = "SELECT * from Trait t order by t.trait_Type", nativeQuery = true)
    Set<Trait> findAllOrderByTraitType(@Param("types") Set<TraitType> traitTypes);

    Set<Trait> findAllByTraitGroup(String traitGroup);
    @Query(value = "SELECT t from Trait t left JOIN FETCH t.tagRequirements req left JOIN FETCH t.conditionalLootEffects c left JOIN FETCH c.conditionParamCategory left JOIN FETCH c.lootEffects lo left JOIN FETCH lo.effectMagnitudes left JOIN fetch t.lootEffects le left JOIN FETCH le.effectMagnitudes left JOIN FETCH t.traitCategory cat left JOIN FETCH cat.allowedTraitTags left JOIN FETCH cat.exclusionGroups WHERE t.id = :id")
    Trait findByIdAndFetchAll(@Param("id") Long id);
    @Query(value = "SELECT t from Trait t JOIN FETCH t.weapons where t.id = :id")
    Trait findByIdAndFetchWeapons(@Param("id") Long id);
    @Query(value = "SELECT t from Trait t left JOIN FETCH t.tagRequirements req left JOIN FETCH t.conditionalLootEffects c left JOIN FETCH c.conditionParamCategory left JOIN FETCH c.lootEffects lo left JOIN FETCH lo.effectMagnitudes left JOIN fetch t.lootEffects le left JOIN FETCH le.effectMagnitudes left JOIN FETCH t.traitCategory cat left JOIN FETCH cat.allowedTraitTags left JOIN FETCH cat.exclusionGroups")
    Set<Trait> findAllAndFetchAll();
   
}
