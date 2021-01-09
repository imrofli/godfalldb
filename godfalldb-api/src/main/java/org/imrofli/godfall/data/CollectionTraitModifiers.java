package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class CollectionTraitModifiers {
    private List<String> modifierNames;
    private ParamType paramType;
    private long scalar;

    @JsonProperty("modifierNames")
    public List<String> getModifierNames() { return modifierNames; }
    @JsonProperty("modifierNames")
    public void setModifierNames(List<String> value) { this.modifierNames = value; }

    @JsonProperty("paramType")
    public ParamType getParamType() { return paramType; }
    @JsonProperty("paramType")
    public void setParamType(ParamType value) { this.paramType = value; }

    @JsonProperty("scalar")
    public long getScalar() { return scalar; }
    @JsonProperty("scalar")
    public void setScalar(long value) { this.scalar = value; }
}
