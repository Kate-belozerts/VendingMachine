package VendingMachine.machines;

import VendingMachine.products.Drink;


public class DrinkMachine extends Machine<Drink> {

    public DrinkMachine(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "This drink machine with drinks contains: \n" +
                super.products + "\n";
    }
}
