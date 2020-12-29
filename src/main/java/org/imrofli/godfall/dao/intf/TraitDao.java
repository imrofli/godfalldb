package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.TraitModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface TraitDao extends JpaRepository<TraitModel, Long> {

    @Query(value = "SELECT t from TraitModel t left JOIN FETCH t.tagRequirements req left JOIN FETCH t.conditionalLootEffects c left JOIN FETCH c.conditionParamCategory left JOIN FETCH c.lootEffects lo left JOIN FETCH lo.effectMagnitudes left JOIN fetch t.lootEffects le left JOIN FETCH le.effectMagnitudes em left JOIN FETCH em.calculatedMagnitudes calc left JOIN FETCH t.traitCategory cat left JOIN FETCH cat.allowedTraitTags left JOIN FETCH cat.exclusionGroups WHERE t.id = :id order by cat.traitType, calc.level, calc.rarity")
    TraitModel findByIdAndFetchAll(@Param("id") Long id);

    @Query(value = "SELECT t from TraitModel t left JOIN FETCH t.tagRequirements req left JOIN FETCH t.conditionalLootEffects c left JOIN FETCH t.version v left JOIN FETCH c.conditionParamCategory left JOIN FETCH c.lootEffects lo left JOIN FETCH lo.effectMagnitudes left JOIN fetch t.lootEffects le left JOIN FETCH le.effectMagnitudes em left JOIN FETCH em.calculatedMagnitudes calc left JOIN FETCH t.traitCategory cat left JOIN FETCH cat.allowedTraitTags left JOIN FETCH cat.exclusionGroups WHERE v.version = :version and t.name = :name order by cat.traitType, calc.level, calc.rarity")
    TraitModel findByNameAndFetchAll(@Param("name") String name, @Param("version") String version);

    @Query(value = "SELECT t from TraitModel t left JOIN FETCH t.tagRequirements req left JOIN FETCH t.conditionalLootEffects c left JOIN FETCH t.version v left JOIN FETCH c.conditionParamCategory left JOIN FETCH c.lootEffects lo left JOIN FETCH lo.effectMagnitudes left JOIN fetch t.lootEffects le left JOIN FETCH le.effectMagnitudes em left JOIN FETCH em.calculatedMagnitudes calc left JOIN FETCH t.traitCategory cat left JOIN FETCH cat.allowedTraitTags left JOIN FETCH cat.exclusionGroups WHERE v.version = :version order by cat.traitType, calc.level, calc.rarity")
    Set<TraitModel> findAllAndFetchAll(@Param("version") String version);

    @Query(value = "SELECT t from TraitModel t left JOIN FETCH t.tagRequirements req left JOIN FETCH t.conditionalLootEffects c left JOIN FETCH c.conditionParamCategory left JOIN FETCH c.lootEffects lo left JOIN FETCH lo.effectMagnitudes left JOIN fetch t.lootEffects le left JOIN FETCH le.effectMagnitudes em left JOIN FETCH em.calculatedMagnitudes calc left JOIN FETCH t.traitCategory cat left JOIN FETCH cat.allowedTraitTags allowed left JOIN FETCH cat.exclusionGroups WHERE allowed IN :tags order by cat.traitType, calc.level, calc.rarity")
    Set<TraitModel> findAllByTraitTagsAndFetchAll(@Param("tags") List<String> tags);

    @Query(value = "SELECT t from TraitModel t left JOIN FETCH t.tagRequirements req left JOIN FETCH t.conditionalLootEffects c left JOIN FETCH t.version v left JOIN FETCH c.conditionParamCategory left JOIN FETCH c.lootEffects lo left JOIN FETCH lo.effectMagnitudes left JOIN fetch t.lootEffects le left JOIN FETCH le.effectMagnitudes em left JOIN FETCH em.calculatedMagnitudes calc inner JOIN FETCH t.traitCategory cat inner join FETCH cat.allowedTraitTags allowed inner JOIN FETCH cat.exclusionGroups where v.version=:version and t.id not in (SELECT t.id from TraitModel t JOIN  t.traitCategory cat join cat.allowedTraitTags allowed JOIN  cat.exclusionGroups where allowed IN :blacklisttags) and allowed IN :tags order by cat.traitType, calc.level, calc.rarity")
    Set<TraitModel> findAllByTraitTagsAndNotBlacklistTagsAndFetchAll(@Param("tags") List<String> tags, @Param("blacklisttags") List<String> blacklisttags, @Param("version") String version);

}
