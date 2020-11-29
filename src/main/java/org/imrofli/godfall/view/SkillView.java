package org.imrofli.godfall.view;

import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.router.Route;
import org.imrofli.godfall.dao.model.Trait;
import org.imrofli.godfall.services.intf.TraitService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Route(value = "skills", layout = MainView.class)
public class SkillView extends VerticalLayout {
    private static final Logger LOGGER = LoggerFactory.getLogger(SkillView.class);

    Grid<SkillItemView> skillItemViewGrid = new Grid<>();
    List<HorizontalLayout> horizontalLayoutList = new ArrayList<>();
    List<SkillItemView> skillItemViews = new ArrayList<>();
    Integer skillPointCount = 0;
    Label skillPoints = new Label();

    @Autowired
    private TraitService traitService;

    public SkillView() {


    }


    @PostConstruct
    public void init() {
        LOGGER.info("Loading Skill Page");
        skillPoints.setText("Skillpoints used: 0");
        this.addAndExpand(skillPoints);
        List<String> exclusionList = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            Set<Trait> traitSetBlk = traitService.getTraitsByGridY(i);
            horizontalLayoutList.add(new HorizontalLayout());
            for (Trait trait : traitSetBlk) {
                if (!exclusionList.contains(trait.getTraitGroupBulk())) {
                    Set<Trait> traitSetGroup = traitService.getTraitsByTraitGrpBulk(trait.getTraitGroupBulk());
                    SkillItemView skillItemView = new SkillItemView(traitSetGroup, this);
                    skillItemViews.add(skillItemView);
                    horizontalLayoutList.get(horizontalLayoutList.size() - 1).addAndExpand(skillItemView);
                    exclusionList.add(trait.getTraitGroupBulk());
                }

            }
            this.addAndExpand(horizontalLayoutList.get(horizontalLayoutList.size() - 1));
        }

    }

    public void updateValue(SkillItemView skillItemView, Integer level) {
        Integer gridx = skillItemView.getGridX();
        Integer gridy = skillItemView.getGridY();

        Integer neighbourUpX = gridx;
        Integer neighbourUpY = gridy - 1;

        Integer neighbourDownX = gridx;
        Integer neighbourDownY = gridy + 1;

        Integer neighbourRightX = gridx + 1;
        Integer neighbourRightY = gridy;

        Integer neighbourLeftX = gridx - 1;
        Integer neighbourLeftY = gridy;

        for (SkillItemView sk : skillItemViews) {
            if ((sk.getGridX() == 1 || sk.getGridX() == 5) && (sk.getGridY() == 1 || sk.getGridY() == 5)) {
                sk.setLevelsEnabled(true);
                sk.setNeighbours(1000);
            }
            else if ((sk.getGridX() == neighbourUpX && sk.getGridY() == neighbourUpY) ||
                    (sk.getGridX() == neighbourDownX && sk.getGridY() == neighbourDownY) ||
                    (sk.getGridX() == neighbourLeftX && sk.getGridY() == neighbourLeftY) ||
                    (sk.getGridX() == neighbourRightX && sk.getGridY() == neighbourRightY)) {

                 if(skillItemView.getLevel()>0){
                    sk.setNeighbours(sk.getNeighbours()+1);
                }
                else{
                    sk.setNeighbours(sk.getNeighbours()-1);
                }
            }

        }
        Integer counter = 0;
        for (SkillItemView sk : skillItemViews) {

            if(sk.getNeighbours()>0){
                sk.setLevelsEnabled(true);
            }
            else{
                sk.setLevelsEnabled(false);
            }

            if (sk.getLevelsEnabled()) {
                counter += sk.getLevel();
            }

        }
        skillPoints.setText("Skillpoints used: " + counter);

    }


}
