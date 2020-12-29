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

import java.util.ArrayList;
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
    @Autowired
    ValorplateService valorplateService;
    @Autowired
    SkillService skillService;
    @Autowired
    VersionService versionService;

    @Override
    public ResponseEntity<List<Trait>> getAllTraits(List<String> tags, List<String> blacklisttags, String version) {
        LOGGER.info("Call to getAllTraits with params: Version {} tags - {} blacklisttags - {}", version, tags, blacklisttags);
        List<Trait> outTraits = null;
        try {
            if (version == null) {
                version = versionService.getLatestVersion().getVersion();
            }
            if ((tags != null && !tags.isEmpty()) || (blacklisttags != null && !blacklisttags.isEmpty())) {

                outTraits = traitService.getTraitsByAllowedTraitTagsAndBlacklistTags(tags, blacklisttags, version);
            } else {
                outTraits = traitService.getAllTraits(version);
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
    public ResponseEntity<List<Trait>> getTraitsByAmuletId(Long id, String version) {
        LOGGER.info("Call to getTraitsByAmuletId with params: ID {} Version {}", id, version);
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
        return getAllTraits(tags, blacklistTags, version);
    }

    @Override
    public ResponseEntity<List<Trait>> getTraitsByAugmentId(Long id, String version) {
        LOGGER.info("Call to getTraitsByAugmentId with params: ID {} Version {}", id, version);
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
        return getAllTraits(tags, blacklistTags, version);
    }

    @Override
    public ResponseEntity<List<Trait>> getTraitsByBannerId(Long id, String version) {
        LOGGER.info("Call to getTraitsByBannerId with params: ID {} Version {}", id, version);
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
        return getAllTraits(tags, blacklistTags, version);
    }

    @Override
    public ResponseEntity<List<Trait>> getTraitsByCharmId(Long id, String version) {
        LOGGER.info("Call to getTraitsByCharmId with params: ID {} Version {}", id, version);
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
        return getAllTraits(tags, blacklistTags, version);
    }

    @Override
    public ResponseEntity<List<Trait>> getTraitsByLifestoneId(Long id, String version) {
        LOGGER.info("Call to getTraitsByLifestoneId with params: ID {} Version {}", id, version);
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
        return getAllTraits(tags, blacklistTags, version);
    }

    @Override
    public ResponseEntity<List<Trait>> getTraitsByRingId(Long id, String version) {
        LOGGER.info("Call to getTraitsByRingId with params: ID {} Version {}", id, version);
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
        return getAllTraits(tags, blacklistTags, version);
    }

    @Override
    public ResponseEntity<List<Trait>> getTraitsBySkillId(Long id, String version) {
        LOGGER.info("Call to getTraitsBySkillId with params: ID {} Version {}", id, version);
        List<Trait> out = new ArrayList<>();
        try {
            if (version == null) {
                version = versionService.getLatestVersion().getVersion();
            }
            Skill buffer = skillService.getSkillByID(id);
            if (buffer != null) {
                Trait t = traitService.getTraitByName(buffer.getTraitname(), version);
                out.add(t);
            }
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(out);
    }

    @Override
    public ResponseEntity<List<Trait>> getTraitsByValorplateId(Long id, String version) {
        LOGGER.info("Call to getTraitsByValorplateId with params: ID {} Version {}", id, version);
        List<Trait> out = new ArrayList<>();
        try {
            if (version == null) {
                version = versionService.getLatestVersion().getVersion();
            }
            Valorplate buffer = valorplateService.getValorplateByID(id);
            if (buffer != null) {
                for (String entry : buffer.getArchonmode().getAlwaysOn()) {
                    Trait t = traitService.getTraitByName(entry, version);
                    out.add(t);
                }
                for (String entry : buffer.getArchonmode().getOnActivation()) {
                    Trait t = traitService.getTraitByName(entry, version);
                    out.add(t);
                }
                for (String entry : buffer.getArchonmode().getWhileActive()) {
                    Trait t = traitService.getTraitByName(entry, version);
                    out.add(t);
                }
            }
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(out);
    }

    @Override
    public ResponseEntity<List<Trait>> getTraitsByWeaponId(Long id, String version) {
        LOGGER.info("Call to getTraitsByWeaponIdId with params: ID {} Version {}", id, version);
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
        return getAllTraits(tags, blacklistTags, version);
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
