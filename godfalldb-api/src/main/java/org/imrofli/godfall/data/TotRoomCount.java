package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class TotRoomCount {
    private List<TotRoomCountCollection> collection;

    @JsonProperty("collection")
    public List<TotRoomCountCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<TotRoomCountCollection> value) { this.collection = value; }
}
