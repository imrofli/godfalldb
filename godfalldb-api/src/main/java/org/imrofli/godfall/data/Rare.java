package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class Rare {
    private long the3;
    private Index index;

    @JsonProperty("3")
    public long getThe3() { return the3; }
    @JsonProperty("3")
    public void setThe3(long value) { this.the3 = value; }

    @JsonProperty("index")
    public Index getIndex() { return index; }
    @JsonProperty("index")
    public void setIndex(Index value) { this.index = value; }
}
