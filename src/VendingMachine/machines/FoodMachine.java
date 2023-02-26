package VendingMachine.machines;

import VendingMachine.products.Food;

public class FoodMachine extends Machine<Food> {
    public FoodMachine(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return "This machine contains: \n" + super.products + "\n";
    }
}
