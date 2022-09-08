package repo;

import java.util.Map;

public class OrderSystem {
    private Map<Integer,Menu> menus;

    public OrderSystem() {
    }

    public OrderSystem(Map<Integer, Menu> menus) {
        this.menus = menus;
    }

    public Menu addMenu(int key, Menu menu) {
        if (menus.containsKey(key)) {
            throw new RuntimeException("Menu already exists.");
        }
        else {
            menus.put(key, menu);
        }

        return menus.get(key);
    }
    
    public Menu getOrderById(int orderNumber) {
        return menus.get(orderNumber);
    }

    public float placeOrder(int menuNumber) {
        float price = getOrderById(menuNumber).getPrice();
        String articel =
                "Main: " + getOrderById(menuNumber).getMainDish()
                + "\nSides: " + getOrderById(menuNumber).getSideDish()
                + "\nBeverage: " + getOrderById(menuNumber).getBeverage()
                + "\nPrice: " + price;
        System.out.println(articel);
        return price;
    }
}