package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class EnemyClasses {
    private List<EnemyClassesCollection> collection;

    @JsonProperty("collection")
    public List<EnemyClassesCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<EnemyClassesCollection> value) { this.collection = value; }
}
