package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class TraitSlot {
    private List<TraitSlotCollection> collection;

    @JsonProperty("collection")
    public List<TraitSlotCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<TraitSlotCollection> value) { this.collection = value; }
}
