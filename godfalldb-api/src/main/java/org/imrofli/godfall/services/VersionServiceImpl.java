package org.imrofli.godfall.services;

import org.imrofli.godfall.api.model.Version;
import org.imrofli.godfall.dao.intf.VersionDao;
import org.imrofli.godfall.dao.model.VersionModel;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.helpers.DaoToViewInterpreter;
import org.imrofli.godfall.services.intf.VersionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class VersionServiceImpl implements VersionService {
    private static final Logger LOGGER = LoggerFactory.getLogger(VersionServiceImpl.class);
    @Autowired
    private VersionDao versionDao;

    @Override
    public Set<VersionModel> getAllVersionsModel() throws ServiceCallException {
        LOGGER.info("Getting all Version Models");
        Set<VersionModel> out = versionDao.findAllOrderByTime();
        if (out == null || out.isEmpty()) {
            throw new ServiceCallException("versionDao.findAllOrderByTime() returned NULL");
        }
        LOGGER.info("Got {} VersionModels", out.size());
        return out;
    }

    @Override
    public VersionModel getLatestVersionModel() throws ServiceCallException {
        LOGGER.info("Getting Latest Version Model");
        Set<VersionModel> versionModelSet = getAllVersionsModel();
        VersionModel out = null;
        for (VersionModel entry : versionModelSet) {
            if (out == null) {
                out = entry;
            } else if (entry.getLoadTime().after(out.getLoadTime())) {
                out = entry;
            }
        }
        return out;

    }

    @Override
    public List<Version> getAllVersions() throws ServiceCallException {
        LOGGER.info("Getting all Versions");
        Set<VersionModel> versionModelSet = versionDao.findAllOrderByTime();
        if (versionModelSet == null || versionModelSet.isEmpty()) {
            throw new ServiceCallException("versionDao.findAllOrderByTime() returned NULL");
        }
        List<Version> out = DaoToViewInterpreter.convertVersionModelDaoSet(versionModelSet);
        LOGGER.info("Got {} Versions", out.size());
        return out;
    }

    @Override
    public Version getLatestVersion() throws ServiceCallException {
        LOGGER.info("Getting Latest Version");
        List<Version> versionList = getAllVersions();
        Version out = null;
        for (Version entry : versionList) {
            if (out == null) {
                out = entry;
            } else if (entry.getLoadtime().isAfter(out.getLoadtime())) {
                out = entry;
            }
        }
        LOGGER.info("Got Version : {}", out.getVersion());
        return out;
    }

    @Override
    public Version getVersionByID(Long id) throws ServiceCallException {
        LOGGER.info("Getting Version by ID: {}");
        Optional<VersionModel> versionModel = versionDao.findById(id);
        if (versionModel == null || versionModel.isPresent()) {
            throw new ServiceCallException("versionDao.findById returned NULL");
        }
        Version out = DaoToViewInterpreter.convertVersionModelDao(versionModel.get());
        return out;
    }
}
