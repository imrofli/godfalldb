package org.imrofli.godfall.view;

import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.details.Details;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import org.imrofli.godfall.dao.model.Augment;
import org.imrofli.godfall.dao.model.LootInfo;
import org.imrofli.godfall.dao.model.Trait;
import org.imrofli.godfall.dao.model.TraitType;
import org.imrofli.godfall.services.intf.AugmentService;
import org.imrofli.godfall.services.intf.ItemScalingService;
import org.imrofli.godfall.services.intf.LootInfoService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

public class AugmentDetailView extends VerticalLayout {
    private ComboBox<Integer> tierComboBox = new ComboBox<>();
    private Label augmentName = new Label();
    private Label augmentRarity = new Label();
    private Label augmentDamageType = new Label();
    private Details lootInfoDetails = new Details();
    private Select<String> augmentPrimaryOne = new Select<>();
    private Select<String> augmentPrimaryTwo = new Select<>();
    private ComboBox<String> augmentSecondaryOne = new ComboBox<>();
    private ComboBox<String> augmentSecondaryTwo = new ComboBox<>();
    private ComboBox<String> augmentSecondaryThree = new ComboBox<>();
    private ComboBox<String> augmentSecondaryFour = new ComboBox<>();

    private AugmentService augmentService;
    private LootInfoService lootInfoService;
    private ItemScalingService itemScalingService;

    private Augment augment;

    public AugmentDetailView(AugmentService augmentService, LootInfoService lootInfoService, ItemScalingService itemScalingService) {
        this.augmentService=augmentService;
        this.lootInfoService=lootInfoService;
        this.itemScalingService=itemScalingService;
        this.add(tierComboBox);
        this.add(augmentName);
        this.add(augmentRarity, augmentDamageType, lootInfoDetails, augmentPrimaryOne, augmentPrimaryTwo, augmentSecondaryOne, augmentSecondaryTwo, augmentSecondaryThree, augmentSecondaryFour);
        List<Integer> tiers = new ArrayList<>();
        for (int i = 1; i <=100 ; i++) {
            tiers.add(i);
        }

        tierComboBox.setItems(tiers);
        tierComboBox.setLabel("Level");
        tierComboBox.addValueChangeListener(this::handleTierSelect);
        lootInfoDetails.setSummaryText("Drop Info");
        augmentPrimaryOne.setLabel("Primary");
        augmentPrimaryTwo.setLabel("2. Primary");
        augmentSecondaryOne.setLabel("Secondary 1");
        augmentSecondaryTwo.setLabel("Secondary 2");
        augmentSecondaryThree.setLabel("Secondary 3");
        augmentSecondaryFour.setLabel("Secondary 4");

    }

    private void handleTierSelect(AbstractField.ComponentValueChangeEvent<ComboBox<Integer>, Integer> comboBoxIntegerComponentValueChangeEvent) {
        if(comboBoxIntegerComponentValueChangeEvent.getValue()!= null){
            updateData(Long.valueOf(comboBoxIntegerComponentValueChangeEvent.getValue()));
        }
    }

    public void setaugment(Long augmentId) {
        this.augment = augmentService.getAugmentById(augmentId);
        Optional<Integer> tiervalue = tierComboBox.getOptionalValue();
        if(tiervalue.isPresent()){
            updateData(Long.valueOf(tiervalue.get()));
        }
        else {
            updateData(1L);
        }
    }

    private void updateData(Long itemTier){
        augmentName.setText(augment.getName());
        augmentRarity.setText(augment.getMinimumRarity().toString());
        augmentDamageType.setText(augment.getElements().toString());
        LootInfo lootInfo = null;
        if(augment.getLootInfo() != null){
        lootInfo = lootInfoService.getLootInfo(augment.getLootInfo().getId());
        }
        lootInfoDetails.setContent(new LootInfoView(lootInfo));
        List<String> primaries = new ArrayList<>();
        List<String> secondaries = new ArrayList<>();
        for(Trait t : augment.getTraits()){
            String calcDesc = itemScalingService.getScaledDescription(t, augment.getMinimumRarity(), itemTier);
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
        augmentPrimaryOne.setItems(primaries);
        augmentPrimaryOne.setWidthFull();
        if(primaries!=null && !primaries.isEmpty()) {
            augmentPrimaryOne.setValue(primaries.get(0));
        }
        augmentPrimaryTwo.setItems(primaries);
        augmentPrimaryTwo.setWidthFull();
        augmentSecondaryOne.setItems(secondaries);
        augmentSecondaryOne.setWidthFull();
        augmentSecondaryTwo.setItems(secondaries);
        augmentSecondaryTwo.setWidthFull();
        augmentSecondaryThree.setItems(secondaries);
        augmentSecondaryThree.setWidthFull();
        augmentSecondaryFour.setItems(secondaries);
        augmentSecondaryFour.setWidthFull();
        if(primaries.size()<=1){
            augmentPrimaryOne.setEnabled(false);
            augmentPrimaryTwo.setVisible(false);
        }
        else{
            augmentPrimaryOne.setEnabled(true);
            augmentPrimaryTwo.setVisible(true);
        }

    }
}
