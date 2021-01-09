package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class CollectionCompositingCollection {
    private String id;
    private List<SheetName> collections;
    private String createMapID;
    private String createMapKey;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("collections")
    public List<SheetName> getCollections() { return collections; }
    @JsonProperty("collections")
    public void setCollections(List<SheetName> value) { this.collections = value; }

    @JsonProperty("createMapId")
    public String getCreateMapID() { return createMapID; }
    @JsonProperty("createMapId")
    public void setCreateMapID(String value) { this.createMapID = value; }

    @JsonProperty("createMapKey")
    public String getCreateMapKey() { return createMapKey; }
    @JsonProperty("createMapKey")
    public void setCreateMapKey(String value) { this.createMapKey = value; }
}
