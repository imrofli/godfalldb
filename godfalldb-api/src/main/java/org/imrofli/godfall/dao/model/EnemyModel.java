package org.imrofli.godfall.dao.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class EnemyModel extends AbstractEntity {

    private String name;
    private String gameplayTag;
    private String enemyType;
    private Long experienceGranted;
    private String lootEventRulesType;

    @ManyToOne
    private VersionModel version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGameplayTag() {
        return gameplayTag;
    }

    public void setGameplayTag(String gameplayTag) {
        this.gameplayTag = gameplayTag;
    }

    public String getEnemyType() {
        return enemyType;
    }

    public void setEnemyType(String enemyType) {
        this.enemyType = enemyType;
    }

    public Long getExperienceGranted() {
        return experienceGranted;
    }

    public void setExperienceGranted(Long experienceGranted) {
        this.experienceGranted = experienceGranted;
    }

    public String getLootEventRulesType() {
        return lootEventRulesType;
    }

    public void setLootEventRulesType(String lootEventRulesType) {
        this.lootEventRulesType = lootEventRulesType;
    }

    public VersionModel getVersion() {
        return version;
    }

    public void setVersion(VersionModel version) {
        this.version = version;
    }
}
