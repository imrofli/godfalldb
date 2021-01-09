package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class TraitModifiersCollection {
    private String name;
    private String operation;
    private long magnitudeRoundedDecimals;
    private DisplayMappingType displayMappingType;
    private List<BoonWhitelistTagElement> affectedCharacterAttributes;
    private List<String> affectedTraitCategoryGroupNames;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("operation")
    public String getOperation() { return operation; }
    @JsonProperty("operation")
    public void setOperation(String value) { this.operation = value; }

    @JsonProperty("magnitudeRoundedDecimals")
    public long getMagnitudeRoundedDecimals() { return magnitudeRoundedDecimals; }
    @JsonProperty("magnitudeRoundedDecimals")
    public void setMagnitudeRoundedDecimals(long value) { this.magnitudeRoundedDecimals = value; }

    @JsonProperty("displayMappingType")
    public DisplayMappingType getDisplayMappingType() { return displayMappingType; }
    @JsonProperty("displayMappingType")
    public void setDisplayMappingType(DisplayMappingType value) { this.displayMappingType = value; }

    @JsonProperty("affectedCharacterAttributes")
    public List<BoonWhitelistTagElement> getAffectedCharacterAttributes() { return affectedCharacterAttributes; }
    @JsonProperty("affectedCharacterAttributes")
    public void setAffectedCharacterAttributes(List<BoonWhitelistTagElement> value) { this.affectedCharacterAttributes = value; }

    @JsonProperty("affectedTraitCategoryGroupNames")
    public List<String> getAffectedTraitCategoryGroupNames() { return affectedTraitCategoryGroupNames; }
    @JsonProperty("affectedTraitCategoryGroupNames")
    public void setAffectedTraitCategoryGroupNames(List<String> value) { this.affectedTraitCategoryGroupNames = value; }
}
