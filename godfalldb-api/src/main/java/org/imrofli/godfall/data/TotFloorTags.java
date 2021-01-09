package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class TotFloorTags {
    private List<TotFloorTagsCollection> collection;

    @JsonProperty("collection")
    public List<TotFloorTagsCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<TotFloorTagsCollection> value) { this.collection = value; }
}
