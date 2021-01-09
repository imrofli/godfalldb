package org.imrofli.godfall.api.impl;

import org.imrofli.godfall.api.RingApiDelegate;
import org.imrofli.godfall.api.model.Ring;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.services.intf.TrinketService;
import org.imrofli.godfall.services.intf.VersionService;
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
    @Autowired
    VersionService versionService;

    @Override
    public ResponseEntity<List<Ring>> getAllRings(String name, String version) {
        LOGGER.info("Call to getAllRings. Query: name {} Version {}", name, version);
        List<Ring> outRing = null;
        try {
            if (version == null) {
                version = versionService.getLatestVersion().getVersion();
            }
            if (name != null && !name.isEmpty()) {
                outRing = trinketService.getAllRingsByQuery(name, version);
            } else {
                outRing = trinketService.getAllRings(version);
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
