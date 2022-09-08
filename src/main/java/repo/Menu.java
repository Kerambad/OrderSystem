package repo;

import java.util.Objects;

public class Menu {
    private int menuNumber;
    private float price;
    private String menuName;
    //TODO: Change to specific Object
    private String mainDish;
    private String sideDish;
    private String beverage;

    public Menu() {
    }

    public Menu(int menuNumber, float price, String menuName, String mainDish, String sideDish, String beverage) {
        this.menuNumber = menuNumber;
        this.price = price;
        this.menuName = menuName;
        this.mainDish = mainDish;
        this.sideDish = sideDish;
        this.beverage = beverage;
    }

    public int getMenuNumber() {
        return menuNumber;
    }

    public void setMenuNumber(int menuNumber) {
        this.menuNumber = menuNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMainDish() {
        return mainDish;
    }

    public void setMainDish(String mainDish) {
        this.mainDish = mainDish;
    }

    public String getSideDish() {
        return sideDish;
    }

    public void setSideDish(String sideDish) {
        this.sideDish = sideDish;
    }

    public String getBeverage() {
        return beverage;
    }

    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Menu menu = (Menu) o;

        if (menuNumber != menu.menuNumber) return false;
        if (Float.compare(menu.price, price) != 0) return false;
        if (!Objects.equals(menuName, menu.menuName)) return false;
        if (!Objects.equals(mainDish, menu.mainDish)) return false;
        if (!Objects.equals(sideDish, menu.sideDish)) return false;
        return Objects.equals(beverage, menu.beverage);
    }

    @Override
    public int hashCode() {
        int result = menuNumber;
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        result = 31 * result + (menuName != null ? menuName.hashCode() : 0);
        result = 31 * result + (mainDish != null ? mainDish.hashCode() : 0);
        result = 31 * result + (sideDish != null ? sideDish.hashCode() : 0);
        result = 31 * result + (beverage != null ? beverage.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuNumber=" + menuNumber +
                ", price=" + price +
                ", menuName='" + menuName + '\'' +
                ", mainDish='" + mainDish + '\'' +
                ", sideDish='" + sideDish + '\'' +
                ", beverage='" + beverage + '\'' +
                '}';
    }
}
