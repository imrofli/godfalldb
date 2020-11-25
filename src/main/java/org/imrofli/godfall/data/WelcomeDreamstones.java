package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class WelcomeDreamstones {
    private List<DreamstonesCollection> collection;

    @JsonProperty("collection")
    public List<DreamstonesCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<DreamstonesCollection> value) { this.collection = value; }
}
