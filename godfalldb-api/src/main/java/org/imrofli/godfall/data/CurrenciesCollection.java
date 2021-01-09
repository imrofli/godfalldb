package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class CurrenciesCollection {
    private String name;
    private String gameplayTag;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("gameplayTag")
    public String getGameplayTag() { return gameplayTag; }
    @JsonProperty("gameplayTag")
    public void setGameplayTag(String value) { this.gameplayTag = value; }
}
