package org.imrofli.godfall.services.intf;


import org.imrofli.godfall.api.model.Trait;
import org.imrofli.godfall.exception.ServiceCallException;

import java.util.List;

public interface TraitService {

    List<Trait> getAllTraits(String version) throws ServiceCallException;

    Trait getTraitById(Long traitId) throws ServiceCallException;

    Trait getTraitByName(String name, String version) throws ServiceCallException;

    List<Trait> getTraitsByAllowedTraitTagsAndBlacklistTags(List<String> allowedTraitTags, List<String> blacklistTags, String version) throws ServiceCallException;


}