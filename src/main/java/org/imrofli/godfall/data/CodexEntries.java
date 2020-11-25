package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class CodexEntries {
    private List<CodexEntriesCollection> collection;

    @JsonProperty("collection")
    public List<CodexEntriesCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<CodexEntriesCollection> value) { this.collection = value; }
}
