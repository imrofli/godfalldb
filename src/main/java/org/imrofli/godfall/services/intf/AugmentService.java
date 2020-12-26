package org.imrofli.godfall.services.intf;



import org.imrofli.godfall.api.model.Augment;
import org.imrofli.godfall.exception.ServiceCallException;

import java.util.List;

public interface AugmentService {

    List<Augment> getAllAugments() throws ServiceCallException;

    List<Augment> getAllAugmentsByQuery(String name) throws ServiceCallException;

    Augment getAugmentById(Long id) throws ServiceCallException;

    Augment getAugmentNoFetch(Long augmentId) throws ServiceCallException;
}
