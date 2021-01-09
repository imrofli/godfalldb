package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class TotRoomRewardThemes {
    private List<TotRoomRewardThemesCollection> collection;

    @JsonProperty("collection")
    public List<TotRoomRewardThemesCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<TotRoomRewardThemesCollection> value) { this.collection = value; }
}
