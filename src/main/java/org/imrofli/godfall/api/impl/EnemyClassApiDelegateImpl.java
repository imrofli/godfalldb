package org.imrofli.godfall.api.impl;

import org.imrofli.godfall.api.EnemyclassApiDelegate;
import org.imrofli.godfall.api.model.EnemyClass;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.services.intf.EnemyClassService;
import org.imrofli.godfall.services.intf.VersionService;
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
    @Autowired
    VersionService versionService;

    @Override
    public ResponseEntity<List<EnemyClass>> getAllEnemyClasses(String name, String version) {
        LOGGER.info("Call to getAllEnemyClasses. Query: name {}, version {}", name, version);
        List<EnemyClass> outEnemyClasses = null;
        try {
            if (version == null) {
                version = versionService.getLatestVersion().getVersion();
            }
            if (name != null && !name.isEmpty()) {
                outEnemyClasses = enemyClassService.getAllEnemyClassesByQuery(name, version);
            } else {
                outEnemyClasses = enemyClassService.getAllEnemyClasses(version);
            }

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
