package org.imrofli.godfall.api.impl;

import org.imrofli.godfall.api.WeaponApiDelegate;
import org.imrofli.godfall.api.model.WeaponElement;
import org.imrofli.godfall.dao.model.Element;
import org.imrofli.godfall.dao.model.Weapon;
import org.imrofli.godfall.services.intf.WeaponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class WeaponApiDelegateImpl implements WeaponApiDelegate {
    @Autowired
    WeaponService weaponService;

    @Override
    public ResponseEntity<List<org.imrofli.godfall.api.model.Weapon>> getAllWeapons(){
        Set<Weapon> dataWeapons = weaponService.getWeapons();
        List<org.imrofli.godfall.api.model.Weapon> outWeapons = new ArrayList<>();
        for(Weapon w : dataWeapons){
            org.imrofli.godfall.api.model.Weapon wOut = new org.imrofli.godfall.api.model.Weapon();
            wOut.setId(w.getId());
            switch (w.getWeaponType()){
                case POLEARM:
                    wOut.setWeaponclass(org.imrofli.godfall.api.model.Weapon.WeaponclassEnum.POLEARM);
                    break;
                case DUALBLADES:
                    wOut.setWeaponclass(org.imrofli.godfall.api.model.Weapon.WeaponclassEnum.DUALBLADES);
                    break;
                case GREATSWORD:
                    wOut.setWeaponclass(org.imrofli.godfall.api.model.Weapon.WeaponclassEnum.GREATSWORD);
                    break;
                case LONGSWORD:
                    wOut.setWeaponclass(org.imrofli.godfall.api.model.Weapon.WeaponclassEnum.LONGSWORD);
                    break;
                case WARHAMMER:
                    wOut.setWeaponclass(org.imrofli.godfall.api.model.Weapon.WeaponclassEnum.WARHAMMER);
                    break;
                default:
                    wOut.setWeaponclass(org.imrofli.godfall.api.model.Weapon.WeaponclassEnum.LONGSWORD);
            }
            List<WeaponElement> elementList = new ArrayList<>();
            for(Element ele : w.getElements()){
                switch (ele){
                    case PHYSICAL:
                        elementList.add(WeaponElement.PHYSICAL);
                        break;
                    case AIR:
                        elementList.add(WeaponElement.AIR);
                        break;
                    case EARTH:
                        elementList.add(WeaponElement.EARTH);
                        break;
                    case VOID:
                        elementList.add(WeaponElement.VOID);
                        break;
                    case WATER:
                        elementList.add(WeaponElement.WATER);
                        break;
                    case FIRE:
                        elementList.add(WeaponElement.FIRE);
                        break;
                    default:
                        elementList.add(WeaponElement.PHYSICAL);
                        elementList.add(WeaponElement.AIR);
                        elementList.add(WeaponElement.EARTH);
                        elementList.add(WeaponElement.VOID);
                        elementList.add(WeaponElement.WATER);
                        elementList.add(WeaponElement.FIRE);
                }
            }
            wOut.setWeaponelements(elementList);
            outWeapons.add(wOut);
        }
        return ResponseEntity.ok(outWeapons);
    }



}
