package org.imrofli.godfall.services;

import org.imrofli.godfall.api.model.Banner;
import org.imrofli.godfall.dao.intf.BannerDao;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.helpers.DaoToViewInterpreter;
import org.imrofli.godfall.services.intf.BannerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class BannerServiceImpl implements BannerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(BannerServiceImpl.class);
    @Autowired
    private BannerDao bannerDao;

    @Override
    public List<Banner> getAllBanners() throws ServiceCallException {
        LOGGER.info("Getting all Banners");
        Set<org.imrofli.godfall.dao.model.Banner> bannerSet = bannerDao.findAllAndFetchElementsAndAffinitiesOrderByName();
        if(bannerSet == null || bannerSet.isEmpty()){
            throw new ServiceCallException("bannerDao.findAllAndFetchElementsAndAffinitiesOrderByName returned NULL");
        }
        List<Banner> out = DaoToViewInterpreter.convertBannerDaoList(bannerSet);
        LOGGER.info("Got {} Banners", out.size());
        return out;
    }

    @Override
    public Banner getBannerByID(Long bannerID) throws ServiceCallException {
        LOGGER.info("Getting banner id: {}", bannerID);
        org.imrofli.godfall.dao.model.Banner banner = bannerDao.findByIdAndFetchElementsAndAffinities(bannerID);
        if(banner == null ){
            throw new ServiceCallException("bannerDao.findByIdAndFetchElementsAndAffinities returned NULL");
        }
        Banner out = DaoToViewInterpreter.convertBannerDao(banner);
        return out;
    }


}
