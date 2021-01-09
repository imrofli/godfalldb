package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class Position {
    private String left;
    private String top;

    @JsonProperty("left")
    public String getLeft() { return left; }
    @JsonProperty("left")
    public void setLeft(String value) { this.left = value; }

    @JsonProperty("top")
    public String getTop() { return top; }
    @JsonProperty("top")
    public void setTop(String value) { this.top = value; }
}
