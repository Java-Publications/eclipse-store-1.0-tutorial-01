package com.svenruppert.expedition.planner.model.gear;

import com.svenruppert.expedition.planner.model.Item;

public class Line extends Item {

    private int length;
    private String color;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    private String material;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Line{" +
                "length=" + length +
                "color=" + color +
                "material=" + material +
                '}';
    }
}
