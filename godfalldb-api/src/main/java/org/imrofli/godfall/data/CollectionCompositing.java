package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class CollectionCompositing {
    private List<CollectionCompositingCollection> collection;

    @JsonProperty("collection")
    public List<CollectionCompositingCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<CollectionCompositingCollection> value) { this.collection = value; }
}
