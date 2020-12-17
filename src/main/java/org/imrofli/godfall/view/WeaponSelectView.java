package org.imrofli.godfall.view;

import com.vaadin.flow.component.accordion.Accordion;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.imrofli.godfall.dao.model.BuildWeapon;
import org.imrofli.godfall.services.intf.ItemScalingService;
import org.imrofli.godfall.services.intf.LootInfoService;
import org.imrofli.godfall.services.intf.TraitService;
import org.imrofli.godfall.services.intf.WeaponService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class WeaponSelectView extends VerticalLayout {
    private static final Logger LOGGER = LoggerFactory.getLogger(WeaponSelectView.class);

    @Autowired
    private WeaponService weaponService;
    @Autowired
    private TraitService traitService;
    @Autowired
    private LootInfoService lootInfoService;
    @Autowired
    private ItemScalingService itemScalingService;

    HorizontalLayout buttons = new HorizontalLayout();
    HorizontalLayout weapons = new HorizontalLayout();

    WeaponView weaponViewPrimary;

    BuildWeapon primaryWeapon;
    BuildWeapon SecondaryWeapon;


    public WeaponSelectView() {

        this.setSizeFull();
    }


    @PostConstruct
    public void init() {
        LOGGER.info("Loading Weapon Select Page");
        weaponViewPrimary =new WeaponView(weaponService, traitService, lootInfoService, itemScalingService);
        weaponViewPrimary.init();
        weaponViewPrimary.setSizeFull();

    }

}
