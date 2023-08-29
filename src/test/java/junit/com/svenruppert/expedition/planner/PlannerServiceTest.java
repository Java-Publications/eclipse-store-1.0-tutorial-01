package junit.com.svenruppert.expedition.planner;

import com.svenruppert.expedition.planner.PersistenceService;
import com.svenruppert.expedition.planner.PlannerService;
import com.svenruppert.expedition.planner.model.ItemConfiguration;
import com.svenruppert.expedition.planner.model.PriceCurrency;
import com.svenruppert.expedition.planner.model.gear.Tarp;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlannerServiceTest {

    public static final String CONFIG_ID = "PlannerServiceTest";
    public static final String ITEM_LIST = "ItemList";
    private PersistenceService persistenceService;

    @BeforeEach
    void setUp() {
        persistenceService = PersistenceService.instance();
        //persistenceService.deleteAllData();
        ItemConfiguration config = new ItemConfiguration();
        config.addNewList(ITEM_LIST);
        persistenceService.addOrReplaceItemConfiguration(CONFIG_ID, config);
    }

    @AfterEach
    void tearDown() {
//        if(persistenceService != null ) persistenceService.deleteAllData();
    }

    @Test
    void addNewItem() {
        PlannerService service = new PlannerService(CONFIG_ID);

        Tarp tarp = new Tarp();
        tarp.setLength(300);
        tarp.setWidth(300);
        tarp.setColorPattern("green");
        tarp.setPrice(22.0);
        tarp.setPriceCurrency(PriceCurrency.EUR);
        tarp.setProductName("Super Cool Tarp");
        tarp.setWeight(800);

        service.addNewItem(ITEM_LIST, tarp);



    }

    //@Test
    void removeItem() {
    }

    //@Test
    void getItemList() {
    }
}