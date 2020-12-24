package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface BannerDao extends JpaRepository<Banner, Long> {
    @Query(value = "SELECT b from Banner b LEFT join fetch b.elements LEFT join fetch b.affinities left JOIN FETCH b.traitSlots order by b.name")
    Set<Banner> findAllAndFetchElementsAndAffinitiesOrderByName();

    @Query(value = "SELECT b from Banner b  LEFT join fetch b.elements LEFT join fetch b.affinities left JOIN FETCH b.traitSlots where b.id = :id")
    Banner findByIdAndFetchElementsAndAffinities(@Param("id") Long id);
    @Query(value = "SELECT b from Banner b LEFT join fetch b.affinities where b.id = :id")
    Banner findByIdAndFetchAffinities(@Param("id") Long id);
    @Query(value = "SELECT * from Banner w where w.loot_info_id in(SELECT l.LOOT_INFO_ID from LOOT_INFO_DROP_TAGS l where l.DROP_TAGS=:tag) ", nativeQuery = true)
    Set<Banner> findAllByLootInfoTag(@Param("tag") String lootInfoTag);
}
