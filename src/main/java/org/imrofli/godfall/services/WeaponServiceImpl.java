package org.imrofli.godfall.services;

import org.imrofli.godfall.dao.intf.WeaponDao;

import org.imrofli.godfall.dao.model.Weapon;
import org.imrofli.godfall.services.intf.WeaponService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Set;

@Service
@Transactional
public class WeaponServiceImpl implements WeaponService {
    private static final Logger LOGGER = LoggerFactory.getLogger(WeaponServiceImpl.class);
    @Autowired
    private WeaponDao weaponDao;

    public WeaponServiceImpl() {
    }

    @Override
    public Set<Weapon> getWeapons() {
        LOGGER.info("Getting all Weapons");
        return weaponDao.findAllAndFetchElementsAndAffinities();
    }

    @Override
    public Weapon getWeapon(Long weaponId) {
        LOGGER.info("Getting Weapon id: {}", weaponId);
        Weapon buffer = weaponDao.findByIdAndFetchTraits(weaponId);
        return buffer;
    }

    @Override
    public Weapon getWeaponByIdLoadAffinity(Long id) {
        return weaponDao.findByIdAndFetchAffinities(id);
    }
}
