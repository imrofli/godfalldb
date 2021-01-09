package org.imrofli.godfall.dao.model;

import javax.persistence.Entity;
import java.sql.Timestamp;

@Entity
public class VersionModel extends AbstractEntity {

    private String version;
    private Timestamp loadTime;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Timestamp getLoadTime() {
        return loadTime;
    }

    public void setLoadTime(Timestamp loadTime) {
        this.loadTime = loadTime;
    }
}
