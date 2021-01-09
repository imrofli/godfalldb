package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class GameplayEvents {
    private List<GameplayEventsCollection> collection;

    @JsonProperty("collection")
    public List<GameplayEventsCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<GameplayEventsCollection> value) { this.collection = value; }
}
