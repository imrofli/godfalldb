package org.imrofli.godfall.view;

import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.details.Details;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import org.imrofli.godfall.dao.model.*;
import org.imrofli.godfall.services.intf.AugmentService;
import org.imrofli.godfall.services.intf.BannerService;
import org.imrofli.godfall.services.intf.ItemScalingService;
import org.imrofli.godfall.services.intf.LootInfoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BannerDetailView extends VerticalLayout {
    private ComboBox<Integer> tierComboBox = new ComboBox<>();
    private Label bannerName = new Label();
    private Label bannerRarity = new Label();
    private Label bannerDamageType = new Label();
    private Details lootInfoDetails = new Details();
    private Select<String> bannerPrimaryOne = new Select<>();
    private Select<String> bannerPrimaryTwo = new Select<>();
    private ComboBox<String> bannerSecondaryOne = new ComboBox<>();
    private ComboBox<String> bannerSecondaryTwo = new ComboBox<>();
    private ComboBox<String> bannerSecondaryThree = new ComboBox<>();
    private ComboBox<String> bannerSecondaryFour = new ComboBox<>();

    private BannerService bannerService;
    private LootInfoService lootInfoService;
    private ItemScalingService itemScalingService;

    private Banner banner;

    public BannerDetailView(BannerService bannerService, LootInfoService lootInfoService, ItemScalingService itemScalingService) {
        this.bannerService=bannerService;
        this.lootInfoService=lootInfoService;
        this.itemScalingService=itemScalingService;
        this.add(tierComboBox);
        this.add(bannerName);
        this.add(bannerRarity, bannerDamageType, lootInfoDetails, bannerPrimaryOne, bannerPrimaryTwo, bannerSecondaryOne, bannerSecondaryTwo, bannerSecondaryThree, bannerSecondaryFour);
        List<Integer> tiers = new ArrayList<>();
        for (int i = 1; i <=100 ; i++) {
            tiers.add(i);
        }

        tierComboBox.setItems(tiers);
        tierComboBox.setLabel("Level");
        tierComboBox.addValueChangeListener(this::handleTierSelect);
        lootInfoDetails.setSummaryText("Drop Info");
        bannerPrimaryOne.setLabel("Primary");
        bannerPrimaryTwo.setLabel("2. Primary");
        bannerSecondaryOne.setLabel("Secondary 1");
        bannerSecondaryTwo.setLabel("Secondary 2");
        bannerSecondaryThree.setLabel("Secondary 3");
        bannerSecondaryFour.setLabel("Secondary 4");

    }

    private void handleTierSelect(AbstractField.ComponentValueChangeEvent<ComboBox<Integer>, Integer> comboBoxIntegerComponentValueChangeEvent) {
        if(comboBoxIntegerComponentValueChangeEvent.getValue()!= null){
            updateData(Long.valueOf(comboBoxIntegerComponentValueChangeEvent.getValue()));
        }
    }

    public void setbanner(Long bannerId) {
        this.banner = bannerService.getBannerByID(bannerId);
        Optional<Integer> tiervalue = tierComboBox.getOptionalValue();
        if(tiervalue.isPresent()){
            updateData(Long.valueOf(tiervalue.get()));
        }
        else {
            updateData(1L);
        }
    }

    private void updateData(Long itemTier){
        bannerName.setText(banner.getName());

        bannerDamageType.setText(banner.getElements().toString());
        LootInfo lootInfo = lootInfoService.getLootInfo(banner.getLootInfo().getId());
        lootInfoDetails.setContent(new LootInfoView(lootInfo));
        List<String> primaries = new ArrayList<>();
        List<String> secondaries = new ArrayList<>();
        for(Trait t : banner.getTraits()){
            String calcDesc = itemScalingService.getScaledDescription(t, Rarity.LEGENDARY, itemTier);
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
        bannerPrimaryOne.setItems(primaries);
        bannerPrimaryOne.setWidthFull();
        if(primaries!=null && !primaries.isEmpty()) {
            bannerPrimaryOne.setValue(primaries.get(0));
        }
        bannerPrimaryTwo.setItems(primaries);
        bannerPrimaryTwo.setWidthFull();
        bannerSecondaryOne.setItems(secondaries);
        bannerSecondaryOne.setWidthFull();
        bannerSecondaryTwo.setItems(secondaries);
        bannerSecondaryTwo.setWidthFull();
        bannerSecondaryThree.setItems(secondaries);
        bannerSecondaryThree.setWidthFull();
        bannerSecondaryFour.setItems(secondaries);
        bannerSecondaryFour.setWidthFull();
        if(primaries.size()<=1){
            bannerPrimaryOne.setEnabled(false);
            bannerPrimaryTwo.setVisible(false);
        }
        else{
            bannerPrimaryOne.setEnabled(true);
            bannerPrimaryTwo.setVisible(true);
        }

    }
}
