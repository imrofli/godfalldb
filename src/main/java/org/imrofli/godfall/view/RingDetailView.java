package org.imrofli.godfall.view;

import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.details.Details;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import org.imrofli.godfall.dao.model.Trinket;
import org.imrofli.godfall.dao.model.LootInfo;
import org.imrofli.godfall.dao.model.Trait;
import org.imrofli.godfall.dao.model.TraitType;
import org.imrofli.godfall.services.intf.ItemScalingService;
import org.imrofli.godfall.services.intf.TrinketService;
import org.imrofli.godfall.services.intf.LootInfoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RingDetailView extends VerticalLayout {
    private ComboBox<Integer> tierComboBox = new ComboBox<>();
    private Label trinketName = new Label();
    private Label trinketRarity = new Label();
    private Label trinketDamageType = new Label();
    private Details lootInfoDetails = new Details();
    private Select<String> trinketPrimaryOne = new Select<>();
    private Select<String> trinketPrimaryTwo = new Select<>();
    private ComboBox<String> trinketSecondaryOne = new ComboBox<>();
    private ComboBox<String> trinketSecondaryTwo = new ComboBox<>();
    private ComboBox<String> trinketSecondaryThree = new ComboBox<>();
    private ComboBox<String> trinketSecondaryFour = new ComboBox<>();

    private TrinketService trinketService;
    private LootInfoService lootInfoService;
    private ItemScalingService itemScalingService;

    private Trinket trinket;

    public RingDetailView(TrinketService trinketService, LootInfoService lootInfoService, ItemScalingService itemScalingService) {
        this.trinketService=trinketService;
        this.lootInfoService=lootInfoService;
        this.itemScalingService=itemScalingService;
        this.add(tierComboBox);
        this.add(trinketName);
        this.add(trinketRarity, trinketDamageType, lootInfoDetails, trinketPrimaryOne, trinketPrimaryTwo, trinketSecondaryOne, trinketSecondaryTwo, trinketSecondaryThree, trinketSecondaryFour);
        List<Integer> tiers = new ArrayList<>();
        for (int i = 1; i <=100 ; i++) {
            tiers.add(i);
        }

        tierComboBox.setItems(tiers);
        tierComboBox.setLabel("Level");
        tierComboBox.addValueChangeListener(this::handleTierSelect);
        lootInfoDetails.setSummaryText("Drop Info");
        trinketPrimaryOne.setLabel("Primary");
        trinketPrimaryTwo.setLabel("2. Primary");
        trinketSecondaryOne.setLabel("Secondary 1");
        trinketSecondaryTwo.setLabel("Secondary 2");
        trinketSecondaryThree.setLabel("Secondary 3");
        trinketSecondaryFour.setLabel("Secondary 4");

    }

    private void handleTierSelect(AbstractField.ComponentValueChangeEvent<ComboBox<Integer>, Integer> comboBoxIntegerComponentValueChangeEvent) {
        if(comboBoxIntegerComponentValueChangeEvent.getValue()!= null){
            updateData(Long.valueOf(comboBoxIntegerComponentValueChangeEvent.getValue()));
        }
    }

    public void settrinket(Long trinketId) {
        this.trinket = trinketService.getTrinketById(trinketId);
        Optional<Integer> tiervalue = tierComboBox.getOptionalValue();
        if(tiervalue.isPresent()){
            updateData(Long.valueOf(tiervalue.get()));
        }
        else {
            updateData(1L);
        }
    }

    private void updateData(Long itemTier){
        trinketName.setText(trinket.getName());
        trinketRarity.setText(trinket.getMinimumRarity().toString());
        trinketDamageType.setText(trinket.getElements().toString());
        LootInfo lootInfo = lootInfoService.getLootInfo(trinket.getLootInfo().getId());
        lootInfoDetails.setContent(new LootInfoView(lootInfo));
        List<String> primaries = new ArrayList<>();
        List<String> secondaries = new ArrayList<>();
        for(Trait t : trinket.getTraits()){
            String calcDesc = itemScalingService.getScaledDescription(t, trinket.getMinimumRarity(), itemTier);
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
        trinketPrimaryOne.setItems(primaries);
        trinketPrimaryOne.setWidthFull();
        if(primaries!=null && !primaries.isEmpty()) {
            trinketPrimaryOne.setValue(primaries.get(0));
        }
        trinketPrimaryTwo.setItems(primaries);
        trinketPrimaryTwo.setWidthFull();
        trinketSecondaryOne.setItems(secondaries);
        trinketSecondaryOne.setWidthFull();
        trinketSecondaryTwo.setItems(secondaries);
        trinketSecondaryTwo.setWidthFull();
        trinketSecondaryThree.setItems(secondaries);
        trinketSecondaryThree.setWidthFull();
        trinketSecondaryFour.setItems(secondaries);
        trinketSecondaryFour.setWidthFull();
        if(primaries.size()<=1){
            trinketPrimaryOne.setEnabled(false);
            trinketPrimaryTwo.setVisible(false);
        }
        else{
            trinketPrimaryOne.setEnabled(true);
            trinketPrimaryTwo.setVisible(true);
        }

    }
}
