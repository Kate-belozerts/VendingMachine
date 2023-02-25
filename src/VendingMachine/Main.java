package VendingMachine;

import VendingMachine.machines.DrinkMachine;
import VendingMachine.machines.HotDrinkVendingMachine;
import VendingMachine.machines.Machine;
import VendingMachine.products.Drink;
import VendingMachine.products.HotDrink;
import VendingMachine.products.Product;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int count = 5;

        DrinkMachine<Drink> drinkMachine = createDrinkMachine(count);
//        Machine<Product> productMachine = createMachine(count);
//        HotDrinkVendingMachine<HotDrink> hotDrinkMachine = createHotDrinkMachine(count);


        //Для экспериментов:
        Product snickers = new Product("Snickers", 70);
        Drink cola = new Drink("Coca-cola", 80, 500);
        HotDrink tea = new HotDrink("Green tea", 200, 500, 90);

//        drinkMachine.addProduct(snickers);
        drinkMachine.addProduct(cola);
//        drinkMachine.addProduct(tea);

//        hotDrinkMachine.addHotDrink(tea);
//        hotDrinkMachine.addHotDrink(cola);
//        hotDrinkMachine.addHotDrink(snickers);

        System.out.println(drinkMachine.getProductByName("Coca-cola"));
//        System.out.println(hotDrinkMachine.getHotDrink("Green tea", 500, 90));
//        System.out.println(hotDrinkMachine.getHotDrinkByName("Green tea"));

        System.out.println(drinkMachine);
    }

    static DrinkMachine<Drink> createDrinkMachine(int count) {
        String[] collectionOfDrinks = new String[]{"Coca-cola", "Juice", "Cold tea", "Sprite", "Vine"};
        DrinkMachine<Drink> drinkMachine = new DrinkMachine<>(" ");

        for (int i = 0; i < count; i++) {
            drinkMachine.addProduct(new Drink(collectionOfDrinks[new Random().nextInt(collectionOfDrinks.length)],
                    new Random().nextInt(500), new Random().nextInt(1000)));
        }
        System.out.println(drinkMachine.getAllProducts());
        return drinkMachine;
    }

    static Machine<Product> createMachine(int count) {
        String[] collectionOfProducts = new String[]{"Mars", "Snickers", "Nuts", "M&Ms"};
        Machine<Product> machine = new Machine<>(" ");

        for (int i = 0; i < count; i++) {
            machine.addProduct(new Product(collectionOfProducts[new Random().nextInt(collectionOfProducts.length)],
                    new Random().nextInt(150)));
        }
        System.out.println(machine.getAllProducts());
        return machine;
    }

    static HotDrinkVendingMachine<HotDrink> createHotDrinkMachine(int count) {
        String[] collectionOfHotDrinks = new String[]{"Green tea", "Black tea", "Red tea", "Milk oolong", "Coffee"};
        HotDrinkVendingMachine<HotDrink> hotDrinkMachine = new HotDrinkVendingMachine<>(" ");
        Random rnd = new Random();

        for (int i = 0; i < count; i++) {
            int bound = rnd.nextInt(collectionOfHotDrinks.length);
            hotDrinkMachine.addHotDrink(new HotDrink(collectionOfHotDrinks[bound],
                    new Random().nextInt(200), new Random().nextInt(500),
                    new Random().nextInt(300)));
        }
        System.out.println(hotDrinkMachine.getAllProducts());
        return hotDrinkMachine;
    }
}
