package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.LootInfoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface LootInfoDao extends JpaRepository<LootInfoModel, Long> {

    LootInfoModel findByName(String name);

    LootInfoModel findByGameplayTag(String gameplayTag);

    @Query("SELECT l from LootInfoModel l left JOIN FETCH l.version v where l.gameplayTag = :gameplayTag and v.version = :version")
    LootInfoModel findByGameplayTagAndVersion(@Param("gameplayTag") String gameplayTag, @Param("version") String version);

    @Query("SELECT l from LootInfoModel l left JOIN FETCH l.dropTags where l.id = :id")
    LootInfoModel findByIdAndFetch(@Param("id") Long id);

    @Query("SELECT l from LootInfoModel l left JOIN FETCH l.dropTags where :tag in(l.dropTags)")
    LootInfoModel findByDropTagAndFetch(@Param("tag") String dropTag);

    @Query("SELECT l from LootInfoModel l left JOIN FETCH l.dropTags left JOIN FETCH l.version v where v.version=:version")
    Set<LootInfoModel> findAllAndFetch(@Param("version") String version);

    @Query(value = "SELECT distinct l.drop_tags from LOOT_INFO_DROP_TAGS l", nativeQuery = true)
    Set<String> findAllDropTags();

    @Query("SELECT l from LootInfoModel l left JOIN FETCH l.dropTags left JOIN FETCH l.version v where v.version = :version and l.id = (SELECT x.lootInfo.id from AugmentModel x where x.id = :id)")
    LootInfoModel findLootInfoByAugmentIdAndFetchDropTags(@Param("id") Long id, @Param("version") String version);

    @Query("SELECT l from LootInfoModel l left JOIN FETCH l.dropTags left JOIN FETCH l.version v where v.version = :version and l.id = (SELECT x.lootInfo.id from BannerModel x where x.id = :id)")
    LootInfoModel findLootInfoByBannerIdAndFetchDropTags(@Param("id") Long id, @Param("version") String version);

    @Query("SELECT l from LootInfoModel l left JOIN FETCH l.dropTags left JOIN FETCH l.version v where v.version = :version and l.id = (SELECT x.lootInfo.id from LifeStoneModel x where x.id = :id)")
    LootInfoModel findLootInfoByLifeStoneIdAndFetchDropTags(@Param("id") Long id, @Param("version") String version);

    @Query("SELECT l from LootInfoModel l left JOIN FETCH l.dropTags left JOIN FETCH l.version v where v.version = :version and l.id = (SELECT x.lootInfo.id from TrinketModel x where x.id = :id)")
    LootInfoModel findLootInfoByTrinketIdAndFetchDropTags(@Param("id") Long id, @Param("version") String version);

    @Query("SELECT l from LootInfoModel l left JOIN FETCH l.dropTags left JOIN FETCH l.version v where v.version = :version and l.id = (SELECT x.lootInfo.id from WeaponModel x where x.id = :id)")
    LootInfoModel findLootInfoByWeaponIdAndFetchDropTags(@Param("id") Long id, @Param("version") String version);

}
