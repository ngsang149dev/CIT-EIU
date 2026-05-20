package Problem4;

public class Odometer {
    private int mileage;
    private FuelGauge fuelGauge;

    public Odometer(FuelGauge fuelGauge) {
        this.fuelGauge = fuelGauge;
    }

    public void incrementMileage() {
        if (this.fuelGauge.getGallon() > 0) {
            this.mileage+=1;
        }
        if (this.mileage > Const.ODOMETER_MAXIMUM_MILEAGE_MILES) {
            this.mileage = 0;
        }
        if (mileage % Const.MILES_PER_ONE_GALLON == 0) {
            fuelGauge.decrementGallon();
        }
        
    }

    public int getMileage() {
        return mileage;
    }
}
