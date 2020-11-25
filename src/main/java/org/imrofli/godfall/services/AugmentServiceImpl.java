package org.imrofli.godfall.services;

import org.imrofli.godfall.dao.intf.AugmentDao;
import org.imrofli.godfall.dao.model.Augment;
import org.imrofli.godfall.services.intf.AugmentService;
import org.imrofli.godfall.services.intf.LootInfoService;
import org.imrofli.godfall.services.intf.TraitService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Set;

@Service
public class AugmentServiceImpl implements AugmentService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AugmentServiceImpl.class);
    @Autowired
    private TraitService traitService;
    @Autowired
    private LootInfoService lootInfoService;

    @Autowired
    private AugmentDao augmentDao;

    @Override
    public Set<Augment> getAugments() {
        LOGGER.info("Getting all Augments");
        return augmentDao.findAllAndFetchElementsAndAffinities();
    }

    @Override
    public Augment getAugmentById(Long id) {
        LOGGER.info("Getting augment id: {}", id);
        return augmentDao.findByIdAndFetchTraits(id);
    }
}
