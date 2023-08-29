package com.svenruppert.expedition.planner.model.clothes;

import com.svenruppert.expedition.planner.model.InsulationMaterial;

public class ThermalPants extends Trousers {


    private InsulationMaterial insulationMaterial;
    private double minComfortTemperature;
    private double maxComfortTemperature;
    private double minExtremeTemperature;

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

    @Override
    public String toString() {
        return "ThermalPants{" +
                "insulationMaterial=" + insulationMaterial +
                ", minComfortTemperature=" + minComfortTemperature +
                ", maxComfortTemperature=" + maxComfortTemperature +
                ", minExtremeTemperature=" + minExtremeTemperature +
                '}';
    }
}
