package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.Trait;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface TraitDao extends JpaRepository<Trait, Long> {

    @Query(value = "SELECT t from Trait t left JOIN FETCH t.tagRequirements req left JOIN FETCH t.conditionalLootEffects c left JOIN FETCH c.conditionParamCategory left JOIN FETCH c.lootEffects lo left JOIN FETCH lo.effectMagnitudes left JOIN fetch t.lootEffects le left JOIN FETCH le.effectMagnitudes left JOIN FETCH t.traitCategory cat left JOIN FETCH cat.allowedTraitTags left JOIN FETCH cat.exclusionGroups WHERE t.id = :id")
    Trait findByIdAndFetchAll(@Param("id") Long id);

    @Query(value = "SELECT t from Trait t left JOIN FETCH t.tagRequirements req left JOIN FETCH t.conditionalLootEffects c left JOIN FETCH c.conditionParamCategory left JOIN FETCH c.lootEffects lo left JOIN FETCH lo.effectMagnitudes left JOIN fetch t.lootEffects le left JOIN FETCH le.effectMagnitudes left JOIN FETCH t.traitCategory cat left JOIN FETCH cat.allowedTraitTags left JOIN FETCH cat.exclusionGroups")
    Set<Trait> findAllAndFetchAll();

    @Query(value = "SELECT t from Trait t left JOIN FETCH t.tagRequirements req left JOIN FETCH t.conditionalLootEffects c left JOIN FETCH c.conditionParamCategory left JOIN FETCH c.lootEffects lo left JOIN FETCH lo.effectMagnitudes left JOIN fetch t.lootEffects le left JOIN FETCH le.effectMagnitudes left JOIN FETCH t.traitCategory cat left JOIN FETCH cat.allowedTraitTags allowed left JOIN FETCH cat.exclusionGroups WHERE allowed IN :tags")
    Set<Trait> findAllByTraitTagsAndFetchAll(@Param("tags") List<String> tags);

    @Query(value = "SELECT t from Trait t left JOIN FETCH t.tagRequirements req left JOIN FETCH t.conditionalLootEffects c left JOIN FETCH c.conditionParamCategory left JOIN FETCH c.lootEffects lo left JOIN FETCH lo.effectMagnitudes left JOIN fetch t.lootEffects le left JOIN FETCH le.effectMagnitudes inner JOIN FETCH t.traitCategory cat inner join FETCH cat.allowedTraitTags allowed inner JOIN FETCH cat.exclusionGroups where t.id not in (SELECT t.id from Trait t JOIN  t.traitCategory cat join cat.allowedTraitTags allowed JOIN  cat.exclusionGroups where allowed IN :blacklisttags) and allowed IN :tags")
    Set<Trait> findAllByTraitTagsAndNotBlacklistTagsAndFetchAll(@Param("tags") List<String> tags, @Param("blacklisttags") List<String> blacklisttags);

}
