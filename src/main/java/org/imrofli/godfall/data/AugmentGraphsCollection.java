package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class AugmentGraphsCollection {
    private String graphName;
    private String valorplateGameplayTag;
    private long nodeID;
    private long levelAvailable;
    private long affinityRequirement;

    @JsonProperty("graphName")
    public String getGraphName() { return graphName; }
    @JsonProperty("graphName")
    public void setGraphName(String value) { this.graphName = value; }

    @JsonProperty("valorplateGameplayTag")
    public String getValorplateGameplayTag() { return valorplateGameplayTag; }
    @JsonProperty("valorplateGameplayTag")
    public void setValorplateGameplayTag(String value) { this.valorplateGameplayTag = value; }

    @JsonProperty("nodeId")
    public long getNodeID() { return nodeID; }
    @JsonProperty("nodeId")
    public void setNodeID(long value) { this.nodeID = value; }

    @JsonProperty("levelAvailable")
    public long getLevelAvailable() { return levelAvailable; }
    @JsonProperty("levelAvailable")
    public void setLevelAvailable(long value) { this.levelAvailable = value; }

    @JsonProperty("affinityRequirement")
    public long getAffinityRequirement() { return affinityRequirement; }
    @JsonProperty("affinityRequirement")
    public void setAffinityRequirement(long value) { this.affinityRequirement = value; }
}
