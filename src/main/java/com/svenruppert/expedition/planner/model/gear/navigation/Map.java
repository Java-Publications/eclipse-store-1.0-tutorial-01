package com.svenruppert.expedition.planner.model.gear.navigation;

import com.svenruppert.expedition.planner.model.Item;

public class Map extends Item {

    private String scale;
    private String mapIdentifier;
    private String mapType; //enum extrahieren

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getMapIdentifier() {
        return mapIdentifier;
    }

    public void setMapIdentifier(String mapIdentifier) {
        this.mapIdentifier = mapIdentifier;
    }

    public String getMapType() {
        return mapType;
    }

    public void setMapType(String mapType) {
        this.mapType = mapType;
    }

    @Override
    public String toString() {
        return "Map{" +
                "scale='" + scale + '\'' +
                ", mapIdentifier='" + mapIdentifier + '\'' +
                ", mapType='" + mapType + '\'' +
                '}';
    }
}
