package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class LootGameplayTriggers {
    private List<LootGameplayTriggersCollection> collection;

    @JsonProperty("collection")
    public List<LootGameplayTriggersCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<LootGameplayTriggersCollection> value) { this.collection = value; }
}
