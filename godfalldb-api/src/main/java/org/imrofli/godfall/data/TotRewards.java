package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class TotRewards {
    private List<TotRewardsCollection> collection;

    @JsonProperty("collection")
    public List<TotRewardsCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<TotRewardsCollection> value) { this.collection = value; }
}
