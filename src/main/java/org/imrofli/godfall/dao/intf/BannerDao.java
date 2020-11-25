package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface BannerDao extends JpaRepository<Banner, Long> {
    @Query(value = "SELECT b from Banner b LEFT join fetch b.elements LEFT join fetch b.affinities order by b.name")
    Set<Banner> findAllAndFetchElementsAndAffinities();
    @Query(value = "SELECT b from Banner b join fetch b.traits LEFT join fetch b.lootInfo LEFT join fetch b.elements LEFT join fetch b.affinities where b.id = :id")
    Banner findByIdAndFetchTraits(@Param("id") Long id);
    @Query(value = "SELECT b from Banner b LEFT join fetch b.affinities where b.id = :id")
    Banner findByIdAndFetchAffinities(@Param("id") Long id);
}
