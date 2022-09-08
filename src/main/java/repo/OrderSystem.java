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
        System.out.println(menus.get(orderNumber));
        return menus.get(orderNumber);
    }
}