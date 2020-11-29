package org.imrofli.godfall.view;


import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.checkbox.CheckboxGroup;
import com.vaadin.flow.component.checkbox.CheckboxGroupVariant;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.radiobutton.RadioGroupVariant;
import com.vaadin.flow.theme.ThemeUtil;
import org.imrofli.godfall.dao.model.Trait;
import org.springframework.ui.context.Theme;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SkillItemView extends VerticalLayout {

    private Label skillName = new Label();
    private RadioButtonGroup<Integer> levels = new RadioButtonGroup<>();
    private SkillView skillView;
    private Integer gridX;
    private Integer gridY;
    private Integer neighbours = 0;

    private Set<Trait> traitSet;

    public SkillItemView(Set<Trait> traitSet, SkillView skillView) {
        this.traitSet = traitSet;
        this.skillView=skillView;
        String name = "";
        List<Integer> radioList = new ArrayList<>(6);
        for (int i = 0; i < 6; i++) {
            radioList.add(i);
        }
        levels.setItems(radioList);
        levels.setValue(0);
        levels.addValueChangeListener(this::valueChangeListener);

        for (Trait t : traitSet){
            name=t.getGridName();
            gridX=t.getGridX();
            gridY=t.getGridY();
            if(t.getGridX() == 1 || t.getGridX() == 5){
                if (t.getGridY() == 1 || t.getGridY() == 5){
                    levels.setReadOnly(false);
                }
                else{
                    levels.setReadOnly(true);
                }
            }
            else{
                levels.setReadOnly(true);
            }
            break;
        }
        skillName.setText(name);



        this.addAndExpand(skillName);
        this.addAndExpand(levels);
    }

    public void valueChangeListener(AbstractField.ComponentValueChangeEvent<RadioButtonGroup<Integer>, Integer> radioButtonGroupIntegerComponentValueChangeEvent) {
        if(radioButtonGroupIntegerComponentValueChangeEvent!=null && radioButtonGroupIntegerComponentValueChangeEvent.getValue()!=null){
            Integer value = radioButtonGroupIntegerComponentValueChangeEvent.getValue();
            skillView.updateValue(this, value);
        }
    }

    public Integer getLevel(){
        return levels.getValue();
    }

    public Integer getGridX(){
        return gridX;
    }

    public Integer getGridY(){
        return gridY;
    }

    public void setLevelsEnabled(Boolean enabled){
        if(!enabled){
            levels.setValue(0);
        }
        levels.setReadOnly(!enabled);
    }

    public Boolean getLevelsEnabled(){
        return !levels.isReadOnly();
    }

    public Integer getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(Integer neighbours) {
        this.neighbours = neighbours;
    }

    @PostConstruct
    public void init() {


    }
}
