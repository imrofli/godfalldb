package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class PurpleNamedLootEffect {
    private String name;
    private List<Magnitude> magnitudes;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("magnitudes")
    public List<Magnitude> getMagnitudes() { return magnitudes; }
    @JsonProperty("magnitudes")
    public void setMagnitudes(List<Magnitude> value) { this.magnitudes = value; }
}
