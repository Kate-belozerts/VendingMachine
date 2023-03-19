package VendingMachine.machines;

import VendingMachine.products.ColdDrink;


public class DrinkMachine extends Machine<ColdDrink> {

    public DrinkMachine(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "This drink machine with drinks contains: \n" +
                super.products + "\n";
    }
}
