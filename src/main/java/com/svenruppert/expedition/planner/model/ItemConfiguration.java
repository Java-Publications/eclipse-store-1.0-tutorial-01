package com.svenruppert.expedition.planner.model;

import java.util.*;

public class ItemConfiguration {

    private Map<String, List<Item>> itemMap;

    public void addNewList(String name) {
        if (itemMap == null) init();
        itemMap.computeIfAbsent(name, s -> new ArrayList<>());
    }

    public void removeItemList(String name) {
        if (itemMap != null) itemMap.remove(name);
    }

    public boolean containsItemList(String name) {
        if (itemMap == null) return false;
        return itemMap.containsKey(name);
    }

    public <E extends Item> Optional<List<E>> getItemList(String name) {
        if (itemMap != null)
            return itemMap.containsKey(name)
                    ? Optional.of((List<E>) itemMap.get(name))
                    : Optional.empty();
        else return Optional.empty();
    }

    public void init() {
        itemMap = new HashMap<>();
    }

    public Map<String, List<Item>> itemMap() {
        return itemMap;
    }

}
