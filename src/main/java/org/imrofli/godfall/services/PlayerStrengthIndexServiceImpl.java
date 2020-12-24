package org.imrofli.godfall.services;

import org.imrofli.godfall.api.model.PlayerStrengthIndex;
import org.imrofli.godfall.dao.intf.PlayerStrengthIndexDao;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.helpers.DaoToViewInterpreter;
import org.imrofli.godfall.services.intf.PlayerStrengthIndexService;
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
public class PlayerStrengthIndexServiceImpl implements PlayerStrengthIndexService {
    private static final Logger LOGGER = LoggerFactory.getLogger(PlayerStrengthIndexServiceImpl.class);
    @Autowired
    private PlayerStrengthIndexDao playerStrengthIndexDao;

    @Override
    public PlayerStrengthIndex getPlayerStrengthIndexById(Long id) throws ServiceCallException {
        LOGGER.info("Getting Player Strength Index id: {}", id);
        Optional<org.imrofli.godfall.dao.model.PlayerStrengthIndex> playerStrengthIndex = playerStrengthIndexDao.findById(id);
        if (!playerStrengthIndex.isPresent()) {
            throw new ServiceCallException("playerStrengthIndexDao.findById returned NULL");
        }
        PlayerStrengthIndex out = DaoToViewInterpreter.convertPlayerStrengthIndexDao(playerStrengthIndex.get());
        return out;
    }

    @Override
    public List<PlayerStrengthIndex> getAllPlayerStrengthIndexes() throws ServiceCallException {
        LOGGER.info("Getting all Player Strength Index");
        Set<org.imrofli.godfall.dao.model.PlayerStrengthIndex> playerStrengthIndexSet = playerStrengthIndexDao.getAllPlayerStrengthIndex();
        if (playerStrengthIndexSet == null || playerStrengthIndexSet.isEmpty()) {
            throw new ServiceCallException("playerStrengthIndexDao.getAllPlayerStrengthIndex() returned NULL");
        }
        List<PlayerStrengthIndex> out = DaoToViewInterpreter.convertPlayerStrengthIndexSetDao(playerStrengthIndexSet);
        LOGGER.info("Got {} Player Strength Index", out.size());
        return out;
    }
}
