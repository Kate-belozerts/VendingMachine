package VendingMachine;

import java.util.ArrayList;

public class Machine {
    private String name;
    protected ArrayList<Product> products;

    public Machine(String name) {
        this.name = name.toLowerCase();
        this.products = new ArrayList<>();
    }

    public void addProduct(Product item) {
        products.add(item);
    }

    public Product getProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public Product getProduct(String name, int volume, int temperature) {
        name = name.toLowerCase();
        for (Product product : products) {
            if (product instanceof HotDrink) {
                HotDrink ht = (HotDrink) product;
                if (ht.getName().equals(name) &&
                        ht.getVolume() == volume &&
                        ht.getTemperature() == temperature)
                    return ht;
            }
        }
        return null;
    }

    public ArrayList<Product> getAllProducts() {
        return this.products;
    }

    @Override
    public String toString() {
        return "Main Machine contains: " +
                "name - " + name +
                ", products - " + products;
    }
}
