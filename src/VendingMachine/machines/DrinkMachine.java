package VendingMachine.machines;

import VendingMachine.products.Product;


public class DrinkMachine<Drink extends Product> extends Machine<Drink> {

    public DrinkMachine(String name) {
        super(name.toLowerCase());
    }

    @Override
    public String toString() {
        return "This drink machine with drinks contains: \n" +
                super.products + "\n";
    }
}
