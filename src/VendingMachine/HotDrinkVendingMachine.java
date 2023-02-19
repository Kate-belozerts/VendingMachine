package VendingMachine;

import java.util.ArrayList;

public class HotDrinkVendingMachine extends Machine {
    private ArrayList<HotDrink> allHotDrinks;

    public HotDrinkVendingMachine(String name) {
        super(name.toLowerCase());
        this.allHotDrinks = new ArrayList<>();
    }

    public void addHotDrink(HotDrink hot) {
        allHotDrinks.add(hot);
    }

    @Override
    public String toString() {
        return "This VendingMachine with hot drinks contains: " +
                allHotDrinks;
    }
}
