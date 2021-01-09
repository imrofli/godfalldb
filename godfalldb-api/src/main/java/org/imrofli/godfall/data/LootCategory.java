package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class LootCategory {
    private List<LootCategoryCollection> collection;

    @JsonProperty("collection")
    public List<LootCategoryCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<LootCategoryCollection> value) { this.collection = value; }
}
