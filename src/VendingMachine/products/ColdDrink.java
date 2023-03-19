package VendingMachine.products;

public class ColdDrink extends Drink implements NewMachine {
    public ColdDrink(String name, double price, int volume) {
        super(name, price, volume);
    }

    @Override
    public String toString() {
        return "\nCold Drink: " + super.getName() +
                ", price - " + super.getPrice() +
                ", volume of bottle - " + super.getVolume();
    }
}
