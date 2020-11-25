package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class DreamstonesCollection {
    private String id;
    private String name;
    private List<EntryFee> entryFee;
    private long roundsCount;
    private String bossActivityID;
    private long rewardsLockedCount;
    private long intelHiddenCount;
    private List<String> requiredProgressionFlags;
    private List<String> grantedProgressionFlags;
    private List<ActivityTag> activityTags;
    private ActivityOverride activityOverride;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("entryFee")
    public List<EntryFee> getEntryFee() { return entryFee; }
    @JsonProperty("entryFee")
    public void setEntryFee(List<EntryFee> value) { this.entryFee = value; }

    @JsonProperty("roundsCount")
    public long getRoundsCount() { return roundsCount; }
    @JsonProperty("roundsCount")
    public void setRoundsCount(long value) { this.roundsCount = value; }

    @JsonProperty("bossActivityId")
    public String getBossActivityID() { return bossActivityID; }
    @JsonProperty("bossActivityId")
    public void setBossActivityID(String value) { this.bossActivityID = value; }

    @JsonProperty("rewardsLockedCount")
    public long getRewardsLockedCount() { return rewardsLockedCount; }
    @JsonProperty("rewardsLockedCount")
    public void setRewardsLockedCount(long value) { this.rewardsLockedCount = value; }

    @JsonProperty("intelHiddenCount")
    public long getIntelHiddenCount() { return intelHiddenCount; }
    @JsonProperty("intelHiddenCount")
    public void setIntelHiddenCount(long value) { this.intelHiddenCount = value; }

    @JsonProperty("requiredProgressionFlags")
    public List<String> getRequiredProgressionFlags() { return requiredProgressionFlags; }
    @JsonProperty("requiredProgressionFlags")
    public void setRequiredProgressionFlags(List<String> value) { this.requiredProgressionFlags = value; }

    @JsonProperty("grantedProgressionFlags")
    public List<String> getGrantedProgressionFlags() { return grantedProgressionFlags; }
    @JsonProperty("grantedProgressionFlags")
    public void setGrantedProgressionFlags(List<String> value) { this.grantedProgressionFlags = value; }

    @JsonProperty("activityTags")
    public List<ActivityTag> getActivityTags() { return activityTags; }
    @JsonProperty("activityTags")
    public void setActivityTags(List<ActivityTag> value) { this.activityTags = value; }

    @JsonProperty("activityOverride")
    public ActivityOverride getActivityOverride() { return activityOverride; }
    @JsonProperty("activityOverride")
    public void setActivityOverride(ActivityOverride value) { this.activityOverride = value; }
}
