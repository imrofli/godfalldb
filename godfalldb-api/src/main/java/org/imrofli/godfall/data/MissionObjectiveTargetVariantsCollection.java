package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class MissionObjectiveTargetVariantsCollection {
    private String label;
    private String variantTag;
    private boolean prefix;
    private String lootQuantityGroup;

    @JsonProperty("label")
    public String getLabel() { return label; }
    @JsonProperty("label")
    public void setLabel(String value) { this.label = value; }

    @JsonProperty("variantTag")
    public String getVariantTag() { return variantTag; }
    @JsonProperty("variantTag")
    public void setVariantTag(String value) { this.variantTag = value; }

    @JsonProperty("prefix")
    public boolean getPrefix() { return prefix; }
    @JsonProperty("prefix")
    public void setPrefix(boolean value) { this.prefix = value; }

    @JsonProperty("lootQuantityGroup")
    public String getLootQuantityGroup() { return lootQuantityGroup; }
    @JsonProperty("lootQuantityGroup")
    public void setLootQuantityGroup(String value) { this.lootQuantityGroup = value; }
}
