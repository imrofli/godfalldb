package org.imrofli.godfall.dao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class SkillModel extends AbstractEntity {
    private String name;
    private String skillgroup;
    private String displayname;
    @Lob
    @Column(length = 10000)
    private String displaydescription;
    private Long minPoints;
    private String traitname;

    @ManyToOne
    private VersionModel version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkillgroup() {
        return skillgroup;
    }

    public void setSkillgroup(String skillgroup) {
        this.skillgroup = skillgroup;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public String getDisplaydescription() {
        return displaydescription;
    }

    public void setDisplaydescription(String displaydescription) {
        this.displaydescription = displaydescription;
    }

    public Long getMinPoints() {
        return minPoints;
    }

    public void setMinPoints(Long minPoints) {
        this.minPoints = minPoints;
    }

    public String getTraitname() {
        return traitname;
    }

    public void setTraitname(String traitname) {
        this.traitname = traitname;
    }

    public VersionModel getVersion() {
        return version;
    }

    public void setVersion(VersionModel version) {
        this.version = version;
    }
}
