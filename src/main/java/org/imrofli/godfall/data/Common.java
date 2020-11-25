package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class Common {
    private long the1;
    private Index index;

    @JsonProperty("1")
    public long getThe1() { return the1; }
    @JsonProperty("1")
    public void setThe1(long value) { this.the1 = value; }

    @JsonProperty("index")
    public Index getIndex() { return index; }
    @JsonProperty("index")
    public void setIndex(Index value) { this.index = value; }
}
