package org.imrofli.godfall.services.intf;


import org.imrofli.godfall.api.model.LootInfo;
import org.imrofli.godfall.exception.ServiceCallException;

import java.util.List;

public interface LootInfoService {

    LootInfo getLootInfo(Long lootInfoId) throws ServiceCallException;
    List<LootInfo> getAllLootInfo() throws ServiceCallException;
    List<String> getAllDropTags();
    LootInfo getLootInfoByAugmentId(Long id) throws ServiceCallException;
    LootInfo getLootInfoByBannerId(Long id) throws ServiceCallException;
    LootInfo getLootInfoByLifeStoneId(Long id) throws ServiceCallException;
    LootInfo getLootInfoByWeaponId(Long id) throws ServiceCallException;
    LootInfo getLootInfoByTrinketId(Long id) throws ServiceCallException;
}
