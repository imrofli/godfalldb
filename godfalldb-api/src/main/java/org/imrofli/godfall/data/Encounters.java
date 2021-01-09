package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Encounters {
    private List<EncountersCollection> collection;

    @JsonProperty("collection")
    public List<EncountersCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<EncountersCollection> value) { this.collection = value; }
}
