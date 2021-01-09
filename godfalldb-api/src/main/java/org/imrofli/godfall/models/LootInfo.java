package org.imrofli.godfall.models;

import org.imrofli.godfall.data.Index;

import java.util.List;

public class LootInfo {
    private List<String> tags;
    private boolean isExclusive;
    private boolean isToT;
    private Integer minLevel;
    private int weight;
    private Index minrarity;

    public LootInfo() {
    }

    public LootInfo(List<String> tags, boolean isExclusive, boolean isToT, Integer minLevel, int weight, Index minrarity) {
        this.tags = tags;
        this.isExclusive = isExclusive;
        this.isToT = isToT;
        this.minLevel = minLevel;
        this.weight = weight;
        this.minrarity = minrarity;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public boolean isExclusive() {
        return isExclusive;
    }

    public void setExclusive(boolean exclusive) {
        isExclusive = exclusive;
    }

    public boolean isToT() {
        return isToT;
    }

    public void setToT(boolean toT) {
        isToT = toT;
    }

    public Integer getMinLevel() {
        return minLevel;
    }

    public void setMinLevel(Integer minLevel) {
        this.minLevel = minLevel;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Index getMinrarity() {
        return minrarity;
    }

    public void setMinrarity(Index minrarity) {
        this.minrarity = minrarity;
    }

    @Override
    public String toString() {
        return "LootInfo{" +
                "tags=" + tags +
                ", isExclusive=" + isExclusive +
                ", isToT=" + isToT +
                ", minLevel=" + minLevel +
                ", weight=" + weight +
                ", minrarity=" + minrarity +
                '}';
    }
}
