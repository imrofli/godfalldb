package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class TotRoomRewards {
    private List<TotRoomRewardsCollection> collection;

    @JsonProperty("collection")
    public List<TotRoomRewardsCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<TotRoomRewardsCollection> value) { this.collection = value; }
}
