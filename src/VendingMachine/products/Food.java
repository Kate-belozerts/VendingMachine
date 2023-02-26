package VendingMachine.products;

public class Food extends Product {
    public Food(String name, double price) {
        super(name, price);
    }
    @Override
    public String toString() {
        return "\nThe product is: " +
                "name - " + super.getName() +
                ", price - " + super.getPrice();
    }
}
