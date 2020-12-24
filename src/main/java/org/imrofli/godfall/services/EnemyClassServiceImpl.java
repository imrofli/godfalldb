package org.imrofli.godfall.services;

import org.imrofli.godfall.api.model.EnemyClass;
import org.imrofli.godfall.dao.intf.EnemyClassDao;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.helpers.DaoToViewInterpreter;
import org.imrofli.godfall.services.intf.EnemyClassService;
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
public class EnemyClassServiceImpl implements EnemyClassService {
    private static final Logger LOGGER = LoggerFactory.getLogger(EnemyClassServiceImpl.class);
    @Autowired
    private EnemyClassDao enemyClassDao;

    @Override
    public EnemyClass getEnemyClassById(Long id) throws ServiceCallException {
        LOGGER.info("Getting Enemy Class id: {}", id);
        Optional<org.imrofli.godfall.dao.model.EnemyClass> enemyClass = enemyClassDao.findById(id);
        if (!enemyClass.isPresent()) {
            throw new ServiceCallException("enemyClassDao.findById returned NULL");
        }
        EnemyClass out = DaoToViewInterpreter.convertEnemyClassDao(enemyClass.get());
        return out;
    }

    @Override
    public List<EnemyClass> getAllEnemyClasses() throws ServiceCallException {
        LOGGER.info("Getting all Enemy Classes");
        Set<org.imrofli.godfall.dao.model.EnemyClass> enemyClassSet = enemyClassDao.getAllEnemyClasses();
        if (enemyClassSet == null || enemyClassSet.isEmpty()) {
            throw new ServiceCallException("enemyTierDao.getAllEnemyTiers returned NULL");
        }
        List<EnemyClass> out = DaoToViewInterpreter.convertEnemyClassSetDao(enemyClassSet);
        LOGGER.info("Got {} Enemy Classes", out.size());
        return out;
    }
}
