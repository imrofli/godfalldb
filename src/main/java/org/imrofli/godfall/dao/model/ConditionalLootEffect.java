package org.imrofli.godfall.dao.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class ConditionalLootEffect extends AbstractEntity{

    @NotNull
    @NotEmpty
    private String name = "";

    private String description;

    private Boolean applyToSelf;

    private Boolean applyToConnected;

    private Boolean applyForEach;

    @OneToMany(cascade = {CascadeType.ALL})
    private Set<LootEffect> lootEffects;

    private String conditionName;

    @OneToOne(cascade = {CascadeType.ALL})
    private ConditionParamCategory conditionParamCategory;

    private ParameterType conditionParameterType;

    private Long conditionParamScalar;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getApplyToSelf() {
        return applyToSelf;
    }

    public void setApplyToSelf(Boolean applyToSelf) {
        this.applyToSelf = applyToSelf;
    }

    public Boolean getApplyToConnected() {
        return applyToConnected;
    }

    public void setApplyToConnected(Boolean applyToConnected) {
        this.applyToConnected = applyToConnected;
    }

    public Boolean getApplyForEach() {
        return applyForEach;
    }

    public void setApplyForEach(Boolean applyForEach) {
        this.applyForEach = applyForEach;
    }

    public Set<LootEffect> getLootEffects() {
        return lootEffects;
    }

    public void setLootEffects(Set<LootEffect> lootEffects) {
        this.lootEffects = lootEffects;
    }

    public String getConditionName() {
        return conditionName;
    }

    public void setConditionName(String conditionName) {
        this.conditionName = conditionName;
    }

    public ConditionParamCategory getConditionParamCategory() {
        return conditionParamCategory;
    }

    public void setConditionParamCategory(ConditionParamCategory conditionParamCategory) {
        this.conditionParamCategory = conditionParamCategory;
    }

    public ParameterType getConditionParameterType() {
        return conditionParameterType;
    }

    public void setConditionParameterType(ParameterType conditionParameterType) {
        this.conditionParameterType = conditionParameterType;
    }

    public Long getConditionParamScalar() {
        return conditionParamScalar;
    }

    public void setConditionParamScalar(Long conditionParamScalar) {
        this.conditionParamScalar = conditionParamScalar;
    }
}
