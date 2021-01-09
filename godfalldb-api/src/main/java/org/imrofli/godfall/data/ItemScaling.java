package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class ItemScaling {
    private List<ItemScalingCollection> collection;

    @JsonProperty("collection")
    public List<ItemScalingCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<ItemScalingCollection> value) { this.collection = value; }
}
