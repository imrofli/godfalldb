package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class MissionObjectiveTargetVariants {
    private List<MissionObjectiveTargetVariantsCollection> collection;

    @JsonProperty("collection")
    public List<MissionObjectiveTargetVariantsCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<MissionObjectiveTargetVariantsCollection> value) { this.collection = value; }
}
