package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Loot {
    private List<LootCurrencyCollection> collection;

    @JsonProperty("collection")
    public List<LootCurrencyCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<LootCurrencyCollection> value) { this.collection = value; }
}
