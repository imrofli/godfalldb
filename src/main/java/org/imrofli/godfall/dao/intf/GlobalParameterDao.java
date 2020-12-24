package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.GlobalParameters;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface GlobalParameterDao extends JpaRepository<GlobalParameters, Long> {
    @Query(value = "SELECT a from GlobalParameters a")
    Set<GlobalParameters> getAllParameters();

}
