package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class WelcomeTrait {
    private List<TraitCollection> collection;

    @JsonProperty("collection")
    public List<TraitCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<TraitCollection> value) { this.collection = value; }
}
