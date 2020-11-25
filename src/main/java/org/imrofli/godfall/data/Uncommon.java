package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class Uncommon {
    private long the2;
    private Index index;

    @JsonProperty("2")
    public long getThe2() { return the2; }
    @JsonProperty("2")
    public void setThe2(long value) { this.the2 = value; }

    @JsonProperty("index")
    public Index getIndex() { return index; }
    @JsonProperty("index")
    public void setIndex(Index value) { this.index = value; }
}
