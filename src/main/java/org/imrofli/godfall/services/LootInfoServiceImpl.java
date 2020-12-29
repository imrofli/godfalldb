package org.imrofli.godfall.services;

import org.imrofli.godfall.api.model.LootInfo;
import org.imrofli.godfall.dao.intf.LootInfoDao;
import org.imrofli.godfall.dao.model.LootInfoModel;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.helpers.DaoToViewInterpreter;
import org.imrofli.godfall.services.intf.LootInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class LootInfoServiceImpl implements LootInfoService {
    private static final Logger LOGGER = LoggerFactory.getLogger(LootInfoServiceImpl.class);
    @Autowired
    private LootInfoDao lootInfoDao;


    @Override
    public LootInfo getLootInfo(Long lootInfoId) throws ServiceCallException {
        LOGGER.info("Getting LootInfo id: {}", lootInfoId);
        LootInfoModel lootInfo = lootInfoDao.findByIdAndFetch(lootInfoId);
        if(lootInfo == null){
            throw new ServiceCallException("lootInfoDao.findByIdAndFetch returned NULL");
        }
        return DaoToViewInterpreter.convertLootInfoDao(lootInfo);
    }

    @Override
    public List<LootInfo> getAllLootInfo(String version) throws ServiceCallException {
        LOGGER.info("Getting all Loot Info. Version {}", version);
        Set<LootInfoModel> lootInfoSet = lootInfoDao.findAllAndFetch(version);
        if (lootInfoSet == null || lootInfoSet.isEmpty()) {
            throw new ServiceCallException("lootInfoDao.findAllAndFetch() returned NULL");
        }
        List<LootInfo> out = DaoToViewInterpreter.convertLootInfoDaoList(lootInfoSet);
        LOGGER.info("Got {} Loot Infos", out.size());
        return out;
    }

    @Override
    public List<String> getAllDropTags() {
        LOGGER.info("Getting all Drop Tags");
        List<String> out = new ArrayList<>();
        out.addAll(lootInfoDao.findAllDropTags());
        LOGGER.info("Got {} DropTags", out.size());
        return out;
    }

    @Override
    public LootInfo getLootInfoByAugmentId(Long id, String version) throws ServiceCallException {
        LOGGER.info("Getting LootInfo from Augment ID: {} Version {}", id, version);
        LootInfoModel lootInfo = lootInfoDao.findLootInfoByAugmentIdAndFetchDropTags(id, version);
        if (lootInfo == null) {
            throw new ServiceCallException("lootInfoDao.findLootInfoByAugmentIdAndFetchDropTags returned NULL");
        }
        LootInfo out = DaoToViewInterpreter.convertLootInfoDao(lootInfo);
        return out;
    }

    @Override
    public LootInfo getLootInfoByBannerId(Long id, String version) throws ServiceCallException {
        LOGGER.info("Getting LootInfo from Banner ID: {} Version {}", id, version);
        LootInfoModel lootInfo = lootInfoDao.findLootInfoByBannerIdAndFetchDropTags(id, version);
        if (lootInfo == null) {
            throw new ServiceCallException("lootInfoDao.findLootInfoByBannerIdAndFetchDropTags returned NULL");
        }
        LootInfo out = DaoToViewInterpreter.convertLootInfoDao(lootInfo);
        return out;
    }

    @Override
    public LootInfo getLootInfoByLifeStoneId(Long id, String version) throws ServiceCallException {
        LOGGER.info("Getting LootInfo from LifeStone ID: {} Version {}", id, version);
        LootInfoModel lootInfo = lootInfoDao.findLootInfoByLifeStoneIdAndFetchDropTags(id, version);
        if (lootInfo == null) {
            throw new ServiceCallException("lootInfoDao.findLootInfoByLifeStoneIdAndFetchDropTags returned NULL");
        }
        LootInfo out = DaoToViewInterpreter.convertLootInfoDao(lootInfo);
        return out;
    }

    @Override
    public LootInfo getLootInfoByWeaponId(Long id, String version) throws ServiceCallException {
        LOGGER.info("Getting LootInfo from Weapon ID: {} Version {}", id, version);
        LootInfoModel lootInfo = lootInfoDao.findLootInfoByWeaponIdAndFetchDropTags(id, version);
        if (lootInfo == null) {
            throw new ServiceCallException("lootInfoDao.findLootInfoByWeaponIdAndFetchDropTags returned NULL");
        }
        LootInfo out = DaoToViewInterpreter.convertLootInfoDao(lootInfo);
        return out;
    }

    @Override
    public LootInfo getLootInfoByTrinketId(Long id, String version) throws ServiceCallException {
        LOGGER.info("Getting LootInfo from Trinket ID: {} Version {}", id, version);
        LootInfoModel lootInfo = lootInfoDao.findLootInfoByTrinketIdAndFetchDropTags(id, version);
        if (lootInfo == null) {
            throw new ServiceCallException("lootInfoDao.findLootInfoByTrinketIdAndFetchDropTags returned NULL");
        }
        LootInfo out = DaoToViewInterpreter.convertLootInfoDao(lootInfo);
        return out;
    }
}
