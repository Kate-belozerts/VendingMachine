package VendingMachine.machines;

import VendingMachine.products.HotDrink;

public class HotDrinkVendingMachine extends Machine<HotDrink> {

    public HotDrinkVendingMachine(String name) {
        super(name.toLowerCase());
    }

    public HotDrink getHotDrink(String name, int volume, int temperature) {
        name = name.toLowerCase();
        for (HotDrink product : super.products) {
            if (product.getName().equals(name) &&
                    product.getVolume() == volume &&
                    product.getTemperature() == temperature)
                return product;
        }
        return null;
    }

    @Override
    public String toString() {
        return "This machine with hot drinks contains: \n" +
                super.products + "\n";
    }
}
