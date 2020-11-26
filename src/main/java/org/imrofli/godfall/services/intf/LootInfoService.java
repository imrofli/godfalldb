package org.imrofli.godfall.services.intf;


import org.imrofli.godfall.dao.model.LootInfo;

import java.util.Set;

public interface LootInfoService {

    LootInfo getLootInfo(Long lootInfoId);
    Set<LootInfo> getAllLootInfo();
    Set<String> getAllDropTags();
}
