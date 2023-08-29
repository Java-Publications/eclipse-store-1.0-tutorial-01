package junit.com.svenruppert.model;

import com.svenruppert.expedition.planner.model.Item;
import com.svenruppert.expedition.planner.model.ItemConfiguration;
import com.svenruppert.expedition.planner.model.PriceCurrency;
import com.svenruppert.expedition.planner.model.food.Food;
import org.eclipse.store.storage.embedded.types.EmbeddedStorage;
import org.eclipse.store.storage.embedded.types.EmbeddedStorageManager;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ItemConfigurationPersistenceTest {


    public static final String FOOD = "food";

    @Test
    void test001() {

        //init EclipseStore

        ItemConfiguration conf = new ItemConfiguration();

        Food food = new Food();
        food.setProductName("DemoFood 001");
        food.setWeight(250);
        food.setDehydrated(true);
        LocalDate expiryDate = LocalDate.of(2023, 12, 20);
        food.setExpiryDate(expiryDate);
        food.setPrice(10.00);
        food.setPriceCurrency(PriceCurrency.EUR);
        LocalDate priceDate = LocalDate.of(2023, 8, 9);
        food.setPriceDate(priceDate);
        food.setKcalPerHundredGramm(200);
        food.setKcalInTotal(food.getKcalPerHundredGramm() * food.getWeight() / 100);

        conf.addNewList(FOOD);
        conf.getItemList(FOOD).ifPresent(items -> items.add(food));

//store

        // Initialize a storage manager ("the database") with purely defaults.
        try (EmbeddedStorageManager storageManager = EmbeddedStorage.start()) {
            storageManager.setRoot(conf);
            storageManager.storeRoot();
            storageManager.shutdown();
        }

        try (EmbeddedStorageManager storageManager = EmbeddedStorage.start()) {
            ItemConfiguration confReloaded = ( ItemConfiguration) storageManager.root();

            assertTrue(confReloaded.containsItemList(FOOD));
            Optional<List<Item>> itemListReloaded = confReloaded.getItemList(FOOD);
            itemListReloaded.get().forEach(System.out::println);


            storageManager.shutdown();
        }


    }
}
