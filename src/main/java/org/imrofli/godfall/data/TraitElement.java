package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class TraitElement {
    private String traitSlotIndex;

    @JsonProperty("traitSlotIndex")
    public String getTraitSlotIndex() { return traitSlotIndex; }
    @JsonProperty("traitSlotIndex")
    public void setTraitSlotIndex(String value) { this.traitSlotIndex = value; }
}
