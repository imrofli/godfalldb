package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class LootGameplayTagsCollection {
    private String gameplayTag;
    private long extraLootBonusPerPlayer;

    @JsonProperty("gameplayTag")
    public String getGameplayTag() { return gameplayTag; }
    @JsonProperty("gameplayTag")
    public void setGameplayTag(String value) { this.gameplayTag = value; }

    @JsonProperty("extraLootBonusPerPlayer")
    public long getExtraLootBonusPerPlayer() { return extraLootBonusPerPlayer; }
    @JsonProperty("extraLootBonusPerPlayer")
    public void setExtraLootBonusPerPlayer(long value) { this.extraLootBonusPerPlayer = value; }
}
