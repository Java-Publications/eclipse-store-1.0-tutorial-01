package com.svenruppert.expedition.planner.model.gear.navigation;

import com.svenruppert.expedition.planner.model.Item;

public class GPS extends Item {

    private String batteryType;
    private int batteryAmount;
    private int runtimeDurationPerBatteryPack;


    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    public int getBatteryAmount() {
        return batteryAmount;
    }

    public void setBatteryAmount(int batteryAmount) {
        this.batteryAmount = batteryAmount;
    }

    public int getRuntimeDurationPerBatteryPack() {
        return runtimeDurationPerBatteryPack;
    }

    public void setRuntimeDurationPerBatteryPack(int runtimeDurationPerBatteryPack) {
        this.runtimeDurationPerBatteryPack = runtimeDurationPerBatteryPack;
    }

    @Override
    public String toString() {
        return "GPS{" +
                "batteryType='" + batteryType + '\'' +
                ", batteryAmount=" + batteryAmount +
                ", runtimeDurationPerBatteryPack=" + runtimeDurationPerBatteryPack +
                '}';
    }
}
