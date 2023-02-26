package VendingMachine;

import VendingMachine.machines.DrinkMachine;
import VendingMachine.machines.FoodMachine;
import VendingMachine.machines.HotDrinkVendingMachine;
import VendingMachine.machines.Machine;
import VendingMachine.products.ColdDrink;
import VendingMachine.products.Food;
import VendingMachine.products.HotDrink;
import VendingMachine.products.Product;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int count = 5;

//        DrinkMachine coldDrinkMachine = createDrinkMachine(count);
//        HotDrinkVendingMachine hotDrinkMachine = createHotDrinkMachine(count);
        FoodMachine foodMachine = createFoodMachine(count);
//        Machine<Product> productMachine = createMachine(count);


        //Для экспериментов:
        Food snickers = new Food("Snickers", 70);
        ColdDrink cola = new ColdDrink("Coca-cola", 80, 500);
        HotDrink tea = new HotDrink("Green tea", 200, 500, 90);

        foodMachine.addProduct(snickers);
//        foodMachine.addProduct(cola);
//        foodMachine.addProduct(tea);

        System.out.println(foodMachine.getProductByName("Coca-cola"));
//        System.out.println(hotDrinkMachine.getHotDrink("Green tea", 500, 90));

        System.out.println(foodMachine);
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
