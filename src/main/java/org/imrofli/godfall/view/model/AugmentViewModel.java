package org.imrofli.godfall.view.model;

import org.imrofli.godfall.models.Affinity;

public class AugmentViewModel extends ItemViewModel{
    private Affinity affinitiy;

    public AugmentViewModel(String name, String element, String rarity, String description, String stat) {
        super(name, element, rarity, description, stat);
    }

    public AugmentViewModel(String name, String element, String rarity, String description, String stat, Affinity affinitiy) {
        super(name, element, rarity, description, stat);
        this.affinitiy = affinitiy;
    }

    public Affinity getAffinitiy() {

        return affinitiy;
    }

    public void setAffinitiy(Affinity affinitiy) {
        this.affinitiy = affinitiy;
    }
}
