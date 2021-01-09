package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class HighRarity {
    private Long the3;
    private long the4;
    private long the5;
    private String index;
    private Long the2;

    @JsonProperty("3")
    public Long getThe3() { return the3; }
    @JsonProperty("3")
    public void setThe3(Long value) { this.the3 = value; }

    @JsonProperty("4")
    public long getThe4() { return the4; }
    @JsonProperty("4")
    public void setThe4(long value) { this.the4 = value; }

    @JsonProperty("5")
    public long getThe5() { return the5; }
    @JsonProperty("5")
    public void setThe5(long value) { this.the5 = value; }

    @JsonProperty("index")
    public String getIndex() { return index; }
    @JsonProperty("index")
    public void setIndex(String value) { this.index = value; }

    @JsonProperty("2")
    public Long getThe2() { return the2; }
    @JsonProperty("2")
    public void setThe2(Long value) { this.the2 = value; }
}
