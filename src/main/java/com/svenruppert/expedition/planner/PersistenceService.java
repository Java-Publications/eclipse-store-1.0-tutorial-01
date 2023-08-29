package com.svenruppert.expedition.planner;

import com.svenruppert.expedition.planner.model.Item;
import com.svenruppert.expedition.planner.model.ItemConfiguration;
import org.eclipse.store.storage.embedded.types.EmbeddedStorage;
import org.eclipse.store.storage.embedded.types.EmbeddedStorageManager;
import org.rapidpm.dependencies.core.logger.HasLogger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class PersistenceService implements HasLogger {

    private static final PersistenceService persistenceService = new PersistenceService();
    private volatile EmbeddedStorageManager storageManager;

    private PersistenceService() {
        logger().info("Started the Storage Manager Constructor");
        initService();
    }

    public static PersistenceService instance() {
        return persistenceService;
    }

    private synchronized void initService() {
        if (storageManager != null) logger().warning("StorageManager already created..");
        else if (storageManager == null) {
            logger().info("start init StorageManager..");
            try (EmbeddedStorageManager embeddedStorageManager = EmbeddedStorage.start()) {
                this.storageManager = embeddedStorageManager;

                Object root = storageManager.root();
                if (root instanceof HashMap) {
                    logger().info("StorageManager Root : already init.");
                } else {
                    final Map<String, ItemConfiguration> config = new HashMap<>();
                    storageManager.setRoot(config);
                    storageManager.storeRoot();

                }
            } catch (Exception e){
                logger().warning(e.getMessage());
            }
//            Thread rampDown = new Thread(() -> {
//                System.out.println("Shutting Down Persistence Service");
//                storageManager.shutdown();
//            });
//            Runtime.getRuntime().addShutdownHook(rampDown);
        }
    }

    private Map<String, ItemConfiguration> getItemConfigurationMap() {
        return (Map<String, ItemConfiguration>) storageManager.root();
    }

    public Optional<ItemConfiguration> getConfigWithID(String configID) {
        Map<String, ItemConfiguration> configMap = getItemConfigurationMap();
        return Optional.ofNullable(configMap.get(configID));
    }

    public void addOrReplaceItemConfiguration(String configID, ItemConfiguration config) {
        Map<String, ItemConfiguration> configMap = getItemConfigurationMap();
        configMap.put(configID, config);
        storageManager.storeRoot();
    }

    public void deleteConfigurationWithID(String configID) {
        getItemConfigurationMap().remove(configID);
        storageManager.storeRoot();
    }

    public void deleteAllData() {
        getItemConfigurationMap().clear();
        storageManager.storeRoot();
    }

    public void storeItemConfiguration(ItemConfiguration itemConfiguration) {
        storageManager.store(itemConfiguration);
    }

    public void storeItemList(List<Item> itemList) {
        storageManager.store(itemList);
    }

}
