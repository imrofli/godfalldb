package org.imrofli.godfall.services;

import org.imrofli.godfall.dao.intf.WeaponDao;
import org.imrofli.godfall.dao.model.WeaponModel;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.helpers.DaoToViewInterpreter;
import org.imrofli.godfall.services.intf.WeaponService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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
    public List<org.imrofli.godfall.api.model.Weapon> getAllWeapons(String version) throws ServiceCallException {
        LOGGER.info("Getting all Weapons. Version {}", version);
        Set<WeaponModel> weaponSet = weaponDao.findAllAndFetchElementsAndAffinitiesOrderByName(version);
        if (weaponSet == null || weaponSet.isEmpty()) {
            throw new ServiceCallException("weaponDao.findAllAndFetchElementsAndAffinitiesOrderByName returned NULL");
        }
        List<org.imrofli.godfall.api.model.Weapon> out = DaoToViewInterpreter.convertWeaponDaoList(weaponSet);
        LOGGER.info("Got {} Weapons", out.size());
        return out;
    }

    @Override
    public List<org.imrofli.godfall.api.model.Weapon> getAllWeaponsByQuery(String name, String version) throws ServiceCallException {
        LOGGER.info("Getting all Weapons by query. Name {} Version {}", name, version);
        Set<WeaponModel> weaponSet = weaponDao.findAllAndFetchElementsAndAffinitiesByNameOrderByName("%" + name + "%", version);
        if (weaponSet == null || weaponSet.isEmpty()) {
            throw new ServiceCallException("weaponDao.findAllAndFetchElementsAndAffinitiesByNameOrderByName returned NULL");
        }
        List<org.imrofli.godfall.api.model.Weapon> out = DaoToViewInterpreter.convertWeaponDaoList(weaponSet);
        LOGGER.info("Got {} Weapons", out.size());
        return out;
    }

    @Override
    public org.imrofli.godfall.api.model.Weapon getWeapon(Long weaponId) throws ServiceCallException {
        LOGGER.info("Getting Weapon id: {}", weaponId);
        WeaponModel weapon = weaponDao.findByIdAndFetchElementsAndAffinities(weaponId);
        if (weapon == null) {
            throw new ServiceCallException("weaponDao.findByIdAndFetchElementsAndAffinities returned NULL");
        }
        org.imrofli.godfall.api.model.Weapon out = DaoToViewInterpreter.convertWeaponDao(weapon);
        return out;
    }

    @Override
    public org.imrofli.godfall.api.model.Weapon getWeaponNoFetch(Long weaponId) throws ServiceCallException {
        LOGGER.info("Getting Weapon for id {}", weaponId);
        Optional<WeaponModel> weapon = weaponDao.findById(weaponId);
        if (weapon.isPresent()) {
            org.imrofli.godfall.api.model.Weapon out = DaoToViewInterpreter.convertWeaponDao(weapon.get());
            return out;
        } else {
            throw new ServiceCallException("weaponDao.findById returned NULL");
        }
    }

    @Override
    public List<String> getWeaponTags(Long weaponId) throws ServiceCallException {
        LOGGER.info("Getting Weapon Tags for id {}", weaponId);
        Optional<WeaponModel> weapon = weaponDao.findById(weaponId);
        if (weapon.isPresent()) {
            Set<String> tagSet = weapon.get().getTags();
            if (tagSet == null || tagSet.isEmpty()) {
                throw new ServiceCallException("weaponDao.findById returned NULL");
            }
            List<String> out = new ArrayList<>();
            out.addAll(tagSet);
            LOGGER.info("Got {} Weapon Tags", out.size());
            return out;
        } else {
            throw new ServiceCallException("weaponDao.findById returned NULL");
        }
    }

}
