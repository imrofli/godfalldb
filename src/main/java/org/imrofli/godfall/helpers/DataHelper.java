package org.imrofli.godfall.helpers;

public final class DataHelper {

    private static String datasetPath;

    public static String getDatasetPath() {
        return datasetPath;
    }

    public static void setDatasetPath(String datasetPath) {
        DataHelper.datasetPath = datasetPath;
    }
}
