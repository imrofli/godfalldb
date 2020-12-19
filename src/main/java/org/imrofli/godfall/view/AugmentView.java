package org.imrofli.godfall.view;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.data.selection.SelectionEvent;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import org.imrofli.godfall.dao.model.Augment;
import org.imrofli.godfall.services.intf.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

@Route(value = "augments", layout = MainView.class)
public class AugmentView extends HorizontalLayout {
    private static final Logger LOGGER = LoggerFactory.getLogger(AugmentView.class);

    @Autowired
    private AugmentService augmentService;
    @Autowired
    private TraitService traitService;

    @Autowired
    private LootInfoService lootInfoService;

    @Autowired
    private ItemScalingService itemScalingService;

    private Grid<Augment> augmentGrid = new Grid<>();
    private AugmentDetailView augmentDetailView;

    public AugmentView() {
        LOGGER.info("Loading Augment Page");
        augmentGrid.setSelectionMode(Grid.SelectionMode.SINGLE);
        augmentGrid.setVerticalScrollingEnabled(true);
        augmentGrid.addColumn(Augment::getName).setResizable(true).setHeader("Name");
        augmentGrid.addColumn(Augment::getAffinities).setResizable(true).setHeader("Affinities");
        augmentGrid.addColumn(Augment::getMinimumRarity).setResizable(true).setHeader("Rarity");
        augmentGrid.addColumn(Augment::getElements).setResizable(true).setHeader("Elements");
        this.addAndExpand(augmentGrid);
        this.setHeightFull();

        augmentGrid.addSelectionListener(this::handleRowSelectAugment);
    }

    private void handleRowSelectAugment(SelectionEvent<Grid<Augment>, Augment> gridAugmentSelectionEvent) {
        if(gridAugmentSelectionEvent!=null){
            if(gridAugmentSelectionEvent.getFirstSelectedItem().isPresent()){
                Long itemId = gridAugmentSelectionEvent.getFirstSelectedItem().get().getId();
                LOGGER.info("Getting Augment: {}", gridAugmentSelectionEvent.getFirstSelectedItem().get().getName());
                augmentDetailView.setaugment(itemId);
            }
        }
    }


    @PostConstruct
    public void init() {
        augmentGrid.setItems(augmentService.getAugments());
        augmentGrid.setSizeFull();
        augmentDetailView = new AugmentDetailView(augmentService, lootInfoService, itemScalingService);
        this.addAndExpand(augmentDetailView);
    }
}
