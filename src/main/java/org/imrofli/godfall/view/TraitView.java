package org.imrofli.godfall.view;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.data.selection.SelectionEvent;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import org.imrofli.godfall.dao.model.Trait;
import org.imrofli.godfall.services.intf.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

@Route(value = "traits", layout = MainView.class)
public class TraitView extends HorizontalLayout {
    private static final Logger LOGGER = LoggerFactory.getLogger(TraitView.class);

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

    private Grid<Trait> traitGrid = new Grid<>();
    private TraitDetailView traitDetailView;

    public TraitView() {
        traitGrid.setSelectionMode(Grid.SelectionMode.SINGLE);
        traitGrid.setVerticalScrollingEnabled(true);
        traitGrid.addColumn(Trait::getDescription).setResizable(true).setHeader("Description");
        traitGrid.addColumn(Trait::getTraitType).setResizable(true).setHeader("Type");
        traitGrid.addColumn(Trait::getWeight).setResizable(true).setHeader("Weight");
        this.addAndExpand(traitGrid);
        this.setHeightFull();

        traitGrid.addSelectionListener(this::handleRowSelectAugment);
    }

    private void handleRowSelectAugment(SelectionEvent<Grid<Trait>, Trait> gridTraitSelectionEvent) {
        if(gridTraitSelectionEvent!=null){
            if(gridTraitSelectionEvent.getFirstSelectedItem().isPresent()){
                Long itemId = gridTraitSelectionEvent.getFirstSelectedItem().get().getId();
                LOGGER.info("Getting Trait: {}", itemId);
                Trait teest = traitService.getTraitAndFetch(itemId);
                traitDetailView.setTrait(teest);
            }
        }
    }


    @PostConstruct
    public void init() {
        traitGrid.setItems(traitService.getTrait());
        traitGrid.setSizeFull();
        traitDetailView = new TraitDetailView(traitService, weaponService, trinketService,  augmentService,  bannerService, lifeStoneService);
        this.addAndExpand(traitDetailView);
    }
}
