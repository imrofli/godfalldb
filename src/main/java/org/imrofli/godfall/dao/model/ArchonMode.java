package org.imrofli.godfall.dao.model;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import java.util.Set;

@Entity
public class ArchonMode extends AbstractEntity {

    private String gameplayTag;
    @ElementCollection
    private Set<String> alwaysOn;
    @ElementCollection
    private Set<String> onActivation;
    @ElementCollection
    private Set<String> whileActive;

    public String getGameplayTag() {
        return gameplayTag;
    }

    public void setGameplayTag(String gameplayTag) {
        this.gameplayTag = gameplayTag;
    }

    public Set<String> getAlwaysOn() {
        return alwaysOn;
    }

    public void setAlwaysOn(Set<String> alwaysOn) {
        this.alwaysOn = alwaysOn;
    }

    public Set<String> getOnActivation() {
        return onActivation;
    }

    public void setOnActivation(Set<String> onActivation) {
        this.onActivation = onActivation;
    }

    public Set<String> getWhileActive() {
        return whileActive;
    }

    public void setWhileActive(Set<String> whileActive) {
        this.whileActive = whileActive;
    }
}
