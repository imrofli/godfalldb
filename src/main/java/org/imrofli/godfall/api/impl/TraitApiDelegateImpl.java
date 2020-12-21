package org.imrofli.godfall.api.impl;

import org.imrofli.godfall.api.TraitApiDelegate;
import org.imrofli.godfall.api.model.Trait;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.services.intf.TraitService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TraitApiDelegateImpl implements TraitApiDelegate {

    private static final Logger LOGGER = LoggerFactory.getLogger(TraitApiDelegateImpl.class);
    @Autowired
    TraitService traitService;

    @Override
    public ResponseEntity<List<Trait>> getAllTraits() {
        LOGGER.info("Call to getAllTraits");
        List<Trait> outTraits = null;
        try {
            outTraits = traitService.getAllTraits();
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        if(outTraits != null && !outTraits.isEmpty()){
            return ResponseEntity.ok(outTraits);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Trait> getTraitById(Long id) {
        LOGGER.info("Call to getTraitById. ID {}", id);
        Trait out = null;
        try {
            out = traitService.getTraitById(id);
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
