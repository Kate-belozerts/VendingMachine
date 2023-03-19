package VendingMachine;

import VendingMachine.machines.*;
import VendingMachine.products.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        MixedMachine mixedMachine = createMixedMachine();

        Food snickers = new Food("Snickers", 70);
        ColdDrink cola = new ColdDrink("Coca-cola", 80, 500);
        HotDrink tea = new HotDrink("Green tea", 200, 500, 90);
        Drink vine = new Drink("vine", 100, 100);
        Product product = new Product("something", 50000);

        mixedMachine.addProduct(snickers);
        mixedMachine.addProduct(cola);
        mixedMachine.addProduct(tea);
        mixedMachine.addProduct(vine);
        mixedMachine.addProduct(product);
        mixedMachine.addProduct(new ColdDrink("Gin", 100, 50));
        mixedMachine.addProduct(new Food("hamburger", 100));

        System.out.println(mixedMachine);
    }

    static MixedMachine createMixedMachine() {
        MixedMachine mixedMachine = new MixedMachine("machine");
        return mixedMachine;
    }

    static DrinkMachine createDrinkMachine(int count) {
        String[] collectionOfDrinks = new String[]{"Coca-cola", "Juice", "Cold tea", "Sprite", "Vine"};
        DrinkMachine drinkMachine = new DrinkMachine(" ");

        for (int i = 0; i < count; i++) {
            drinkMachine.addProduct(new ColdDrink(collectionOfDrinks[new Random().nextInt(collectionOfDrinks.length)],
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

    static HotDrinkVendingMachine createHotDrinkMachine(int count) {
        String[] collectionOfHotDrinks = new String[]{"Green tea", "Black tea", "Red tea", "Milk oolong", "Coffee"};
        HotDrinkVendingMachine hotDrinkMachine = new HotDrinkVendingMachine(" ");
        Random rnd = new Random();

        for (int i = 0; i < count; i++) {
            int bound = rnd.nextInt(collectionOfHotDrinks.length);
            hotDrinkMachine.addProduct(new HotDrink(collectionOfHotDrinks[bound],
                    new Random().nextInt(200), new Random().nextInt(500),
                    new Random().nextInt(300)));
        }
        System.out.println(hotDrinkMachine.getAllProducts());
        return hotDrinkMachine;
    }

    static FoodMachine createFoodMachine(int count) {
        String[] collectionOfProducts = new String[]{"Mars", "Snickers", "Nuts", "M&Ms"};
        FoodMachine foodMachine = new FoodMachine(" ");

        for (int i = 0; i < count; i++) {
            foodMachine.addProduct(new Food(collectionOfProducts[new Random().nextInt(collectionOfProducts.length)],
                    new Random().nextInt(150)));
        }
        System.out.println(foodMachine.getAllProducts());
        return foodMachine;
    }
}
