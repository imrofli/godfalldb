package org.imrofli.godfall.api.impl;

import org.imrofli.godfall.api.ValorplateApiDelegate;
import org.imrofli.godfall.api.model.Valorplate;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.services.intf.ValorplateService;
import org.imrofli.godfall.services.intf.VersionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValorplateApiDelegateImpl implements ValorplateApiDelegate {
    private static final Logger LOGGER = LoggerFactory.getLogger(ValorplateApiDelegateImpl.class);
    @Autowired
    ValorplateService valorplateService;
    @Autowired
    VersionService versionService;

    @Override
    public ResponseEntity<List<Valorplate>> getAllValorplates(String name, String version) {
        LOGGER.info("Call to getAllValorplates. Query: name {}, Version {}", name, version);
        List<Valorplate> outValorplates = null;
        try {
            if (version == null) {
                version = versionService.getLatestVersion().getVersion();
            }
            if (name != null && !name.isEmpty()) {
                outValorplates = valorplateService.getAllValorplatesByQuery(name, version);
            } else {
                outValorplates = valorplateService.getAllValorplates(version);
            }
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        if (outValorplates != null && !outValorplates.isEmpty()) {
            return ResponseEntity.ok(outValorplates);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Valorplate> getValorplateById(Long id) {
        LOGGER.info("Call to getValorplateById. ID {}", id);
        Valorplate out = null;
        try {
            out = valorplateService.getValorplateByID(id);
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        if (out != null) {
            return ResponseEntity.ok(out);
        }
        return ResponseEntity.notFound().build();
    }

}
