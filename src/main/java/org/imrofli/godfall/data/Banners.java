package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Banners {
    private List<BannersCollection> collection;

    @JsonProperty("collection")
    public List<BannersCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<BannersCollection> value) { this.collection = value; }
}
