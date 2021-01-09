package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.GlobalParametersModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface GlobalParameterDao extends JpaRepository<GlobalParametersModel, Long> {
    @Query(value = "SELECT a from GlobalParametersModel a left JOIN FETCH a.version v where v.version=:version")
    Set<GlobalParametersModel> getAllParameters(@Param("version") String version);

}
