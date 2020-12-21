package org.imrofli.godfall.api.impl;

import org.imrofli.godfall.api.LootinfoApiDelegate;
import org.imrofli.godfall.api.model.LootInfo;
import org.imrofli.godfall.api.model.Ring;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.services.intf.LootInfoService;
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

    @Override
    public ResponseEntity<List<LootInfo>> getAllLootInfos() {
        LOGGER.info("Call to getAllLootInfos");
        List<LootInfo> outLootInfo = null;
        try {
            outLootInfo = lootInfoService.getAllLootInfo();
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        if(outLootInfo != null && !outLootInfo.isEmpty()){
            return ResponseEntity.ok(outLootInfo);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<LootInfo> getLootInfoByAmuletId(Long id) {
        LOGGER.info("Call to getLootInfoByAmuletId");
        LootInfo outLootInfo = null;
        try {
            outLootInfo = lootInfoService.getLootInfoByTrinketId(id);
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
    public ResponseEntity<LootInfo> getLootInfoByAugmentId(Long id) {
        LOGGER.info("Call to getLootInfoByAugmentId");
        LootInfo outLootInfo = null;
        try {
            outLootInfo = lootInfoService.getLootInfoByAugmentId(id);
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
    public ResponseEntity<LootInfo> getLootInfoByBannerId(Long id) {
        LOGGER.info("Call to getLootInfoByBannerId");
        LootInfo outLootInfo = null;
        try {
            outLootInfo = lootInfoService.getLootInfoByBannerId(id);
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
    public ResponseEntity<LootInfo> getLootInfoByCharmId(Long id) {
        LOGGER.info("Call to getLootInfoByCharmId");
        LootInfo outLootInfo = null;
        try {
            outLootInfo = lootInfoService.getLootInfoByTrinketId(id);
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
    public ResponseEntity<LootInfo> getLootInfoByLifeStoneId(Long id) {
        LOGGER.info("Call to getLootInfoByLifeStoneId");
        LootInfo outLootInfo = null;
        try {
            outLootInfo = lootInfoService.getLootInfoByLifeStoneId(id);
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
    public ResponseEntity<LootInfo> getLootInfoByRingId(Long id) {
        LOGGER.info("Call to getLootInfoByRingId");
        LootInfo outLootInfo = null;
        try {
            outLootInfo = lootInfoService.getLootInfoByTrinketId(id);
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        if(outLootInfo != null){
            return ResponseEntity.ok(outLootInfo);
        }
        return ResponseEntity.notFound().build();
    }
}
