package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class LootEffects {
    private List<LootEffectsCollection> collection;

    @JsonProperty("collection")
    public List<LootEffectsCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<LootEffectsCollection> value) { this.collection = value; }
}
