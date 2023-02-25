package VendingMachine.products;

import VendingMachine.products.Product;

public class Drink extends Product {
    private final int volume;

    public Drink(String name, double price, int volume) {
        super(name, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void consume() {
        System.out.println("Напиток выпит");
    }

    @Override
    public String toString() {
        return "\nDrink is: " + super.getName() +
                ", volume of bottle - " + volume +
                ", price - " + super.getPrice();
    }
}
