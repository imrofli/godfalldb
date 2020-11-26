package org.imrofli.godfall.services;

import org.imrofli.godfall.dao.intf.LootInfoDao;

import org.imrofli.godfall.dao.model.LootInfo;
import org.imrofli.godfall.services.intf.LootInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class LootInfoServiceImpl implements LootInfoService {
    private static final Logger LOGGER = LoggerFactory.getLogger(LootInfo.class);
    @Autowired
    private LootInfoDao lootInfoDao;

    public LootInfoServiceImpl() {

    }


    @Override
    public LootInfo getLootInfo(Long lootInfoId) {
        LOGGER.info("Getting LootInfo id: {}", lootInfoId);
        return lootInfoDao.findByIdAndFetch(lootInfoId);
    }

    @Override
    public Set<LootInfo> getAllLootInfo() {
        return lootInfoDao.findAllAndFetch();
    }

    @Override
    public Set<String> getAllDropTags() {
        return lootInfoDao.findAllDropTags();
    }
}
