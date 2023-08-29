package com.svenruppert.expedition.planner.model.gear;

import com.svenruppert.expedition.planner.model.Item;
import com.svenruppert.expedition.planner.model.InsulationMaterial;

public class SleepingBag extends Item {

    private InsulationMaterial insulationMaterial;
    private double minComfortTemperature;
    private double maxComfortTemperature;
    private double minExtremeTemperature;

    private int length;


    public InsulationMaterial getInsulationMaterial() {
        return insulationMaterial;
    }

    public void setInsulationMaterial(InsulationMaterial insulationMaterial) {
        this.insulationMaterial = insulationMaterial;
    }

    public double getMinComfortTemperature() {
        return minComfortTemperature;
    }

    public void setMinComfortTemperature(double minComfortTemperature) {
        this.minComfortTemperature = minComfortTemperature;
    }

    public double getMaxComfortTemperature() {
        return maxComfortTemperature;
    }

    public void setMaxComfortTemperature(double maxComfortTemperature) {
        this.maxComfortTemperature = maxComfortTemperature;
    }

    public double getMinExtremeTemperature() {
        return minExtremeTemperature;
    }

    public void setMinExtremeTemperature(double minExtremeTemperature) {
        this.minExtremeTemperature = minExtremeTemperature;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "SleepingBag{" +
                "insulationMaterial=" + insulationMaterial +
                ", minComfortTemperature=" + minComfortTemperature +
                ", maxComfortTemperature=" + maxComfortTemperature +
                ", minExtremeTemperature=" + minExtremeTemperature +
                ", length=" + length +
                '}';
    }
}
