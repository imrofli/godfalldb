package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.SkillModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface SkillDao extends JpaRepository<SkillModel, Long> {
    @Query(value = "SELECT b from SkillModel b left JOIN FETCH b.version v where v.version=:version order by b.name ")
    Set<SkillModel> findAllOrderByName(@Param("version") String version);

    @Query(value = "SELECT b from SkillModel b left JOIN FETCH b.version v where v.version=:version and lower(b.name) like lower(:name) order by b.name")
    Set<SkillModel> findAllByNameOrderByName(@Param("name") String name, @Param("version") String version);

}
