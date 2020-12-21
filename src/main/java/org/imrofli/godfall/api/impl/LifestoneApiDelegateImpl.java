package org.imrofli.godfall.api.impl;

import org.imrofli.godfall.api.LifestoneApiDelegate;
import org.imrofli.godfall.api.model.LifeStone;
import org.imrofli.godfall.api.model.Ring;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.services.intf.LifeStoneService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LifestoneApiDelegateImpl implements LifestoneApiDelegate {
    private static final Logger LOGGER = LoggerFactory.getLogger(LifestoneApiDelegateImpl.class);

    @Autowired
    LifeStoneService lifeStoneService;

    @Override
    public ResponseEntity<List<LifeStone>> getAllLifestones() {
        LOGGER.info("Call to getAllLifeStones");
        List<LifeStone> outLifeStone = null;
        try {
            outLifeStone = lifeStoneService.getAllLifeStones();
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        if(outLifeStone != null && !outLifeStone.isEmpty()){
            return ResponseEntity.ok(outLifeStone);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<LifeStone> getLifestoneById(Long id) {
        LOGGER.info("Call to getLifeStoneById. ID {}", id);
        LifeStone out = null;
        try {
            out = lifeStoneService.getLifeStoneById(id);
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
