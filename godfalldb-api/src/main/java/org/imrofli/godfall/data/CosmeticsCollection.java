package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class CosmeticsCollection {
    private String gameplayTag;
    private String forGameplayTag;
    private CosmeticClass cosmeticClass;

    @JsonProperty("gameplayTag")
    public String getGameplayTag() { return gameplayTag; }
    @JsonProperty("gameplayTag")
    public void setGameplayTag(String value) { this.gameplayTag = value; }

    @JsonProperty("forGameplayTag")
    public String getForGameplayTag() { return forGameplayTag; }
    @JsonProperty("forGameplayTag")
    public void setForGameplayTag(String value) { this.forGameplayTag = value; }

    @JsonProperty("cosmeticClass")
    public CosmeticClass getCosmeticClass() { return cosmeticClass; }
    @JsonProperty("cosmeticClass")
    public void setCosmeticClass(CosmeticClass value) { this.cosmeticClass = value; }
}
