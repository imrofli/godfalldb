package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.ValorplateModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface ValorplateDao extends JpaRepository<ValorplateModel, Long> {
    @Query(value = "SELECT b from ValorplateModel b LEFT join fetch b.archonmode LEFT join fetch b.augmentGraphs LEFT join fetch b.version v where v.version=:version order by b.name")
    Set<ValorplateModel> findAllAndFetchArchonModeAndAugmentGraphsOrderByName(@Param("version") String version);

    @Query(value = "SELECT b from ValorplateModel b LEFT join fetch b.archonmode LEFT join fetch b.augmentGraphs LEFT join fetch b.version v where v.version=:version and lower(b.name) like lower(:name) order by b.name")
    Set<ValorplateModel> findAllAndFetchArchonModeAndAugmentGraphsByNameOrderByName(@Param("name") String name, @Param("version") String version);

    @Query(value = "SELECT b from ValorplateModel b LEFT join fetch b.archonmode LEFT join fetch b.augmentGraphs where b.id = :id")
    ValorplateModel findByIdAndFetchArchonModeAndAugmentGraphs(@Param("id") Long id);

}
