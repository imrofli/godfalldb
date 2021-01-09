package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class Localization {
    private String id;
    private SheetName sheetName;
    private DescriptionUnion name;
    private DescriptionUnion description;
    private SuccessText successText;
    private AcquireText acquireText;
    private String progressText;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("sheetName")
    public SheetName getSheetName() { return sheetName; }
    @JsonProperty("sheetName")
    public void setSheetName(SheetName value) { this.sheetName = value; }

    @JsonProperty("name")
    public DescriptionUnion getName() { return name; }
    @JsonProperty("name")
    public void setName(DescriptionUnion value) { this.name = value; }

    @JsonProperty("description")
    public DescriptionUnion getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(DescriptionUnion value) { this.description = value; }

    @JsonProperty("successText")
    public SuccessText getSuccessText() { return successText; }
    @JsonProperty("successText")
    public void setSuccessText(SuccessText value) { this.successText = value; }

    @JsonProperty("acquireText")
    public AcquireText getAcquireText() { return acquireText; }
    @JsonProperty("acquireText")
    public void setAcquireText(AcquireText value) { this.acquireText = value; }

    @JsonProperty("progressText")
    public String getProgressText() { return progressText; }
    @JsonProperty("progressText")
    public void setProgressText(String value) { this.progressText = value; }
}
