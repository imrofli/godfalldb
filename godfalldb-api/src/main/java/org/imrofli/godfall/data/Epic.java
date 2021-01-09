package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class Epic {
    private long the4;
    private Index index;

    @JsonProperty("4")
    public long getThe4() { return the4; }
    @JsonProperty("4")
    public void setThe4(long value) { this.the4 = value; }

    @JsonProperty("index")
    public Index getIndex() { return index; }
    @JsonProperty("index")
    public void setIndex(Index value) { this.index = value; }
}
