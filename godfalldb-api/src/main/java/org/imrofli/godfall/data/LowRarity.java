package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class LowRarity {
    private Long the1;
    private Long the2;
    private Long the3;
    private String index;
    private Long the4;
    private Long the5;

    @JsonProperty("1")
    public Long getThe1() { return the1; }
    @JsonProperty("1")
    public void setThe1(Long value) { this.the1 = value; }

    @JsonProperty("2")
    public Long getThe2() { return the2; }
    @JsonProperty("2")
    public void setThe2(Long value) { this.the2 = value; }

    @JsonProperty("3")
    public Long getThe3() { return the3; }
    @JsonProperty("3")
    public void setThe3(Long value) { this.the3 = value; }

    @JsonProperty("index")
    public String getIndex() { return index; }
    @JsonProperty("index")
    public void setIndex(String value) { this.index = value; }

    @JsonProperty("4")
    public Long getThe4() { return the4; }
    @JsonProperty("4")
    public void setThe4(Long value) { this.the4 = value; }

    @JsonProperty("5")
    public Long getThe5() { return the5; }
    @JsonProperty("5")
    public void setThe5(Long value) { this.the5 = value; }
}
