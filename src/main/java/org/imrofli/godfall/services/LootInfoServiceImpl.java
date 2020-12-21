package org.imrofli.godfall.services;

import org.imrofli.godfall.api.model.LootInfo;
import org.imrofli.godfall.dao.intf.LootInfoDao;
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
        org.imrofli.godfall.dao.model.LootInfo lootInfo = lootInfoDao.findByIdAndFetch(lootInfoId);
        if(lootInfo == null){
            throw new ServiceCallException("lootInfoDao.findByIdAndFetch returned NULL");
        }
        return DaoToViewInterpreter.convertLootInfoDao(lootInfo);
    }

    @Override
    public List<LootInfo> getAllLootInfo() throws ServiceCallException {
        LOGGER.info("Getting all Loot Info");
        Set<org.imrofli.godfall.dao.model.LootInfo> lootInfoSet = lootInfoDao.findAllAndFetch();
        if(lootInfoSet == null || lootInfoSet.isEmpty()){
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
    public LootInfo getLootInfoByAugmentId(Long id) throws ServiceCallException {
        LOGGER.info("Getting LootInfo from Augment ID: {}", id);
        org.imrofli.godfall.dao.model.LootInfo lootInfo = lootInfoDao.findLootInfoByAugmentIdAndFetchDropTags(id);
        if(lootInfo == null){
            throw new ServiceCallException("lootInfoDao.findLootInfoByAugmentIdAndFetchDropTags returned NULL");
        }
        LootInfo out = DaoToViewInterpreter.convertLootInfoDao(lootInfo);
        return out;
    }

    @Override
    public LootInfo getLootInfoByBannerId(Long id) throws ServiceCallException {
        LOGGER.info("Getting LootInfo from Banner ID: {}", id);
        org.imrofli.godfall.dao.model.LootInfo lootInfo = lootInfoDao.findLootInfoByBannerIdAndFetchDropTags(id);
        if(lootInfo == null){
            throw new ServiceCallException("lootInfoDao.findLootInfoByBannerIdAndFetchDropTags returned NULL");
        }
        LootInfo out = DaoToViewInterpreter.convertLootInfoDao(lootInfo);
        return out;
    }

    @Override
    public LootInfo getLootInfoByLifeStoneId(Long id) throws ServiceCallException {
        LOGGER.info("Getting LootInfo from LifeStone ID: {}", id);
        org.imrofli.godfall.dao.model.LootInfo lootInfo = lootInfoDao.findLootInfoByLifeStoneIdAndFetchDropTags(id);
        if(lootInfo == null){
            throw new ServiceCallException("lootInfoDao.findLootInfoByLifeStoneIdAndFetchDropTags returned NULL");
        }
        LootInfo out = DaoToViewInterpreter.convertLootInfoDao(lootInfo);
        return out;
    }

    @Override
    public LootInfo getLootInfoByWeaponId(Long id) throws ServiceCallException {
        LOGGER.info("Getting LootInfo from Weapon ID: {}", id);
        org.imrofli.godfall.dao.model.LootInfo lootInfo = lootInfoDao.findLootInfoByWeaponIdAndFetchDropTags(id);
        if(lootInfo == null){
            throw new ServiceCallException("lootInfoDao.findLootInfoByWeaponIdAndFetchDropTags returned NULL");
        }
        LootInfo out = DaoToViewInterpreter.convertLootInfoDao(lootInfo);
        return out;
    }

    @Override
    public LootInfo getLootInfoByTrinketId(Long id) throws ServiceCallException {
        LOGGER.info("Getting LootInfo from Trinket ID: {}", id);
        org.imrofli.godfall.dao.model.LootInfo lootInfo = lootInfoDao.findLootInfoByTrinketIdAndFetchDropTags(id);
        if(lootInfo == null){
            throw new ServiceCallException("lootInfoDao.findLootInfoByTrinketIdAndFetchDropTags returned NULL");
        }
        LootInfo out = DaoToViewInterpreter.convertLootInfoDao(lootInfo);
        return out;
    }
}
