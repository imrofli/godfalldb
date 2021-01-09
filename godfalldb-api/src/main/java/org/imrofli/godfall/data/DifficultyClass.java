package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class DifficultyClass {
    private List<Long> threat;
    private List<Long> maxDeaths;

    @JsonProperty("threat")
    public List<Long> getThreat() { return threat; }
    @JsonProperty("threat")
    public void setThreat(List<Long> value) { this.threat = value; }

    @JsonProperty("maxDeaths")
    public List<Long> getMaxDeaths() { return maxDeaths; }
    @JsonProperty("maxDeaths")
    public void setMaxDeaths(List<Long> value) { this.maxDeaths = value; }
}
