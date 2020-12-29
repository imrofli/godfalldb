package org.imrofli.godfall.helpers;

import java.io.File;

public final class DataHelper {

    private static File datasetPath;

    public static File getDatasetPath() {
        return datasetPath;
    }

    public static void setDatasetPath(File datasetPath) {
        DataHelper.datasetPath = datasetPath;
    }
}
