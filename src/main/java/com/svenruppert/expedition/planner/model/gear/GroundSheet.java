package com.svenruppert.expedition.planner.model.gear;

import com.svenruppert.expedition.planner.model.Item;

public class GroundSheet extends Item {

    private int length;
    private int width;
    private String colorPattern;

    private boolean waterproof;


    public boolean isWaterproof() {
        return waterproof;
    }

    public void setWaterproof(boolean waterproof) {
        this.waterproof = waterproof;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getColorPattern() {
        return colorPattern;
    }

    public void setColorPattern(String colorPattern) {
        this.colorPattern = colorPattern;
    }


    @Override
    public String toString() {
        return "GroundSheet{" +
                "length=" + length +
                ", width=" + width +
                ", colorPattern='" + colorPattern + '\'' +
                ", waterproof=" + waterproof +
                '}';
    }


}
