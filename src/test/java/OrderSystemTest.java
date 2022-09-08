import org.junit.jupiter.api.Test;
import repo.Menu;
import repo.OrderSystem;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class OrderSystemTest {
    @Test
    void addMenuReturnsRightAddedMenu() {
        //GIVEN
        Menu toTest = new Menu(1,5f,"Pommes Schranke","Pommes","Rot/Weiss","Cola");
        int testKey = 3;
        Map<Integer,Menu> testMap = new HashMap<>();
        testMap.put(1,toTest);

        OrderSystem testSystem =new OrderSystem(testMap);

        //WHEN
        Menu expected = testSystem.addMenu(testKey,toTest);

        //THEN
        assertEquals(new Menu(1,5f,"Pommes Schranke","Pommes","Rot/Weiss","Cola"),expected);
    }
    @Test
    void addMenuAddMenuAlreadyExcsists() {
        //GIVEN
        Menu toTest = new Menu(1,5f,"Pommes Schranke","Pommes","Rot/Weiss","Cola");
        int testKey = 3;
        Map<Integer,Menu> testMap = new HashMap<>();
        testMap.put(testKey,toTest);

        OrderSystem testSystem =new OrderSystem(testMap);

        //WHEN
        try {
            testSystem.addMenu(testKey,toTest);
            fail();
        }
        //THEN
        catch (RuntimeException e) {
        }

    }
    @Test
    void getOrderByIdReturnsRightOrder() {
        //GIVEN
        Menu toTest = new Menu(1,5f,"Pommes Schranke","Pommes","Rot/Weiss","Cola");
        int testKey = 1;
        Map<Integer,Menu> testMap = new HashMap<>();
        testMap.put(testKey,toTest);

        OrderSystem testSystem =new OrderSystem(testMap);

        //WHEN
        Menu expected = testSystem.getOrderById(testKey);

        //THEN
        assertEquals(toTest,expected);
    }
}
