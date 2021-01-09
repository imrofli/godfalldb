package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Enemies {
    private List<EnemiesCollection> collection;

    @JsonProperty("collection")
    public List<EnemiesCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<EnemiesCollection> value) { this.collection = value; }
}
