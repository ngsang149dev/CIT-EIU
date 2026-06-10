public class Main {
    public static void main(String[] args) {
        ShoppingItem item1 = new ShoppingItem(32_000_000, "Macbook Air M5");
        ShoppingItem item2 = new ShoppingItem(40_000_000, "iPhone 17 Pro Max");
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(item1);
        cart.addItem(item2);
        cart.setPaymentStrategy(new CashPayment());
        cart.checkout();
    }
}
