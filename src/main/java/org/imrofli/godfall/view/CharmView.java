package org.imrofli.godfall.view;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.data.selection.SelectionEvent;
import com.vaadin.flow.router.Route;
import org.imrofli.godfall.dao.model.Trinket;
import org.imrofli.godfall.services.intf.ItemScalingService;
import org.imrofli.godfall.services.intf.LootInfoService;
import org.imrofli.godfall.services.intf.TraitService;
import org.imrofli.godfall.services.intf.TrinketService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

@Route(value = "charms", layout = MainView.class)
public class CharmView extends HorizontalLayout {
    private static final Logger LOGGER = LoggerFactory.getLogger(CharmView.class);

    @Autowired
    private TrinketService trinketService;
    @Autowired
    private TraitService traitService;

    @Autowired
    private LootInfoService lootInfoService;

    @Autowired
    private ItemScalingService itemScalingService;

    private Grid<Trinket> trinketGrid = new Grid<>();
    private RingDetailView trinketDetailView;

    public CharmView() {
        trinketGrid.setSelectionMode(Grid.SelectionMode.SINGLE);
        trinketGrid.setVerticalScrollingEnabled(true);
        trinketGrid.addColumn(Trinket::getName).setResizable(true).setHeader("Name");
        trinketGrid.addColumn(Trinket::getAffinities).setResizable(true).setHeader("Affinities");
        trinketGrid.addColumn(Trinket::getMinimumRarity).setResizable(true).setHeader("Rarity");
        trinketGrid.addColumn(Trinket::getElements).setResizable(true).setHeader("Elements");
        this.addAndExpand(trinketGrid);
        this.setHeightFull();

        trinketGrid.addSelectionListener(this::handleRowSelectTrinket);
    }

    private void handleRowSelectTrinket(SelectionEvent<Grid<Trinket>, Trinket> gridTrinketSelectionEvent) {
        if(gridTrinketSelectionEvent!=null){
            if(gridTrinketSelectionEvent.getFirstSelectedItem().isPresent()){
                Long itemId = gridTrinketSelectionEvent.getFirstSelectedItem().get().getId();
                LOGGER.info("Getting Charm: {}", gridTrinketSelectionEvent.getFirstSelectedItem().get().getName());
                trinketDetailView.settrinket(itemId);
            }
        }
    }


    @PostConstruct
    public void init() {
        trinketGrid.setItems(trinketService.getCharms());
        trinketGrid.setSizeFull();
        trinketDetailView = new RingDetailView(trinketService, lootInfoService, itemScalingService);
        this.addAndExpand(trinketDetailView);
    }
}
