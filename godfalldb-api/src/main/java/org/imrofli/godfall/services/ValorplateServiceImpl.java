package org.imrofli.godfall.services;

import org.imrofli.godfall.api.model.Valorplate;
import org.imrofli.godfall.dao.intf.ValorplateDao;
import org.imrofli.godfall.dao.model.ValorplateModel;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.helpers.DaoToViewInterpreter;
import org.imrofli.godfall.services.intf.ValorplateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class ValorplateServiceImpl implements ValorplateService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ValorplateServiceImpl.class);
    @Autowired
    private ValorplateDao valorplateDao;

    @Override
    public List<Valorplate> getAllValorplates(String version) throws ServiceCallException {
        LOGGER.info("Getting all Valorplates. Version {}", version);
        Set<ValorplateModel> valorplateSet = valorplateDao.findAllAndFetchArchonModeAndAugmentGraphsOrderByName(version);
        if (valorplateSet == null || valorplateSet.isEmpty()) {
            throw new ServiceCallException("valorplateDao.findAllAndFetchArchonModeAndAugmentGraphsOrderByName returned NULL");
        }
        List<Valorplate> out = DaoToViewInterpreter.convertValorplateList(valorplateSet);
        LOGGER.info("Got {} Valorplates", out.size());
        return out;
    }

    @Override
    public List<Valorplate> getAllValorplatesByQuery(String name, String version) throws ServiceCallException {
        LOGGER.info("Getting all Valorplates by query. Name {} Version {}", name, version);
        Set<ValorplateModel> valorplateSet = valorplateDao.findAllAndFetchArchonModeAndAugmentGraphsByNameOrderByName("%" + name + "%", version);
        if (valorplateSet == null || valorplateSet.isEmpty()) {
            throw new ServiceCallException("valorplateDao.findAllAndFetchArchonModeAndAugmentGraphsByNameOrderByName returned NULL");
        }
        List<Valorplate> out = DaoToViewInterpreter.convertValorplateList(valorplateSet);
        LOGGER.info("Got {} Valorplates", out.size());
        return out;
    }

    @Override
    public Valorplate getValorplateByID(Long valorplateId) throws ServiceCallException {
        LOGGER.info("Getting Valorplate id: {}", valorplateId);
        ValorplateModel valorplate = valorplateDao.findByIdAndFetchArchonModeAndAugmentGraphs(valorplateId);
        if (valorplate == null) {
            throw new ServiceCallException("valorplateDao.findByIdAndFetchArchonModeAndAugmentGraphs returned NULL");
        }
        Valorplate out = DaoToViewInterpreter.convertValorplate(valorplate);
        return out;
    }

    @Override
    public Valorplate getValorplateNoFetch(Long valorplateId) throws ServiceCallException {
        LOGGER.info("Getting Valorplate for id {}", valorplateId);
        Optional<ValorplateModel> banner = valorplateDao.findById(valorplateId);
        if (banner.isPresent()) {
            Valorplate out = DaoToViewInterpreter.convertValorplate(banner.get());
            return out;
        } else {
            throw new ServiceCallException("valorplateDao.findById returned NULL");
        }
    }
}
