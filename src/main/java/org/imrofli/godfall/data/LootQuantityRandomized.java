package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class LootQuantityRandomized {
    private List<LootQuantityRandomizedCollection> collection;

    @JsonProperty("collection")
    public List<LootQuantityRandomizedCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<LootQuantityRandomizedCollection> value) { this.collection = value; }
}
