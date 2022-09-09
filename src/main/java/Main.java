import repo.*;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Main {

    //TODO: add input Scanner
    //TODO: Try safe Menus in File




    public static void main(String[] args) {

        Menu menu1 = new Menu(1, 8.25f,"Big Breakfast", "Buns + Jam", "Fryed Egg", "Americano");
        Menu menu2 = new Menu(2, 5.99f,"LabourLunch", "Sausages with Coleslaw", "Bun", "Coke");
        Menu menu3 = new Menu(3, 2.99f,"HotDog", "Buns + Sausage", "Rosted Onions", "-");

        Map<Integer,Menu> menus = new HashMap<>();
        menus.put(1, menu1);
        menus.put(2, menu2);
        menus.put(3, menu3);

        OrderSystem system = new OrderSystem(menus);

        try {
            system.placeOrder();
        }
        catch (NoSuchElementException e) {
            //TODO: methods with e.
            System.out.println(e.getMessage());
            main(null);
        }
    }
}
