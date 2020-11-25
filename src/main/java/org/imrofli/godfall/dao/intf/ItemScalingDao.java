package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.ItemScaling;
import org.imrofli.godfall.dao.model.Rarity;
import org.imrofli.godfall.dao.model.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface ItemScalingDao extends JpaRepository<ItemScaling, Long> {
    Set<ItemScaling> getAllByRarity(Rarity rarity);
    Set<ItemScaling> getAllByTierIdentifier(Long tier);
    ItemScaling getByTierIdentifierAndRarity(Long tier, Rarity rarity);

}
