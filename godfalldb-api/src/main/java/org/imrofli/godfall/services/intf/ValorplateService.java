package org.imrofli.godfall.services.intf;


import org.imrofli.godfall.api.model.Valorplate;
import org.imrofli.godfall.exception.ServiceCallException;

import java.util.List;

public interface ValorplateService {

    List<Valorplate> getAllValorplates(String version) throws ServiceCallException;

    List<Valorplate> getAllValorplatesByQuery(String name, String version) throws ServiceCallException;

    Valorplate getValorplateByID(Long valorplateId) throws ServiceCallException;

    Valorplate getValorplateNoFetch(Long valorplateId) throws ServiceCallException;
}
