

public class ServiceEstimate {
    private double groomingCost;
    private double additionalCareCost;
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

    public double getAdditionalCareCost() {
        return additionalCareCost;
    }

    public void setAdditionalCareCost(double additonalCareCost) {
        this.additionalCareCost = additonalCareCost;
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
        return (groomingCost + additionalCareCost) * (1 + tax);
    }

    public String toString() {
        return "Pet: %s \n Grooming Cost: %d \n Additional Care Cost: %d \n Tax: %d".formatted(this.pet,this.groomingCost,this.additionalCareCost,this.tax);
    }
}
