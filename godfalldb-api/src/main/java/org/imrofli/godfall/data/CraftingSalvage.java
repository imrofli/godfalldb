package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class CraftingSalvage {
    private List<CraftingSalvageCollection> collection;

    @JsonProperty("collection")
    public List<CraftingSalvageCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<CraftingSalvageCollection> value) { this.collection = value; }
}
