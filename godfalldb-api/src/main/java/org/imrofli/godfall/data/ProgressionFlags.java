package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class ProgressionFlags {
    private List<ArchonModeDefault> collection;

    @JsonProperty("collection")
    public List<ArchonModeDefault> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<ArchonModeDefault> value) { this.collection = value; }
}
