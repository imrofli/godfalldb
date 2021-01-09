package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class Currency {
    private CurrencyGameplayTag gameplayTag;
    private long amount;

    @JsonProperty("gameplayTag")
    public CurrencyGameplayTag getGameplayTag() { return gameplayTag; }
    @JsonProperty("gameplayTag")
    public void setGameplayTag(CurrencyGameplayTag value) { this.gameplayTag = value; }

    @JsonProperty("amount")
    public long getAmount() { return amount; }
    @JsonProperty("amount")
    public void setAmount(long value) { this.amount = value; }
}
