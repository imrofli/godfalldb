package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class MapSubzones {
    private List<MapSubzonesCollection> collection;

    @JsonProperty("collection")
    public List<MapSubzonesCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<MapSubzonesCollection> value) { this.collection = value; }
}
