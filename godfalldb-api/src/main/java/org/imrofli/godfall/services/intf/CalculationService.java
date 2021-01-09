package org.imrofli.godfall.services.intf;

import org.imrofli.godfall.api.model.GlobalParameters;
import org.imrofli.godfall.dao.model.RarityModel;
import org.imrofli.godfall.dao.model.TraitModel;
import org.imrofli.godfall.exception.ServiceCallException;

import java.util.List;

public interface CalculationService {

    void calculateTraitPerLevelAndRarity(String version, TraitModel trait, Long level, RarityModel rarity, String descriptionParamType, List<GlobalParameters> globalParametersList) throws ServiceCallException;

    void calculateTrait(String version, TraitModel trait) throws ServiceCallException;
}
