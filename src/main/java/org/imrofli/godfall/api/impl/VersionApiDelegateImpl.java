package org.imrofli.godfall.api.impl;

import org.imrofli.godfall.api.VersionApiDelegate;
import org.imrofli.godfall.api.model.Version;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.services.intf.VersionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VersionApiDelegateImpl implements VersionApiDelegate {
    private static final Logger LOGGER = LoggerFactory.getLogger(VersionApiDelegateImpl.class);
    @Autowired
    VersionService versionService;

    @Override
    public ResponseEntity<List<Version>> getAllVersions() {
        LOGGER.info("Call to getAllVersions");
        List<Version> outVersions = null;
        try {
            outVersions = versionService.getAllVersions();
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        if (outVersions != null && !outVersions.isEmpty()) {
            return ResponseEntity.ok(outVersions);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Version> getLatestVersion() {
        LOGGER.info("Call to getLatestVersion.");
        Version out = null;
        try {
            out = versionService.getLatestVersion();
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        if (out != null) {
            return ResponseEntity.ok(out);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Version> getVersionById(Long id) {
        LOGGER.info("Call to getVersionById. ID {}", id);
        Version out = null;
        try {
            out = versionService.getVersionByID(id);
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
