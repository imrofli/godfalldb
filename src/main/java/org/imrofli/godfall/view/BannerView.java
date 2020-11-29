package org.imrofli.godfall.view;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.data.selection.SelectionEvent;
import com.vaadin.flow.router.Route;
import org.imrofli.godfall.dao.model.Banner;
import org.imrofli.godfall.services.intf.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

@Route(value = "banners", layout = MainView.class)
public class BannerView extends HorizontalLayout {
    private static final Logger LOGGER = LoggerFactory.getLogger(BannerView.class);

    @Autowired
    private BannerService bannerService;
    @Autowired
    private TraitService traitService;

    @Autowired
    private LootInfoService lootInfoService;

    @Autowired
    private ItemScalingService itemScalingService;

    private Grid<Banner> bannerGrid = new Grid<>();
    private BannerDetailView bannerDetailView;

    public BannerView() {
        LOGGER.info("Loading Banner Page");
        bannerGrid.setSelectionMode(Grid.SelectionMode.SINGLE);
        bannerGrid.setVerticalScrollingEnabled(true);
        bannerGrid.addColumn(Banner::getName).setResizable(true).setHeader("Name");
        bannerGrid.addColumn(Banner::getAffinities).setResizable(true).setHeader("Affinities");
        bannerGrid.addColumn(Banner::getElements).setResizable(true).setHeader("Elements");
        this.addAndExpand(bannerGrid);
        this.setHeightFull();

        bannerGrid.addSelectionListener(this::handleRowSelectBanner);
    }

    private void handleRowSelectBanner(SelectionEvent<Grid<Banner>, Banner> gridBannerSelectionEvent) {
        if(gridBannerSelectionEvent!=null){
            if(gridBannerSelectionEvent.getFirstSelectedItem().isPresent()){
                Long itemId = gridBannerSelectionEvent.getFirstSelectedItem().get().getId();
                LOGGER.info("Getting Banner: {}", gridBannerSelectionEvent.getFirstSelectedItem().get().getName());
                bannerDetailView.setbanner(itemId);
            }
        }
    }


    @PostConstruct
    public void init() {
        bannerGrid.setItems(bannerService.getBanners());
        bannerGrid.setSizeFull();
        bannerDetailView = new BannerDetailView(bannerService, lootInfoService, itemScalingService);
        this.addAndExpand(bannerDetailView);
    }
}
