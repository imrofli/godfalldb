package org.imrofli.godfall.view;

import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.details.Details;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import org.imrofli.godfall.dao.model.LootInfo;
import org.imrofli.godfall.dao.model.Trait;
import org.imrofli.godfall.dao.model.TraitType;
import org.imrofli.godfall.dao.model.Weapon;
import org.imrofli.godfall.services.intf.ItemScalingService;
import org.imrofli.godfall.services.intf.LootInfoService;
import org.imrofli.godfall.services.intf.TraitService;
import org.imrofli.godfall.services.intf.WeaponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class WeaponDetailView extends VerticalLayout {
    private ComboBox<Integer> tierComboBox = new ComboBox<>();
    private Label weaponName = new Label();
    private Label weaponRarity = new Label();
    private Label weaponDps = new Label();
    private Label weaponDamageType = new Label();
    private Details lootInfoDetails = new Details();
    private Select<String> weaponPrimaryOne = new Select<>();
    private Select<String> weaponPrimaryTwo = new Select<>();
    private ComboBox<String> weaponSecondaryOne = new ComboBox<>();
    private ComboBox<String> weaponSecondaryTwo = new ComboBox<>();
    private ComboBox<String> weaponSecondaryThree = new ComboBox<>();
    private ComboBox<String> weaponSecondaryFour = new ComboBox<>();

    private WeaponService weaponService;
    private LootInfoService lootInfoService;
    private ItemScalingService itemScalingService;

    private Weapon weapon;

    public WeaponDetailView(WeaponService weaponService, LootInfoService lootInfoService, ItemScalingService itemScalingService) {
        this.weaponService=weaponService;
        this.lootInfoService=lootInfoService;
        this.itemScalingService=itemScalingService;
        this.add(tierComboBox);
        this.add(weaponName);
        this.add(weaponRarity, weaponDps, weaponDamageType, lootInfoDetails, weaponPrimaryOne, weaponPrimaryTwo, weaponSecondaryOne, weaponSecondaryTwo, weaponSecondaryThree, weaponSecondaryFour);
        List<Integer> tiers = new ArrayList<>();
        for (int i = 1; i <=100 ; i++) {
            tiers.add(i);
        }

        tierComboBox.setItems(tiers);
        tierComboBox.setLabel("Level");
        tierComboBox.addValueChangeListener(this::handleTierSelect);
        lootInfoDetails.setSummaryText("Drop Info");
        weaponPrimaryOne.setLabel("Primary");
        weaponPrimaryTwo.setLabel("2. Primary");
        weaponSecondaryOne.setLabel("Secondary 1");
        weaponSecondaryTwo.setLabel("Secondary 2");
        weaponSecondaryThree.setLabel("Secondary 3");
        weaponSecondaryFour.setLabel("Secondary 4");

    }

    private void handleTierSelect(AbstractField.ComponentValueChangeEvent<ComboBox<Integer>, Integer> comboBoxIntegerComponentValueChangeEvent) {
        if(comboBoxIntegerComponentValueChangeEvent.getValue()!= null){
            updateData(Long.valueOf(comboBoxIntegerComponentValueChangeEvent.getValue()));
        }
    }

    public void setWeapon(Long weaponId) {
        this.weapon = weaponService.getWeapon(weaponId);
        Optional<Integer> tiervalue = tierComboBox.getOptionalValue();
        if(tiervalue.isPresent()){
            updateData(Long.valueOf(tiervalue.get()));
        }
        else {
            updateData(1L);
        }
    }

    private void updateData(Long itemTier){
        weaponName.setText(weapon.getName());
        weaponDps.setText("Todo:DPS");
        weaponRarity.setText(weapon.getMinimumRarity().toString());
        weaponDamageType.setText(weapon.getElements().toString());
        LootInfo lootInfo = lootInfoService.getLootInfo(weapon.getLootInfo().getId());
        lootInfoDetails.setContent(new LootInfoView(lootInfo));
        List<String> primaries = new ArrayList<>();
        List<String> secondaries = new ArrayList<>();
        for(Trait t : weapon.getTraits()){
            String calcDesc = itemScalingService.getScaledDescription(t, weapon.getMinimumRarity(), itemTier);
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
        weaponPrimaryOne.setItems(primaries);
        weaponPrimaryOne.setWidthFull();
        if(primaries!=null && !primaries.isEmpty()) {
            weaponPrimaryOne.setValue(primaries.get(0));
        }
        weaponPrimaryTwo.setItems(primaries);
        weaponPrimaryTwo.setWidthFull();
        weaponSecondaryOne.setItems(secondaries);
        weaponSecondaryOne.setWidthFull();
        weaponSecondaryTwo.setItems(secondaries);
        weaponSecondaryTwo.setWidthFull();
        weaponSecondaryThree.setItems(secondaries);
        weaponSecondaryThree.setWidthFull();
        weaponSecondaryFour.setItems(secondaries);
        weaponSecondaryFour.setWidthFull();
        if(primaries.size()<=1){
            weaponPrimaryOne.setEnabled(false);
            weaponPrimaryTwo.setVisible(false);
        }
        else{
            weaponPrimaryOne.setEnabled(true);
            weaponPrimaryTwo.setVisible(true);
        }

    }
}
