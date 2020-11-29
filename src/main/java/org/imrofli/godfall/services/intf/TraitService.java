package org.imrofli.godfall.services.intf;

import org.imrofli.godfall.dao.model.Trait;

import java.util.Set;

public interface TraitService {

    Set<Trait> getTraits();
    Trait getTraits(Long traitId);
    Trait getTraitAndFetch(Long traitId);
    Set<Trait> getTraitsByTraitGrpBulk(String traitGroupBlk);
    Set<Trait> getTraitsByGridY(Integer gridY);
    Trait getTraitsByMastery(String mastery);

}
