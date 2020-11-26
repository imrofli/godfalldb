package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.LootInfo;
import org.imrofli.godfall.dao.model.Trait;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface LootInfoDao extends JpaRepository<LootInfo,Long> {

    LootInfo findByName(String name);
    LootInfo findByGameplayTag(String gameplayTag);
    @Query("SELECT l from LootInfo l left JOIN FETCH l.dropTags where l.id = :id")
    LootInfo findByIdAndFetch(@Param("id") Long id);
    @Query("SELECT l from LootInfo l left JOIN FETCH l.dropTags where :tag in(l.dropTags)")
    LootInfo findByDropTagAndFetch(@Param("tag") String dropTag);
    @Query("SELECT l from LootInfo l left JOIN FETCH l.dropTags")
    Set<LootInfo> findAllAndFetch();
    @Query(value = "SELECT distinct l.drop_tags from LOOT_INFO_DROP_TAGS l", nativeQuery = true)
    Set<String> findAllDropTags();

}
