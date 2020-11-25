package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Tiers {
    private List<TiersCollection> collection;

    @JsonProperty("collection")
    public List<TiersCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<TiersCollection> value) { this.collection = value; }
}
