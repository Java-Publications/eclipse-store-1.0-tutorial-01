package com.svenruppert.expedition.planner.model.clothes;

import com.svenruppert.expedition.planner.model.Item;

public class Trousers extends Item {

    private int size;
    private String material;


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Trousers{" +
                "size=" + size +
                ", material='" + material + '\'' +
                '}';
    }
}
