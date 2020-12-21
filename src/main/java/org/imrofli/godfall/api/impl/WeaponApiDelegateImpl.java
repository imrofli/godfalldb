package org.imrofli.godfall.api.impl;

import org.imrofli.godfall.api.WeaponApiDelegate;
import org.imrofli.godfall.api.model.Weapon;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.services.intf.WeaponService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class WeaponApiDelegateImpl implements WeaponApiDelegate {
    private static final Logger LOGGER = LoggerFactory.getLogger(WeaponApiDelegateImpl.class);

    @Autowired
    WeaponService weaponService;

    @Override
    public ResponseEntity<List<Weapon>> getAllWeapons(){
        LOGGER.info("Call to getAllWeapons");
        List<Weapon> outWeapons = null;
        try {
            outWeapons = weaponService.getAllWeapons();
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        if(outWeapons != null && !outWeapons.isEmpty()){
            return ResponseEntity.ok(outWeapons);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Weapon> getWeaponById(Long id){
        LOGGER.info("Call to getWeaponById. ID {}", id);
        Weapon out = null;
        try {
            out = weaponService.getWeapon(id);
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
