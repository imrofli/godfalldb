package org.imrofli.godfall.services;

import org.imrofli.godfall.api.model.Enemy;
import org.imrofli.godfall.dao.intf.EnemyDao;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.helpers.DaoToViewInterpreter;
import org.imrofli.godfall.services.intf.EnemyService;
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
public class EnemyServiceImpl implements EnemyService {
    private static final Logger LOGGER = LoggerFactory.getLogger(EnemyServiceImpl.class);
    @Autowired
    private EnemyDao enemyDao;

    @Override
    public Enemy getEnemyById(Long id) throws ServiceCallException {
        LOGGER.info("Getting Enemy id: {}", id);
        Optional<org.imrofli.godfall.dao.model.Enemy> enemy = enemyDao.findById(id);
        if (!enemy.isPresent()) {
            throw new ServiceCallException("enemyDao.findById returned NULL");
        }
        Enemy out = DaoToViewInterpreter.convertEnemyDao(enemy.get());
        return out;
    }

    @Override
    public List<Enemy> getAllEnemies() throws ServiceCallException {
        LOGGER.info("Getting all Enemies");
        Set<org.imrofli.godfall.dao.model.Enemy> enemySet = enemyDao.getAllEnemies();
        if (enemySet == null || enemySet.isEmpty()) {
            throw new ServiceCallException("enemyDao.getAllEnemies returned NULL");
        }
        List<Enemy> out = DaoToViewInterpreter.convertEnemySetDao(enemySet);
        LOGGER.info("Got {} Enemies", out.size());
        return out;
    }
}
