package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class AugmentAffinities {
    private List<AugmentAffinitiesCollection> collection;

    @JsonProperty("collection")
    public List<AugmentAffinitiesCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<AugmentAffinitiesCollection> value) { this.collection = value; }
}
