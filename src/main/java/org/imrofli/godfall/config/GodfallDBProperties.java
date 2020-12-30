package org.imrofli.godfall.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("godfalldb")
public class GodfallDBProperties {

    private String dataDirectory = "data";
    private String archiveDirectory = "archive";
    private Long fileWatcherPollIntervalSeconds = 5L;
    private Long fileWatcherQuietPeriodSeconds = 3L;

    public String getDataDirectory() {
        return dataDirectory;
    }

    public void setDataDirectory(String dataDirectory) {
        this.dataDirectory = dataDirectory;
    }

    public String getArchiveDirectory() {
        return archiveDirectory;
    }

    public void setArchiveDirectory(String archiveDirectory) {
        this.archiveDirectory = archiveDirectory;
    }

    public Long getFileWatcherPollIntervalSeconds() {
        return fileWatcherPollIntervalSeconds;
    }

    public void setFileWatcherPollIntervalSeconds(Long fileWatcherPollIntervalSeconds) {
        this.fileWatcherPollIntervalSeconds = fileWatcherPollIntervalSeconds;
    }

    public Long getFileWatcherQuietPeriodSeconds() {
        return fileWatcherQuietPeriodSeconds;
    }

    public void setFileWatcherQuietPeriodSeconds(Long fileWatcherQuietPeriodSeconds) {
        this.fileWatcherQuietPeriodSeconds = fileWatcherQuietPeriodSeconds;
    }
}
