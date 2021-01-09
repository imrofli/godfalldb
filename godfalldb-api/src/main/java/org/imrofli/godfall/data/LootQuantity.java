package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class LootQuantity {
    private List<LootQuantityCollection> collection;

    @JsonProperty("collection")
    public List<LootQuantityCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<LootQuantityCollection> value) { this.collection = value; }
}
