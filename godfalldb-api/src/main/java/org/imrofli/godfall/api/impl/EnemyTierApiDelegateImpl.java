package org.imrofli.godfall.api.impl;

import org.imrofli.godfall.api.EnemytierApiDelegate;
import org.imrofli.godfall.api.model.EnemyTier;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.services.intf.EnemyTierService;
import org.imrofli.godfall.services.intf.VersionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnemyTierApiDelegateImpl implements EnemytierApiDelegate {
    private static final Logger LOGGER = LoggerFactory.getLogger(EnemyTierApiDelegateImpl.class);
    @Autowired
    EnemyTierService enemyTierService;
    @Autowired
    VersionService versionService;

    @Override
    public ResponseEntity<List<EnemyTier>> getAllEnemyTiers(String version) {
        LOGGER.info("Call to getAllEnemyTiers. Version {}", version);
        List<EnemyTier> outEnemyTiers = null;
        try {
            if (version == null) {
                version = versionService.getLatestVersion().getVersion();
            }
            outEnemyTiers = enemyTierService.getAllEnemyTiers(version);
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        if (outEnemyTiers != null && !outEnemyTiers.isEmpty()) {
            return ResponseEntity.ok(outEnemyTiers);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<EnemyTier> getEnemyTierById(Long id) {
        LOGGER.info("Call to getEnemyTierById. ID {}", id);
        EnemyTier out = null;
        try {
            out = enemyTierService.getEnemyTierById(id);
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
