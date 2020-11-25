package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Quests {
    private List<QuestsCollection> collection;

    @JsonProperty("collection")
    public List<QuestsCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<QuestsCollection> value) { this.collection = value; }
}
