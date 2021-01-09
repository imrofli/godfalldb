package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class AugmentGraphs {
    private List<AugmentGraphsCollection> collection;

    @JsonProperty("collection")
    public List<AugmentGraphsCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<AugmentGraphsCollection> value) { this.collection = value; }
}
