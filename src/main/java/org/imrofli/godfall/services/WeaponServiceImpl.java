package org.imrofli.godfall.services;

import org.imrofli.godfall.dao.intf.WeaponDao;

import org.imrofli.godfall.dao.model.Weapon;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.helpers.DaoToViewInterpreter;
import org.imrofli.godfall.services.intf.WeaponService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
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
    public List<org.imrofli.godfall.api.model.Weapon> getAllWeapons() throws ServiceCallException {
        LOGGER.info("Getting all Weapons");
        Set<Weapon> weaponSet = weaponDao.findAllAndFetchElementsAndAffinitiesOrderByName();
        if(weaponSet == null || weaponSet.isEmpty()){
            throw new ServiceCallException("weaponDao.findAllAndFetchElementsAndAffinitiesOrderByName returned NULL");
        }
        List<org.imrofli.godfall.api.model.Weapon> out = DaoToViewInterpreter.convertWeaponDaoList(weaponSet);
        LOGGER.info("Got {} Weapons", out.size());
        return out;
    }

    @Override
    public org.imrofli.godfall.api.model.Weapon getWeapon(Long weaponId) throws ServiceCallException {
        LOGGER.info("Getting Weapon id: {}", weaponId);
        Weapon weapon = weaponDao.findByIdAndFetchElementsAndAffinities(weaponId);
        if(weapon == null){
            throw new ServiceCallException("weaponDao.findByIdAndFetchElementsAndAffinities returned NULL");
        }
        org.imrofli.godfall.api.model.Weapon out = DaoToViewInterpreter.convertWeaponDao(weapon);
        return out;
    }

}
