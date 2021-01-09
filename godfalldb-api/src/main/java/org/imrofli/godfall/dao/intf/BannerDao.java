package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.BannerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface BannerDao extends JpaRepository<BannerModel, Long> {
    @Query(value = "SELECT b from BannerModel b LEFT join fetch b.elements LEFT join fetch b.affinities left JOIN FETCH b.traitSlots order by b.name")
    Set<BannerModel> findAllAndFetchElementsAndAffinitiesOrderByName();

    @Query(value = "SELECT b from BannerModel b LEFT join fetch b.elements LEFT join fetch b.affinities left JOIN FETCH b.traitSlots left JOIN FETCH b.version v where v.version = :version and lower(b.displayName) like lower(:name) order by b.name")
    Set<BannerModel> findAllAndFetchElementsAndAffinitiesByNameOrderByName(@Param("name") String name, @Param("version") String version);

    @Query(value = "SELECT b from BannerModel b  LEFT join fetch b.elements LEFT join fetch b.affinities left JOIN FETCH b.traitSlots where b.id = :id")
    BannerModel findByIdAndFetchElementsAndAffinities(@Param("id") Long id);

    @Query(value = "SELECT b from BannerModel b LEFT join fetch b.affinities where b.id = :id")
    BannerModel findByIdAndFetchAffinities(@Param("id") Long id);

    @Query(value = "SELECT * from Banner w where w.loot_info_id in(SELECT l.LOOT_INFO_ID from LOOT_INFO_DROP_TAGS l where l.DROP_TAGS=:tag) ", nativeQuery = true)
    Set<BannerModel> findAllByLootInfoTag(@Param("tag") String lootInfoTag);

    @Query(value = "SELECT b from BannerModel b LEFT join fetch b.elements LEFT join fetch b.affinities left JOIN FETCH b.traitSlots left JOIN FETCH b.version v where v.version = :version order by b.name")
    Set<BannerModel> findAllAndFetchElementsAndAffinitiesByVersionOrderByName(@Param("version") String version);
}
