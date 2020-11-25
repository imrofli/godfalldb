package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class ValorplateAttributes {
    private List<ValorplateAttributesCollection> collection;

    @JsonProperty("collection")
    public List<ValorplateAttributesCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<ValorplateAttributesCollection> value) { this.collection = value; }
}
