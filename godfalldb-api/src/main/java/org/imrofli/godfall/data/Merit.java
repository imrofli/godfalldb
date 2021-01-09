package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Merit {
    private String id;
    private String name;
    private MeritAbyssianSlayerCategory category;
    private String objectiveID;
    private long progressDenominator1;
    private long progressDenominator2;
    private long progressDenominator3;
    private long grantedXP1;
    private long grantedXP2;
    private long grantedXP3;
    private List<LootQuantityGroups1> lootQuantityGroups1;
    private List<LootQuantityGroups2> lootQuantityGroups2;
    private List<LootQuantityGroups3> lootQuantityGroups3;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("category")
    public MeritAbyssianSlayerCategory getCategory() { return category; }
    @JsonProperty("category")
    public void setCategory(MeritAbyssianSlayerCategory value) { this.category = value; }

    @JsonProperty("objectiveId")
    public String getObjectiveID() { return objectiveID; }
    @JsonProperty("objectiveId")
    public void setObjectiveID(String value) { this.objectiveID = value; }

    @JsonProperty("progressDenominator.1")
    public long getProgressDenominator1() { return progressDenominator1; }
    @JsonProperty("progressDenominator.1")
    public void setProgressDenominator1(long value) { this.progressDenominator1 = value; }

    @JsonProperty("progressDenominator.2")
    public long getProgressDenominator2() { return progressDenominator2; }
    @JsonProperty("progressDenominator.2")
    public void setProgressDenominator2(long value) { this.progressDenominator2 = value; }

    @JsonProperty("progressDenominator.3")
    public long getProgressDenominator3() { return progressDenominator3; }
    @JsonProperty("progressDenominator.3")
    public void setProgressDenominator3(long value) { this.progressDenominator3 = value; }

    @JsonProperty("grantedXp.1")
    public long getGrantedXP1() { return grantedXP1; }
    @JsonProperty("grantedXp.1")
    public void setGrantedXP1(long value) { this.grantedXP1 = value; }

    @JsonProperty("grantedXp.2")
    public long getGrantedXP2() { return grantedXP2; }
    @JsonProperty("grantedXp.2")
    public void setGrantedXP2(long value) { this.grantedXP2 = value; }

    @JsonProperty("grantedXp.3")
    public long getGrantedXP3() { return grantedXP3; }
    @JsonProperty("grantedXp.3")
    public void setGrantedXP3(long value) { this.grantedXP3 = value; }

    @JsonProperty("lootQuantityGroups.1")
    public List<LootQuantityGroups1> getLootQuantityGroups1() { return lootQuantityGroups1; }
    @JsonProperty("lootQuantityGroups.1")
    public void setLootQuantityGroups1(List<LootQuantityGroups1> value) { this.lootQuantityGroups1 = value; }

    @JsonProperty("lootQuantityGroups.2")
    public List<LootQuantityGroups2> getLootQuantityGroups2() { return lootQuantityGroups2; }
    @JsonProperty("lootQuantityGroups.2")
    public void setLootQuantityGroups2(List<LootQuantityGroups2> value) { this.lootQuantityGroups2 = value; }

    @JsonProperty("lootQuantityGroups.3")
    public List<LootQuantityGroups3> getLootQuantityGroups3() { return lootQuantityGroups3; }
    @JsonProperty("lootQuantityGroups.3")
    public void setLootQuantityGroups3(List<LootQuantityGroups3> value) { this.lootQuantityGroups3 = value; }
}
