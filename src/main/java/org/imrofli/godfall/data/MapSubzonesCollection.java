package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class MapSubzonesCollection {
    private ID id;
    private String name;
    private String mapID;

    @JsonProperty("id")
    public ID getID() { return id; }
    @JsonProperty("id")
    public void setID(ID value) { this.id = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("mapId")
    public String getMapID() { return mapID; }
    @JsonProperty("mapId")
    public void setMapID(String value) { this.mapID = value; }
}
