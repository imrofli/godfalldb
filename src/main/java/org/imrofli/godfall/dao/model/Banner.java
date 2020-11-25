package org.imrofli.godfall.dao.model;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class Banner extends AbstractEntity {

    @NotNull
    @NotEmpty
    private String name = "";

    @ElementCollection(targetClass = Element.class)
    private Set<Element> elements;

    private String gameplayTag;

    private Long overshieldScalar;

    private Long radiusScalar;

    private Long cooldownScalar;

    @Enumerated(EnumType.STRING)
    private ItemType itemType;

    @ElementCollection(targetClass = Affinity.class)
    private Set<Affinity> affinities;

    @OneToOne
    private LootInfo lootInfo;

    @ManyToMany
    @JoinTable(
            name = "banner_traits",
            joinColumns = @JoinColumn(name = "banner_id"),
            inverseJoinColumns = @JoinColumn(name = "trait_id"))
    private Set<Trait> traits;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Element> getElements() {
        return elements;
    }

    public void setElements(Set<Element> elements) {
        this.elements = elements;
    }

    public Long getOvershieldScalar() {
        return overshieldScalar;
    }

    public void setOvershieldScalar(Long overshieldScalar) {
        this.overshieldScalar = overshieldScalar;
    }

    public Long getRadiusScalar() {
        return radiusScalar;
    }

    public void setRadiusScalar(Long radiusScalar) {
        this.radiusScalar = radiusScalar;
    }

    public Long getCooldownScalar() {
        return cooldownScalar;
    }

    public void setCooldownScalar(Long cooldownScalar) {
        this.cooldownScalar = cooldownScalar;
    }

    public Set<Trait> getTraits() {
        return traits;
    }

    public void setTraits(Set<Trait> traits) {
        this.traits = traits;
    }

    public String getGameplayTag() {
        return gameplayTag;
    }

    public void setGameplayTag(String gameplayTag) {
        this.gameplayTag = gameplayTag;
    }

    public Set<Affinity> getAffinities() {
        return affinities;
    }

    public void setAffinities(Set<Affinity> affinities) {
        this.affinities = affinities;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public LootInfo getLootInfo() {
        return lootInfo;
    }

    public void setLootInfo(LootInfo lootInfo) {
        this.lootInfo = lootInfo;
    }

    @Override
    public String toString() {
        return "Banner{" +
                "name='" + name + '\'' +
                ", elements=" + elements +
                ", gameplayTag='" + gameplayTag + '\'' +
                ", overshieldScalar=" + overshieldScalar +
                ", radiusScalar=" + radiusScalar +
                ", cooldownScalar=" + cooldownScalar +
                ", itemType=" + itemType +
                ", affinities=" + affinities +
                ", lootInfo=" + lootInfo +
                ", traits=" + traits +
                '}';
    }
}
