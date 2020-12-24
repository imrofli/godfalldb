package org.imrofli.godfall.api.impl;

import org.imrofli.godfall.api.ScalingApiDelegate;
import org.imrofli.godfall.api.model.Rarity;
import org.imrofli.godfall.api.model.Scaling;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.services.intf.ScalingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScalingApiDelegateImpl implements ScalingApiDelegate {
    private static final Logger LOGGER = LoggerFactory.getLogger(ScalingApiDelegateImpl.class);
    @Autowired
    ScalingService scalingService;

    @Override
    public ResponseEntity<List<Scaling>> getAllScalings(Rarity rarity, Long level) {
        LOGGER.info("Call to getAllScalings");
        List<Scaling> outScaling = null;
        try {
            outScaling = scalingService.getScalingByRarityAndLevel(rarity, level);
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        if (outScaling != null && !outScaling.isEmpty()) {
            return ResponseEntity.ok(outScaling);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Scaling> getScalingsById(Long id) {
        LOGGER.info("Call to getScalingsById. ID {}", id);
        Scaling out = null;
        try {
            out = scalingService.getScalingById(id);
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
