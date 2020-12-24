package org.imrofli.godfall.services;

import org.imrofli.godfall.api.model.EnemyTier;
import org.imrofli.godfall.dao.intf.EnemyTierDao;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.helpers.DaoToViewInterpreter;
import org.imrofli.godfall.services.intf.EnemyTierService;
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
public class EnemyTierServiceImpl implements EnemyTierService {
    private static final Logger LOGGER = LoggerFactory.getLogger(EnemyTierServiceImpl.class);
    @Autowired
    private EnemyTierDao enemyTierDao;

    @Override
    public EnemyTier getEnemyTierById(Long id) throws ServiceCallException {
        LOGGER.info("Getting Enemy Tier id: {}", id);
        Optional<org.imrofli.godfall.dao.model.EnemyTier> enemyTier = enemyTierDao.findById(id);
        if (!enemyTier.isPresent()) {
            throw new ServiceCallException("enemyTierDao.findById returned NULL");
        }
        EnemyTier out = DaoToViewInterpreter.convertEnemyTierDao(enemyTier.get());
        return out;
    }

    @Override
    public List<EnemyTier> getAllEnemyTiers() throws ServiceCallException {
        LOGGER.info("Getting all Enemy Tiers");
        Set<org.imrofli.godfall.dao.model.EnemyTier> enemyTierSet = enemyTierDao.getAllEnemyTiers();
        if (enemyTierSet == null || enemyTierSet.isEmpty()) {
            throw new ServiceCallException("enemyTierDao.getAllEnemyTiers returned NULL");
        }
        List<EnemyTier> out = DaoToViewInterpreter.convertEnemyTierSetDao(enemyTierSet);
        LOGGER.info("Got {} Enemy Tiers", out.size());
        return out;
    }
}
