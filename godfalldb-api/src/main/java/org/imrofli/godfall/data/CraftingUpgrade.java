package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class CraftingUpgrade {
    private List<CraftingUpgradeCollection> collection;

    @JsonProperty("collection")
    public List<CraftingUpgradeCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<CraftingUpgradeCollection> value) { this.collection = value; }
}
