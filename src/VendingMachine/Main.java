package VendingMachine;

public class Main {
    public static void main(String[] args) {
        Product mars = new Product("Mars", 90);
        Product snickers = new Product("Snickers", 70);
        Drink cola = new Drink("Coca-cola", 80, 500);
        Drink sprite = new Drink("Sprite", 50, 250);
        HotDrink tea = new HotDrink("Green tea", 200, 500, 90);
        HotDrink coffee = new HotDrink("Coffee", 350, 200, 80);
        HotDrink blackTea = new HotDrink("Black tea", 150, 300, 95);

        Machine allMixedProducts = new Machine("firstMachine");
        HotDrinkVendingMachine hotDrinks = new HotDrinkVendingMachine("secondMachine");

        hotDrinks.addHotDrink(tea);
        hotDrinks.addHotDrink(coffee);

        allMixedProducts.addProduct(mars);
        allMixedProducts.addProduct(snickers);
        allMixedProducts.addProduct(cola);
        allMixedProducts.addProduct(sprite);
        allMixedProducts.addProduct(blackTea);

        System.out.println(allMixedProducts.getProduct("BLACK tea", 300, 95));
    }
}
