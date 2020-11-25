package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Boons {
    private List<BoonsCollection> collection;

    @JsonProperty("collection")
    public List<BoonsCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<BoonsCollection> value) { this.collection = value; }
}
