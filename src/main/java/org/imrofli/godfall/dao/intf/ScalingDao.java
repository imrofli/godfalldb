package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.Rarity;
import org.imrofli.godfall.dao.model.Scaling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface ScalingDao extends JpaRepository<Scaling, Long> {
    @Query(value = "SELECT a from Scaling a")
    Set<Scaling> getAllScalings();

    Set<Scaling> getAllByRarity(Rarity rarity);

    Set<Scaling> getAllByTierIdentifier(Long tier);

    Set<Scaling> getByTierIdentifierAndRarity(Long tier, Rarity rarity);

}
