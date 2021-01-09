package org.imrofli.godfall.services;

import org.imrofli.godfall.api.model.Trait;
import org.imrofli.godfall.dao.intf.TraitDao;
import org.imrofli.godfall.dao.model.TraitModel;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.helpers.DaoToViewInterpreter;
import org.imrofli.godfall.services.intf.CalculationService;
import org.imrofli.godfall.services.intf.TraitService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class TraitServiceImpl implements TraitService {
    private static final Logger LOGGER = LoggerFactory.getLogger(TraitServiceImpl.class);
    @Autowired
    private TraitDao traitDao;
    @Autowired
    private CalculationService calculationService;

    public TraitServiceImpl() {
    }


    @Override
    public List<Trait> getAllTraits(String version) throws ServiceCallException {
        LOGGER.info("Getting all Traits. Version {}", version);
        Set<TraitModel> traitSet = traitDao.findAllAndFetchAll(version);
        if (traitSet == null || traitSet.isEmpty()) {
            throw new ServiceCallException("traitDao.findAllAndFetchAll() returned NULL");
        }
        List<Trait> out = DaoToViewInterpreter.convertTraitSetDao(traitSet);
        LOGGER.info("Got {} Traits", out.size());
        return out;
    }

    @Override
    public Trait getTraitById(Long traitId) throws ServiceCallException {
        LOGGER.info("Getting Trait by id: {}", traitId);
        TraitModel trait = traitDao.findByIdAndFetchAll(traitId);
        if (trait == null) {
            throw new ServiceCallException("traitDao.findByIdAndFetchAll returned NULL");
        }
        Trait out = DaoToViewInterpreter.convertTraitDao(trait);
        return out;
    }

    @Override
    public Trait getTraitByName(String name, String version) throws ServiceCallException {
        LOGGER.info("Getting Trait by name: {} Version {}", name, version);
        TraitModel trait = traitDao.findByNameAndFetchAll(name, version);
        if (trait == null) {
            throw new ServiceCallException("traitDao.findByNameAndFetchAll returned NULL");
        }
        Trait out = DaoToViewInterpreter.convertTraitDao(trait);
        return out;
    }

    @Override
    public List<Trait> getTraitsByAllowedTraitTagsAndBlacklistTags(List<String> allowedTraitTags, List<String> blacklistTags, String version) throws ServiceCallException {
        LOGGER.info("Getting all Traits for Version {} tags: {} and blacklistTags: {}", version, allowedTraitTags, blacklistTags);
        if (allowedTraitTags == null) {
            allowedTraitTags = new ArrayList<>();
        }
        if (blacklistTags == null) {
            blacklistTags = new ArrayList<>();
        }
        Set<TraitModel> traitSet = traitDao.findAllByTraitTagsAndNotBlacklistTagsAndFetchAll(allowedTraitTags, blacklistTags, version);
        if (traitSet == null || traitSet.isEmpty()) {
            throw new ServiceCallException("traitDao.findAllAndFetchAll() returned NULL");
        }
        List<Trait> out = DaoToViewInterpreter.convertTraitSetDao(traitSet);
        LOGGER.info("Got {} Traits", out.size());
        return out;
    }

}
