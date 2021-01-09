package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Weapons {
    private List<WeaponsCollection> collection;

    @JsonProperty("collection")
    public List<WeaponsCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<WeaponsCollection> value) { this.collection = value; }
}
