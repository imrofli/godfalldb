package org.imrofli.godfall.dao.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class AugmentGraph extends AbstractEntity {

    private String gameplayTag;
    private String graphName;
    private Integer nodeid;
    private Integer levelAvailable;
    @Enumerated(EnumType.STRING)
    private Affinity affinityRequirement;

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

    public Affinity getAffinityRequirement() {
        return affinityRequirement;
    }

    public void setAffinityRequirement(Affinity affinityRequirement) {
        this.affinityRequirement = affinityRequirement;
    }
}
