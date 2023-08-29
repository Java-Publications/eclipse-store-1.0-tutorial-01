package com.svenruppert.expedition.planner;


import com.svenruppert.expedition.planner.model.Item;
import com.svenruppert.expedition.planner.model.ItemConfiguration;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class PlannerService {

    private final PersistenceService persistenceService = PersistenceService.instance();

    private final String configID;

    public PlannerService(String configID) {
        this.configID = configID;
    }

    /**
     * @param itemListID id of the itemList the item should be added too. For example, food.
     */
    public void addNewItem(String itemListID, Item itemToAdd) {
        Optional<ItemConfiguration> configWithID = persistenceService.getConfigWithID(configID);
        configWithID
                .flatMap(itemConfig -> itemConfig.getItemList(itemListID))
                .ifPresent(itemList -> {
                    itemList.add(itemToAdd);
                    persistenceService.storeItemList(itemList);
                });
    }

    public void removeItem(String itemListID, Item itemToRemove){
        persistenceService.getConfigWithID(configID)
                .flatMap(itemConfig -> itemConfig.getItemList(itemListID))
                .ifPresent(itemList -> {
                    itemList.remove(itemToRemove);
                    persistenceService.storeItemList(itemList);
                });
    }

    public <E extends Item> List<E> getItemList(String itemListID){
        return persistenceService.getConfigWithID(configID)
                .flatMap(itemConfig -> itemConfig.<E>getItemList(itemListID))
                .orElseGet(Collections::emptyList);
    }

}
