package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class IntelCollection {
    private String id;
    private String gameplayTag;
    private MagnitudeName magnitudeName;
    private double magnitude;
    private DisplayMappingType displayMappingType;
    private List<String> metaTags;
    private List<String> exclusionGroups;
    private long weight;
    private String reverse;
    private String reduce;
    private String increase;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("gameplayTag")
    public String getGameplayTag() { return gameplayTag; }
    @JsonProperty("gameplayTag")
    public void setGameplayTag(String value) { this.gameplayTag = value; }

    @JsonProperty("magnitudeName")
    public MagnitudeName getMagnitudeName() { return magnitudeName; }
    @JsonProperty("magnitudeName")
    public void setMagnitudeName(MagnitudeName value) { this.magnitudeName = value; }

    @JsonProperty("magnitude")
    public double getMagnitude() { return magnitude; }
    @JsonProperty("magnitude")
    public void setMagnitude(double value) { this.magnitude = value; }

    @JsonProperty("displayMappingType")
    public DisplayMappingType getDisplayMappingType() { return displayMappingType; }
    @JsonProperty("displayMappingType")
    public void setDisplayMappingType(DisplayMappingType value) { this.displayMappingType = value; }

    @JsonProperty("metaTags")
    public List<String> getMetaTags() { return metaTags; }
    @JsonProperty("metaTags")
    public void setMetaTags(List<String> value) { this.metaTags = value; }

    @JsonProperty("exclusionGroups")
    public List<String> getExclusionGroups() { return exclusionGroups; }
    @JsonProperty("exclusionGroups")
    public void setExclusionGroups(List<String> value) { this.exclusionGroups = value; }

    @JsonProperty("weight")
    public long getWeight() { return weight; }
    @JsonProperty("weight")
    public void setWeight(long value) { this.weight = value; }

    @JsonProperty("reverse")
    public String getReverse() { return reverse; }
    @JsonProperty("reverse")
    public void setReverse(String value) { this.reverse = value; }

    @JsonProperty("reduce")
    public String getReduce() { return reduce; }
    @JsonProperty("reduce")
    public void setReduce(String value) { this.reduce = value; }

    @JsonProperty("increase")
    public String getIncrease() { return increase; }
    @JsonProperty("increase")
    public void setIncrease(String value) { this.increase = value; }
}
