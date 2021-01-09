package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class LootEffectsCollection {
    private String lootEffectName;
    private String gameplayTag;
    private BoonWhitelistTagElement affectedStat;
    private String statOperation;
    private LootEventRulesType evaluationChannel;
    private List<Param> params;

    @JsonProperty("lootEffectName")
    public String getLootEffectName() { return lootEffectName; }
    @JsonProperty("lootEffectName")
    public void setLootEffectName(String value) { this.lootEffectName = value; }

    @JsonProperty("gameplayTag")
    public String getGameplayTag() { return gameplayTag; }
    @JsonProperty("gameplayTag")
    public void setGameplayTag(String value) { this.gameplayTag = value; }

    @JsonProperty("affectedStat")
    public BoonWhitelistTagElement getAffectedStat() { return affectedStat; }
    @JsonProperty("affectedStat")
    public void setAffectedStat(BoonWhitelistTagElement value) { this.affectedStat = value; }

    @JsonProperty("statOperation")
    public String getStatOperation() { return statOperation; }
    @JsonProperty("statOperation")
    public void setStatOperation(String value) { this.statOperation = value; }

    @JsonProperty("evaluationChannel")
    public LootEventRulesType getEvaluationChannel() { return evaluationChannel; }
    @JsonProperty("evaluationChannel")
    public void setEvaluationChannel(LootEventRulesType value) { this.evaluationChannel = value; }

    @JsonProperty("params")
    public List<Param> getParams() { return params; }
    @JsonProperty("params")
    public void setParams(List<Param> value) { this.params = value; }
}
