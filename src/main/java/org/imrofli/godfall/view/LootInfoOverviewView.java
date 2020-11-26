package org.imrofli.godfall.view;

import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.imrofli.godfall.dao.model.*;
import org.imrofli.godfall.services.intf.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Route(value = "lootinfo", layout = MainView.class)
public class LootInfoOverviewView extends VerticalLayout {
    private ComboBox<String> lootInfoComboBox = new ComboBox<>();
    private Grid<Weapon> weaponGrid = new Grid<>();
    private Grid<Augment> augmentGrid = new Grid<>();
    private Grid<Banner> bannerGrid = new Grid<>();
    private Grid<LifeStone> lifeStoneGrid = new Grid<>();
    private Grid<Trinket> ringGrid = new Grid<>();
    private Grid<Trinket> amuletGrid = new Grid<>();
    private Grid<Trinket> charmGrid = new Grid<>();

    @Autowired
    private LootInfoService lootInfoService;
    @Autowired
    private TraitService traitService;
    @Autowired
    private WeaponService weaponService;
    @Autowired
    private TrinketService trinketService;
    @Autowired
    private AugmentService augmentService;
    @Autowired
    private BannerService bannerService;
    @Autowired
    private LifeStoneService lifeStoneService;


    public LootInfoOverviewView() {
        this.add(lootInfoComboBox);
        lootInfoComboBox.setLabel("Select Drop Tag");
        lootInfoComboBox.addValueChangeListener(this::valueChangeListener);

        this.add(new Label("Weapons"));
        weaponGrid.addColumn(Weapon::getName).setHeader("Name");
        weaponGrid.addColumn(Weapon::getWeaponType).setHeader("Type");
        this.addAndExpand(weaponGrid);

        this.add(new Label("Augments"));
        augmentGrid.addColumn(Augment::getName).setHeader("Name");
        this.addAndExpand(augmentGrid);

        this.add(new Label("Banners"));
        bannerGrid.addColumn(Banner::getName).setHeader("Name");
        this.addAndExpand(bannerGrid);

        this.add(new Label("LifeStones"));
        lifeStoneGrid.addColumn(LifeStone::getName).setHeader("Name");
        this.addAndExpand(lifeStoneGrid);

        this.add(new Label("Rings"));
        ringGrid.addColumn(Trinket::getName).setHeader("Name");
        this.addAndExpand(ringGrid);

        this.add(new Label("Amulets"));
        amuletGrid.addColumn(Trinket::getName).setHeader("Name");
        this.addAndExpand(amuletGrid);

        this.add(new Label("Charms"));
        charmGrid.addColumn(Trinket::getName).setHeader("Name");
        this.addAndExpand(charmGrid);

        weaponGrid.setMinHeight("5%");
        augmentGrid.setMinHeight("5%");
        bannerGrid.setMinHeight("5%");
        lifeStoneGrid.setMinHeight("5%");
        ringGrid.setMinHeight("5%");
        amuletGrid.setMinHeight("5%");
        charmGrid.setMinHeight("5%");

    }

    private void valueChangeListener(AbstractField.ComponentValueChangeEvent<ComboBox<String>, String> comboBoxStringComponentValueChangeEvent) {
        if(comboBoxStringComponentValueChangeEvent!=null &&comboBoxStringComponentValueChangeEvent.getValue()!=null){
            updateData(comboBoxStringComponentValueChangeEvent.getValue());
        }

    }

    private void updateData(String value) {
        Set<Weapon> weaponSet = new HashSet<>();
        Set<Augment> augmentSet = new HashSet<>();
        Set<Banner> bannerSet = new HashSet<>();
        Set<LifeStone> lifeStoneSet = new HashSet<>();
        Set<Trinket> allTrinkets = new HashSet<>();
        Set<Trinket> rings = new HashSet<>();
        Set<Trinket> amulets = new HashSet<>();
        Set<Trinket> charms = new HashSet<>();
        weaponGrid.setMinHeight("5%");
        augmentGrid.setMinHeight("5%");
        bannerGrid.setMinHeight("5%");
        lifeStoneGrid.setMinHeight("5%");
        ringGrid.setMinHeight("5%");
        amuletGrid.setMinHeight("5%");
        charmGrid.setMinHeight("5%");

        weaponSet=weaponService.getAllByLootInfoDropTag(value);

        if(weaponSet != null && weaponSet.size()>0){
            weaponGrid.setMinHeight("20%");
        }
        if(weaponSet==null){
            weaponSet=new HashSet<>();
        }

            augmentSet=augmentService.getAllByLootInfoDropTag(value);

        if(augmentSet != null && augmentSet.size()>0){
            augmentGrid.setMinHeight("20%");
        }
        if(augmentSet==null){
            augmentSet=new HashSet<>();
        }

            bannerSet=bannerService.getAllByLootInfoDropTag(value);

        if(bannerSet != null &&bannerSet.size()>0){
            bannerGrid.setMinHeight("20%");
        }
        if(bannerSet==null){
            bannerSet=new HashSet<>();
        }
            lifeStoneSet=lifeStoneService.getAllByLootInfoDropTag(value);

        if(lifeStoneSet != null && lifeStoneSet.size()>0){
            lifeStoneGrid.setMinHeight("20%");
        }
        if(lifeStoneSet==null){
            lifeStoneSet=new HashSet<>();
        }
        weaponGrid.setItems(weaponSet);
        augmentGrid.setItems(augmentSet);
        bannerGrid.setItems(bannerSet);
        lifeStoneGrid.setItems(lifeStoneSet);
        allTrinkets=trinketService.getAllByLootInfoDropTag(value);
        if(allTrinkets!=null) {
            for (Trinket t : allTrinkets) {
                Trinket loadT = trinketService.getTrinketById(t.getId());
                if (loadT.getItemType() == ItemType.RING) {
                    rings.add(loadT);
                } else if (loadT.getItemType() == ItemType.AMULET) {
                    amulets.add(loadT);
                } else if (loadT.getItemType() == ItemType.CHARM) {
                    charms.add(loadT);
                }
            }
        }
        ringGrid.setItems(rings);
        if(rings.size()>0){
            ringGrid.setMinHeight("20%");
        }
        amuletGrid.setItems(amulets);
        if(amulets.size()>0){
            amuletGrid.setMinHeight("20%");
        }
        charmGrid.setItems(charms);
        if(charms.size()>0){
            charmGrid.setMinHeight("20%");
        }
    }

    @PostConstruct
    public void init() {
        lootInfoComboBox.setItems(lootInfoService.getAllDropTags());
    }
}
