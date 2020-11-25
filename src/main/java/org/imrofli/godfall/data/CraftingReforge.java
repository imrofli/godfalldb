package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class CraftingReforge {
    private List<CraftingReforgeCollection> collection;

    @JsonProperty("collection")
    public List<CraftingReforgeCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<CraftingReforgeCollection> value) { this.collection = value; }
}
