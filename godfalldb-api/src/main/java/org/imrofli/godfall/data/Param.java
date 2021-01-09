package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class Param {
    private MagnitudeName magnitudeName;
    private long magnitudeRoundedDecimals;
    private DisplayMappingType displayMappingType;

    @JsonProperty("magnitudeName")
    public MagnitudeName getMagnitudeName() { return magnitudeName; }
    @JsonProperty("magnitudeName")
    public void setMagnitudeName(MagnitudeName value) { this.magnitudeName = value; }

    @JsonProperty("magnitudeRoundedDecimals")
    public long getMagnitudeRoundedDecimals() { return magnitudeRoundedDecimals; }
    @JsonProperty("magnitudeRoundedDecimals")
    public void setMagnitudeRoundedDecimals(long value) { this.magnitudeRoundedDecimals = value; }

    @JsonProperty("displayMappingType")
    public DisplayMappingType getDisplayMappingType() { return displayMappingType; }
    @JsonProperty("displayMappingType")
    public void setDisplayMappingType(DisplayMappingType value) { this.displayMappingType = value; }
}
