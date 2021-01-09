package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class Complete {
    private AnyElement any;
    private AllUnion all;

    @JsonProperty("any")
    public AnyElement getAny() { return any; }
    @JsonProperty("any")
    public void setAny(AnyElement value) { this.any = value; }

    @JsonProperty("all")
    public AllUnion getAll() { return all; }
    @JsonProperty("all")
    public void setAll(AllUnion value) { this.all = value; }
}
