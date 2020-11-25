package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class Legendary {
    private long the5;
    private Index index;

    @JsonProperty("5")
    public long getThe5() { return the5; }
    @JsonProperty("5")
    public void setThe5(long value) { this.the5 = value; }

    @JsonProperty("index")
    public Index getIndex() { return index; }
    @JsonProperty("index")
    public void setIndex(Index value) { this.index = value; }
}
