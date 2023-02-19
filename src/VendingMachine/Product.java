package VendingMachine;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name.toLowerCase();
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void consume() {
        System.out.println("Продукт потреблен");
    }

    @Override
    public String toString() {
        return "The product is: " +
                "name - " + name +
                ", price - " + price;
    }
}
