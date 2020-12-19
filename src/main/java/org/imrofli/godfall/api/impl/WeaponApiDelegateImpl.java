package org.imrofli.godfall.api.impl;

import org.imrofli.godfall.api.WeaponApiDelegate;
import org.imrofli.godfall.api.model.ItemElement;
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
            List<ItemElement> elementList = new ArrayList<>();
            for(Element ele : w.getElements()){
                switch (ele){
                    case PHYSICAL:
                        elementList.add(ItemElement.PHYSICAL);
                        break;
                    case AIR:
                        elementList.add(ItemElement.AIR);
                        break;
                    case EARTH:
                        elementList.add(ItemElement.EARTH);
                        break;
                    case VOID:
                        elementList.add(ItemElement.VOID);
                        break;
                    case WATER:
                        elementList.add(ItemElement.WATER);
                        break;
                    case FIRE:
                        elementList.add(ItemElement.FIRE);
                        break;
                    default:
                        elementList.add(ItemElement.PHYSICAL);
                        elementList.add(ItemElement.AIR);
                        elementList.add(ItemElement.EARTH);
                        elementList.add(ItemElement.VOID);
                        elementList.add(ItemElement.WATER);
                        elementList.add(ItemElement.FIRE);
                }
            }
            wOut.setWeaponelements(elementList);
            outWeapons.add(wOut);
        }
        return ResponseEntity.ok(outWeapons);
    }



}
