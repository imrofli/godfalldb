package org.imrofli.godfall.services.intf;

import org.imrofli.godfall.dao.model.Weapon;

import java.util.List;
import java.util.Set;

public interface WeaponService {

    Set<Weapon> getWeapons();
    Weapon getWeapon(Long weaponId);

}
