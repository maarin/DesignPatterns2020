package visitor;

public class VisitorMain {
    public static void main(String[] args) {
        Product apple = new Fruit("Apple", 2, 3);
        Product banana = new Fruit("Banana", 3, 1);
        Product book = new Book("2873727", 60);

        ShoppingCartVisitor priceCalculator = new PriceCalculator();
        int priceForApples = apple.accept(priceCalculator);
        int priceForBanana = banana.accept(priceCalculator);
        int priceForBook = book.accept(priceCalculator);
    }
}
