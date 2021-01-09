package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class ValorplateLevelingCollection {
    private String gameplayTag;
    private long level;
    private List<EntryFee> costs;

    @JsonProperty("gameplayTag")
    public String getGameplayTag() { return gameplayTag; }
    @JsonProperty("gameplayTag")
    public void setGameplayTag(String value) { this.gameplayTag = value; }

    @JsonProperty("level")
    public long getLevel() { return level; }
    @JsonProperty("level")
    public void setLevel(long value) { this.level = value; }

    @JsonProperty("costs")
    public List<EntryFee> getCosts() { return costs; }
    @JsonProperty("costs")
    public void setCosts(List<EntryFee> value) { this.costs = value; }
}
