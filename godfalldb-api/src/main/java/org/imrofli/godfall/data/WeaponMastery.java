package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class WeaponMastery {
    private List<WeaponMasteryCollection> collection;

    @JsonProperty("collection")
    public List<WeaponMasteryCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<WeaponMasteryCollection> value) { this.collection = value; }
}
