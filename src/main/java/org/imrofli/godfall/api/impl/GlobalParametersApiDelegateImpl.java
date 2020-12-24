package org.imrofli.godfall.api.impl;

import org.imrofli.godfall.api.GlobalparamsApiDelegate;
import org.imrofli.godfall.api.model.GlobalParameters;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.services.intf.GlobalParameterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GlobalParametersApiDelegateImpl implements GlobalparamsApiDelegate {
    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalParametersApiDelegateImpl.class);
    @Autowired
    GlobalParameterService globalParameterService;

    @Override
    public ResponseEntity<List<GlobalParameters>> getAllGlobalParameters() {
        LOGGER.info("Call to getAllGlobalParameters");
        List<GlobalParameters> outGlobalParameters = null;
        try {
            outGlobalParameters = globalParameterService.getAllGlobalParameters();
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        if (outGlobalParameters != null && !outGlobalParameters.isEmpty()) {
            return ResponseEntity.ok(outGlobalParameters);
        }
        return ResponseEntity.notFound().build();
    }
}
