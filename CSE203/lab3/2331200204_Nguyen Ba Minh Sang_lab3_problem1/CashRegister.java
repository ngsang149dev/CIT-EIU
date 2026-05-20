
public class CashRegister {
    private RetailItem retailItem;
    private int quantity;
    private static final double TAX_RATE = 0.06;

    public CashRegister(RetailItem retailItem, int quantity) {
        this.retailItem = retailItem;
        this.quantity = quantity;
    }
    public RetailItem getRetailItem() {
        return retailItem;
    }
    public void setRetailItem(RetailItem retailItem) {
        this.retailItem = retailItem;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }  
    
    public double getSubtotal() {
        return this.quantity * this.retailItem.getPrice();
    }

    public double getTax() {
        return getSubtotal() * TAX_RATE;
    }

    public double getTotal() {
        return getSubtotal() + getTax();
    }

}
