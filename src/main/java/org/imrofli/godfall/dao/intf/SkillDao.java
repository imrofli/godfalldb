package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface SkillDao extends JpaRepository<Skill, Long> {
    @Query(value = "SELECT b from Skill b order by b.name")
    Set<Skill> findAllOrderByName();

    @Query(value = "SELECT b from Skill b where b.name like :name order by b.name")
    Set<Skill> findAllByNameOrderByName(@Param("name") String name);

}
