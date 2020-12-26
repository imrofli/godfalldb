package org.imrofli.godfall.api.impl;

import org.imrofli.godfall.api.RingApiDelegate;
import org.imrofli.godfall.api.model.Ring;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.services.intf.TrinketService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RingApiDelegateImpl implements RingApiDelegate {
    private static final Logger LOGGER = LoggerFactory.getLogger(RingApiDelegateImpl.class);
    @Autowired
    TrinketService trinketService;

    @Override
    public ResponseEntity<List<Ring>> getAllRings(String name) {
        LOGGER.info("Call to getAllRings. Query: name {}", name);
        List<Ring> outRing = null;
        try {
            if (name != null && !name.isEmpty()) {
                outRing = trinketService.getAllRingsByQuery(name);
            } else {
                outRing = trinketService.getAllRings();
            }
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        if(outRing != null && !outRing.isEmpty()){
            return ResponseEntity.ok(outRing);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Ring> getRingById(Long id) {
        LOGGER.info("Call to getRingById. ID {}", id);
        Ring out = null;
        try {
            out = trinketService.getRingById(id);
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
