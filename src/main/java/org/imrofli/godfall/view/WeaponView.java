package org.imrofli.godfall.view;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.data.selection.SelectionEvent;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import org.imrofli.godfall.dao.model.Weapon;
import org.imrofli.godfall.services.intf.ItemScalingService;
import org.imrofli.godfall.services.intf.LootInfoService;
import org.imrofli.godfall.services.intf.TraitService;
import org.imrofli.godfall.services.intf.WeaponService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

@Route(value = "weapons", layout = MainView.class)
@RouteAlias(value = "", layout = MainView.class)
public class WeaponView extends HorizontalLayout {
    private static final Logger LOGGER = LoggerFactory.getLogger(WeaponView.class);

    @Autowired
    private WeaponService weaponService;
    @Autowired
    private TraitService traitService;

    @Autowired
    private LootInfoService lootInfoService;

    @Autowired
    private ItemScalingService itemScalingService;

    private Grid<Weapon> weaponGrid = new Grid<>();
    private WeaponDetailView weaponDetailView;

    public WeaponView() {
        LOGGER.info("Loading Weapon Page");
        weaponGrid.setSelectionMode(Grid.SelectionMode.SINGLE);
        weaponGrid.setVerticalScrollingEnabled(true);
        weaponGrid.addColumn(Weapon::getName).setResizable(true).setHeader("Name");
        weaponGrid.addColumn(Weapon::getWeaponType).setResizable(true).setHeader("Type");
        weaponGrid.addColumn(Weapon::getElements).setResizable(true).setHeader("Elements");
        this.addAndExpand(weaponGrid);
        this.setHeightFull();

        weaponGrid.addSelectionListener(this::handleRowSelectAugment);
    }

    private void handleRowSelectAugment(SelectionEvent<Grid<Weapon>, Weapon> gridWeaponSelectionEvent) {
        if(gridWeaponSelectionEvent!=null){
            if(gridWeaponSelectionEvent.getFirstSelectedItem().isPresent()){
                Long itemId = gridWeaponSelectionEvent.getFirstSelectedItem().get().getId();
                LOGGER.info("Getting Weapon: {}", gridWeaponSelectionEvent.getFirstSelectedItem().get().getName());
                weaponDetailView.setWeapon(itemId);
            }
        }
    }


    @PostConstruct
    public void init() {
        weaponGrid.setItems(weaponService.getWeapons());
        weaponGrid.setSizeFull();
        weaponDetailView = new WeaponDetailView(weaponService, lootInfoService, itemScalingService);
        this.addAndExpand(weaponDetailView);
    }
}
