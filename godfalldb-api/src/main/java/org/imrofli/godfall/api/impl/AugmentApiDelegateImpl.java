package org.imrofli.godfall.api.impl;

import org.imrofli.godfall.api.AugmentApiDelegate;
import org.imrofli.godfall.api.model.Augment;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.services.intf.AugmentService;
import org.imrofli.godfall.services.intf.VersionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AugmentApiDelegateImpl implements AugmentApiDelegate {
    private static final Logger LOGGER = LoggerFactory.getLogger(AugmentApiDelegateImpl.class);

    @Autowired
    AugmentService augmentService;
    @Autowired
    VersionService versionService;

    @Override
    public ResponseEntity<List<Augment>> getAllAugments(String name, String version) {
        LOGGER.info("Call to getAllAugments. Query: name {} Version {}", name, version);
        List<Augment> outAugments = null;
        try {
            if (version == null) {
                version = versionService.getLatestVersion().getVersion();
            }
            if (name != null && !name.isEmpty()) {
                outAugments = augmentService.getAllAugmentsByQuery(name, version);
            } else {
                outAugments = augmentService.getAllAugments(version);
            }
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        if(outAugments != null && !outAugments.isEmpty()){
            return ResponseEntity.ok(outAugments);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Augment> getAugmentById(Long id) {
        LOGGER.info("Call to getAugmentById. ID {}", id);
        Augment out = null;
        try {
            out = augmentService.getAugmentById(id);
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        if(out!=null){
            return ResponseEntity.ok(out);
        }
        return ResponseEntity.notFound().build();
    }
}
