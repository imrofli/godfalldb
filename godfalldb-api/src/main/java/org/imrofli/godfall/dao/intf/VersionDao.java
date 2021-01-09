package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.VersionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface VersionDao extends JpaRepository<VersionModel, Long> {
    @Query(value = "SELECT b from VersionModel b order by b.loadTime desc")
    Set<VersionModel> findAllOrderByTime();

    @Query(value = "SELECT b from VersionModel b where b.version like :name order by b.loadTime desc")
    Set<VersionModel> findAllByVersionOrderByTime(@Param("name") String name);

}
