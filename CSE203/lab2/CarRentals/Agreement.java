package CSE203.lab2.CarRentals;

public class Agreement {
    private String purpose;
    private double baseRentalFee;
    private double mileageFee;
    private Car car;

    public Agreement(Car car, String purpose, double baseRentalFee, double mileageFee) {
        this.car = car;
        this.purpose = purpose;
        this.baseRentalFee = baseRentalFee;
        this.mileageFee = mileageFee;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public double getBaseRentalFee() {
        return baseRentalFee;
    }

    public void setBaseRentalFee(double baseRentalFee) {
        this.baseRentalFee = baseRentalFee;
    }

    public double getMileageFee() {
        return mileageFee;
    }

    public void setMileageFee(double mileageFee) {
        this.mileageFee = mileageFee;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public double getRentalCostAfterTax() {
        double subtotal = this.baseRentalFee + this.mileageFee;
        return subtotal * (1 + Const.TAX);
    }

    public String toString() {
        return "Purpose: %s \n Base Rental Fee: %d \n Mileage Fee: %d \n Car: %s".formatted(this.purpose, this.baseRentalFee, this.mileageFee, this.car);
    }
}
