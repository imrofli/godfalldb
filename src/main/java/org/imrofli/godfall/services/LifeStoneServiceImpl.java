package org.imrofli.godfall.services;

import org.imrofli.godfall.dao.intf.LifeStoneDao;
import org.imrofli.godfall.dao.model.LifeStone;
import org.imrofli.godfall.services.intf.LifeStoneService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class LifeStoneServiceImpl implements LifeStoneService {
    private static final Logger LOGGER = LoggerFactory.getLogger(LifeStoneServiceImpl.class);

    @Autowired
    private LifeStoneDao lifeStoneDao;

    @Override
    public Set<LifeStone> getLifeStones() {
        LOGGER.info("Getting all LifeStones");
        return lifeStoneDao.findAllAndFetchElementsAndAffinities();
    }

    @Override
    public LifeStone getLifeStoneById(Long id) {
        LOGGER.info("Getting LifeStone id: {}", id);
        return lifeStoneDao.findByIdAndFetchTraits(id);
    }

    @Override
    public LifeStone getLifeStoneByIdLoadAffinity(Long id) {
        return lifeStoneDao.findByIdAndFetchAffinities(id);
    }

    @Override
    public Set<LifeStone> getAllByLootInfoDropTag(String dropTag) {
        return null;
    }
}
