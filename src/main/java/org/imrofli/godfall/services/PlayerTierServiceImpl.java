package org.imrofli.godfall.services;

import org.imrofli.godfall.api.model.PlayerTier;
import org.imrofli.godfall.dao.intf.PlayerTierDao;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.helpers.DaoToViewInterpreter;
import org.imrofli.godfall.services.intf.PlayerTierService;
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
public class PlayerTierServiceImpl implements PlayerTierService {
    private static final Logger LOGGER = LoggerFactory.getLogger(PlayerTierServiceImpl.class);
    @Autowired
    private PlayerTierDao playerTierDao;

    @Override
    public PlayerTier getPlayerTierById(Long id) throws ServiceCallException {
        LOGGER.info("Getting Player Tier id: {}", id);
        Optional<org.imrofli.godfall.dao.model.PlayerTier> playerTier = playerTierDao.findById(id);
        if (!playerTier.isPresent()) {
            throw new ServiceCallException("playerTierDao.findById returned NULL");
        }
        PlayerTier out = DaoToViewInterpreter.convertPlayerTierDao(playerTier.get());
        return out;
    }

    @Override
    public List<PlayerTier> getAllPlayerTier() throws ServiceCallException {
        LOGGER.info("Getting all Player Tiers");
        Set<org.imrofli.godfall.dao.model.PlayerTier> playerTierSet = playerTierDao.getAllPlayerTiers();
        if (playerTierSet == null || playerTierSet.isEmpty()) {
            throw new ServiceCallException("playerStrengthIndexDao.getAllPlayerStrengthIndex() returned NULL");
        }
        List<PlayerTier> out = DaoToViewInterpreter.convertPlayerTierSetDao(playerTierSet);
        LOGGER.info("Got {} Player Tiers", out.size());
        return out;
    }
}
