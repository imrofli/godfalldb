package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Difficulties {
    private List<DifficultiesCollection> collection;

    @JsonProperty("collection")
    public List<DifficultiesCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<DifficultiesCollection> value) { this.collection = value; }
}
