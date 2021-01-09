package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class MasteryEntitlements {
    private List<MasteryEntitlementsCollection> collection;

    @JsonProperty("collection")
    public List<MasteryEntitlementsCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<MasteryEntitlementsCollection> value) { this.collection = value; }
}
