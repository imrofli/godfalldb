package org.imrofli.godfall.services;

import org.imrofli.godfall.api.model.Augment;
import org.imrofli.godfall.dao.intf.AugmentDao;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.helpers.DaoToViewInterpreter;
import org.imrofli.godfall.services.intf.AugmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class AugmentServiceImpl implements AugmentService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AugmentServiceImpl.class);

    @Autowired
    private AugmentDao augmentDao;

    @Override
    public List<Augment> getAllAugments() throws ServiceCallException {
        LOGGER.info("Getting all Augments");
        Set<org.imrofli.godfall.dao.model.Augment> augmentSet = augmentDao.findAllAndFetchElementsAndAffinitiesOrderByName();
        if(augmentSet == null || augmentSet.isEmpty()){
            throw new ServiceCallException("augmentDao.findAllAndFetchElementsAndAffinitiesOrderByName returned NULL");
        }
        List<Augment> out = DaoToViewInterpreter.convertAugmentDaoList(augmentSet);
        LOGGER.info("Got {} Augments", out.size());
        return out;
    }

    @Override
    public Augment getAugmentById(Long id) throws ServiceCallException {
        LOGGER.info("Getting augment id: {}", id);
        org.imrofli.godfall.dao.model.Augment augment = augmentDao.findByIdAndFetchElementsAndAffinities(id);
        if(augment == null){
            throw new ServiceCallException("augmentDao.findByIdAndFetchElementsAndAffinities returned NULL");
        }
        return DaoToViewInterpreter.convertAugmentDao(augment);
    }

}
