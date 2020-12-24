package org.imrofli.godfall.services;

import org.imrofli.godfall.api.model.Amulet;
import org.imrofli.godfall.api.model.Charm;
import org.imrofli.godfall.api.model.Ring;
import org.imrofli.godfall.dao.intf.TrinketDao;
import org.imrofli.godfall.dao.model.ItemType;
import org.imrofli.godfall.dao.model.Trinket;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.helpers.DaoToViewInterpreter;
import org.imrofli.godfall.services.intf.TrinketService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class TrinketServiceImpl implements TrinketService {
    private static final Logger LOGGER = LoggerFactory.getLogger(TrinketServiceImpl.class);
    @Autowired
    private TrinketDao trinketDao;

    @Override
    public List<Amulet> getAllAmulets() throws ServiceCallException {
        LOGGER.info("Getting all Amulets");
        Set<Trinket> trinketSet = trinketDao.findAllAndFetchElementsAndAffinitiesWhereTrinketTypeOrderByName(ItemType.AMULET);
        if(trinketSet == null || trinketSet.isEmpty()){
            throw new ServiceCallException("trinketDao.findAllAndFetchElementsAndAffinitiesWhereTrinketTypeOrderByName returned NULL");
        }
        List<Amulet> out = DaoToViewInterpreter.convertAmuletDaoList(trinketSet);
        LOGGER.info("Got {} Amulets", out.size());
        return out;
    }

    @Override
    public List<Ring> getAllRings() throws ServiceCallException {
        LOGGER.info("Getting all Rings");
        Set<Trinket> trinketSet = trinketDao.findAllAndFetchElementsAndAffinitiesWhereTrinketTypeOrderByName(ItemType.RING);
        if(trinketSet == null || trinketSet.isEmpty()){
            throw new ServiceCallException("trinketDao.findAllAndFetchElementsAndAffinitiesWhereTrinketTypeOrderByName returned NULL");
        }
        List<Ring> out = DaoToViewInterpreter.convertRingDaoList(trinketSet);
        LOGGER.info("Got {} Rings", out.size());
        return out;
    }

    @Override
    public List<Charm> getAllCharms() throws ServiceCallException {
        LOGGER.info("Getting all Charms");
        Set<Trinket> trinketSet = trinketDao.findAllAndFetchElementsAndAffinitiesWhereTrinketTypeOrderByName(ItemType.CHARM);
        if(trinketSet == null || trinketSet.isEmpty()){
            throw new ServiceCallException("trinketDao.findAllAndFetchElementsAndAffinitiesWhereTrinketTypeOrderByName returned NULL");
        }
        List<Charm> out = DaoToViewInterpreter.convertCharmDaoList(trinketSet);
        LOGGER.info("Got {} Rings", out.size());
        return out;
    }

    @Override
    public Trinket getTrinketById(Long id) throws ServiceCallException {
        LOGGER.info("Getting Trinket id: {}", id);
        Trinket trinket = trinketDao.findByIdAndFetchAffinities(id);
        if(trinket == null){
            throw new ServiceCallException("trinketDao.findByIdAndFetchAffinities(id) returned NULL");
        }
        return trinket;
    }

    @Override
    public Ring getRingById(Long id) throws ServiceCallException {
        LOGGER.info("Getting Ring id: {}", id);
        Trinket trinket = trinketDao.findByIdAndFetchElementsAndAffinitiesWhereTrinketType(id, ItemType.RING);
        if(trinket == null){
            throw new ServiceCallException("trinketDao.findByIdAndFetchElementsAndAffinitiesWhereTrinketType returned NULL");
        }
        Ring out = DaoToViewInterpreter.convertRingDao(trinket);
        return out;
    }

    @Override
    public Charm getCharmById(Long id) throws ServiceCallException {
        LOGGER.info("Getting Charm id: {}", id);
        Trinket trinket = trinketDao.findByIdAndFetchElementsAndAffinitiesWhereTrinketType(id, ItemType.CHARM);
        if(trinket == null){
            throw new ServiceCallException("trinketDao.findByIdAndFetchElementsAndAffinitiesWhereTrinketType returned NULL");
        }
        Charm out = DaoToViewInterpreter.convertCharmDao(trinket);
        return out;
    }

    @Override
    public Amulet getAmuletById(Long id) throws ServiceCallException {
        LOGGER.info("Getting Charm id: {}", id);
        Trinket trinket = trinketDao.findByIdAndFetchElementsAndAffinitiesWhereTrinketType(id, ItemType.AMULET);
        if (trinket == null) {
            throw new ServiceCallException("trinketDao.findByIdAndFetchElementsAndAffinitiesWhereTrinketType returned NULL");
        }
        Amulet out = DaoToViewInterpreter.convertAmuletDao(trinket);
        return out;
    }

    @Override
    public Amulet getAmuletNoFetch(Long trinketId) throws ServiceCallException {
        LOGGER.info("Getting Amulet for id {}", trinketId);
        Optional<Trinket> trinket = trinketDao.findByIdAndItemType(trinketId, ItemType.AMULET);
        if (trinket.isPresent()) {
            org.imrofli.godfall.api.model.Amulet out = DaoToViewInterpreter.convertAmuletDao(trinket.get());
            return out;
        } else {
            throw new ServiceCallException("trinketDao.findByIdAndItemType returned NULL");
        }
    }

    @Override
    public Ring getRingNoFetch(Long trinketId) throws ServiceCallException {
        LOGGER.info("Getting Ring for id {}", trinketId);
        Optional<Trinket> trinket = trinketDao.findByIdAndItemType(trinketId, ItemType.RING);
        if (trinket.isPresent()) {
            org.imrofli.godfall.api.model.Ring out = DaoToViewInterpreter.convertRingDao(trinket.get());
            return out;
        } else {
            throw new ServiceCallException("trinketDao.findByIdAndItemType returned NULL");
        }
    }

    @Override
    public Charm getCharmNoFetch(Long trinketId) throws ServiceCallException {
        LOGGER.info("Getting Charm for id {}", trinketId);
        Optional<Trinket> trinket = trinketDao.findByIdAndItemType(trinketId, ItemType.CHARM);
        if (trinket.isPresent()) {
            org.imrofli.godfall.api.model.Charm out = DaoToViewInterpreter.convertCharmDao(trinket.get());
            return out;
        } else {
            throw new ServiceCallException("trinketDao.findByIdAndItemType returned NULL");
        }
    }
}
