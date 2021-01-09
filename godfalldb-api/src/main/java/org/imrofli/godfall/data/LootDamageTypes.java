package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class LootDamageTypes {
    private List<LootDamageTypesCollection> collection;

    @JsonProperty("collection")
    public List<LootDamageTypesCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<LootDamageTypesCollection> value) { this.collection = value; }
}
