package org.imrofli.godfall.api.impl;

import org.imrofli.godfall.api.TraitApiDelegate;
import org.imrofli.godfall.api.model.*;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.services.intf.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraitApiDelegateImpl implements TraitApiDelegate {

    private static final Logger LOGGER = LoggerFactory.getLogger(TraitApiDelegateImpl.class);
    @Autowired
    TraitService traitService;
    @Autowired
    WeaponService weaponService;
    @Autowired
    TrinketService trinketService;
    @Autowired
    AugmentService augmentService;
    @Autowired
    BannerService bannerService;
    @Autowired
    LifeStoneService lifeStoneService;

    @Override
    public ResponseEntity<List<Trait>> getTraitsByWeaponId(Long id) {
        LOGGER.info("Call to getTraitsByWeaponIdId with params: ID {}", id);
        List<String> tags = null;
        List<String> blacklistTags = null;
        try {
            Weapon buffer = weaponService.getWeaponNoFetch(id);
            if (buffer != null) {
                tags = buffer.getTags();
                blacklistTags = buffer.getBlacklisttags();
            }
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        return getAllTraits(tags, blacklistTags);
    }

    @Override
    public ResponseEntity<List<Trait>> getTraitsByAmuletId(Long id) {
        LOGGER.info("Call to getTraitsByAmuletId with params: ID {}", id);
        List<String> tags = null;
        List<String> blacklistTags = null;
        try {
            Amulet buffer = trinketService.getAmuletNoFetch(id);
            if (buffer != null) {
                tags = buffer.getTags();
                blacklistTags = buffer.getBlacklisttags();
            }
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        return getAllTraits(tags, blacklistTags);
    }

    @Override
    public ResponseEntity<List<Trait>> getTraitsByAugmentId(Long id) {
        LOGGER.info("Call to getTraitsByAugmentId with params: ID {}", id);
        List<String> tags = null;
        List<String> blacklistTags = null;
        try {
            Augment buffer = augmentService.getAugmentNoFetch(id);
            if (buffer != null) {
                tags = buffer.getTags();
                blacklistTags = buffer.getBlacklisttags();
            }
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        return getAllTraits(tags, blacklistTags);
    }

    @Override
    public ResponseEntity<List<Trait>> getTraitsByBannerId(Long id) {
        LOGGER.info("Call to getTraitsByBannerId with params: ID {}", id);
        List<String> tags = null;
        List<String> blacklistTags = null;
        try {
            Banner buffer = bannerService.getBannerNoFetch(id);
            if (buffer != null) {
                tags = buffer.getTags();
                blacklistTags = buffer.getBlacklisttags();
            }
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        return getAllTraits(tags, blacklistTags);
    }

    @Override
    public ResponseEntity<List<Trait>> getTraitsByCharmId(Long id) {
        LOGGER.info("Call to getTraitsByCharmId with params: ID {}", id);
        List<String> tags = null;
        List<String> blacklistTags = null;
        try {
            Charm buffer = trinketService.getCharmNoFetch(id);
            if (buffer != null) {
                tags = buffer.getTags();
                blacklistTags = buffer.getBlacklisttags();
            }
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        return getAllTraits(tags, blacklistTags);
    }

    @Override
    public ResponseEntity<List<Trait>> getTraitsByLifestoneId(Long id) {
        LOGGER.info("Call to getTraitsByLifestoneId with params: ID {}", id);
        List<String> tags = null;
        List<String> blacklistTags = null;
        try {
            LifeStone buffer = lifeStoneService.getLifeStoneNoFetch(id);
            if (buffer != null) {
                tags = buffer.getTags();
                blacklistTags = buffer.getBlacklisttags();
            }
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        return getAllTraits(tags, blacklistTags);
    }

    @Override
    public ResponseEntity<List<Trait>> getTraitsByRingId(Long id) {
        LOGGER.info("Call to getTraitsByRingId with params: ID {}", id);
        List<String> tags = null;
        List<String> blacklistTags = null;
        try {
            Ring buffer = trinketService.getRingNoFetch(id);
            if (buffer != null) {
                tags = buffer.getTags();
                blacklistTags = buffer.getBlacklisttags();
            }
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        return getAllTraits(tags, blacklistTags);
    }

    @Override
    public ResponseEntity<List<Trait>> getAllTraits(List<String> tags, List<String> blacklisttags) {
        LOGGER.info("Call to getAllTraits with params: tags - {}", tags);
        List<Trait> outTraits = null;
        try {
            if ((tags != null && !tags.isEmpty()) || (blacklisttags != null && !blacklisttags.isEmpty())) {

                outTraits = traitService.getTraitsByAllowedTraitTagsAndBlacklistTags(tags, blacklisttags);
            } else {
                outTraits = traitService.getAllTraits();
            }
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        if (outTraits != null && !outTraits.isEmpty()) {
            return ResponseEntity.ok(outTraits);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Trait> getTraitById(Long id) {
        LOGGER.info("Call to getTraitById with params: ID {}", id);
        Trait out = null;
        try {
            out = traitService.getTraitById(id);
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
