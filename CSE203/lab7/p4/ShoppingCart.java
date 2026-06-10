import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;
    private List<ShoppingItem> items;

    public ShoppingCart() {
        this.items= new ArrayList<>();
    }

    public void addItem(ShoppingItem item) {
        items.add(item);
    }

    public void removeItem(ShoppingItem item) {
        items.remove(item);
    }

    private double calculateTotal() {
        return items.stream().mapToDouble(ShoppingItem::getCost).sum();
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty");
        }
        if (paymentStrategy == null) {
            System.out.println("No payment method selected");
        }

        double total = calculateTotal();
        System.out.println("Total amount: " + total);
        paymentStrategy.pay(total);
    }

    public void pay(double amount) {
        paymentStrategy.pay(amount);
    }
}
