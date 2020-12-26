package org.imrofli.godfall.services.intf;

import org.imrofli.godfall.api.model.GlobalParameters;
import org.imrofli.godfall.dao.model.Rarity;
import org.imrofli.godfall.dao.model.Trait;
import org.imrofli.godfall.exception.ServiceCallException;

import java.util.List;

public interface CalculationService {

    void calculateTraitPerLevelAndRarity(Trait trait, Long level, Rarity rarity, String descriptionParamType, List<GlobalParameters> globalParametersList) throws ServiceCallException;

    void calculateTrait(Trait trait) throws ServiceCallException;
}
