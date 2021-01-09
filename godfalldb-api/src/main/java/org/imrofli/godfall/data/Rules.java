package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class Rules {
    private Complete complete;
    private Fail fail;

    @JsonProperty("complete")
    public Complete getComplete() { return complete; }
    @JsonProperty("complete")
    public void setComplete(Complete value) { this.complete = value; }

    @JsonProperty("fail")
    public Fail getFail() { return fail; }
    @JsonProperty("fail")
    public void setFail(Fail value) { this.fail = value; }
}
