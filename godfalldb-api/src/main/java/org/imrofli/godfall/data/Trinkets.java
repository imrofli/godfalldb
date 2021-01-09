package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Trinkets {
    private List<TrinketsCollection> collection;

    @JsonProperty("collection")
    public List<TrinketsCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<TrinketsCollection> value) { this.collection = value; }
}
