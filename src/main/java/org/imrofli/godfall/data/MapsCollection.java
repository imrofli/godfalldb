package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class MapsCollection {
    private String title;
    private String identifier;
    private String description;
    private List<String> visibleRequiredProgressionFlags;
    private String mapName;
    private String subtitle;
    private Position position;
    private List<String> playableRequiredProgressionFlags;

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }

    @JsonProperty("identifier")
    public String getIdentifier() { return identifier; }
    @JsonProperty("identifier")
    public void setIdentifier(String value) { this.identifier = value; }

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("visibleRequiredProgressionFlags")
    public List<String> getVisibleRequiredProgressionFlags() { return visibleRequiredProgressionFlags; }
    @JsonProperty("visibleRequiredProgressionFlags")
    public void setVisibleRequiredProgressionFlags(List<String> value) { this.visibleRequiredProgressionFlags = value; }

    @JsonProperty("mapName")
    public String getMapName() { return mapName; }
    @JsonProperty("mapName")
    public void setMapName(String value) { this.mapName = value; }

    @JsonProperty("subtitle")
    public String getSubtitle() { return subtitle; }
    @JsonProperty("subtitle")
    public void setSubtitle(String value) { this.subtitle = value; }

    @JsonProperty("position")
    public Position getPosition() { return position; }
    @JsonProperty("position")
    public void setPosition(Position value) { this.position = value; }

    @JsonProperty("playableRequiredProgressionFlags")
    public List<String> getPlayableRequiredProgressionFlags() { return playableRequiredProgressionFlags; }
    @JsonProperty("playableRequiredProgressionFlags")
    public void setPlayableRequiredProgressionFlags(List<String> value) { this.playableRequiredProgressionFlags = value; }
}
