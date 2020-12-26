package org.imrofli.godfall.api.impl;

import org.imrofli.godfall.api.AugmentApiDelegate;
import org.imrofli.godfall.api.model.Augment;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.services.intf.AugmentService;
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


    @Override
    public ResponseEntity<List<Augment>> getAllAugments(String name) {
        LOGGER.info("Call to getAllAugments. Query: name {}", name);
        List<Augment> outAugments = null;
        try {
            if (name != null && !name.isEmpty()) {
                outAugments = augmentService.getAllAugmentsByQuery(name);
            } else {
                outAugments = augmentService.getAllAugments();
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
