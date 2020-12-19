package org.imrofli.godfall.view;

import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.details.Details;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import org.imrofli.godfall.dao.model.LifeStone;
import org.imrofli.godfall.dao.model.LootInfo;
import org.imrofli.godfall.dao.model.Trait;
import org.imrofli.godfall.dao.model.TraitType;
import org.imrofli.godfall.services.intf.LifeStoneService;
import org.imrofli.godfall.services.intf.ItemScalingService;
import org.imrofli.godfall.services.intf.LootInfoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LifeStoneDetailView extends VerticalLayout {
    private ComboBox<Integer> tierComboBox = new ComboBox<>();
    private Label lifeStoneName = new Label();
    private Label lifeStoneRarity = new Label();
    private Label lifeStoneDamageType = new Label();
    private Details lootInfoDetails = new Details();
    private Select<String> lifeStonePrimaryOne = new Select<>();
    private Select<String> lifeStonePrimaryTwo = new Select<>();
    private ComboBox<String> lifeStoneSecondaryOne = new ComboBox<>();
    private ComboBox<String> lifeStoneSecondaryTwo = new ComboBox<>();
    private ComboBox<String> lifeStoneSecondaryThree = new ComboBox<>();
    private ComboBox<String> lifeStoneSecondaryFour = new ComboBox<>();

    private LifeStoneService lifeStoneService;
    private LootInfoService lootInfoService;
    private ItemScalingService itemScalingService;

    private LifeStone lifeStone;

    public LifeStoneDetailView(LifeStoneService lifeStoneService, LootInfoService lootInfoService, ItemScalingService itemScalingService) {
        this.lifeStoneService=lifeStoneService;
        this.lootInfoService=lootInfoService;
        this.itemScalingService=itemScalingService;
        this.add(tierComboBox);
        this.add(lifeStoneName);
        this.add(lifeStoneRarity, lifeStoneDamageType, lootInfoDetails, lifeStonePrimaryOne, lifeStonePrimaryTwo, lifeStoneSecondaryOne, lifeStoneSecondaryTwo, lifeStoneSecondaryThree, lifeStoneSecondaryFour);
        List<Integer> tiers = new ArrayList<>();
        for (int i = 1; i <=100 ; i++) {
            tiers.add(i);
        }

        tierComboBox.setItems(tiers);
        tierComboBox.setLabel("Level");
        tierComboBox.addValueChangeListener(this::handleTierSelect);
        lootInfoDetails.setSummaryText("Drop Info");
        lifeStonePrimaryOne.setLabel("Primary");
        lifeStonePrimaryTwo.setLabel("2. Primary");
        lifeStoneSecondaryOne.setLabel("Secondary 1");
        lifeStoneSecondaryTwo.setLabel("Secondary 2");
        lifeStoneSecondaryThree.setLabel("Secondary 3");
        lifeStoneSecondaryFour.setLabel("Secondary 4");

    }

    private void handleTierSelect(AbstractField.ComponentValueChangeEvent<ComboBox<Integer>, Integer> comboBoxIntegerComponentValueChangeEvent) {
        if(comboBoxIntegerComponentValueChangeEvent.getValue()!= null){
            updateData(Long.valueOf(comboBoxIntegerComponentValueChangeEvent.getValue()));
        }
    }

    public void setlifeStone(Long lifeStoneId) {
        this.lifeStone = lifeStoneService.getLifeStoneById(lifeStoneId);
        Optional<Integer> tiervalue = tierComboBox.getOptionalValue();
        if(tiervalue.isPresent()){
            updateData(Long.valueOf(tiervalue.get()));
        }
        else {
            updateData(1L);
        }
    }

    private void updateData(Long itemTier){
        lifeStoneName.setText(lifeStone.getName());
        lifeStoneRarity.setText(lifeStone.getMinimumRarity().toString());
        lifeStoneDamageType.setText(lifeStone.getElements().toString());
        LootInfo lootInfo = lootInfoService.getLootInfo(lifeStone.getLootInfo().getId());
        lootInfoDetails.setContent(new LootInfoView(lootInfo));
        List<String> primaries = new ArrayList<>();
        List<String> secondaries = new ArrayList<>();
        for(Trait t : lifeStone.getTraits()){
            String calcDesc = itemScalingService.getScaledDescription(t, lifeStone.getMinimumRarity(), itemTier);
            if(t.getTraitType()== TraitType.PRIMARY) {
                primaries.add(calcDesc);
            }
            if(t.getTraitType()== TraitType.SECONDARY || t.getTraitType()== TraitType.MASTERWORK) {
                if(t.getTraitType()==TraitType.MASTERWORK){
                    calcDesc = "Masterwork - " + calcDesc;
                }
                secondaries.add(calcDesc);
            }
        }
        lifeStonePrimaryOne.setItems(primaries);
        lifeStonePrimaryOne.setWidthFull();
        if(primaries!=null && !primaries.isEmpty()) {
            lifeStonePrimaryOne.setValue(primaries.get(0));
        }
        lifeStonePrimaryTwo.setItems(primaries);
        lifeStonePrimaryTwo.setWidthFull();
        lifeStoneSecondaryOne.setItems(secondaries);
        lifeStoneSecondaryOne.setWidthFull();
        lifeStoneSecondaryTwo.setItems(secondaries);
        lifeStoneSecondaryTwo.setWidthFull();
        lifeStoneSecondaryThree.setItems(secondaries);
        lifeStoneSecondaryThree.setWidthFull();
        lifeStoneSecondaryFour.setItems(secondaries);
        lifeStoneSecondaryFour.setWidthFull();
        if(primaries.size()<=1){
            lifeStonePrimaryOne.setEnabled(false);
            lifeStonePrimaryTwo.setVisible(false);
        }
        else{
            lifeStonePrimaryOne.setEnabled(true);
            lifeStonePrimaryTwo.setVisible(true);
        }

    }
}
