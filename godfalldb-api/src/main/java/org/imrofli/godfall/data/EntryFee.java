package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class EntryFee {
    private String gameplayTag;
    private long quantity;

    @JsonProperty("gameplayTag")
    public String getGameplayTag() { return gameplayTag; }
    @JsonProperty("gameplayTag")
    public void setGameplayTag(String value) { this.gameplayTag = value; }

    @JsonProperty("quantity")
    public long getQuantity() { return quantity; }
    @JsonProperty("quantity")
    public void setQuantity(long value) { this.quantity = value; }
}
