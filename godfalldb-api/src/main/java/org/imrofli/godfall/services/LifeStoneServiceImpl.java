package org.imrofli.godfall.services;

import org.imrofli.godfall.api.model.LifeStone;
import org.imrofli.godfall.dao.intf.LifeStoneDao;
import org.imrofli.godfall.dao.model.LifeStoneModel;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.helpers.DaoToViewInterpreter;
import org.imrofli.godfall.services.intf.LifeStoneService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class LifeStoneServiceImpl implements LifeStoneService {
    private static final Logger LOGGER = LoggerFactory.getLogger(LifeStoneServiceImpl.class);

    @Autowired
    private LifeStoneDao lifeStoneDao;

    @Override
    public List<LifeStone> getAllLifeStones(String version) throws ServiceCallException {
        LOGGER.info("Getting all LifeStones. Version {}", version);
        Set<LifeStoneModel> lifeStoneSet = lifeStoneDao.findAllAndFetchElementsAndAffinitiesOrderByName(version);
        if (lifeStoneSet == null || lifeStoneSet.isEmpty()) {
            throw new ServiceCallException("lifeStoneDao.findAllAndFetchElementsAndAffinitiesOrderByName returned NULL");
        }
        List<LifeStone> out = DaoToViewInterpreter.convertLifeStoneDaoList(lifeStoneSet);
        LOGGER.info("Got {} LifeStones", out.size());
        return out;
    }

    @Override
    public List<LifeStone> getAllLifeStonesByQuery(String name, String version) throws ServiceCallException {
        LOGGER.info("Getting all LifeStones by query. Name {} Version {}", name, version);
        Set<LifeStoneModel> lifeStoneSet = lifeStoneDao.findAllAndFetchElementsAndAffinitiesByNameOrderByName("%" + name + "%", version);
        if (lifeStoneSet == null || lifeStoneSet.isEmpty()) {
            throw new ServiceCallException("lifeStoneDao.findAllAndFetchElementsAndAffinitiesByNameOrderByName returned NULL");
        }
        List<LifeStone> out = DaoToViewInterpreter.convertLifeStoneDaoList(lifeStoneSet);
        LOGGER.info("Got {} LifeStones", out.size());
        return out;
    }

    @Override
    public LifeStone getLifeStoneById(Long id) throws ServiceCallException {
        LOGGER.info("Getting LifeStone id: {}", id);
        LifeStoneModel lifeStone = lifeStoneDao.findByIdAndFetchElementsAndAffinities(id);
        if (lifeStone == null) {
            throw new ServiceCallException("lifeStoneDao.findByIdAndFetchElementsAndAffinities returned NULL");
        }
        LifeStone out = DaoToViewInterpreter.convertLifeStoneDao(lifeStone);
        return out;
    }

    @Override
    public LifeStone getLifeStoneNoFetch(Long lifeStone) throws ServiceCallException {
        LOGGER.info("Getting LifeStone for id {}", lifeStone);
        Optional<LifeStoneModel> lifeStoneOptional = lifeStoneDao.findById(lifeStone);
        if (lifeStoneOptional.isPresent()) {
            org.imrofli.godfall.api.model.LifeStone out = DaoToViewInterpreter.convertLifeStoneDao(lifeStoneOptional.get());
            return out;
        } else {
            throw new ServiceCallException("lifeStoneDao.findById returned NULL");
        }
    }

}