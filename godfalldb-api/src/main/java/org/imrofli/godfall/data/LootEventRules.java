package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class LootEventRules {
    private Chest lootEventRulesDefault;
    private Chest destructible;
    private Chest chest;
    private Chest gather;
    private Chest popcorn;
    private Chest mook;
    private Chest squire;
    private Chest knight;
    private Chest midBoss;
    private Chest endBoss;
    private Chest storyMacros;

    @JsonProperty("Default")
    public Chest getLootEventRulesDefault() { return lootEventRulesDefault; }
    @JsonProperty("Default")
    public void setLootEventRulesDefault(Chest value) { this.lootEventRulesDefault = value; }

    @JsonProperty("Destructible")
    public Chest getDestructible() { return destructible; }
    @JsonProperty("Destructible")
    public void setDestructible(Chest value) { this.destructible = value; }

    @JsonProperty("Chest")
    public Chest getChest() { return chest; }
    @JsonProperty("Chest")
    public void setChest(Chest value) { this.chest = value; }

    @JsonProperty("Gather")
    public Chest getGather() { return gather; }
    @JsonProperty("Gather")
    public void setGather(Chest value) { this.gather = value; }

    @JsonProperty("Popcorn")
    public Chest getPopcorn() { return popcorn; }
    @JsonProperty("Popcorn")
    public void setPopcorn(Chest value) { this.popcorn = value; }

    @JsonProperty("Mook")
    public Chest getMook() { return mook; }
    @JsonProperty("Mook")
    public void setMook(Chest value) { this.mook = value; }

    @JsonProperty("Squire")
    public Chest getSquire() { return squire; }
    @JsonProperty("Squire")
    public void setSquire(Chest value) { this.squire = value; }

    @JsonProperty("Knight")
    public Chest getKnight() { return knight; }
    @JsonProperty("Knight")
    public void setKnight(Chest value) { this.knight = value; }

    @JsonProperty("MidBoss")
    public Chest getMidBoss() { return midBoss; }
    @JsonProperty("MidBoss")
    public void setMidBoss(Chest value) { this.midBoss = value; }

    @JsonProperty("EndBoss")
    public Chest getEndBoss() { return endBoss; }
    @JsonProperty("EndBoss")
    public void setEndBoss(Chest value) { this.endBoss = value; }

    @JsonProperty("StoryMacros")
    public Chest getStoryMacros() { return storyMacros; }
    @JsonProperty("StoryMacros")
    public void setStoryMacros(Chest value) { this.storyMacros = value; }
}
