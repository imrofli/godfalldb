package org.imrofli.godfall.loader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.devtools.filewatch.ChangedFile;
import org.springframework.boot.devtools.filewatch.ChangedFiles;
import org.springframework.boot.devtools.filewatch.FileChangeListener;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Set;

@Component
public class DataFileChangeListener implements FileChangeListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(DataFileChangeListener.class);
    private DataLoaderIntf dataLoader;

    public DataFileChangeListener(DataLoaderIntf loaderIntf) {
        dataLoader = loaderIntf;
    }

    @Override
    public void onChange(Set<ChangedFiles> changeSet) {
        for (ChangedFiles cfiles : changeSet) {
            for (ChangedFile cfile : cfiles.getFiles()) {
                if ((cfile.getType().equals(ChangedFile.Type.MODIFY) || cfile.getType().equals(ChangedFile.Type.ADD)) && !isLocked(cfile.getFile().toPath()) && cfile.getFile().getName().endsWith(".json")) {
                    LOGGER.info("Found data file {}", cfile.getFile().getName());
                    try {
                        dataLoader.loadData(cfile.getFile());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private boolean isLocked(Path path) {
        try {
            FileChannel ch = FileChannel.open(path, StandardOpenOption.WRITE);
            FileLock lock = ch.tryLock();
            if (lock != null) {
                lock.release();
                return false;
            }
            return true;
        } catch (IOException e) {
            return true;
        }
    }
}
