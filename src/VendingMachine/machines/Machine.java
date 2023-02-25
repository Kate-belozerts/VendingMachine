package VendingMachine.machines;

import VendingMachine.products.Product;

import java.util.ArrayList;

public class Machine<T extends Product> {
    private final String name;
    protected ArrayList<T> products;

    public Machine(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(T item) {
        products.add(item);
    }

    public T getProductByName(String name) {
        name = name.toLowerCase();
        for (T product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public ArrayList<T> getAllProducts() {
        return this.products;
    }

    @Override
    public String toString() {
        return "This machine contains: \n" + products + "\n";
    }
}
