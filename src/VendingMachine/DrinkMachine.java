package VendingMachine;

import java.util.ArrayList;

public class DrinkMachine extends Machine {
    private ArrayList<Drink> drinks;

    public DrinkMachine(String name) {
        super(name.toLowerCase());
        drinks = new ArrayList<>();
    }

    public void addDrink(Drink item) {
        drinks.add(item);
    }

    public ArrayList<Drink> getDrinks() {
        return drinks;
    }

    @Override
    public String toString() {
        return "This Machine with drinks contains: " + drinks;
    }
}
