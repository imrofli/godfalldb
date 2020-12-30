package org.imrofli.godfall.services.intf;

import org.imrofli.godfall.api.model.Weapon;
import org.imrofli.godfall.exception.ServiceCallException;

import java.util.List;

public interface WeaponService {

    List<Weapon> getAllWeapons(String version) throws ServiceCallException;

    List<Weapon> getAllWeaponsByQuery(String name, String version) throws ServiceCallException;

    Weapon getWeapon(Long weaponId) throws ServiceCallException;

    Weapon getWeaponNoFetch(Long weaponId) throws ServiceCallException;

    List<String> getWeaponTags(Long weaponId) throws ServiceCallException;


}
