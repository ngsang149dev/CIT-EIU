

import java.util.ArrayList;
import java.util.List;

public class Quote {
    private List<String> ingredient = new ArrayList<>();
    private double laborCharge;
    private double deliveryFee;
    private Cake cake;

    public Quote(Cake cake, double laborCharge, double deliveryFee) {
        this.cake = cake;
        this.laborCharge = laborCharge;
        this.deliveryFee = deliveryFee;
    }

    public List<String> getIngredient() {
        return ingredient;
    }

    public void setIngredient(List<String> ingredient) {
        this.ingredient = ingredient;
    }

    public double getLaborCharge() {
        return laborCharge;
    }

    public void setLaborCharge(double laborCharge) {
        this.laborCharge = laborCharge;
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public Cake getCake() {
        return cake;
    }

    public void setCake(Cake cake) {
        this.cake = cake;
    }
    public double getPriceAferTax() {
        return  (this.laborCharge + this.deliveryFee)*(1+ Const.TAX);
    } 
    
    public String toString() {
        return "Cake: %s \n Ingredients: %s \n Labor Charge: %d \n Delivery Fee: %d".formatted(this.cake, this.ingredient, this.laborCharge, this.deliveryFee);
    }
}
