package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class LootItem {
    private List<LootItemCollection> collection;

    @JsonProperty("collection")
    public List<LootItemCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<LootItemCollection> value) { this.collection = value; }
}
