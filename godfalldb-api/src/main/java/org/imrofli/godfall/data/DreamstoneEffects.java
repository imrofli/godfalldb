package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class DreamstoneEffects {
    private List<DreamstoneEffectsCollection> collection;

    @JsonProperty("collection")
    public List<DreamstoneEffectsCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<DreamstoneEffectsCollection> value) { this.collection = value; }
}
