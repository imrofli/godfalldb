package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class TotStartingFloor {
    private List<TotStartingFloorCollection> collection;

    @JsonProperty("collection")
    public List<TotStartingFloorCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<TotStartingFloorCollection> value) { this.collection = value; }
}
