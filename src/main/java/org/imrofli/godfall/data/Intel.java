package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Intel {
    private List<IntelCollection> collection;

    @JsonProperty("collection")
    public List<IntelCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<IntelCollection> value) { this.collection = value; }
}
