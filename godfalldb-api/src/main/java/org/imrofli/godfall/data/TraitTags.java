package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class TraitTags {
    private List<TraitTagsCollection> collection;

    @JsonProperty("collection")
    public List<TraitTagsCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<TraitTagsCollection> value) { this.collection = value; }
}
