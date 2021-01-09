package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class MissionRule {
    private String ruleID;
    private boolean autoAcquire;
    private boolean autoClaim;
    private boolean repeatable;
    private boolean displayCompletionNotification;
    private Boolean forceTravelToMap;
    private Boolean useWorldStateSynchronizer;

    @JsonProperty("ruleId")
    public String getRuleID() { return ruleID; }
    @JsonProperty("ruleId")
    public void setRuleID(String value) { this.ruleID = value; }

    @JsonProperty("autoAcquire")
    public boolean getAutoAcquire() { return autoAcquire; }
    @JsonProperty("autoAcquire")
    public void setAutoAcquire(boolean value) { this.autoAcquire = value; }

    @JsonProperty("autoClaim")
    public boolean getAutoClaim() { return autoClaim; }
    @JsonProperty("autoClaim")
    public void setAutoClaim(boolean value) { this.autoClaim = value; }

    @JsonProperty("repeatable")
    public boolean getRepeatable() { return repeatable; }
    @JsonProperty("repeatable")
    public void setRepeatable(boolean value) { this.repeatable = value; }

    @JsonProperty("displayCompletionNotification")
    public boolean getDisplayCompletionNotification() { return displayCompletionNotification; }
    @JsonProperty("displayCompletionNotification")
    public void setDisplayCompletionNotification(boolean value) { this.displayCompletionNotification = value; }

    @JsonProperty("forceTravelToMap")
    public Boolean getForceTravelToMap() { return forceTravelToMap; }
    @JsonProperty("forceTravelToMap")
    public void setForceTravelToMap(Boolean value) { this.forceTravelToMap = value; }

    @JsonProperty("useWorldStateSynchronizer")
    public Boolean getUseWorldStateSynchronizer() { return useWorldStateSynchronizer; }
    @JsonProperty("useWorldStateSynchronizer")
    public void setUseWorldStateSynchronizer(Boolean value) { this.useWorldStateSynchronizer = value; }
}
