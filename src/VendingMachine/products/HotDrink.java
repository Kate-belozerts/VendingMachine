package VendingMachine.products;

public class HotDrink extends Drink {
    private final int temperature;

    public HotDrink(String name, double price, int volume, int temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "\nThis HotDrink is: " + super.getName() +
                ", volume of cup - " + super.getVolume() +
                ", temperature - " + temperature;
    }
}
