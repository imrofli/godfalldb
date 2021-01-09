package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Biome {
    private String name;
    private List<String> addedDropTags;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("addedDropTags")
    public List<String> getAddedDropTags() { return addedDropTags; }
    @JsonProperty("addedDropTags")
    public void setAddedDropTags(List<String> value) { this.addedDropTags = value; }
}
