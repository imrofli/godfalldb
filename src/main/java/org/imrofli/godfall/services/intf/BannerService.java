package org.imrofli.godfall.services.intf;

import org.imrofli.godfall.dao.model.Weapon;
import org.imrofli.godfall.dao.model.Banner;

import java.util.List;
import java.util.Set;

public interface BannerService {

    Set<Banner> getBanners();
    Banner getBannerByID(Long banneerId);
    Banner getBannerByIdLoadAffinity(Long id);

}
