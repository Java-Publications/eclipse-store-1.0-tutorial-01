package com.svenruppert.expedition.planner.model.gear;

import com.svenruppert.expedition.planner.model.Item;

public class Knive extends Item {

    private boolean conform42A;

    public boolean isConform42A() {
        return conform42A;
    }

    public void setConform42A(boolean conform42A) {
        this.conform42A = conform42A;
    }

    @Override
    public String toString() {
        return "Knive{" +
                "conform42A=" + conform42A +
                '}';
    }
}
