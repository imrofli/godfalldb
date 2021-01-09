package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class LootItemClass {
    private List<LootItemClassCollection> collection;

    @JsonProperty("collection")
    public List<LootItemClassCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<LootItemClassCollection> value) { this.collection = value; }
}
