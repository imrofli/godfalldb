package org.imrofli.godfall.api.impl;

import org.imrofli.godfall.api.BannerApiDelegate;
import org.imrofli.godfall.api.model.Banner;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.services.intf.BannerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerApiDelegateImpl implements BannerApiDelegate {
    private static final Logger LOGGER = LoggerFactory.getLogger(BannerApiDelegateImpl.class);
    @Autowired
    BannerService bannerService;

    @Override
    public ResponseEntity<List<Banner>> getAllBanners(String name) {
        LOGGER.info("Call to getAllBanners. Query: name {}", name);
        List<Banner> outBanner = null;
        try {
            if (name != null && !name.isEmpty()) {
                outBanner = bannerService.getAllBannersByQuery(name);
            } else {
                outBanner = bannerService.getAllBanners();
            }
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        if(outBanner != null && !outBanner.isEmpty()){
            return ResponseEntity.ok(outBanner);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Banner> getBannerById(Long id) {
        LOGGER.info("Call to getBannerById. ID {}", id);
        Banner out = null;
        try {
            out = bannerService.getBannerByID(id);
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        if(out!=null){
            return ResponseEntity.ok(out);
        }
        return ResponseEntity.notFound().build();
    }
}
