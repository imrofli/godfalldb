package org.imrofli.godfall.services.intf;


import org.imrofli.godfall.dao.model.Augment;

import java.util.List;
import java.util.Set;

public interface AugmentService {

    public Set<Augment> getAugments();
    public Augment getAugmentById(Long id);
}
