package org.imrofli.godfall.api.impl;

import org.imrofli.godfall.api.EnemyApiDelegate;
import org.imrofli.godfall.api.model.Enemy;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.services.intf.EnemyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnemyApiDelegateImpl implements EnemyApiDelegate {
    private static final Logger LOGGER = LoggerFactory.getLogger(EnemyApiDelegateImpl.class);
    @Autowired
    EnemyService enemyService;

    @Override
    public ResponseEntity<List<Enemy>> getAllEnemies() {
        LOGGER.info("Call to getAllEnemies");
        List<Enemy> outEnemies = null;
        try {
            outEnemies = enemyService.getAllEnemies();
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        if (outEnemies != null && !outEnemies.isEmpty()) {
            return ResponseEntity.ok(outEnemies);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Enemy> getEnemyById(Long id) {
        LOGGER.info("Call to getEnemyById. ID {}", id);
        Enemy out = null;
        try {
            out = enemyService.getEnemyById(id);
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
