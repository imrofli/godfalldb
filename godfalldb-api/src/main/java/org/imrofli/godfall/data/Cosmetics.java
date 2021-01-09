package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Cosmetics {
    private List<CosmeticsCollection> collection;

    @JsonProperty("collection")
    public List<CosmeticsCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<CosmeticsCollection> value) { this.collection = value; }
}
