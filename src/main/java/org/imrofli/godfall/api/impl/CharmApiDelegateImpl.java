package org.imrofli.godfall.api.impl;

import org.imrofli.godfall.api.CharmApiDelegate;
import org.imrofli.godfall.api.model.Charm;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.services.intf.TrinketService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharmApiDelegateImpl implements CharmApiDelegate {
    private static final Logger LOGGER = LoggerFactory.getLogger(CharmApiDelegateImpl.class);
    @Autowired
    TrinketService trinketService;

    @Override
    public ResponseEntity<List<Charm>> getAllCharms(String name) {
        LOGGER.info("Call to getAllCharms. Query: name {}", name);
        List<Charm> outCharm = null;
        try {
            if (name != null && !name.isEmpty()) {
                outCharm = trinketService.getAllCharmsByQuery(name);
            } else {
                outCharm = trinketService.getAllCharms();
            }
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        if(outCharm != null && !outCharm.isEmpty()){
            return ResponseEntity.ok(outCharm);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Charm> getCharmById(Long id) {
        LOGGER.info("Call to getCharmById. ID {}", id);
        Charm out = null;
        try {
            out = trinketService.getCharmById(id);
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
