package org.imrofli.godfall.api.impl;

import org.imrofli.godfall.api.GlobalparamsApiDelegate;
import org.imrofli.godfall.api.model.GlobalParameters;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.services.intf.GlobalParameterService;
import org.imrofli.godfall.services.intf.VersionService;
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
    @Autowired
    VersionService versionService;

    @Override
    public ResponseEntity<List<GlobalParameters>> getAllGlobalParameters(String version) {
        LOGGER.info("Call to getAllGlobalParameters");
        List<GlobalParameters> outGlobalParameters = null;
        try {
            if (version == null) {
                version = versionService.getLatestVersion().getVersion();
            }
            outGlobalParameters = globalParameterService.getAllGlobalParameters(version);
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
