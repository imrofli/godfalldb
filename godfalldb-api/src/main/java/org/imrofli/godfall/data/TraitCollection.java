package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class TraitCollection {
    private String traitName;
    private String description;
    private String groupName;
    private List<FluffyNamedLootEffect> namedLootEffects;
    private Boolean matchModifierMagnitudes;
    private Long minTier;
    private Long maxTier;
    private Long minRarity;
    private Long maxRarity;
    private Long weight;
    private List<String> conditionalLootEffects;
    private List<String> keywords;
    private List<OngoingTagRequirement> ongoingTagRequirements;

    @JsonProperty("traitName")
    public String getTraitName() { return traitName; }
    @JsonProperty("traitName")
    public void setTraitName(String value) { this.traitName = value; }

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("groupName")
    public String getGroupName() { return groupName; }
    @JsonProperty("groupName")
    public void setGroupName(String value) { this.groupName = value; }

    @JsonProperty("namedLootEffects")
    public List<FluffyNamedLootEffect> getNamedLootEffects() { return namedLootEffects; }
    @JsonProperty("namedLootEffects")
    public void setNamedLootEffects(List<FluffyNamedLootEffect> value) { this.namedLootEffects = value; }

    @JsonProperty("matchModifierMagnitudes")
    public Boolean getMatchModifierMagnitudes() { return matchModifierMagnitudes; }
    @JsonProperty("matchModifierMagnitudes")
    public void setMatchModifierMagnitudes(Boolean value) { this.matchModifierMagnitudes = value; }

    @JsonProperty("minTier")
    public Long getMinTier() { return minTier; }
    @JsonProperty("minTier")
    public void setMinTier(Long value) { this.minTier = value; }

    @JsonProperty("maxTier")
    public Long getMaxTier() { return maxTier; }
    @JsonProperty("maxTier")
    public void setMaxTier(Long value) { this.maxTier = value; }

    @JsonProperty("minRarity")
    public Long getMinRarity() { return minRarity; }
    @JsonProperty("minRarity")
    public void setMinRarity(Long value) { this.minRarity = value; }

    @JsonProperty("maxRarity")
    public Long getMaxRarity() { return maxRarity; }
    @JsonProperty("maxRarity")
    public void setMaxRarity(Long value) { this.maxRarity = value; }

    @JsonProperty("weight")
    public Long getWeight() { return weight; }
    @JsonProperty("weight")
    public void setWeight(Long value) { this.weight = value; }

    @JsonProperty("conditionalLootEffects")
    public List<String> getConditionalLootEffects() { return conditionalLootEffects; }
    @JsonProperty("conditionalLootEffects")
    public void setConditionalLootEffects(List<String> value) { this.conditionalLootEffects = value; }

    @JsonProperty("keywords")
    public List<String> getKeywords() { return keywords; }
    @JsonProperty("keywords")
    public void setKeywords(List<String> value) { this.keywords = value; }

    @JsonProperty("ongoingTagRequirements")
    public List<OngoingTagRequirement> getOngoingTagRequirements() { return ongoingTagRequirements; }
    @JsonProperty("ongoingTagRequirements")
    public void setOngoingTagRequirements(List<OngoingTagRequirement> value) { this.ongoingTagRequirements = value; }
}
