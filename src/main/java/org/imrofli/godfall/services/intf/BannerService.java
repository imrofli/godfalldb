package org.imrofli.godfall.services.intf;


import org.imrofli.godfall.api.model.Banner;
import org.imrofli.godfall.exception.ServiceCallException;

import java.util.List;

public interface BannerService {

    List<Banner> getAllBanners() throws ServiceCallException;
    Banner getBannerByID(Long bannerId) throws ServiceCallException;

}
