package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class LootDamageTypesCollection {
    private String name;
    private String traitTag;
    private String gameplayTag;
    private long percentOfDamage;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("traitTag")
    public String getTraitTag() { return traitTag; }
    @JsonProperty("traitTag")
    public void setTraitTag(String value) { this.traitTag = value; }

    @JsonProperty("gameplayTag")
    public String getGameplayTag() { return gameplayTag; }
    @JsonProperty("gameplayTag")
    public void setGameplayTag(String value) { this.gameplayTag = value; }

    @JsonProperty("percentOfDamage")
    public long getPercentOfDamage() { return percentOfDamage; }
    @JsonProperty("percentOfDamage")
    public void setPercentOfDamage(long value) { this.percentOfDamage = value; }
}
