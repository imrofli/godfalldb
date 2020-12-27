package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.Valorplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface ValorplateDao extends JpaRepository<Valorplate, Long> {
    @Query(value = "SELECT b from Valorplate b LEFT join fetch b.archonmode LEFT join fetch b.augmentGraphs order by b.name")
    Set<Valorplate> findAllAndFetchArchonModeAndAugmentGraphsOrderByName();

    @Query(value = "SELECT b from Valorplate b LEFT join fetch b.archonmode LEFT join fetch b.augmentGraphs where b.name like :name order by b.name")
    Set<Valorplate> findAllAndFetchArchonModeAndAugmentGraphsByNameOrderByName(@Param("name") String name);

    @Query(value = "SELECT b from Valorplate b LEFT join fetch b.archonmode LEFT join fetch b.augmentGraphs where b.id = :id")
    Valorplate findByIdAndFetchArchonModeAndAugmentGraphs(@Param("id") Long id);

}
