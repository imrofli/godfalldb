package org.imrofli.godfall.services.intf;

import org.imrofli.godfall.dao.model.Trait;
import org.imrofli.godfall.dao.model.Weapon;
import org.imrofli.godfall.data.Index;
import org.imrofli.godfall.models.TraitInfo;
import org.imrofli.godfall.models.WeaponClass;

import java.util.List;
import java.util.Set;

public interface TraitService {

    Set<Trait> getTrait();
    Trait getTrait(Long traitId);
    Trait getTraitAndFetch(Long traitId);

}
