package org.imrofli.godfall.api.impl;

import org.imrofli.godfall.api.PlayertierApiDelegate;
import org.imrofli.godfall.api.model.PlayerTier;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.services.intf.PlayerTierService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerTierApiDelegateImpl implements PlayertierApiDelegate {
    private static final Logger LOGGER = LoggerFactory.getLogger(PlayerTierApiDelegateImpl.class);
    @Autowired
    PlayerTierService playerTierService;

    @Override
    public ResponseEntity<List<PlayerTier>> getAllPlayerTiers() {
        LOGGER.info("Call to getAllPlayerStrengthIndexes");
        List<PlayerTier> outPlayerTiers = null;
        try {
            outPlayerTiers = playerTierService.getAllPlayerTier();
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        if (outPlayerTiers != null && !outPlayerTiers.isEmpty()) {
            return ResponseEntity.ok(outPlayerTiers);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<PlayerTier> getPlayerTierById(Long id) {
        LOGGER.info("Call to getPlayerStrengthIndexById. ID {}", id);
        PlayerTier out = null;
        try {
            out = playerTierService.getPlayerTierById(id);
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
