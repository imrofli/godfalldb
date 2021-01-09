package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class TotRoomRewardsCollection {
    private String name;
    private String tags;
    private NameElement rarity;
    private Long roomEncounterTimerSeconds;
    private List<Double> roomEncounterAwardKeyThresholds;
    private Long rewardMinComplexity1;
    private Long rewardMaxComplexity1;
    private List<String> rewardWhitelistTags1;
    private Long rewardMinComplexity2;
    private Long rewardMaxComplexity2;
    private List<String> rewardWhitelistTags2;
    private Long rewardMinComplexity3;
    private Long rewardMaxComplexity3;
    private List<String> rewardWhitelistTags3;
    private Long rewardMinComplexity4;
    private Long rewardMaxComplexity4;
    private List<String> rewardWhitelistTags4;
    private Long rewardMinComplexity5;
    private Long rewardMaxComplexity5;
    private List<String> rewardWhitelistTags5;
    private Long rewardMinComplexity6;
    private Long rewardMaxComplexity6;
    private List<EncounterType> rewardWhitelistTags6;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("tags")
    public String getTags() { return tags; }
    @JsonProperty("tags")
    public void setTags(String value) { this.tags = value; }

    @JsonProperty("rarity")
    public NameElement getRarity() { return rarity; }
    @JsonProperty("rarity")
    public void setRarity(NameElement value) { this.rarity = value; }

    @JsonProperty("roomEncounterTimerSeconds")
    public Long getRoomEncounterTimerSeconds() { return roomEncounterTimerSeconds; }
    @JsonProperty("roomEncounterTimerSeconds")
    public void setRoomEncounterTimerSeconds(Long value) { this.roomEncounterTimerSeconds = value; }

    @JsonProperty("roomEncounterAwardKeyThresholds")
    public List<Double> getRoomEncounterAwardKeyThresholds() { return roomEncounterAwardKeyThresholds; }
    @JsonProperty("roomEncounterAwardKeyThresholds")
    public void setRoomEncounterAwardKeyThresholds(List<Double> value) { this.roomEncounterAwardKeyThresholds = value; }

    @JsonProperty("rewardMinComplexity1")
    public Long getRewardMinComplexity1() { return rewardMinComplexity1; }
    @JsonProperty("rewardMinComplexity1")
    public void setRewardMinComplexity1(Long value) { this.rewardMinComplexity1 = value; }

    @JsonProperty("rewardMaxComplexity1")
    public Long getRewardMaxComplexity1() { return rewardMaxComplexity1; }
    @JsonProperty("rewardMaxComplexity1")
    public void setRewardMaxComplexity1(Long value) { this.rewardMaxComplexity1 = value; }

    @JsonProperty("RewardWhitelistTags1")
    public List<String> getRewardWhitelistTags1() { return rewardWhitelistTags1; }
    @JsonProperty("RewardWhitelistTags1")
    public void setRewardWhitelistTags1(List<String> value) { this.rewardWhitelistTags1 = value; }

    @JsonProperty("rewardMinComplexity2")
    public Long getRewardMinComplexity2() { return rewardMinComplexity2; }
    @JsonProperty("rewardMinComplexity2")
    public void setRewardMinComplexity2(Long value) { this.rewardMinComplexity2 = value; }

    @JsonProperty("rewardMaxComplexity2")
    public Long getRewardMaxComplexity2() { return rewardMaxComplexity2; }
    @JsonProperty("rewardMaxComplexity2")
    public void setRewardMaxComplexity2(Long value) { this.rewardMaxComplexity2 = value; }

    @JsonProperty("RewardWhitelistTags2")
    public List<String> getRewardWhitelistTags2() { return rewardWhitelistTags2; }
    @JsonProperty("RewardWhitelistTags2")
    public void setRewardWhitelistTags2(List<String> value) { this.rewardWhitelistTags2 = value; }

    @JsonProperty("rewardMinComplexity3")
    public Long getRewardMinComplexity3() { return rewardMinComplexity3; }
    @JsonProperty("rewardMinComplexity3")
    public void setRewardMinComplexity3(Long value) { this.rewardMinComplexity3 = value; }

    @JsonProperty("rewardMaxComplexity3")
    public Long getRewardMaxComplexity3() { return rewardMaxComplexity3; }
    @JsonProperty("rewardMaxComplexity3")
    public void setRewardMaxComplexity3(Long value) { this.rewardMaxComplexity3 = value; }

    @JsonProperty("RewardWhitelistTags3")
    public List<String> getRewardWhitelistTags3() { return rewardWhitelistTags3; }
    @JsonProperty("RewardWhitelistTags3")
    public void setRewardWhitelistTags3(List<String> value) { this.rewardWhitelistTags3 = value; }

    @JsonProperty("rewardMinComplexity4")
    public Long getRewardMinComplexity4() { return rewardMinComplexity4; }
    @JsonProperty("rewardMinComplexity4")
    public void setRewardMinComplexity4(Long value) { this.rewardMinComplexity4 = value; }

    @JsonProperty("rewardMaxComplexity4")
    public Long getRewardMaxComplexity4() { return rewardMaxComplexity4; }
    @JsonProperty("rewardMaxComplexity4")
    public void setRewardMaxComplexity4(Long value) { this.rewardMaxComplexity4 = value; }

    @JsonProperty("RewardWhitelistTags4")
    public List<String> getRewardWhitelistTags4() { return rewardWhitelistTags4; }
    @JsonProperty("RewardWhitelistTags4")
    public void setRewardWhitelistTags4(List<String> value) { this.rewardWhitelistTags4 = value; }

    @JsonProperty("rewardMinComplexity5")
    public Long getRewardMinComplexity5() { return rewardMinComplexity5; }
    @JsonProperty("rewardMinComplexity5")
    public void setRewardMinComplexity5(Long value) { this.rewardMinComplexity5 = value; }

    @JsonProperty("rewardMaxComplexity5")
    public Long getRewardMaxComplexity5() { return rewardMaxComplexity5; }
    @JsonProperty("rewardMaxComplexity5")
    public void setRewardMaxComplexity5(Long value) { this.rewardMaxComplexity5 = value; }

    @JsonProperty("RewardWhitelistTags5")
    public List<String> getRewardWhitelistTags5() { return rewardWhitelistTags5; }
    @JsonProperty("RewardWhitelistTags5")
    public void setRewardWhitelistTags5(List<String> value) { this.rewardWhitelistTags5 = value; }

    @JsonProperty("rewardMinComplexity6")
    public Long getRewardMinComplexity6() { return rewardMinComplexity6; }
    @JsonProperty("rewardMinComplexity6")
    public void setRewardMinComplexity6(Long value) { this.rewardMinComplexity6 = value; }

    @JsonProperty("rewardMaxComplexity6")
    public Long getRewardMaxComplexity6() { return rewardMaxComplexity6; }
    @JsonProperty("rewardMaxComplexity6")
    public void setRewardMaxComplexity6(Long value) { this.rewardMaxComplexity6 = value; }

    @JsonProperty("RewardWhitelistTags6")
    public List<EncounterType> getRewardWhitelistTags6() { return rewardWhitelistTags6; }
    @JsonProperty("RewardWhitelistTags6")
    public void setRewardWhitelistTags6(List<EncounterType> value) { this.rewardWhitelistTags6 = value; }
}
