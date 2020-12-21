package org.imrofli.godfall.api.impl;

import org.imrofli.godfall.api.AmuletApiDelegate;
import org.imrofli.godfall.api.model.Amulet;
import org.imrofli.godfall.api.model.Augment;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.services.intf.TrinketService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmuletApiDelegateImpl implements AmuletApiDelegate {
    private static final Logger LOGGER = LoggerFactory.getLogger(AmuletApiDelegateImpl.class);
    @Autowired
    TrinketService trinketService;

    @Override
    public ResponseEntity<List<Amulet>> getAllAmulets() {
        LOGGER.info("Call to getAllAmulets");
        List<Amulet> outAmulets = null;
        try {
            outAmulets = trinketService.getAllAmulets();
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        if(outAmulets != null && !outAmulets.isEmpty()){
            return ResponseEntity.ok(outAmulets);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Amulet> getAmuletById(Long id) {
        LOGGER.info("Call to getAmuletById. ID {}", id);
        Amulet out = null;
        try {
            out = trinketService.getAmuletById(id);
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
