package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class TotFloor {
    private List<TotFloorCollection> collection;

    @JsonProperty("collection")
    public List<TotFloorCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<TotFloorCollection> value) { this.collection = value; }
}
