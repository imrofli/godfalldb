package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class DifficultiesCollection {
    private String gameplayTag;
    private long identifier;
    private List<String> requiredProgressionFlags;

    @JsonProperty("gameplayTag")
    public String getGameplayTag() { return gameplayTag; }
    @JsonProperty("gameplayTag")
    public void setGameplayTag(String value) { this.gameplayTag = value; }

    @JsonProperty("identifier")
    public long getIdentifier() { return identifier; }
    @JsonProperty("identifier")
    public void setIdentifier(long value) { this.identifier = value; }

    @JsonProperty("requiredProgressionFlags")
    public List<String> getRequiredProgressionFlags() { return requiredProgressionFlags; }
    @JsonProperty("requiredProgressionFlags")
    public void setRequiredProgressionFlags(List<String> value) { this.requiredProgressionFlags = value; }
}
