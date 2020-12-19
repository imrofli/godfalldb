package org.imrofli.godfall.view;

import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.details.Details;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import org.imrofli.godfall.dao.model.*;
import org.imrofli.godfall.services.intf.*;

import java.util.*;

public class TraitDetailView extends VerticalLayout {
    private Grid<Weapon> weaponGrid = new Grid<>();
    private Grid<Augment> augmentGrid = new Grid<>();
    private Grid<Banner> bannerGrid = new Grid<>();
    private Grid<LifeStone> lifeStoneGrid = new Grid<>();
    private Grid<Trinket> ringGrid = new Grid<>();
    private Grid<Trinket> amuletGrid = new Grid<>();
    private Grid<Trinket> charmGrid = new Grid<>();

    private TraitService traitService;
    private WeaponService weaponService;
    private TrinketService trinketService;
    private AugmentService augmentService;
    private BannerService bannerService;
    private LifeStoneService lifeStoneService;

    private Trait trait;

    public TraitDetailView(TraitService traitService, WeaponService weaponService, TrinketService trinketService, AugmentService augmentService, BannerService bannerService, LifeStoneService lifeStoneService) {
        this.traitService = traitService;
        this.weaponService = weaponService;
        this.trinketService = trinketService;
        this.augmentService = augmentService;
        this.bannerService = bannerService;
        this.lifeStoneService = lifeStoneService;

        this.add(new Label("Weapons"));
        weaponGrid.addColumn(Weapon::getName).setHeader("Name");
        weaponGrid.addColumn(Weapon::getWeaponType).setHeader("Type");
        this.add(weaponGrid);

        this.add(new Label("Augments"));
        augmentGrid.addColumn(Augment::getName).setHeader("Name");
        augmentGrid.addColumn(Augment::getAffinities).setHeader("Type");
        this.add(augmentGrid);

        this.add(new Label("Banners"));
        bannerGrid.addColumn(Banner::getName).setHeader("Name");
        bannerGrid.addColumn(Banner::getAffinities).setHeader("Type");
        this.add(bannerGrid);

        this.add(new Label("LifeStones"));
        lifeStoneGrid.addColumn(LifeStone::getName).setHeader("Name");
        lifeStoneGrid.addColumn(LifeStone::getAffinities).setHeader("Type");
        this.add(lifeStoneGrid);

        this.add(new Label("Rings"));
        ringGrid.addColumn(Trinket::getName).setHeader("Name");
        ringGrid.addColumn(Trinket::getAffinities).setHeader("Type");
        this.add(ringGrid);

        this.add(new Label("Amulets"));
        amuletGrid.addColumn(Trinket::getName).setHeader("Name");
        amuletGrid.addColumn(Trinket::getAffinities).setHeader("Type");
        this.add(amuletGrid);

        this.add(new Label("Charms"));
        charmGrid.addColumn(Trinket::getName).setHeader("Name");
        charmGrid.addColumn(Trinket::getAffinities).setHeader("Type");
        this.add(charmGrid);

    }

    public void setTrait(Trait trait) {
        this.trait=trait;
        //this.trait = traitService.getTraitAndFetch(traitid);
        updateData(1L);

    }

    private void updateData(Long itemTier){
        Set<Weapon> weaponSet = new HashSet<>();
        Set<Augment> augmentSet = new HashSet<>();
        Set<Banner> bannerSet = new HashSet<>();
        Set<LifeStone> lifeStoneSet = new HashSet<>();
        weaponGrid.setMinHeight("5%");
        augmentGrid.setMinHeight("5%");
        bannerGrid.setMinHeight("5%");
        lifeStoneGrid.setMinHeight("5%");
        ringGrid.setMinHeight("5%");
        amuletGrid.setMinHeight("5%");
        charmGrid.setMinHeight("5%");


        for(Weapon w : trait.getWeapons()){
            weaponSet.add(weaponService.getWeaponByIdLoadAffinity(w.getId()));
        }
        if(weaponSet.size()>0){
            weaponGrid.setMinHeight("20%");
        }
        for(Augment a: trait.getAugments()){
            augmentSet.add(augmentService.getAugmentByIdLoadAffinity(a.getId()));
        }
        if(augmentSet.size()>0){
            augmentGrid.setMinHeight("20%");
        }
        for(Banner b : trait.getBanners()){
            bannerSet.add(bannerService.getBannerByIdLoadAffinity(b.getId()));
        }
        if(bannerSet.size()>0){
            bannerGrid.setMinHeight("20%");
        }
        for(LifeStone l : trait.getLifeStones()){
            lifeStoneSet.add(lifeStoneService.getLifeStoneByIdLoadAffinity(l.getId()));
        }
        if(lifeStoneSet.size()>0){
            lifeStoneGrid.setMinHeight("20%");
        }
        weaponGrid.setItems(weaponSet);
        augmentGrid.setItems(augmentSet);
        bannerGrid.setItems(bannerSet);
        lifeStoneGrid.setItems(lifeStoneSet);
        Set<Trinket> rings = new HashSet<>();
        Set<Trinket> amulets = new HashSet<>();
        Set<Trinket> charms = new HashSet<>();
        for(Trinket t : trait.getTrinkets()){
            Trinket loadT = trinketService.getTrinketByIdLoadAffinity(t.getId());
            if(loadT.getItemType()==ItemType.RING){
                rings.add(loadT);
            }
            else if(loadT.getItemType()==ItemType.AMULET){
                amulets.add(loadT);
            }
            else if(loadT.getItemType()==ItemType.CHARM){
                charms.add(loadT);
            }
        }
        if(rings.size()>0){
            ringGrid.setMinHeight("20%");
        }
        if(amulets.size()>0){
            amuletGrid.setMinHeight("20%");
        }
        if(charms.size()>0){
            charmGrid.setMinHeight("20%");
        }
        ringGrid.setItems(rings);
        amuletGrid.setItems(amulets);
        charmGrid.setItems(charms);

    }
}
