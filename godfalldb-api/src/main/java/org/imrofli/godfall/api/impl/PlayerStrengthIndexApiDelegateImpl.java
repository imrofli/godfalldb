package org.imrofli.godfall.api.impl;

import org.imrofli.godfall.api.PlayerstrengthindexApiDelegate;
import org.imrofli.godfall.api.model.PlayerStrengthIndex;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.services.intf.PlayerStrengthIndexService;
import org.imrofli.godfall.services.intf.VersionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerStrengthIndexApiDelegateImpl implements PlayerstrengthindexApiDelegate {
    private static final Logger LOGGER = LoggerFactory.getLogger(PlayerStrengthIndexApiDelegateImpl.class);
    @Autowired
    PlayerStrengthIndexService playerStrengthIndexService;
    @Autowired
    VersionService versionService;

    @Override
    public ResponseEntity<List<PlayerStrengthIndex>> getAllPlayerStrengthIndexes(String version) {
        LOGGER.info("Call to getAllPlayerStrengthIndexes. Version {}", version);
        List<PlayerStrengthIndex> outPlayerStrengthIndices = null;
        try {
            if (version == null) {
                version = versionService.getLatestVersion().getVersion();
            }
            outPlayerStrengthIndices = playerStrengthIndexService.getAllPlayerStrengthIndexes(version);
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        if (outPlayerStrengthIndices != null && !outPlayerStrengthIndices.isEmpty()) {
            return ResponseEntity.ok(outPlayerStrengthIndices);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<PlayerStrengthIndex> getPlayerStrengthIndexById(Long id) {
        LOGGER.info("Call to getPlayerStrengthIndexById. ID {}", id);
        PlayerStrengthIndex out = null;
        try {
            out = playerStrengthIndexService.getPlayerStrengthIndexById(id);
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
