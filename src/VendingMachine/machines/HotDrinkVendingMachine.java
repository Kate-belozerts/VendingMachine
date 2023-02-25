package VendingMachine.machines;

import VendingMachine.products.HotDrink;

import java.util.ArrayList;

public class HotDrinkVendingMachine<T extends HotDrink> {
    private final String name;
    protected ArrayList<T> hotDrinks;

    public HotDrinkVendingMachine(String name) {
        this.name = name.toLowerCase();
        this.hotDrinks = new ArrayList<>();
    }

    public void addHotDrink(T hot) {
        hotDrinks.add(hot);
    }

    public HotDrink getHotDrink(String name, int volume, int temperature) {
        name = name.toLowerCase();
        for (HotDrink product : hotDrinks) {
            if (product.getName().equals(name) &&
                    product.getVolume() == volume &&
                    product.getTemperature() == temperature)
                return product;
        }
        return null;
    }

    public T getHotDrinkByName(String name) {
        name = name.toLowerCase();
        for (T product : hotDrinks) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public ArrayList<T> getAllProducts() {
        return this.hotDrinks;
    }

    @Override
    public String toString() {
        return "This machine with hot drinks contains: \n" +
                hotDrinks + "\n";
    }
}
