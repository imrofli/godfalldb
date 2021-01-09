package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.RarityModel;
import org.imrofli.godfall.dao.model.ScalingModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface ScalingDao extends JpaRepository<ScalingModel, Long> {
    @Query(value = "SELECT a from ScalingModel a")
    Set<ScalingModel> getAllScalings();

    @Query(value = "SELECT a from ScalingModel a LEFT join fetch a.version v where v.version=:version and a.rarity=:rarity")
    Set<ScalingModel> getAllByRarity(@Param("rarity") RarityModel rarity, @Param("version") String version);

    @Query(value = "SELECT a from ScalingModel a LEFT join fetch a.version v where v.version=:version and a.tierIdentifier=:tier")
    Set<ScalingModel> getAllByTierIdentifier(@Param("tier") Long tier, @Param("version") String version);

    @Query(value = "SELECT a from ScalingModel a LEFT join fetch a.version v where v.version=:version and a.rarity=:rarity and a.tierIdentifier=:tier")
    Set<ScalingModel> getByTierIdentifierAndRarity(@Param("tier") Long tier, @Param("rarity") RarityModel rarity, @Param("version") String version);

}
