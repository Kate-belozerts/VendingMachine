package VendingMachine.products;

public class HotDrink {
    private final String name;
    private final double price;
    private final int temperature;
    private final int volume;


    public HotDrink(String name, double price, int volume, int temperature) {
        this.name = name.toLowerCase();
        this.price = price;
        this.volume = volume;
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "\nThis HotDrink is: " + name +
                ", volume of cup - " + volume +
                ", temperature - " + temperature;
    }
}
