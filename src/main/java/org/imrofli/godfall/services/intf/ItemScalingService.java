package org.imrofli.godfall.services.intf;

import org.imrofli.godfall.dao.model.Rarity;
import org.imrofli.godfall.dao.model.Trait;

public interface ItemScalingService {

    String getScaledDescription(Trait trait, Rarity rarity, Long tier);
}
