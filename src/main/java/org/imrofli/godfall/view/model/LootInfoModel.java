package org.imrofli.godfall.view.model;

public class LootInfoModel {

    public LootInfoModel(String tag, Long lootInfoId) {
        this.tag = tag;
        this.lootInfoId = lootInfoId;
    }

    String tag;
    Long lootInfoId;

    @Override
    public String toString() {
        return tag;
    }
}
