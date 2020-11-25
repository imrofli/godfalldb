package org.imrofli.godfall.view;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import org.imrofli.godfall.dao.model.LootInfo;

import java.awt.*;

public class LootInfoView extends VerticalLayout {

    private LootInfo lootInfo;

    public LootInfoView(LootInfo lootInfo) {
        this.lootInfo = lootInfo;
        if(lootInfo.getPreorderDrop()){
            Button preorder = new Button("Preorder/Deluxe");
            preorder.setIcon(VaadinIcon.DOLLAR.create());
            this.addAndExpand(preorder);
        }
        if(lootInfo.getTowerDrop()){
            Button preorder = new Button("Tower");
            preorder.setIcon(VaadinIcon.BUILDING.create());
            this.addAndExpand(preorder);
        }
        for (String s : lootInfo.getDropTags()) {
            Button entry = new Button(s);
            this.addAndExpand(entry);
            this.setSpacing(false);
        }
    }
}
