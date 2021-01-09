package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class ValorplateLeveling {
    private List<ValorplateLevelingCollection> collection;

    @JsonProperty("collection")
    public List<ValorplateLevelingCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<ValorplateLevelingCollection> value) { this.collection = value; }
}
