package org.imrofli.godfall.view;

import com.vaadin.flow.component.accordion.Accordion;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.imrofli.godfall.dao.model.BuildWeapon;
import org.imrofli.godfall.dao.model.Weapon;
import org.imrofli.godfall.services.intf.ItemScalingService;
import org.imrofli.godfall.services.intf.LootInfoService;
import org.imrofli.godfall.services.intf.TraitService;
import org.imrofli.godfall.services.intf.WeaponService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Route(value = "build", layout = MainView.class)
public class BuildView extends VerticalLayout {
    private static final Logger LOGGER = LoggerFactory.getLogger(BuildView.class);

    @Autowired
    private WeaponService weaponService;
    @Autowired
    private TraitService traitService;
    @Autowired
    private LootInfoService lootInfoService;
    @Autowired
    private ItemScalingService itemScalingService;


    Accordion accordion = new Accordion();

    SkillView skillView;
    HorizontalLayout weapons = new HorizontalLayout();
    VerticalLayout weaponsSelect = new VerticalLayout();
    WeaponView weaponView;

    BuildWeapon primaryWeapon;


    public BuildView() {
        this.setSizeFull();
    }


    @PostConstruct
    public void init() {
        LOGGER.info("Loading Build Page");
        skillView=new SkillView(traitService);
        skillView.init();
        skillView.setSizeFull();
        weaponView =new WeaponView(weaponService, traitService, lootInfoService, itemScalingService);
        weaponView.init();
        weaponView.setSizeFull();
        weaponsSelect.addAndExpand(weaponView);

        accordion.add("Primary Weapon", weaponViewPrimary);
        accordion.add("Skillpoints", skillView);

        accordion.setSizeFull();

        this.addAndExpand(accordion);
    }

}
