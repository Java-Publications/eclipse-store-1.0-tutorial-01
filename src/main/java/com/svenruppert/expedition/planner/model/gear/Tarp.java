package com.svenruppert.expedition.planner.model.gear;

import com.svenruppert.expedition.planner.model.Item;

public class Tarp extends Item {

    private int length;
    private int width;
    private String colorPattern;


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
        return "Tarp{" +
                "length=" + length +
                ", width=" + width +
                ", colorPattern='" + colorPattern + '\'' +
                '}';
    }
}
