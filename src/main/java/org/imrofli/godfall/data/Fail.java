package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class Fail {
    private AnyUnion any;

    @JsonProperty("any")
    public AnyUnion getAny() { return any; }
    @JsonProperty("any")
    public void setAny(AnyUnion value) { this.any = value; }
}
