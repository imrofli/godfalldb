package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Rarities {
    private List<RaritiesCollection> collection;

    @JsonProperty("collection")
    public List<RaritiesCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<RaritiesCollection> value) { this.collection = value; }
}
