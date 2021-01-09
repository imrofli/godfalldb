package org.imrofli.godfall.services.intf;

import org.imrofli.godfall.api.model.GlobalParameters;
import org.imrofli.godfall.exception.ServiceCallException;

import java.util.List;

public interface GlobalParameterService {

    List<GlobalParameters> getAllGlobalParameters(String version) throws ServiceCallException;
}
