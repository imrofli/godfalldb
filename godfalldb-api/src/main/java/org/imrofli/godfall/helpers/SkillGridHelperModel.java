package org.imrofli.godfall.helpers;

public class SkillGridHelperModel {
    private Integer gridX;
    private Integer gridY;

    public SkillGridHelperModel(Integer gridX, Integer gridY) {
        this.gridX = gridX;
        this.gridY = gridY;
    }

    public Integer getGridX() {
        return gridX;
    }

    public void setGridX(Integer gridX) {
        this.gridX = gridX;
    }

    public Integer getGridY() {
        return gridY;
    }

    public void setGridY(Integer gridY) {
        this.gridY = gridY;
    }
}
