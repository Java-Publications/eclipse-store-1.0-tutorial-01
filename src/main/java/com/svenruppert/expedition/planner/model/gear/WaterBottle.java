package com.svenruppert.expedition.planner.model.gear;

import com.svenruppert.expedition.planner.model.Item;

public class WaterBottle extends Item {

    private int volume;
    private String material;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "WaterBottle{" +
                "volume=" + volume +
                ", material=" + material +
                '}';
    }
}
