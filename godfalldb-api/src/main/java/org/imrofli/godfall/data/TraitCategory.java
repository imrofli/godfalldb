package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class TraitCategory {
    private List<TraitCategoryCollection> collection;

    @JsonProperty("collection")
    public List<TraitCategoryCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<TraitCategoryCollection> value) { this.collection = value; }
}
