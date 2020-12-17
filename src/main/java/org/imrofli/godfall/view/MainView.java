package org.imrofli.godfall.view;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.HighlightConditions;
import com.vaadin.flow.router.RouterLink;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainView extends AppLayout {
    private static final Logger LOGGER = LoggerFactory.getLogger(MainView.class);

    public MainView() {
        createHeader();
        createDrawer();
    }

    private void createHeader() {
        LOGGER.info("Loading Main Page");
        H1 logo = new H1("GodfallDB");
        logo.addClassName("logo");

        HorizontalLayout header = new HorizontalLayout(new DrawerToggle(), logo);

        header.setDefaultVerticalComponentAlignment(
                FlexComponent.Alignment.CENTER);


        header.setWidth("100%");
        header.addClassName("header");





    }

    private void createDrawer() {
        RouterLink listLink = new RouterLink("Weapons", WeaponView.class);
        RouterLink listLink_2 = new RouterLink("Augments", AugmentView.class);
        RouterLink listLink_3 = new RouterLink("Banners", BannerView.class);
        RouterLink listLink_4 = new RouterLink("Lifestones", LifeStoneView.class);
        RouterLink listLink_5 = new RouterLink("Rings", RingView.class);
        RouterLink listLink_6 = new RouterLink("Amulets", AmuletView.class);
        RouterLink listLink_7 = new RouterLink("Charms", CharmView.class);
        RouterLink listLink_8 = new RouterLink("Traits", TraitView.class);
        RouterLink listLink_9 = new RouterLink("Loot info", LootInfoOverviewView.class);
        RouterLink listLink_10 = new RouterLink("Skills", SkillView.class);


        listLink.setHighlightCondition(HighlightConditions.sameLocation());

        addToDrawer(new VerticalLayout(listLink, listLink_2, listLink_3, listLink_4, listLink_5, listLink_6, listLink_7, listLink_8, listLink_9, listLink_10));



    }

}
