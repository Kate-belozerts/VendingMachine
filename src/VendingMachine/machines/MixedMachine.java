package VendingMachine.machines;

import VendingMachine.products.NewMachine;
import VendingMachine.products.Product;

public class MixedMachine extends Machine<Product> {
    public MixedMachine(String name) {
        super(name);
    }

    //____________________Маркерные интерфесы___________________________
    @Override
    public void addProduct(Product item) {
        if (item instanceof NewMachine) {
            super.addProduct(item);
        }
    }

    // ____________________ENUM__________________________________________
//    @Override
//    public void addProduct(Product item) {
//        try {
//            EnumSortMachine.valueOf(item.getName().toLowerCase());
//            super.addProduct(item);
//        } catch (IllegalArgumentException e) {
//            System.out.println("Этот продукт не подходит для этой машины");
//        }
//    }

    @Override
    public String toString() {
        return "MixedMachine contains products:" + super.products;
    }
}
