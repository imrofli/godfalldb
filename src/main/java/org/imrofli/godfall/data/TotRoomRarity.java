package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class TotRoomRarity {
    private List<TotRoomRarityCollection> collection;

    @JsonProperty("collection")
    public List<TotRoomRarityCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<TotRoomRarityCollection> value) { this.collection = value; }
}
