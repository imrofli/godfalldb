package org.imrofli.godfall.view;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.data.selection.SelectionEvent;
import com.vaadin.flow.router.Route;
import org.imrofli.godfall.dao.model.LifeStone;
import org.imrofli.godfall.services.intf.LifeStoneService;
import org.imrofli.godfall.services.intf.ItemScalingService;
import org.imrofli.godfall.services.intf.LootInfoService;
import org.imrofli.godfall.services.intf.TraitService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

@Route(value = "lifestones", layout = MainView.class)
public class LifeStoneView extends HorizontalLayout {
    private static final Logger LOGGER = LoggerFactory.getLogger(LifeStoneView.class);

    @Autowired
    private LifeStoneService lifeStoneService;
    @Autowired
    private TraitService traitService;

    @Autowired
    private LootInfoService lootInfoService;

    @Autowired
    private ItemScalingService itemScalingService;

    private Grid<LifeStone> lifeStoneGrid = new Grid<>();
    private LifeStoneDetailView lifeStoneDetailView;

    public LifeStoneView() {
        LOGGER.info("Loading Lifestone Page");
        lifeStoneGrid.setSelectionMode(Grid.SelectionMode.SINGLE);
        lifeStoneGrid.setVerticalScrollingEnabled(true);
        lifeStoneGrid.addColumn(LifeStone::getName).setResizable(true).setHeader("Name");
        lifeStoneGrid.addColumn(LifeStone::getAffinities).setResizable(true).setHeader("Affinities");
        lifeStoneGrid.addColumn(LifeStone::getMinimumRarity).setResizable(true).setHeader("Rarity");
        lifeStoneGrid.addColumn(LifeStone::getElements).setResizable(true).setHeader("Elements");
        this.addAndExpand(lifeStoneGrid);
        this.setHeightFull();

        lifeStoneGrid.addSelectionListener(this::handleRowSelectLifeStone);
    }

    private void handleRowSelectLifeStone(SelectionEvent<Grid<LifeStone>, LifeStone> gridLifeStoneSelectionEvent) {
        if(gridLifeStoneSelectionEvent!=null){
            if(gridLifeStoneSelectionEvent.getFirstSelectedItem().isPresent()){
                Long itemId = gridLifeStoneSelectionEvent.getFirstSelectedItem().get().getId();
                LOGGER.info("Getting LifeStone: {}", gridLifeStoneSelectionEvent.getFirstSelectedItem().get().getName());
                lifeStoneDetailView.setlifeStone(itemId);
            }
        }
    }


    @PostConstruct
    public void init() {
        lifeStoneGrid.setItems(lifeStoneService.getLifeStones());
        lifeStoneGrid.setSizeFull();
        lifeStoneDetailView = new LifeStoneDetailView(lifeStoneService, lootInfoService, itemScalingService);
        this.addAndExpand(lifeStoneDetailView);
    }
}
