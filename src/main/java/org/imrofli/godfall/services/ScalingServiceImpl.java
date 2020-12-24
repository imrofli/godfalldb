package org.imrofli.godfall.services;

import org.imrofli.godfall.api.model.Rarity;
import org.imrofli.godfall.api.model.Scaling;
import org.imrofli.godfall.dao.intf.ScalingDao;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.helpers.DaoToViewInterpreter;
import org.imrofli.godfall.services.intf.ScalingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@Transactional
public class ScalingServiceImpl implements ScalingService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ScalingServiceImpl.class);
    @Autowired
    private ScalingDao scalingDao;


    @Override
    public List<Scaling> getScalingByRarityAndLevel(Rarity rarity, Long tier) throws ServiceCallException {
        LOGGER.info("Getting Scaling by Rartiy: {} and Level: {}", rarity, tier);
        Set<org.imrofli.godfall.dao.model.Scaling> scaling;
        if (rarity == null && tier != null) {
            scaling = scalingDao.getAllByTierIdentifier(tier);
        } else if (rarity != null && tier == null) {
            scaling = scalingDao.getAllByRarity(DaoToViewInterpreter.convertRarityBack(rarity));
            if (scaling == null) {
                throw new ServiceCallException("scalingDao.getAllByRarity returned NULL");
            }
        } else if (rarity != null && tier != null) {
            scaling = scalingDao.getByTierIdentifierAndRarity(tier, DaoToViewInterpreter.convertRarityBack(rarity));
            if (scaling == null) {
                throw new ServiceCallException("scalingDao.getByTierIdentifierAndRarity returned NULL");
            }
        } else {
            scaling = scalingDao.getAllScalings();
            if (scaling == null) {
                throw new ServiceCallException("scalingDao.getAllScalings() returned NULL");
            }
        }
        List<Scaling> out = DaoToViewInterpreter.convertScalingsDao(scaling);
        LOGGER.info("Got {} Scalings", out.size());
        return out;
    }

    @Override
    public Scaling getScalingById(Long id) throws ServiceCallException {
        LOGGER.info("Getting Scaling id: {}", id);
        Optional<org.imrofli.godfall.dao.model.Scaling> scaling = scalingDao.findById(id);
        if (!scaling.isPresent()) {
            throw new ServiceCallException("scalingDao.findById returned NULL");
        }
        org.imrofli.godfall.api.model.Scaling out = DaoToViewInterpreter.convertScaling(scaling.get());
        return out;
    }

    @Override
    public List<Scaling> getAllScalings() throws ServiceCallException {
        LOGGER.info("Getting all Scalings");
        Set<org.imrofli.godfall.dao.model.Scaling> scalingSet = scalingDao.getAllScalings();
        if (scalingSet == null || scalingSet.isEmpty()) {
            throw new ServiceCallException("scalingDao.getAllScalings returned NULL");
        }
        List<org.imrofli.godfall.api.model.Scaling> out = DaoToViewInterpreter.convertScalingsDao(scalingSet);
        LOGGER.info("Got {} Scalings", out.size());
        return out;
    }
}
