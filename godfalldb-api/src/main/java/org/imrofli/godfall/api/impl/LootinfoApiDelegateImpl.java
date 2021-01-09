package org.imrofli.godfall.api.impl;

import org.imrofli.godfall.api.LootinfoApiDelegate;
import org.imrofli.godfall.api.model.LootInfo;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.services.intf.LootInfoService;
import org.imrofli.godfall.services.intf.VersionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LootinfoApiDelegateImpl implements LootinfoApiDelegate {
    private static final Logger LOGGER = LoggerFactory.getLogger(LootinfoApiDelegateImpl.class);

    @Autowired
    LootInfoService lootInfoService;
    @Autowired
    VersionService versionService;

    @Override
    public ResponseEntity<List<LootInfo>> getAllLootInfos(String version) {
        LOGGER.info("Call to getAllLootInfos. Version {}", version);
        List<LootInfo> outLootInfo = null;
        try {
            if (version == null) {
                version = versionService.getLatestVersion().getVersion();
            }
            outLootInfo = lootInfoService.getAllLootInfo(version);
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        if (outLootInfo != null && !outLootInfo.isEmpty()) {
            return ResponseEntity.ok(outLootInfo);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<LootInfo> getLootInfoByAmuletId(Long id, String version) {
        LOGGER.info("Call to getLootInfoByAmuletId. Version {}", version);
        LootInfo outLootInfo = null;
        try {
            if (version == null) {
                version = versionService.getLatestVersion().getVersion();
            }
            outLootInfo = lootInfoService.getLootInfoByTrinketId(id, version);
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        if (outLootInfo != null) {
            return ResponseEntity.ok(outLootInfo);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<LootInfo> getLootInfoByAugmentId(Long id, String version) {
        LOGGER.info("Call to getLootInfoByAugmentId. Version {}", version);
        LootInfo outLootInfo = null;
        try {
            if (version == null) {
                version = versionService.getLatestVersion().getVersion();
            }
            outLootInfo = lootInfoService.getLootInfoByAugmentId(id, version);
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        if (outLootInfo != null) {
            return ResponseEntity.ok(outLootInfo);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<LootInfo> getLootInfoByBannerId(Long id, String version) {
        LOGGER.info("Call to getLootInfoByBannerId. Version {}", version);
        LootInfo outLootInfo = null;
        try {
            if (version == null) {
                version = versionService.getLatestVersion().getVersion();
            }
            outLootInfo = lootInfoService.getLootInfoByBannerId(id, version);
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        if(outLootInfo != null){
            return ResponseEntity.ok(outLootInfo);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<LootInfo> getLootInfoByCharmId(Long id, String version) {
        LOGGER.info("Call to getLootInfoByCharmId. Version {}", version);
        LootInfo outLootInfo = null;
        try {
            if (version == null) {
                version = versionService.getLatestVersion().getVersion();
            }
            outLootInfo = lootInfoService.getLootInfoByTrinketId(id, version);
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        if(outLootInfo != null){
            return ResponseEntity.ok(outLootInfo);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<LootInfo> getLootInfoByLifeStoneId(Long id, String version) {
        LOGGER.info("Call to getLootInfoByLifeStoneId. Version {}", version);
        LootInfo outLootInfo = null;
        try {
            if (version == null) {
                version = versionService.getLatestVersion().getVersion();
            }
            outLootInfo = lootInfoService.getLootInfoByLifeStoneId(id, version);
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        if(outLootInfo != null){
            return ResponseEntity.ok(outLootInfo);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<LootInfo> getLootInfoByRingId(Long id, String version) {
        LOGGER.info("Call to getLootInfoByRingId. Version {}", version);
        LootInfo outLootInfo = null;
        try {
            if (version == null) {
                version = versionService.getLatestVersion().getVersion();
            }
            outLootInfo = lootInfoService.getLootInfoByTrinketId(id, version);
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        if(outLootInfo != null){
            return ResponseEntity.ok(outLootInfo);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<LootInfo> getLootInfoByWeaponId(Long id, String version) {
        LOGGER.info("Call to getLootInfoByWeaponId. Version {}", version);
        LootInfo outLootInfo = null;
        try {
            if (version == null) {
                version = versionService.getLatestVersion().getVersion();
            }
            outLootInfo = lootInfoService.getLootInfoByWeaponId(id, version);
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        if (outLootInfo != null) {
            return ResponseEntity.ok(outLootInfo);
        }
        return ResponseEntity.notFound().build();
    }

}
