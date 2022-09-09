package repo;

import java.util.Map;
import java.util.NoSuchElementException;

public class OrderSystem {
    private Map<Integer,Menu> menus;

    public OrderSystem() {
    }

    public OrderSystem(Map<Integer, Menu> menus) {
        this.menus = menus;
    }

    public Menu addMenu(int key, Menu menu) {
        if (menus.containsKey(key)) {
            throw new RuntimeException("Menu Id already exists.");
        }
        else {
            menus.put(key, menu);
        }

        return menus.get(key);
    }
    
    public Menu getOrderById(int orderNumber) {
        return menus.get(orderNumber);
    }

    public float placeOrder() {
        int menuNumber = OrderSystemIO.intInput("Enter Article Id: ");
        float price;
        try {
            price = getOrderById(menuNumber).getPrice();
        }
        catch (NullPointerException e) {
            throw new NoSuchElementException("Menu Id dosen't exsists.");

        }
        String articel =
                "Main: " + getOrderById(menuNumber).getMainDish()
                + "\nSides: " + getOrderById(menuNumber).getSideDish()
                + "\nBeverage: " + getOrderById(menuNumber).getBeverage()
                + "\nPrice: " + price + "\u20AC";
        System.out.println(articel);
        return price;
    }
}