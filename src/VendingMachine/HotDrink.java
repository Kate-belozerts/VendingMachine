package VendingMachine;

public class HotDrink extends Drink {
    private int temperature;

    public HotDrink(String name, double price, int volume, int temperature) {
        super(name.toLowerCase(), price, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "This HotDrink is: " + super.getName() +
                ", volume of cup - " + super.getVolume() +
                ", temperature=" + temperature;
    }
}
