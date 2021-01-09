package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Objectives {
    private List<ObjectivesCollection> collection;

    @JsonProperty("collection")
    public List<ObjectivesCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<ObjectivesCollection> value) { this.collection = value; }
}
