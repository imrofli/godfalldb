package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class MissionStateObjectives {
    private List<MissionStateObjectivesCollection> collection;

    @JsonProperty("collection")
    public List<MissionStateObjectivesCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<MissionStateObjectivesCollection> value) { this.collection = value; }
}
