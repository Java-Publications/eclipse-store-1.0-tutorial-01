package junit.com.svenruppert.model;

import com.svenruppert.expedition.planner.model.Item;
import com.svenruppert.expedition.planner.model.ItemConfiguration;
import com.svenruppert.expedition.planner.model.PriceCurrency;
import com.svenruppert.expedition.planner.model.food.Food;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class ItemConfigurationTest {


    @Test
    void test001() {
        ItemConfiguration config = new ItemConfiguration();
        config.init();
        final String key = "key";
        assertFalse(config.containsItemList(key));

        config.addNewList(key);
        assertTrue(config.containsItemList(key));

        config.removeItemList(key);
        assertFalse(config.containsItemList(key));
    }


    @Test
    void test002() {
        ItemConfiguration config = new ItemConfiguration();
        config.init();
        final String key = "key";

        config.addNewList(key);
        Optional<List<Item>> optional = config.getItemList(key);
        assertTrue(optional.isPresent());
        List<Item> itemList = optional.get();
        assertTrue(itemList.isEmpty());

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
        food.setKcalInTotal(food.getKcalPerHundredGramm() * food.getWeight()/100);

        itemList.add(food);


        List<Item> items = config.getItemList(key).get();
        assertTrue(items.size() == 1);
        Food item = (Food)items.get(0);

        assertEquals(item, food);

        config.removeItemList(key);
        assertFalse(config.containsItemList(key));
    }
}
