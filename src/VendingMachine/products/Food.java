package VendingMachine.products;


public class Food extends Product implements NewMachine {
    public Food(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "\nFood : " +
                "name - " + super.getName() +
                ", price - " + super.getPrice();
    }
}
