package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Activities {
    private List<ActivitiesCollection> collection;

    @JsonProperty("collection")
    public List<ActivitiesCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<ActivitiesCollection> value) { this.collection = value; }
}
