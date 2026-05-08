
public class CashRegister {
    private RetailItem retailItem;
    private int quanityOfItems;
    public CashRegister(RetailItem retailItem, int quanityOfItems) {
        this.retailItem = retailItem;
        this.quanityOfItems = quanityOfItems;
    }
    public RetailItem getRetailItem() {
        return retailItem;
    }
    public void setRetailItem(RetailItem retailItem) {
        this.retailItem = retailItem;
    }
    public int getQuanityOfItems() {
        return quanityOfItems;
    }
    public void setQuanityOfItems(int quanityOfItems) {
        this.quanityOfItems = quanityOfItems;
    }  
    
    public double getSubtotal() {
        return quanityOfItems * retailItem.getPrice();
    }

    public double getTax() {
        return getSubtotal() * 0.06;
    }

    public double getTotal() {
        return getSubtotal() + getTax();
    }

}
