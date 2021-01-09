package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Maps {
    private List<MapsCollection> collection;

    @JsonProperty("collection")
    public List<MapsCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<MapsCollection> value) { this.collection = value; }
}
