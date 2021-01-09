package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class BoonsCollection {
    private String id;
    private String traitName;
    private RarityTitleLOCID rarityTitleLOCID;
    private List<BoonWhitelistTagElement> tags;
    private List<NameElement> rarityTags;
    private long weight;
    private long traitInitializationRarity;
    private long traitInitializationTier;
    private long traitMaxTier;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("traitName")
    public String getTraitName() { return traitName; }
    @JsonProperty("traitName")
    public void setTraitName(String value) { this.traitName = value; }

    @JsonProperty("rarityTitleLocId")
    public RarityTitleLOCID getRarityTitleLOCID() { return rarityTitleLOCID; }
    @JsonProperty("rarityTitleLocId")
    public void setRarityTitleLOCID(RarityTitleLOCID value) { this.rarityTitleLOCID = value; }

    @JsonProperty("tags")
    public List<BoonWhitelistTagElement> getTags() { return tags; }
    @JsonProperty("tags")
    public void setTags(List<BoonWhitelistTagElement> value) { this.tags = value; }

    @JsonProperty("rarityTags")
    public List<NameElement> getRarityTags() { return rarityTags; }
    @JsonProperty("rarityTags")
    public void setRarityTags(List<NameElement> value) { this.rarityTags = value; }

    @JsonProperty("weight")
    public long getWeight() { return weight; }
    @JsonProperty("weight")
    public void setWeight(long value) { this.weight = value; }

    @JsonProperty("traitInitializationRarity")
    public long getTraitInitializationRarity() { return traitInitializationRarity; }
    @JsonProperty("traitInitializationRarity")
    public void setTraitInitializationRarity(long value) { this.traitInitializationRarity = value; }

    @JsonProperty("traitInitializationTier")
    public long getTraitInitializationTier() { return traitInitializationTier; }
    @JsonProperty("traitInitializationTier")
    public void setTraitInitializationTier(long value) { this.traitInitializationTier = value; }

    @JsonProperty("traitMaxTier")
    public long getTraitMaxTier() { return traitMaxTier; }
    @JsonProperty("traitMaxTier")
    public void setTraitMaxTier(long value) { this.traitMaxTier = value; }
}
