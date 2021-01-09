package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Potions {
    private List<PotionsCollection> collection;

    @JsonProperty("collection")
    public List<PotionsCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<PotionsCollection> value) { this.collection = value; }
}
