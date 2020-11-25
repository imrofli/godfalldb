package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class ConditionalLootEffects {
    private List<ConditionalLootEffectsCollection> collection;

    @JsonProperty("collection")
    public List<ConditionalLootEffectsCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<ConditionalLootEffectsCollection> value) { this.collection = value; }
}
