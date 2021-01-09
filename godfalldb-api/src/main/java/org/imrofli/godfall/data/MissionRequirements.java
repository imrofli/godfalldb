package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class MissionRequirements {
    private List<MissionRequirementsCollection> collection;

    @JsonProperty("collection")
    public List<MissionRequirementsCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<MissionRequirementsCollection> value) { this.collection = value; }
}
