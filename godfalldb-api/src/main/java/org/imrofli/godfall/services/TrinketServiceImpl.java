package org.imrofli.godfall.services;

import org.imrofli.godfall.api.model.Amulet;
import org.imrofli.godfall.api.model.Charm;
import org.imrofli.godfall.api.model.Ring;
import org.imrofli.godfall.dao.intf.TrinketDao;
import org.imrofli.godfall.dao.model.ItemTypeModel;
import org.imrofli.godfall.dao.model.TrinketModel;
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
    public List<Amulet> getAllAmulets(String version) throws ServiceCallException {
        LOGGER.info("Getting all Amulets. Version {}", version);
        Set<TrinketModel> trinketSet = trinketDao.findAllAndFetchElementsAndAffinitiesWhereTrinketTypeOrderByName(ItemTypeModel.AMULET, version);
        if (trinketSet == null || trinketSet.isEmpty()) {
            throw new ServiceCallException("trinketDao.findAllAndFetchElementsAndAffinitiesWhereTrinketTypeOrderByName returned NULL");
        }
        List<Amulet> out = DaoToViewInterpreter.convertAmuletDaoList(trinketSet);
        LOGGER.info("Got {} Amulets", out.size());
        return out;
    }

    @Override
    public List<Ring> getAllRings(String version) throws ServiceCallException {
        LOGGER.info("Getting all Rings. Version {}", version);
        Set<TrinketModel> trinketSet = trinketDao.findAllAndFetchElementsAndAffinitiesWhereTrinketTypeOrderByName(ItemTypeModel.RING, version);
        if (trinketSet == null || trinketSet.isEmpty()) {
            throw new ServiceCallException("trinketDao.findAllAndFetchElementsAndAffinitiesWhereTrinketTypeOrderByName returned NULL");
        }
        List<Ring> out = DaoToViewInterpreter.convertRingDaoList(trinketSet);
        LOGGER.info("Got {} Rings", out.size());
        return out;
    }

    @Override
    public List<Charm> getAllCharms(String version) throws ServiceCallException {
        LOGGER.info("Getting all Charms. Version {}", version);
        Set<TrinketModel> trinketSet = trinketDao.findAllAndFetchElementsAndAffinitiesWhereTrinketTypeOrderByName(ItemTypeModel.CHARM, version);
        if (trinketSet == null || trinketSet.isEmpty()) {
            throw new ServiceCallException("trinketDao.findAllAndFetchElementsAndAffinitiesWhereTrinketTypeOrderByName returned NULL");
        }
        List<Charm> out = DaoToViewInterpreter.convertCharmDaoList(trinketSet);
        LOGGER.info("Got {} Rings", out.size());
        return out;
    }

    @Override
    public List<Amulet> getAllAmuletsByQuery(String name, String version) throws ServiceCallException {
        LOGGER.info("Getting all Amulets by query. Name {} Version {}", name, version);
        Set<TrinketModel> trinketSet = trinketDao.findAllAndFetchElementsAndAffinitiesWhereTrinketTypeAndNameOrderByName(ItemTypeModel.AMULET, "%" + name + "%", version);
        if (trinketSet == null || trinketSet.isEmpty()) {
            throw new ServiceCallException("trinketDao.findAllAndFetchElementsAndAffinitiesWhereTrinketTypeAndNameOrderByName returned NULL");
        }
        List<Amulet> out = DaoToViewInterpreter.convertAmuletDaoList(trinketSet);
        LOGGER.info("Got {} Amulets", out.size());
        return out;
    }

    @Override
    public List<Ring> getAllRingsByQuery(String name, String version) throws ServiceCallException {
        LOGGER.info("Getting all Rings by query. Name {} Version {}", name, version);
        Set<TrinketModel> trinketSet = trinketDao.findAllAndFetchElementsAndAffinitiesWhereTrinketTypeAndNameOrderByName(ItemTypeModel.RING, "%" + name + "%", version);
        if (trinketSet == null || trinketSet.isEmpty()) {
            throw new ServiceCallException("trinketDao.findAllAndFetchElementsAndAffinitiesWhereTrinketTypeAndNameOrderByName returned NULL");
        }
        List<Ring> out = DaoToViewInterpreter.convertRingDaoList(trinketSet);
        LOGGER.info("Got {} Rings", out.size());
        return out;
    }

    @Override
    public List<Charm> getAllCharmsByQuery(String name, String version) throws ServiceCallException {
        LOGGER.info("Getting all Charms by query. Name {} Version {}", name, version);
        Set<TrinketModel> trinketSet = trinketDao.findAllAndFetchElementsAndAffinitiesWhereTrinketTypeAndNameOrderByName(ItemTypeModel.CHARM, "%" + name + "%", version);
        if (trinketSet == null || trinketSet.isEmpty()) {
            throw new ServiceCallException("trinketDao.findAllAndFetchElementsAndAffinitiesWhereTrinketTypeAndNameOrderByName returned NULL");
        }
        List<Charm> out = DaoToViewInterpreter.convertCharmDaoList(trinketSet);
        LOGGER.info("Got {} Rings", out.size());
        return out;
    }

    @Override
    public TrinketModel getTrinketById(Long id) throws ServiceCallException {
        LOGGER.info("Getting Trinket id: {}", id);
        TrinketModel trinket = trinketDao.findByIdAndFetchAffinities(id);
        if (trinket == null) {
            throw new ServiceCallException("trinketDao.findByIdAndFetchAffinities(id) returned NULL");
        }
        return trinket;
    }

    @Override
    public Ring getRingById(Long id) throws ServiceCallException {
        LOGGER.info("Getting Ring id: {}", id);
        TrinketModel trinket = trinketDao.findByIdAndFetchElementsAndAffinitiesWhereTrinketType(id, ItemTypeModel.RING);
        if(trinket == null){
            throw new ServiceCallException("trinketDao.findByIdAndFetchElementsAndAffinitiesWhereTrinketType returned NULL");
        }
        Ring out = DaoToViewInterpreter.convertRingDao(trinket);
        return out;
    }

    @Override
    public Charm getCharmById(Long id) throws ServiceCallException {
        LOGGER.info("Getting Charm id: {}", id);
        TrinketModel trinket = trinketDao.findByIdAndFetchElementsAndAffinitiesWhereTrinketType(id, ItemTypeModel.CHARM);
        if(trinket == null){
            throw new ServiceCallException("trinketDao.findByIdAndFetchElementsAndAffinitiesWhereTrinketType returned NULL");
        }
        Charm out = DaoToViewInterpreter.convertCharmDao(trinket);
        return out;
    }

    @Override
    public Amulet getAmuletById(Long id) throws ServiceCallException {
        LOGGER.info("Getting Charm id: {}", id);
        TrinketModel trinket = trinketDao.findByIdAndFetchElementsAndAffinitiesWhereTrinketType(id, ItemTypeModel.AMULET);
        if (trinket == null) {
            throw new ServiceCallException("trinketDao.findByIdAndFetchElementsAndAffinitiesWhereTrinketType returned NULL");
        }
        Amulet out = DaoToViewInterpreter.convertAmuletDao(trinket);
        return out;
    }

    @Override
    public Amulet getAmuletNoFetch(Long trinketId) throws ServiceCallException {
        LOGGER.info("Getting Amulet for id {}", trinketId);
        Optional<TrinketModel> trinket = trinketDao.findByIdAndItemType(trinketId, ItemTypeModel.AMULET);
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
        Optional<TrinketModel> trinket = trinketDao.findByIdAndItemType(trinketId, ItemTypeModel.RING);
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
        Optional<TrinketModel> trinket = trinketDao.findByIdAndItemType(trinketId, ItemTypeModel.CHARM);
        if (trinket.isPresent()) {
            org.imrofli.godfall.api.model.Charm out = DaoToViewInterpreter.convertCharmDao(trinket.get());
            return out;
        } else {
            throw new ServiceCallException("trinketDao.findByIdAndItemType returned NULL");
        }
    }
}
