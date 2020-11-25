package org.imrofli.godfall.services;

import org.imrofli.godfall.dao.intf.BannerDao;
import org.imrofli.godfall.dao.intf.WeaponDao;
import org.imrofli.godfall.dao.model.Banner;
import org.imrofli.godfall.dao.model.Weapon;
import org.imrofli.godfall.data.BannersCollection;
import org.imrofli.godfall.helpers.ItemHelper;
import org.imrofli.godfall.services.intf.BannerService;
import org.imrofli.godfall.dao.intf.DataDao;
import org.imrofli.godfall.services.intf.LootInfoService;
import org.imrofli.godfall.services.intf.TraitService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class BannerServiceImpl implements BannerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(BannerServiceImpl.class);
    @Autowired
    private BannerDao bannerDao;

    public BannerServiceImpl() {
    }

    @Override
    public Set<Banner> getBanners() {
        LOGGER.info("Getting all Banners");
        return bannerDao.findAllAndFetchElementsAndAffinities();
    }

    @Override
    public Banner getBannerByID(Long bannerID) {
        LOGGER.info("Getting banner id: {}", bannerID);
        Banner buffer = bannerDao.findByIdAndFetchTraits(bannerID);
        return buffer;
    }
}
