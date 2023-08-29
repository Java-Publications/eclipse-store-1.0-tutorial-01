package com.svenruppert.expedition.planner.model.gear;

import com.svenruppert.expedition.planner.model.Item;

public class Saw extends Item {

    private int sawBladeLength;

    private boolean foldable;

    public int getSawBladeLength() {
        return sawBladeLength;
    }

    public void setSawBladeLength(int length) {
        this.sawBladeLength = length;
    }

    public boolean isFoldable() {
        return foldable;
    }

    public void setFoldable(boolean foldable) {
        this.foldable = foldable;
    }

    @Override
    public String toString() {
        return "Saw{" +
                "sawBladeLength=" + sawBladeLength +
                ", foldable=" + foldable +
                '}';
    }
}
