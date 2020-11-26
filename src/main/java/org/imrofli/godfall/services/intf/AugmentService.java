package org.imrofli.godfall.services.intf;


import org.imrofli.godfall.dao.model.Augment;
import org.imrofli.godfall.dao.model.Weapon;

import java.util.List;
import java.util.Set;

public interface AugmentService {

    public Set<Augment> getAugments();
    public Augment getAugmentById(Long id);
    public Augment getAugmentByIdLoadAffinity(Long id);
    Set<Augment> getAllByLootInfoDropTag(String dropTag);
}
