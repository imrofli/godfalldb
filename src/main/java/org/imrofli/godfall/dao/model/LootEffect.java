package org.imrofli.godfall.dao.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class LootEffect extends AbstractEntity{

    @NotNull
    @NotEmpty
    private String name = "";

    @OneToMany(cascade = {CascadeType.ALL})
    private Set<Magnitude> magnitudes;

    @Enumerated(EnumType.STRING)
    private LootEffectType lootEffectType;

    private Boolean applyToSelf;

    private Boolean applyToConnected;

    private Boolean applyForEach;

    private Long conditionParamScalar;

    private ParameterType conditionParamType;

    private String conditionParamCategory;

    private String conditionName;

    private String grantedEffectDescription;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Magnitude> getMagnitudes() {
        return magnitudes;
    }

    public void setMagnitudes(Set<Magnitude> magnitudes) {
        this.magnitudes = magnitudes;
    }

    public LootEffectType getLootEffectType() {
        return lootEffectType;
    }

    public void setLootEffectType(LootEffectType lootEffectType) {
        this.lootEffectType = lootEffectType;
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

    public Long getConditionParamScalar() {
        return conditionParamScalar;
    }

    public void setConditionParamScalar(Long conditionParamScalar) {
        this.conditionParamScalar = conditionParamScalar;
    }

    public ParameterType getConditionParamType() {
        return conditionParamType;
    }

    public void setConditionParamType(ParameterType conditionParamType) {
        this.conditionParamType = conditionParamType;
    }

    public String getConditionParamCategory() {
        return conditionParamCategory;
    }

    public void setConditionParamCategory(String conditionParamCategory) {
        this.conditionParamCategory = conditionParamCategory;
    }

    public String getConditionName() {
        return conditionName;
    }

    public void setConditionName(String conditionName) {
        this.conditionName = conditionName;
    }

    public String getGrantedEffectDescription() {
        return grantedEffectDescription;
    }

    public void setGrantedEffectDescription(String grantedEffectDescription) {
        this.grantedEffectDescription = grantedEffectDescription;
    }

    @Override
    public String toString() {
        return "LootEffect{" +
                "name='" + name + '\'' +
                ", magnitudes=" + magnitudes +
                ", lootEffectType=" + lootEffectType +
                '}';
    }
}
