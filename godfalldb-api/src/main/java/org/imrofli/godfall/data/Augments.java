package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Augments {
    private List<AugmentsCollection> collection;

    @JsonProperty("collection")
    public List<AugmentsCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<AugmentsCollection> value) { this.collection = value; }
}
