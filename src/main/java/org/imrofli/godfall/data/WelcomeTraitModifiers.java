package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class WelcomeTraitModifiers {
    private List<TraitModifiersCollection> collection;

    @JsonProperty("collection")
    public List<TraitModifiersCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<TraitModifiersCollection> value) { this.collection = value; }
}
