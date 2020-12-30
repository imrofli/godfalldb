package org.imrofli.godfall.dao.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class ConditionalLootEffectModel extends AbstractEntity {

    @NotNull
    @NotEmpty
    private String name = "";

    private String description;

    private Boolean applyToSelf;

    private Boolean applyToConnected;

    private Boolean applyForEach;

    @OneToMany(cascade = {CascadeType.ALL})
    private Set<LootEffectModel> lootEffects;

    private String conditionName;

    @OneToOne(cascade = {CascadeType.ALL})
    private ConditionParamCategoryModel conditionParamCategory;

    private ParameterTypeModel conditionParameterType;

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

    public Set<LootEffectModel> getLootEffects() {
        return lootEffects;
    }

    public void setLootEffects(Set<LootEffectModel> lootEffects) {
        this.lootEffects = lootEffects;
    }

    public String getConditionName() {
        return conditionName;
    }

    public void setConditionName(String conditionName) {
        this.conditionName = conditionName;
    }

    public ConditionParamCategoryModel getConditionParamCategory() {
        return conditionParamCategory;
    }

    public void setConditionParamCategory(ConditionParamCategoryModel conditionParamCategory) {
        this.conditionParamCategory = conditionParamCategory;
    }

    public ParameterTypeModel getConditionParameterType() {
        return conditionParameterType;
    }

    public void setConditionParameterType(ParameterTypeModel conditionParameterType) {
        this.conditionParameterType = conditionParameterType;
    }

    public Long getConditionParamScalar() {
        return conditionParamScalar;
    }

    public void setConditionParamScalar(Long conditionParamScalar) {
        this.conditionParamScalar = conditionParamScalar;
    }
}
