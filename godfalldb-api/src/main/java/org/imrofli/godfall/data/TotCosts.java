package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class TotCosts {
    private List<TotCostsCollection> collection;

    @JsonProperty("collection")
    public List<TotCostsCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<TotCostsCollection> value) { this.collection = value; }
}
