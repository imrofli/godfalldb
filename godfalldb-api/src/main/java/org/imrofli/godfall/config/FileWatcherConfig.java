package org.imrofli.godfall.config;

import org.imrofli.godfall.loader.DataFileChangeListener;
import org.imrofli.godfall.loader.DataLoaderIntf;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.devtools.filewatch.FileSystemWatcher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PreDestroy;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;

@Configuration
public class FileWatcherConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(FileWatcherConfig.class);

    @Autowired
    DataLoaderIntf loaderIntf;
    @Autowired
    GodfallDBProperties godfallDBProperties;

    @Bean
    public FileSystemWatcher fileSystemWatcher() {
        if (Files.notExists(Paths.get(godfallDBProperties.getDataDirectory()))) {
            try {
                Files.createDirectory(Paths.get(godfallDBProperties.getDataDirectory()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileSystemWatcher fileSystemWatcher = new FileSystemWatcher(true, Duration.ofSeconds(godfallDBProperties.getFileWatcherPollIntervalSeconds()), Duration.ofSeconds(godfallDBProperties.getFileWatcherQuietPeriodSeconds()));
        fileSystemWatcher.addSourceDirectory(new File(godfallDBProperties.getDataDirectory()));
        fileSystemWatcher.addListener(new DataFileChangeListener(loaderIntf));
        fileSystemWatcher.start();
        LOGGER.info("started fileSystemWatcher");
        return fileSystemWatcher;
    }

    @PreDestroy
    public void onDestroy() throws Exception {
        fileSystemWatcher().stop();
    }
}
