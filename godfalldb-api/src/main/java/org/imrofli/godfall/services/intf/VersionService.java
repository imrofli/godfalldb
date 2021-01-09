package org.imrofli.godfall.services.intf;

import org.imrofli.godfall.api.model.Version;
import org.imrofli.godfall.dao.model.VersionModel;
import org.imrofli.godfall.exception.ServiceCallException;

import java.util.List;
import java.util.Set;

public interface VersionService {

    Set<VersionModel> getAllVersionsModel() throws ServiceCallException;

    VersionModel getLatestVersionModel() throws ServiceCallException;


    List<Version> getAllVersions() throws ServiceCallException;

    Version getLatestVersion() throws ServiceCallException;

    Version getVersionByID(Long id) throws ServiceCallException;
}
