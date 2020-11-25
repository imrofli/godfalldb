package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class MissionObjectiveTypes {
    private List<MissionObjectiveTypesCollection> collection;

    @JsonProperty("collection")
    public List<MissionObjectiveTypesCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<MissionObjectiveTypesCollection> value) { this.collection = value; }
}
