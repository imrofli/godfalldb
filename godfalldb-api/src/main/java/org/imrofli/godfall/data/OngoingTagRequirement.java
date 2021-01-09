package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class OngoingTagRequirement {
    private String gameplayTag;
    private RequireOrIgnore requireOrIgnore;
    private ActorType actorType;

    @JsonProperty("gameplayTag")
    public String getGameplayTag() { return gameplayTag; }
    @JsonProperty("gameplayTag")
    public void setGameplayTag(String value) { this.gameplayTag = value; }

    @JsonProperty("requireOrIgnore")
    public RequireOrIgnore getRequireOrIgnore() { return requireOrIgnore; }
    @JsonProperty("requireOrIgnore")
    public void setRequireOrIgnore(RequireOrIgnore value) { this.requireOrIgnore = value; }

    @JsonProperty("actorType")
    public ActorType getActorType() { return actorType; }
    @JsonProperty("actorType")
    public void setActorType(ActorType value) { this.actorType = value; }
}
