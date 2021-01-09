package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Valorplates {
    private List<ValorplatesCollection> collection;

    @JsonProperty("collection")
    public List<ValorplatesCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<ValorplatesCollection> value) { this.collection = value; }
}
