package CSE203.lab2.PetGroomingShop;

public class ServiceEstimate {
    private double groomingCost;
    private double additonalCareCost;
    private double tax;
    private Pet pet;

    public ServiceEstimate() {

    }

    public double getGroomingCost() {
        return groomingCost;
    }

    public void setGroomingCost(double groomingCost) {
        this.groomingCost = groomingCost;
    }

    public double getAdditonalCareCost() {
        return additonalCareCost;
    }

    public void setAdditonalCareCost(double additonalCareCost) {
        this.additonalCareCost = additonalCareCost;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public double getTotalCostAfterTax() {
        double subtotal = this.groomingCost + this.additonalCareCost;
        return subtotal * (1 + this.tax);
    }

    public String toString() {
        return "Pet: %s \n Grooming Cost: %d \n Additional Care Cost: %d \n Tax: %d".formatted(this.pet,this.groomingCost,this.additonalCareCost,this.tax);
    }
}
