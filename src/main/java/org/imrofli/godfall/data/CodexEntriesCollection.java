package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class CodexEntriesCollection {
    private String id;
    private CodexTab codexTab;
    private String groupID;
    private long displayOrder;
    private SheetName localizationSheetName;
    private Boolean unlockOnGameStart;
    private Double modelScale;
    private Long modelLocation;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("codexTab")
    public CodexTab getCodexTab() { return codexTab; }
    @JsonProperty("codexTab")
    public void setCodexTab(CodexTab value) { this.codexTab = value; }

    @JsonProperty("groupId")
    public String getGroupID() { return groupID; }
    @JsonProperty("groupId")
    public void setGroupID(String value) { this.groupID = value; }

    @JsonProperty("displayOrder")
    public long getDisplayOrder() { return displayOrder; }
    @JsonProperty("displayOrder")
    public void setDisplayOrder(long value) { this.displayOrder = value; }

    @JsonProperty("localizationSheetName")
    public SheetName getLocalizationSheetName() { return localizationSheetName; }
    @JsonProperty("localizationSheetName")
    public void setLocalizationSheetName(SheetName value) { this.localizationSheetName = value; }

    @JsonProperty("unlockOnGameStart")
    public Boolean getUnlockOnGameStart() { return unlockOnGameStart; }
    @JsonProperty("unlockOnGameStart")
    public void setUnlockOnGameStart(Boolean value) { this.unlockOnGameStart = value; }

    @JsonProperty("modelScale")
    public Double getModelScale() { return modelScale; }
    @JsonProperty("modelScale")
    public void setModelScale(Double value) { this.modelScale = value; }

    @JsonProperty("modelLocation")
    public Long getModelLocation() { return modelLocation; }
    @JsonProperty("modelLocation")
    public void setModelLocation(Long value) { this.modelLocation = value; }
}
