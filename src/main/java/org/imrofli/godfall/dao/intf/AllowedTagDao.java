package org.imrofli.godfall.dao.intf;

import org.imrofli.godfall.dao.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface AllowedTagDao extends JpaRepository<AllowedTraitTags,Long> {

    Set<AllowedTraitTags> findAllByName(String name);
    Set<AllowedTraitTags> findAllByTraitGroup(String traitGroup);
    Set<AllowedTraitTags> findAllByAffinityInAndElementInAndItemTypeInAndWeaponTypeIn(Set<Affinity> affinitySet, Set<Element> elementSet, Set<ItemType> itemTypeSet, Set<WeaponType> weaponTypeSet);

}
