package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class ConditionalLootEffectsCollection {
    private String name;
    private String description;
    private boolean applyToSelf;
    private boolean applyToConnected;
    private boolean applyForEach;
    private List<PurpleNamedLootEffect> namedLootEffects;
    private ConditionName conditionName;
    private ConditionParamCategory conditionParamCategory;
    private ParamType conditionParamType;
    private Long conditionParamScalar;
    private String grantedEffectDescription;
    private CollectionTraitModifiers traitModifiers;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("applyToSelf")
    public boolean getApplyToSelf() { return applyToSelf; }
    @JsonProperty("applyToSelf")
    public void setApplyToSelf(boolean value) { this.applyToSelf = value; }

    @JsonProperty("applyToConnected")
    public boolean getApplyToConnected() { return applyToConnected; }
    @JsonProperty("applyToConnected")
    public void setApplyToConnected(boolean value) { this.applyToConnected = value; }

    @JsonProperty("applyForEach")
    public boolean getApplyForEach() { return applyForEach; }
    @JsonProperty("applyForEach")
    public void setApplyForEach(boolean value) { this.applyForEach = value; }

    @JsonProperty("namedLootEffects")
    public List<PurpleNamedLootEffect> getNamedLootEffects() { return namedLootEffects; }
    @JsonProperty("namedLootEffects")
    public void setNamedLootEffects(List<PurpleNamedLootEffect> value) { this.namedLootEffects = value; }

    @JsonProperty("conditionName")
    public ConditionName getConditionName() { return conditionName; }
    @JsonProperty("conditionName")
    public void setConditionName(ConditionName value) { this.conditionName = value; }

    @JsonProperty("conditionParamCategory")
    public ConditionParamCategory getConditionParamCategory() { return conditionParamCategory; }
    @JsonProperty("conditionParamCategory")
    public void setConditionParamCategory(ConditionParamCategory value) { this.conditionParamCategory = value; }

    @JsonProperty("conditionParamType")
    public ParamType getConditionParamType() { return conditionParamType; }
    @JsonProperty("conditionParamType")
    public void setConditionParamType(ParamType value) { this.conditionParamType = value; }

    @JsonProperty("conditionParamScalar")
    public Long getConditionParamScalar() { return conditionParamScalar; }
    @JsonProperty("conditionParamScalar")
    public void setConditionParamScalar(Long value) { this.conditionParamScalar = value; }

    @JsonProperty("grantedEffectDescription")
    public String getGrantedEffectDescription() { return grantedEffectDescription; }
    @JsonProperty("grantedEffectDescription")
    public void setGrantedEffectDescription(String value) { this.grantedEffectDescription = value; }

    @JsonProperty("traitModifiers")
    public CollectionTraitModifiers getTraitModifiers() { return traitModifiers; }
    @JsonProperty("traitModifiers")
    public void setTraitModifiers(CollectionTraitModifiers value) { this.traitModifiers = value; }
}
