package org.imrofli.godfall.services;

import org.imrofli.godfall.dao.intf.GlobalParameterDao;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.helpers.DaoToViewInterpreter;
import org.imrofli.godfall.services.intf.GlobalParameterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;

@Service
@Transactional
public class GlobalParameterServiceImpl implements GlobalParameterService {
    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalParameterServiceImpl.class);
    @Autowired
    private GlobalParameterDao globalParameterDao;

    @Override
    public List<org.imrofli.godfall.api.model.GlobalParameters> getAllGlobalParameters() throws ServiceCallException {
        Set<org.imrofli.godfall.dao.model.GlobalParameters> globalParametersSet = globalParameterDao.getAllParameters();
        if (globalParametersSet == null || globalParametersSet.isEmpty()) {
            throw new ServiceCallException("globalParameterDao.getAllParameters() returned NULL");
        }
        List<org.imrofli.godfall.api.model.GlobalParameters> out = DaoToViewInterpreter.convertGlobalParameterSetDao(globalParametersSet);
        return out;
    }
}
