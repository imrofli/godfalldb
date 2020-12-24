package org.imrofli.godfall.api.impl;

import org.imrofli.godfall.api.EnemyclassApiDelegate;
import org.imrofli.godfall.api.model.EnemyClass;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.services.intf.EnemyClassService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnemyClassApiDelegateImpl implements EnemyclassApiDelegate {
    private static final Logger LOGGER = LoggerFactory.getLogger(EnemyClassApiDelegateImpl.class);
    @Autowired
    EnemyClassService enemyClassService;

    @Override
    public ResponseEntity<List<EnemyClass>> getAllEnemyClasses() {
        LOGGER.info("Call to getAllEnemyClasses");
        List<EnemyClass> outEnemyClasses = null;
        try {
            outEnemyClasses = enemyClassService.getAllEnemyClasses();
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        if (outEnemyClasses != null && !outEnemyClasses.isEmpty()) {
            return ResponseEntity.ok(outEnemyClasses);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<EnemyClass> getEnemyClassById(Long id) {
        LOGGER.info("Call to getEnemyClassById. ID {}", id);
        EnemyClass out = null;
        try {
            out = enemyClassService.getEnemyClassById(id);
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
