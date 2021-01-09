package org.imrofli.godfall.api.impl;

import org.imrofli.godfall.api.LifestoneApiDelegate;
import org.imrofli.godfall.api.model.LifeStone;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.services.intf.LifeStoneService;
import org.imrofli.godfall.services.intf.VersionService;
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
    @Autowired
    VersionService versionService;

    @Override
    public ResponseEntity<List<LifeStone>> getAllLifestones(String name, String version) {
        LOGGER.info("Call to getAllLifeStones. Query: name {} version {}", name, version);
        List<LifeStone> outLifeStone = null;
        try {
            if (version == null) {
                version = versionService.getLatestVersion().getVersion();
            }
            if (name != null && !name.isEmpty()) {
                outLifeStone = lifeStoneService.getAllLifeStonesByQuery(name, version);
            } else {
                outLifeStone = lifeStoneService.getAllLifeStones(version);
            }
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
