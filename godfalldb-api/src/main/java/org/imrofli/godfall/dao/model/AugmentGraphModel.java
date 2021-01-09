package org.imrofli.godfall.dao.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class AugmentGraphModel extends AbstractEntity {

    private String gameplayTag;
    private String graphName;
    private Integer nodeid;
    private Integer levelAvailable;
    @Enumerated(EnumType.STRING)
    private AffinityModel affinityRequirement;

    public String getGameplayTag() {
        return gameplayTag;
    }

    public void setGameplayTag(String gameplayTag) {
        this.gameplayTag = gameplayTag;
    }

    public String getGraphName() {
        return graphName;
    }

    public void setGraphName(String graphName) {
        this.graphName = graphName;
    }

    public Integer getNodeid() {
        return nodeid;
    }

    public void setNodeid(Integer nodeid) {
        this.nodeid = nodeid;
    }

    public Integer getLevelAvailable() {
        return levelAvailable;
    }

    public void setLevelAvailable(Integer levelAvailable) {
        this.levelAvailable = levelAvailable;
    }

    public AffinityModel getAffinityRequirement() {
        return affinityRequirement;
    }

    public void setAffinityRequirement(AffinityModel affinityRequirement) {
        this.affinityRequirement = affinityRequirement;
    }
}
