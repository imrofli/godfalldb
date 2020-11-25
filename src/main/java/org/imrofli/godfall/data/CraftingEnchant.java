package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class CraftingEnchant {
    private List<CraftingEnchantCollection> collection;

    @JsonProperty("collection")
    public List<CraftingEnchantCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<CraftingEnchantCollection> value) { this.collection = value; }
}
