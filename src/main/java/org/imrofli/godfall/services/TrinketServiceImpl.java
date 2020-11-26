package org.imrofli.godfall.services;

import org.imrofli.godfall.dao.intf.TrinketDao;
import org.imrofli.godfall.dao.model.ItemType;
import org.imrofli.godfall.dao.model.Trinket;
import org.imrofli.godfall.services.intf.TrinketService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class TrinketServiceImpl implements TrinketService {
    private static final Logger LOGGER = LoggerFactory.getLogger(TrinketServiceImpl.class);
    @Autowired
    private TrinketDao trinketDao;


    public TrinketServiceImpl() {
    }


    @Override
    public Set<Trinket> getTrinkets() {
        LOGGER.info("Getting all Trinkets");
        return trinketDao.findAllAndFetchElementsAndAffinities();
    }

    @Override
    public Set<Trinket> getAmulets() {
        LOGGER.info("Getting all Amulets");

        return trinketDao.findAllAndFetchElementsAndAffinitiesWhereTrinketType(ItemType.AMULET);
    }

    @Override
    public Set<Trinket> getRings() {
        LOGGER.info("Getting all Rings");
        return trinketDao.findAllAndFetchElementsAndAffinitiesWhereTrinketType(ItemType.RING);
    }

    @Override
    public Set<Trinket> getCharms() {
        LOGGER.info("Getting all Charms");
        return trinketDao.findAllAndFetchElementsAndAffinitiesWhereTrinketType(ItemType.CHARM);
    }

    @Override
    public Trinket getTrinketById(Long id) {
        LOGGER.info("Getting Trinket id: {}", id);
        return trinketDao.findByIdAndFetchTraits(id);
    }

    @Override
    public Trinket getTrinketByIdLoadAffinity(Long id) {
        LOGGER.info("Getting Trinkets by id: {}", id);
        return trinketDao.findByIdAndFetchAffinities(id);
    }

    @Override
    public Set<Trinket> getAllByLootInfoDropTag(String dropTag) {
        LOGGER.info("Getting Trinkets by drop tag: {}", dropTag);
        return trinketDao.findAllByLootInfoTag(dropTag);
    }


}
