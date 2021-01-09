package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class LootGameplayTags {
    private List<LootGameplayTagsCollection> collection;

    @JsonProperty("collection")
    public List<LootGameplayTagsCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<LootGameplayTagsCollection> value) { this.collection = value; }
}
